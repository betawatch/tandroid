package j$.util.stream;

import j$.util.Spliterator;

/* loaded from: classes2.dex */
final class z extends B {
    z(Spliterator spliterator, int i) {
        super(spliterator, i);
    }

    @Override // j$.util.stream.B, j$.util.stream.E
    public final void c0(j$.util.function.m mVar) {
        j$.util.D E0;
        if (isParallel()) {
            super.c0(mVar);
        } else {
            E0 = B.E0(y0());
            E0.e(mVar);
        }
    }

    @Override // j$.util.stream.B, j$.util.stream.E
    public final void i(j$.util.function.m mVar) {
        j$.util.D E0;
        if (isParallel()) {
            super.i(mVar);
        } else {
            E0 = B.E0(y0());
            E0.e(mVar);
        }
    }

    @Override // j$.util.stream.b, j$.util.stream.BaseStream, j$.util.stream.E
    public final /* bridge */ /* synthetic */ E parallel() {
        parallel();
        return this;
    }

    @Override // j$.util.stream.b, j$.util.stream.BaseStream, j$.util.stream.E
    public final /* bridge */ /* synthetic */ E sequential() {
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
