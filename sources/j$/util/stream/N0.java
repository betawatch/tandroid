package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
public class N0 implements v0 {
    public final double[] a;
    public int b;

    @Override // j$.util.stream.B0
    public final /* synthetic */ B0 f(long j, long j2, IntFunction intFunction) {
        return q1.t(this, j, j2);
    }

    @Override // j$.util.stream.B0
    public final /* synthetic */ void forEach(Consumer consumer) {
        q1.q(this, consumer);
    }

    @Override // j$.util.stream.B0
    public final /* synthetic */ Object[] h(IntFunction intFunction) {
        return q1.m(this, intFunction);
    }

    @Override // j$.util.stream.B0
    public final /* synthetic */ int i() {
        return 0;
    }

    @Override // j$.util.stream.B0
    public final /* bridge */ /* synthetic */ B0 b(int i) {
        b(i);
        throw null;
    }

    @Override // j$.util.stream.A0, j$.util.stream.B0
    public final A0 b(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.B0
    public final /* synthetic */ void g(Object[] objArr, int i) {
        q1.n(this, (Double[]) objArr, i);
    }

    @Override // j$.util.stream.A0
    public final void e(Object obj) {
        DoubleConsumer doubleConsumer = (DoubleConsumer) obj;
        for (int i = 0; i < this.b; i++) {
            doubleConsumer.accept(this.a[i]);
        }
    }

    @Override // j$.util.stream.A0
    public final void j(int i, Object obj) {
        int i2 = this.b;
        System.arraycopy(this.a, 0, (double[]) obj, i, i2);
    }

    public N0(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.a = new double[(int) j];
        this.b = 0;
    }

    public N0(double[] dArr) {
        this.a = dArr;
        this.b = dArr.length;
    }

    @Override // j$.util.stream.B0
    public final Spliterator spliterator() {
        int i = this.b;
        double[] dArr = this.a;
        Spliterators.a(((double[]) Objects.requireNonNull(dArr)).length, 0, i);
        return new j$.util.j0(dArr, 0, i, 1040);
    }

    @Override // j$.util.stream.A0, j$.util.stream.B0
    public final j$.util.c0 spliterator() {
        int i = this.b;
        double[] dArr = this.a;
        Spliterators.a(((double[]) Objects.requireNonNull(dArr)).length, 0, i);
        return new j$.util.j0(dArr, 0, i, 1040);
    }

    @Override // j$.util.stream.A0
    public final Object d() {
        double[] dArr = this.a;
        int length = dArr.length;
        int i = this.b;
        return length == i ? dArr : Arrays.copyOf(dArr, i);
    }

    @Override // j$.util.stream.B0
    public final long count() {
        return this.b;
    }

    public String toString() {
        double[] dArr = this.a;
        return String.format("DoubleArrayNode[%d][%s]", Integer.valueOf(dArr.length - this.b), Arrays.toString(dArr));
    }
}
