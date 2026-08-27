package j$.util;

import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
public interface a1 extends d1 {
    void forEachRemaining(LongConsumer longConsumer);

    boolean tryAdvance(LongConsumer longConsumer);

    @Override // j$.util.d1, j$.util.Spliterator
    a1 trySplit();
}
