package j$.util.stream;

import j$.util.function.IntFunction;

/* loaded from: classes2.dex */
abstract class Z0 implements G0 {
    Z0() {
    }

    @Override // j$.util.stream.G0
    public G0 a(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.G0
    public final long count() {
        return 0L;
    }

    public final void d(Object obj, int i) {
    }

    public final void g(Object obj) {
    }

    @Override // j$.util.stream.G0
    public final /* synthetic */ int p() {
        return 0;
    }

    @Override // j$.util.stream.G0
    public final Object[] s(IntFunction intFunction) {
        return (Object[]) intFunction.apply(0);
    }

    @Override // j$.util.stream.G0
    public /* synthetic */ G0 t(long j, long j2, IntFunction intFunction) {
        return u0.w(this, j, j2, intFunction);
    }
}
