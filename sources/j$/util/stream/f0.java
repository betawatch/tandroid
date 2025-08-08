package j$.util.stream;

/* loaded from: classes2.dex */
final class f0 extends h0 {
    @Override // j$.util.stream.b, j$.util.stream.BaseStream
    public final /* bridge */ /* synthetic */ LongStream parallel() {
        parallel();
        return this;
    }

    @Override // j$.util.stream.b, j$.util.stream.BaseStream
    public final /* bridge */ /* synthetic */ LongStream sequential() {
        sequential();
        return this;
    }

    @Override // j$.util.stream.b
    final boolean v0() {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.stream.b
    final d2 w0(int i, d2 d2Var) {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.stream.h0, j$.util.stream.LongStream
    public final void c(j$.util.function.Y y) {
        j$.util.J E0;
        if (!isParallel()) {
            E0 = h0.E0(y0());
            E0.e(y);
        } else {
            super.c(y);
        }
    }

    @Override // j$.util.stream.h0, j$.util.stream.LongStream
    public final void T(j$.util.function.Y y) {
        j$.util.J E0;
        if (!isParallel()) {
            E0 = h0.E0(y0());
            E0.e(y);
        } else {
            super.T(y);
        }
    }
}
