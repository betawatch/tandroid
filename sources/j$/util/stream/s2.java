package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes4.dex */
public final class s2 extends j2 {
    @Override // j$.util.stream.h2
    public final h2 e(long j, long j2, IntFunction intFunction) {
        if (j == 0 && j2 == this.c) {
            return this;
        }
        long count = this.a.count();
        if (j >= count) {
            return this.b.e(j - count, j2 - count, intFunction);
        }
        if (j2 <= count) {
            return this.a.e(j, j2, intFunction);
        }
        return w3.E(c7.REFERENCE, this.a.e(j, count, intFunction), this.b.e(0L, j2 - count, intFunction));
    }

    @Override // j$.util.stream.h2
    public final void f(Object[] objArr, int i) {
        Objects.requireNonNull(objArr);
        h2 h2Var = this.a;
        h2Var.f(objArr, i);
        this.b.f(objArr, i + ((int) h2Var.count()));
    }

    @Override // j$.util.stream.h2
    public final void forEach(Consumer consumer) {
        this.a.forEach(consumer);
        this.b.forEach(consumer);
    }

    @Override // j$.util.stream.h2
    public final Object[] g(IntFunction intFunction) {
        long j = this.c;
        if (j >= 2147483639) {
            j$.time.g.c("Stream size exceeds max array size");
            return null;
        }
        Object[] objArr = (Object[]) intFunction.apply((int) j);
        f(objArr, 0);
        return objArr;
    }

    @Override // j$.util.stream.h2
    public final Spliterator spliterator() {
        return new j3(this);
    }

    public final String toString() {
        long j = this.c;
        return j < 32 ? String.format("ConcNode[%s.%s]", this.a, this.b) : String.format("ConcNode[size=%d]", Long.valueOf(j));
    }
}
