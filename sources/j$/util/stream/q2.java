package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
public class q2 implements y1 {
    public final double[] a;
    public int b;

    @Override // j$.util.stream.e2
    public final /* synthetic */ e2 e(long j10, long j11, IntFunction intFunction) {
        return t3.S(this, j10, j11);
    }

    @Override // j$.util.stream.e2
    public final /* synthetic */ void forEach(Consumer consumer) {
        t3.P(this, consumer);
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
    public final /* bridge */ /* synthetic */ e2 a(int i9) {
        a(i9);
        throw null;
    }

    @Override // j$.util.stream.d2, j$.util.stream.e2
    public final d2 a(int i9) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.e2
    public final /* synthetic */ void f(Object[] objArr, int i9) {
        t3.M(this, (Double[]) objArr, i9);
    }

    @Override // j$.util.stream.d2
    public final void c(int i9, Object obj) {
        int i10 = this.b;
        System.arraycopy(this.a, 0, (double[]) obj, i9, i10);
    }

    @Override // j$.util.stream.d2
    public final void d(Object obj) {
        DoubleConsumer doubleConsumer = (DoubleConsumer) obj;
        for (int i9 = 0; i9 < this.b; i9++) {
            doubleConsumer.accept(this.a[i9]);
        }
    }

    public q2(long j10) {
        if (j10 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.a = new double[(int) j10];
        this.b = 0;
    }

    public q2(double[] dArr) {
        this.a = dArr;
        this.b = dArr.length;
    }

    @Override // j$.util.stream.e2
    public final Spliterator spliterator() {
        int i9 = this.b;
        double[] dArr = this.a;
        Spliterators.a(((double[]) Objects.requireNonNull(dArr)).length, 0, i9);
        return new j$.util.k1(dArr, 0, i9, 1040);
    }

    @Override // j$.util.stream.d2, j$.util.stream.e2
    public final j$.util.d1 spliterator() {
        int i9 = this.b;
        double[] dArr = this.a;
        Spliterators.a(((double[]) Objects.requireNonNull(dArr)).length, 0, i9);
        return new j$.util.k1(dArr, 0, i9, 1040);
    }

    @Override // j$.util.stream.d2
    public final Object b() {
        double[] dArr = this.a;
        int length = dArr.length;
        int i9 = this.b;
        return length == i9 ? dArr : Arrays.copyOf(dArr, i9);
    }

    @Override // j$.util.stream.e2
    public final long count() {
        return this.b;
    }

    public String toString() {
        double[] dArr = this.a;
        return String.format("DoubleArrayNode[%d][%s]", Integer.valueOf(dArr.length - this.b), Arrays.toString(dArr));
    }
}
