package j$.util;

import java.util.function.DoubleConsumer;

/* loaded from: classes2.dex */
public interface V extends e0 {
    void forEachRemaining(DoubleConsumer doubleConsumer);

    boolean tryAdvance(DoubleConsumer doubleConsumer);

    @Override // j$.util.e0, j$.util.Spliterator
    V trySplit();
}
