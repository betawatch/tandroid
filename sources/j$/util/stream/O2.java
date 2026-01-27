package j$.util.stream;

import j$.util.Spliterators;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* loaded from: classes2.dex */
final class O2 extends U2 implements j$.util.W {
    final /* synthetic */ P2 g;

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.util.T.a(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.util.T.f(this, consumer);
    }

    @Override // j$.util.stream.U2
    final void a(int i, Object obj, Object obj2) {
        ((DoubleConsumer) obj2).accept(((double[]) obj)[i]);
    }

    @Override // j$.util.stream.U2
    final j$.util.f0 b(Object obj, int i, int i2) {
        return Spliterators.j((double[]) obj, i, i2 + i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    O2(P2 p2, int i, int i2, int i3, int i4) {
        super(p2, i, i2, i3, i4);
        this.g = p2;
    }

    @Override // j$.util.stream.U2
    final j$.util.f0 c(int i, int i2, int i3, int i4) {
        return new O2(this.g, i, i2, i3, i4);
    }
}
