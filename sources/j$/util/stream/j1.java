package j$.util.stream;

import java.util.function.Consumer;

/* loaded from: classes2.dex */
final class j1 extends k1 implements j$.util.b0 {
    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.util.S.c(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.util.S.h(this, consumer);
    }
}
