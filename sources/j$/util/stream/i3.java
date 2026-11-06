package j$.util.stream;

import j$.util.DesugarArrays;
import j$.util.Spliterator;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
public class i3 implements c2 {
    public final long[] a;
    public int b;

    @Override // j$.util.stream.e2
    public final /* synthetic */ e2 e(long j3, long j10, IntFunction intFunction) {
        return t3.U(this, j3, j10);
    }

    @Override // j$.util.stream.e2
    public final /* synthetic */ void forEach(Consumer consumer) {
        t3.R(this, consumer);
    }

    @Override // j$.util.stream.e2
    public final /* synthetic */ Object[] g(IntFunction intFunction) {
        return t3.L(this, intFunction);
    }

    @Override // j$.util.stream.e2
    public final /* synthetic */ int h() {
        return 0;
    }

    @Override // j$.util.stream.e2
    public final /* bridge */ /* synthetic */ e2 a(int i7) {
        a(i7);
        throw null;
    }

    @Override // j$.util.stream.d2, j$.util.stream.e2
    public final d2 a(int i7) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.e2
    public final /* synthetic */ void f(Object[] objArr, int i7) {
        t3.O(this, (Long[]) objArr, i7);
    }

    @Override // j$.util.stream.d2
    public final void c(int i7, Object obj) {
        int i10 = this.b;
        System.arraycopy(this.a, 0, (long[]) obj, i7, i10);
    }

    @Override // j$.util.stream.d2
    public final void d(Object obj) {
        LongConsumer longConsumer = (LongConsumer) obj;
        for (int i7 = 0; i7 < this.b; i7++) {
            longConsumer.accept(this.a[i7]);
        }
    }

    public i3(long j3) {
        if (j3 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.a = new long[(int) j3];
        this.b = 0;
    }

    public i3(long[] jArr) {
        this.a = jArr;
        this.b = jArr.length;
    }

    @Override // j$.util.stream.e2
    public final Spliterator spliterator() {
        return DesugarArrays.c(this.a, 0, this.b);
    }

    @Override // j$.util.stream.d2, j$.util.stream.e2
    public final j$.util.d1 spliterator() {
        return DesugarArrays.c(this.a, 0, this.b);
    }

    @Override // j$.util.stream.d2
    public final Object b() {
        long[] jArr = this.a;
        int length = jArr.length;
        int i7 = this.b;
        return length == i7 ? jArr : Arrays.copyOf(jArr, i7);
    }

    @Override // j$.util.stream.e2
    public final long count() {
        return this.b;
    }

    public String toString() {
        long[] jArr = this.a;
        return String.format("LongArrayNode[%d][%s]", Integer.valueOf(jArr.length - this.b), Arrays.toString(jArr));
    }
}
