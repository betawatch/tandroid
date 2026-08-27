package j$.util;

import java.util.function.DoubleConsumer;

/* loaded from: classes2.dex */
public interface u0 extends d1 {
    void forEachRemaining(DoubleConsumer doubleConsumer);

    boolean tryAdvance(DoubleConsumer doubleConsumer);

    @Override // j$.util.d1, j$.util.Spliterator
    u0 trySplit();
}
