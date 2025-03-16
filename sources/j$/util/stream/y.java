package j$.util.stream;

import j$.util.Spliterator;

/* loaded from: classes2.dex */
final class y extends A {
    y(Spliterator spliterator, int i) {
        super(spliterator, i);
    }

    @Override // j$.util.stream.A, j$.util.stream.D
    public final void d0(j$.util.function.m mVar) {
        j$.util.D F0;
        if (isParallel()) {
            super.d0(mVar);
        } else {
            F0 = A.F0(z0());
            F0.e(mVar);
        }
    }

    @Override // j$.util.stream.A, j$.util.stream.D
    public final void i(j$.util.function.m mVar) {
        j$.util.D F0;
        if (isParallel()) {
            super.i(mVar);
        } else {
            F0 = A.F0(z0());
            F0.e(mVar);
        }
    }

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
    final boolean w0() {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.stream.b
    final e2 x0(int i, e2 e2Var) {
        throw new UnsupportedOperationException();
    }
}
