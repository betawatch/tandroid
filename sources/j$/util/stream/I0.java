package j$.util.stream;

import j$.util.Spliterator;
import j$.util.Spliterators;
import j$.util.function.Consumer;
import j$.util.function.IntFunction;
import java.util.Arrays;

/* loaded from: classes2.dex */
class I0 implements F0 {
    final Object[] a;
    int b;

    @Override // j$.util.stream.F0
    public final /* synthetic */ int p() {
        return 0;
    }

    @Override // j$.util.stream.F0
    public final /* synthetic */ F0 t(long j, long j2, IntFunction intFunction) {
        return t0.w(this, j, j2, intFunction);
    }

    @Override // j$.util.stream.F0
    public final F0 a(int i) {
        throw new IndexOutOfBoundsException();
    }

    I0(long j, IntFunction intFunction) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.a = (Object[]) intFunction.apply((int) j);
        this.b = 0;
    }

    I0(Object[] objArr) {
        this.a = objArr;
        this.b = objArr.length;
    }

    @Override // j$.util.stream.F0
    public final Spliterator spliterator() {
        return Spliterators.m(this.a, 0, this.b);
    }

    @Override // j$.util.stream.F0
    public final void i(Object[] objArr, int i) {
        System.arraycopy(this.a, 0, objArr, i, this.b);
    }

    @Override // j$.util.stream.F0
    public final Object[] s(IntFunction intFunction) {
        Object[] objArr = this.a;
        if (objArr.length == this.b) {
            return objArr;
        }
        throw new IllegalStateException();
    }

    @Override // j$.util.stream.F0
    public final long count() {
        return this.b;
    }

    @Override // j$.util.stream.F0
    public final void forEach(Consumer consumer) {
        for (int i = 0; i < this.b; i++) {
            consumer.r(this.a[i]);
        }
    }

    public String toString() {
        Object[] objArr = this.a;
        return String.format("ArrayNode[%d][%s]", Integer.valueOf(objArr.length - this.b), Arrays.toString(objArr));
    }
}
