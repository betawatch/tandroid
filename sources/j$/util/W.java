package j$.util;

import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
public interface W extends c0 {
    void forEachRemaining(IntConsumer intConsumer);

    boolean tryAdvance(IntConsumer intConsumer);

    @Override // j$.util.c0, j$.util.Spliterator
    W trySplit();
}
