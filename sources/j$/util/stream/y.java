package j$.util.stream;

import j$.util.Spliterator;

/* loaded from: classes2.dex */
final class y extends A {
    y(Spliterator spliterator, int i) {
        super(spliterator, i);
    }

    @Override // j$.util.stream.A, j$.util.stream.D
    public final void e0(j$.util.function.m mVar) {
        j$.util.D G0;
        if (isParallel()) {
            super.e0(mVar);
        } else {
            G0 = A.G0(A0());
            G0.e(mVar);
        }
    }

    @Override // j$.util.stream.A, j$.util.stream.D
    public final void j(j$.util.function.m mVar) {
        j$.util.D G0;
        if (isParallel()) {
            super.j(mVar);
        } else {
            G0 = A.G0(A0());
            G0.e(mVar);
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
    final boolean x0() {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.stream.b
    final e2 y0(int i, e2 e2Var) {
        throw new UnsupportedOperationException();
    }
}
