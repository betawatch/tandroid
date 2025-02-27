package j$.util.stream;

import j$.util.Spliterator;

/* loaded from: classes2.dex */
final class Z extends b0 {
    Z(Spliterator spliterator, int i) {
        super(spliterator, i);
    }

    @Override // j$.util.stream.b0, j$.util.stream.IntStream
    public final void B(j$.util.function.E e) {
        j$.util.G G0;
        if (isParallel()) {
            super.B(e);
        } else {
            G0 = b0.G0(A0());
            G0.e(e);
        }
    }

    @Override // j$.util.stream.b0, j$.util.stream.IntStream
    public final void K(j$.util.function.E e) {
        j$.util.G G0;
        if (isParallel()) {
            super.K(e);
        } else {
            G0 = b0.G0(A0());
            G0.e(e);
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
    final boolean x0() {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.stream.b
    final e2 y0(int i, e2 e2Var) {
        throw new UnsupportedOperationException();
    }
}
