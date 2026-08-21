package j$.util.stream;

import j$.util.DesugarArrays;
import j$.util.Spliterator;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
public class g1 implements A0 {
    public final long[] a;
    public int b;

    @Override // j$.util.stream.C0
    public final /* synthetic */ C0 f(long j, long j2, IntFunction intFunction) {
        return r1.v(this, j, j2);
    }

    @Override // j$.util.stream.C0
    public final /* synthetic */ void forEach(Consumer consumer) {
        r1.s(this, consumer);
    }

    @Override // j$.util.stream.C0
    public final /* synthetic */ Object[] h(IntFunction intFunction) {
        return r1.m(this, intFunction);
    }

    @Override // j$.util.stream.C0
    public final /* synthetic */ int i() {
        return 0;
    }

    @Override // j$.util.stream.C0
    public final /* bridge */ /* synthetic */ C0 b(int i) {
        b(i);
        throw null;
    }

    @Override // j$.util.stream.B0, j$.util.stream.C0
    public final B0 b(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.C0
    public final /* synthetic */ void g(Object[] objArr, int i) {
        r1.p(this, (Long[]) objArr, i);
    }

    @Override // j$.util.stream.B0
    public final void e(Object obj) {
        LongConsumer longConsumer = (LongConsumer) obj;
        for (int i = 0; i < this.b; i++) {
            longConsumer.accept(this.a[i]);
        }
    }

    @Override // j$.util.stream.B0
    public final void j(int i, Object obj) {
        int i2 = this.b;
        System.arraycopy(this.a, 0, (long[]) obj, i, i2);
    }

    public g1(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.a = new long[(int) j];
        this.b = 0;
    }

    public g1(long[] jArr) {
        this.a = jArr;
        this.b = jArr.length;
    }

    @Override // j$.util.stream.C0
    public final Spliterator spliterator() {
        return DesugarArrays.c(this.a, 0, this.b);
    }

    @Override // j$.util.stream.B0, j$.util.stream.C0
    public final j$.util.c0 spliterator() {
        return DesugarArrays.c(this.a, 0, this.b);
    }

    @Override // j$.util.stream.B0
    public final Object d() {
        long[] jArr = this.a;
        int length = jArr.length;
        int i = this.b;
        return length == i ? jArr : Arrays.copyOf(jArr, i);
    }

    @Override // j$.util.stream.C0
    public final long count() {
        return this.b;
    }

    public String toString() {
        long[] jArr = this.a;
        return String.format("LongArrayNode[%d][%s]", Integer.valueOf(jArr.length - this.b), Arrays.toString(jArr));
    }
}
