package j$.util.concurrent.atomic;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.IntUnaryOperator;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes4.dex */
public class DesugarAtomicInteger {
    public static int getAndUpdate(AtomicInteger atomicInteger, IntUnaryOperator intUnaryOperator) {
        int i;
        do {
            i = atomicInteger.get();
        } while (!atomicInteger.compareAndSet(i, intUnaryOperator.applyAsInt(i)));
        return i;
    }
}
