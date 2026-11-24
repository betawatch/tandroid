package j$.util;

import java.util.function.IntConsumer;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes4.dex */
public interface x0 extends d1 {
    void forEachRemaining(IntConsumer intConsumer);

    boolean tryAdvance(IntConsumer intConsumer);

    @Override // j$.util.d1, j$.util.Spliterator
    x0 trySplit();
}
