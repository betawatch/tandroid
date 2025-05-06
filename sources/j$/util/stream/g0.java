package j$.util.stream;

import j$.util.Spliterator;

/* loaded from: classes2.dex */
final class g0 extends i0 {
    g0(Spliterator spliterator, int i) {
        super(spliterator, i);
    }

    @Override // j$.util.stream.i0, j$.util.stream.LongStream
    public final void T(j$.util.function.T t) {
        j$.util.J E0;
        if (isParallel()) {
            super.T(t);
        } else {
            E0 = i0.E0(y0());
            E0.e(t);
        }
    }

    @Override // j$.util.stream.i0, j$.util.stream.LongStream
    public final void c(j$.util.function.T t) {
        j$.util.J E0;
        if (isParallel()) {
            super.c(t);
        } else {
            E0 = i0.E0(y0());
            E0.e(t);
        }
    }

    @Override // j$.util.stream.b, j$.util.stream.BaseStream, j$.util.stream.E
    public final /* bridge */ /* synthetic */ LongStream parallel() {
        parallel();
        return this;
    }

    @Override // j$.util.stream.b, j$.util.stream.BaseStream, j$.util.stream.E
    public final /* bridge */ /* synthetic */ LongStream sequential() {
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
