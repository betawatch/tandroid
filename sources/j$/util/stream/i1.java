package j$.util.stream;

import java.util.function.Consumer;

/* loaded from: classes2.dex */
final class i1 extends k1 implements j$.util.Z {
    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.util.T.b(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.util.T.g(this, consumer);
    }
}
