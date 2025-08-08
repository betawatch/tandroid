package j$.util.stream;

/* loaded from: classes2.dex */
final class Y extends a0 {
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
    final boolean v0() {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.stream.b
    final d2 w0(int i, d2 d2Var) {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.stream.a0, j$.util.stream.IntStream
    public final void J(j$.util.function.G g) {
        j$.util.G E0;
        if (!isParallel()) {
            E0 = a0.E0(y0());
            E0.e(g);
        } else {
            super.J(g);
        }
    }

    @Override // j$.util.stream.a0, j$.util.stream.IntStream
    public final void A(j$.util.function.G g) {
        j$.util.G E0;
        if (!isParallel()) {
            E0 = a0.E0(y0());
            E0.e(g);
        } else {
            super.A(g);
        }
    }
}
