package j$.util.stream;

import j$.util.Spliterators;
import j$.util.function.Consumer;

/* loaded from: classes2.dex */
final class K2 extends M2 implements j$.util.J {
    final /* synthetic */ L2 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    K2(L2 l2, int i, int i2, int i3, int i4) {
        super(l2, i, i2, i3, i4);
        this.g = l2;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void a(Consumer consumer) {
        j$.util.A.h(this, consumer);
    }

    @Override // j$.util.stream.M2
    final void b(int i, Object obj, Object obj2) {
        ((j$.util.function.T) obj2).accept(((long[]) obj)[i]);
    }

    @Override // j$.util.stream.M2
    final j$.util.M f(Object obj, int i, int i2) {
        return Spliterators.l((long[]) obj, i, i2 + i);
    }

    @Override // j$.util.stream.M2
    final j$.util.M h(int i, int i2, int i3, int i4) {
        return new K2(this.g, i, i2, i3, i4);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean s(Consumer consumer) {
        return j$.util.A.n(this, consumer);
    }
}
