package j$.util.stream;

import j$.util.Spliterators;
import j$.util.function.Consumer;

/* loaded from: classes2.dex */
final class F2 extends L2 implements j$.util.D {
    final /* synthetic */ G2 g;

    @Override // j$.util.Spliterator
    public final /* synthetic */ void a(Consumer consumer) {
        j$.util.A.b(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean s(Consumer consumer) {
        return j$.util.A.l(this, consumer);
    }

    @Override // j$.util.stream.L2
    final void b(int i, Object obj, Object obj2) {
        ((j$.util.function.l) obj2).accept(((double[]) obj)[i]);
    }

    @Override // j$.util.stream.L2
    final j$.util.M f(Object obj, int i, int i2) {
        return Spliterators.j((double[]) obj, i, i2 + i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    F2(G2 g2, int i, int i2, int i3, int i4) {
        super(g2, i, i2, i3, i4);
        this.g = g2;
    }

    @Override // j$.util.stream.L2
    final j$.util.M h(int i, int i2, int i3, int i4) {
        return new F2(this.g, i, i2, i3, i4);
    }
}
