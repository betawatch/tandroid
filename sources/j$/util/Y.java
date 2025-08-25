package j$.util;

import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
public interface Y extends e0 {
    void forEachRemaining(IntConsumer intConsumer);

    boolean tryAdvance(IntConsumer intConsumer);

    @Override // j$.util.e0, j$.util.Spliterator
    Y trySplit();
}
