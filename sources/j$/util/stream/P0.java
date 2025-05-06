package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer;
import j$.util.function.IntFunction;

/* loaded from: classes2.dex */
final class P0 extends Q0 implements E0 {
    P0(E0 e0, E0 e02) {
        super(e0, e02);
    }

    @Override // j$.util.stream.G0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final /* synthetic */ void i(Long[] lArr, int i) {
        u0.p(this, lArr, i);
    }

    @Override // j$.util.stream.F0
    public final Object c(int i) {
        return new long[i];
    }

    @Override // j$.util.stream.G0
    public final /* synthetic */ void forEach(Consumer consumer) {
        u0.s(this, consumer);
    }

    @Override // j$.util.stream.G0
    public final j$.util.M spliterator() {
        return new g1(this);
    }

    @Override // j$.util.stream.G0
    public final Spliterator spliterator() {
        return new g1(this);
    }

    @Override // j$.util.stream.G0
    public final /* synthetic */ G0 t(long j, long j2, IntFunction intFunction) {
        return u0.v(this, j, j2);
    }
}
