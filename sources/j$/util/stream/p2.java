package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
public final class p2 extends g2 {
    @Override // j$.util.stream.e2
    public final e2 e(long j10, long j11, IntFunction intFunction) {
        if (j10 == 0 && j11 == this.c) {
            return this;
        }
        long count = this.a.count();
        if (j10 >= count) {
            return this.b.e(j10 - count, j11 - count, intFunction);
        }
        if (j11 > count) {
            return t3.e0(w6.REFERENCE, this.a.e(j10, count, intFunction), this.b.e(0L, j11 - count, intFunction));
        }
        return this.a.e(j10, j11, intFunction);
    }

    @Override // j$.util.stream.e2
    public final Spliterator spliterator() {
        return new g3(this);
    }

    @Override // j$.util.stream.e2
    public final void f(Object[] objArr, int i9) {
        Objects.requireNonNull(objArr);
        e2 e2Var = this.a;
        e2Var.f(objArr, i9);
        this.b.f(objArr, i9 + ((int) e2Var.count()));
    }

    @Override // j$.util.stream.e2
    public final Object[] g(IntFunction intFunction) {
        long j10 = this.c;
        if (j10 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object[] objArr = (Object[]) intFunction.apply((int) j10);
        f(objArr, 0);
        return objArr;
    }

    @Override // j$.util.stream.e2
    public final void forEach(Consumer consumer) {
        this.a.forEach(consumer);
        this.b.forEach(consumer);
    }

    public final String toString() {
        long j10 = this.c;
        return j10 < 32 ? String.format("ConcNode[%s.%s]", this.a, this.b) : String.format("ConcNode[size=%d]", Long.valueOf(j10));
    }
}
