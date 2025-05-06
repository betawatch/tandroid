package j$.util.stream;

import j$.util.Spliterator;

/* loaded from: classes2.dex */
final class Z extends b0 {
    Z(Spliterator spliterator, int i) {
        super(spliterator, i);
    }

    @Override // j$.util.stream.b0, j$.util.stream.IntStream
    public final void A(j$.util.function.E e) {
        j$.util.G E0;
        if (isParallel()) {
            super.A(e);
        } else {
            E0 = b0.E0(y0());
            E0.e(e);
        }
    }

    @Override // j$.util.stream.b0, j$.util.stream.IntStream
    public final void J(j$.util.function.E e) {
        j$.util.G E0;
        if (isParallel()) {
            super.J(e);
        } else {
            E0 = b0.E0(y0());
            E0.e(e);
        }
    }

    @Override // j$.util.stream.b, j$.util.stream.BaseStream, j$.util.stream.E
    public final /* bridge */ /* synthetic */ IntStream parallel() {
        parallel();
        return this;
    }

    @Override // j$.util.stream.b, j$.util.stream.BaseStream, j$.util.stream.E
    public final /* bridge */ /* synthetic */ IntStream sequential() {
        sequential();
        return this;
    }

    @Override // j$.util.stream.b
    final boolean v0() {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.stream.b
    final e2 w0(int i, e2 e2Var) {
        throw new UnsupportedOperationException();
    }
}
