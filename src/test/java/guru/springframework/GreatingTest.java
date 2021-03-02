package guru.springframework;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class GreatingTest {
    private Greating greating;

    @BeforeAll
     static void beforeAll() {
        System.out.println("Before - I am only called Once");
    }

    @BeforeEach
    void setUp() {
        System.out.println("In before Each....");
        greating = new Greating();
    }

    @Test
    void helloWorld() {

        System.out.println(greating.helloWorld());
    }

    @Test
    void testHelloWorld() {

        System.out.println(greating.helloWorld("Norman"));
    }

    @AfterEach
    void tearDown() {
        System.out.println("In after each...");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("After - I am only called once");
    }
}
