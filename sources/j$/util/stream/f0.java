package j$.util.stream;

import j$.util.Spliterator;

/* loaded from: classes2.dex */
final class f0 extends h0 {
    f0(Spliterator spliterator, int i) {
        super(spliterator, i);
    }

    @Override // j$.util.stream.h0, j$.util.stream.LongStream
    public final void U(j$.util.function.T t) {
        j$.util.J G0;
        if (isParallel()) {
            super.U(t);
        } else {
            G0 = h0.G0(A0());
            G0.e(t);
        }
    }

    @Override // j$.util.stream.h0, j$.util.stream.LongStream
    public final void d(j$.util.function.T t) {
        j$.util.J G0;
        if (isParallel()) {
            super.d(t);
        } else {
            G0 = h0.G0(A0());
            G0.e(t);
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
    final boolean x0() {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.stream.b
    final e2 y0(int i, e2 e2Var) {
        throw new UnsupportedOperationException();
    }
}
