package guru.qa;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

@Tag("simple")
public class PositiveTests {

    @Test
    void someTest(){
        assertTrue(true);
    }

    @Test
    void someTest1(){
        assertTrue(true);
    }

    @Test
    void someTest2(){
        assertTrue(true);
    }
}