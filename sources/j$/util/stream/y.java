package j$.util.stream;

/* loaded from: classes2.dex */
final class y extends A {
    @Override // j$.util.stream.b, j$.util.stream.BaseStream
    public final /* bridge */ /* synthetic */ D parallel() {
        parallel();
        return this;
    }

    @Override // j$.util.stream.b, j$.util.stream.BaseStream
    public final /* bridge */ /* synthetic */ D sequential() {
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

    @Override // j$.util.stream.A, j$.util.stream.D
    public final void i(j$.util.function.l lVar) {
        j$.util.D E0;
        if (!isParallel()) {
            E0 = A.E0(y0());
            E0.e(lVar);
        } else {
            super.i(lVar);
        }
    }

    @Override // j$.util.stream.A, j$.util.stream.D
    public final void c0(j$.util.function.l lVar) {
        j$.util.D E0;
        if (!isParallel()) {
            E0 = A.E0(y0());
            E0.e(lVar);
        } else {
            super.c0(lVar);
        }
    }
}
