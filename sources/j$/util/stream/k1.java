package j$.util.stream;

import j$.util.Spliterator;
import j$.util.Spliterators;
import j$.util.function.Consumer;
import j$.util.function.IntFunction;
import java.util.Arrays;

/* loaded from: classes2.dex */
class k1 implements E0 {
    final long[] a;
    int b;

    k1(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.a = new long[(int) j];
        this.b = 0;
    }

    k1(long[] jArr) {
        this.a = jArr;
        this.b = jArr.length;
    }

    @Override // j$.util.stream.F0, j$.util.stream.G0
    public final F0 a(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.G0
    public final /* bridge */ /* synthetic */ G0 a(int i) {
        a(i);
        throw null;
    }

    @Override // j$.util.stream.G0
    public final long count() {
        return this.b;
    }

    @Override // j$.util.stream.F0
    public final void d(Object obj, int i) {
        int i2 = this.b;
        System.arraycopy(this.a, 0, (long[]) obj, i, i2);
    }

    @Override // j$.util.stream.F0
    public final Object e() {
        long[] jArr = this.a;
        int length = jArr.length;
        int i = this.b;
        return length == i ? jArr : Arrays.copyOf(jArr, i);
    }

    @Override // j$.util.stream.G0
    public final /* synthetic */ void forEach(Consumer consumer) {
        u0.s(this, consumer);
    }

    @Override // j$.util.stream.F0
    public final void g(Object obj) {
        j$.util.function.T t = (j$.util.function.T) obj;
        for (int i = 0; i < this.b; i++) {
            t.accept(this.a[i]);
        }
    }

    @Override // j$.util.stream.G0
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public final /* synthetic */ void i(Long[] lArr, int i) {
        u0.p(this, lArr, i);
    }

    @Override // j$.util.stream.G0
    public final /* synthetic */ int p() {
        return 0;
    }

    @Override // j$.util.stream.G0
    public final /* synthetic */ Object[] s(IntFunction intFunction) {
        return u0.m(this, intFunction);
    }

    @Override // j$.util.stream.F0, j$.util.stream.G0
    public final j$.util.M spliterator() {
        return Spliterators.l(this.a, 0, this.b);
    }

    @Override // j$.util.stream.G0
    public final Spliterator spliterator() {
        return Spliterators.l(this.a, 0, this.b);
    }

    @Override // j$.util.stream.G0
    public final /* synthetic */ G0 t(long j, long j2, IntFunction intFunction) {
        return u0.v(this, j, j2);
    }

    public String toString() {
        long[] jArr = this.a;
        return String.format("LongArrayNode[%d][%s]", Integer.valueOf(jArr.length - this.b), Arrays.toString(jArr));
    }
}
