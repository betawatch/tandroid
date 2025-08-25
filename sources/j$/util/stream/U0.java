package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
final class U0 extends K0 {
    @Override // j$.util.stream.I0
    public final Spliterator spliterator() {
        return new l1(this);
    }

    @Override // j$.util.stream.I0
    public final void i(Object[] objArr, int i) {
        Objects.requireNonNull(objArr);
        I0 i0 = this.a;
        i0.i(objArr, i);
        this.b.i(objArr, i + ((int) i0.count()));
    }

    @Override // j$.util.stream.I0
    public final Object[] o(IntFunction intFunction) {
        long count = count();
        if (count >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object[] objArr = (Object[]) intFunction.apply((int) count);
        i(objArr, 0);
        return objArr;
    }

    @Override // j$.util.stream.I0
    public final void forEach(Consumer consumer) {
        this.a.forEach(consumer);
        this.b.forEach(consumer);
    }

    @Override // j$.util.stream.I0
    public final I0 h(long j, long j2, IntFunction intFunction) {
        if (j == 0 && j2 == count()) {
            return this;
        }
        long count = this.a.count();
        if (j >= count) {
            return this.b.h(j - count, j2 - count, intFunction);
        }
        if (j2 > count) {
            return w0.I(b3.REFERENCE, this.a.h(j, count, intFunction), this.b.h(0L, j2 - count, intFunction));
        }
        return this.a.h(j, j2, intFunction);
    }

    public final String toString() {
        return count() < 32 ? String.format("ConcNode[%s.%s]", this.a, this.b) : String.format("ConcNode[size=%d]", Long.valueOf(count()));
    }
}
