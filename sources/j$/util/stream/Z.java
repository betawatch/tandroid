package j$.util.stream;

import j$.util.Spliterator;

/* loaded from: classes2.dex */
final class Z extends b0 {
    Z(Spliterator spliterator, int i) {
        super(spliterator, i);
    }

    @Override // j$.util.stream.b0, j$.util.stream.IntStream
    public final void A(j$.util.function.E e) {
        j$.util.G F0;
        if (isParallel()) {
            super.A(e);
        } else {
            F0 = b0.F0(z0());
            F0.e(e);
        }
    }

    @Override // j$.util.stream.b0, j$.util.stream.IntStream
    public final void J(j$.util.function.E e) {
        j$.util.G F0;
        if (isParallel()) {
            super.J(e);
        } else {
            F0 = b0.F0(z0());
            F0.e(e);
        }
    }

    @Override // j$.util.stream.b, j$.util.stream.BaseStream
    public final /* bridge */ /* synthetic */ IntStream parallel() {
        parallel();
        return this;
    }

    @Override // j$.util.stream.b, j$.util.stream.BaseStream
    public final /* bridge */ /* synthetic */ IntStream sequential() {
        sequential();
        return this;
    }

    @Override // j$.util.stream.b
    final boolean w0() {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.stream.b
    final e2 x0(int i, e2 e2Var) {
        throw new UnsupportedOperationException();
    }
}
