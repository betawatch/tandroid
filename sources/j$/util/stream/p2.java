package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
public final class p2 extends g2 {
    @Override // j$.util.stream.e2
    public final e2 e(long j3, long j10, IntFunction intFunction) {
        if (j3 == 0 && j10 == this.c) {
            return this;
        }
        long count = this.a.count();
        if (j3 >= count) {
            return this.b.e(j3 - count, j10 - count, intFunction);
        }
        if (j10 > count) {
            return t3.e0(w6.REFERENCE, this.a.e(j3, count, intFunction), this.b.e(0L, j10 - count, intFunction));
        }
        return this.a.e(j3, j10, intFunction);
    }

    @Override // j$.util.stream.e2
    public final Spliterator spliterator() {
        return new g3(this);
    }

    @Override // j$.util.stream.e2
    public final void f(Object[] objArr, int i10) {
        Objects.requireNonNull(objArr);
        e2 e2Var = this.a;
        e2Var.f(objArr, i10);
        this.b.f(objArr, i10 + ((int) e2Var.count()));
    }

    @Override // j$.util.stream.e2
    public final Object[] g(IntFunction intFunction) {
        long j3 = this.c;
        if (j3 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object[] objArr = (Object[]) intFunction.apply((int) j3);
        f(objArr, 0);
        return objArr;
    }

    @Override // j$.util.stream.e2
    public final void forEach(Consumer consumer) {
        this.a.forEach(consumer);
        this.b.forEach(consumer);
    }

    public final String toString() {
        long j3 = this.c;
        return j3 < 32 ? String.format("ConcNode[%s.%s]", this.a, this.b) : String.format("ConcNode[size=%d]", Long.valueOf(j3));
    }
}
