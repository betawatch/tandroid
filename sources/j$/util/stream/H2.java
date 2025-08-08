package j$.util.stream;

import j$.util.Spliterators;
import j$.util.function.Consumer;

/* loaded from: classes2.dex */
final class H2 extends L2 implements j$.util.G {
    final /* synthetic */ I2 g;

    @Override // j$.util.Spliterator
    public final /* synthetic */ void a(Consumer consumer) {
        j$.util.A.f(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean s(Consumer consumer) {
        return j$.util.A.m(this, consumer);
    }

    @Override // j$.util.stream.L2
    final void b(int i, Object obj, Object obj2) {
        ((j$.util.function.G) obj2).accept(((int[]) obj)[i]);
    }

    @Override // j$.util.stream.L2
    final j$.util.M f(Object obj, int i, int i2) {
        return Spliterators.k((int[]) obj, i, i2 + i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    H2(I2 i2, int i, int i3, int i4, int i5) {
        super(i2, i, i3, i4, i5);
        this.g = i2;
    }

    @Override // j$.util.stream.L2
    final j$.util.M h(int i, int i2, int i3, int i4) {
        return new H2(this.g, i, i2, i3, i4);
    }
}
