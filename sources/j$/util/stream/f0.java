package j$.util.stream;

import j$.util.Spliterator;

/* loaded from: classes2.dex */
final class f0 extends h0 {
    f0(Spliterator spliterator, int i) {
        super(spliterator, i);
    }

    @Override // j$.util.stream.h0, j$.util.stream.LongStream
    public final void T(j$.util.function.T t) {
        j$.util.J F0;
        if (isParallel()) {
            super.T(t);
        } else {
            F0 = h0.F0(z0());
            F0.e(t);
        }
    }

    @Override // j$.util.stream.h0, j$.util.stream.LongStream
    public final void c(j$.util.function.T t) {
        j$.util.J F0;
        if (isParallel()) {
            super.c(t);
        } else {
            F0 = h0.F0(z0());
            F0.e(t);
        }
    }

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
    final boolean w0() {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.stream.b
    final e2 x0(int i, e2 e2Var) {
        throw new UnsupportedOperationException();
    }
}
