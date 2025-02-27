package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer;
import j$.util.function.IntFunction;

/* loaded from: classes2.dex */
final class Q0 extends H0 {
    Q0(F0 f0, F0 f02) {
        super(f0, f02);
    }

    @Override // j$.util.stream.F0
    public final void forEach(Consumer consumer) {
        this.a.forEach(consumer);
        this.b.forEach(consumer);
    }

    @Override // j$.util.stream.F0
    public final void i(Object[] objArr, int i) {
        objArr.getClass();
        F0 f0 = this.a;
        f0.i(objArr, i);
        this.b.i(objArr, i + ((int) f0.count()));
    }

    @Override // j$.util.stream.F0
    public final Object[] s(IntFunction intFunction) {
        long count = count();
        if (count >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object[] objArr = (Object[]) intFunction.apply((int) count);
        i(objArr, 0);
        return objArr;
    }

    @Override // j$.util.stream.F0
    public final Spliterator spliterator() {
        return new h1(this);
    }

    @Override // j$.util.stream.F0
    public final F0 t(long j, long j2, IntFunction intFunction) {
        if (j == 0 && j2 == count()) {
            return this;
        }
        long count = this.a.count();
        if (j >= count) {
            return this.b.t(j - count, j2 - count, intFunction);
        }
        if (j2 <= count) {
            return this.a.t(j, j2, intFunction);
        }
        return t0.I(S2.REFERENCE, this.a.t(j, count, intFunction), this.b.t(0L, j2 - count, intFunction));
    }

    public final String toString() {
        return count() < 32 ? String.format("ConcNode[%s.%s]", this.a, this.b) : String.format("ConcNode[size=%d]", Long.valueOf(count()));
    }
}
