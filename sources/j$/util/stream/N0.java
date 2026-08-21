package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
public final class N0 extends E0 {
    @Override // j$.util.stream.C0
    public final Spliterator spliterator() {
        return new e1(this);
    }

    @Override // j$.util.stream.C0
    public final void g(Object[] objArr, int i) {
        Objects.requireNonNull(objArr);
        C0 c0 = this.a;
        c0.g(objArr, i);
        this.b.g(objArr, i + ((int) c0.count()));
    }

    @Override // j$.util.stream.C0
    public final Object[] h(IntFunction intFunction) {
        long j = this.c;
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object[] objArr = (Object[]) intFunction.apply((int) j);
        g(objArr, 0);
        return objArr;
    }

    @Override // j$.util.stream.C0
    public final void forEach(Consumer consumer) {
        this.a.forEach(consumer);
        this.b.forEach(consumer);
    }

    @Override // j$.util.stream.C0
    public final C0 f(long j, long j2, IntFunction intFunction) {
        if (j == 0 && j2 == this.c) {
            return this;
        }
        long count = this.a.count();
        if (j >= count) {
            return this.b.f(j - count, j2 - count, intFunction);
        }
        if (j2 > count) {
            return r1.F(T2.REFERENCE, this.a.f(j, count, intFunction), this.b.f(0L, j2 - count, intFunction));
        }
        return this.a.f(j, j2, intFunction);
    }

    public final String toString() {
        long j = this.c;
        return j < 32 ? String.format("ConcNode[%s.%s]", this.a, this.b) : String.format("ConcNode[size=%d]", Long.valueOf(j));
    }
}
