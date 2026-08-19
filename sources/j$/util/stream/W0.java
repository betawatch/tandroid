package j$.util.stream;

import j$.util.DesugarArrays;
import j$.util.Spliterator;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
public class W0 implements x0 {
    public final int[] a;
    public int b;

    @Override // j$.util.stream.B0
    public final /* synthetic */ B0 f(long j, long j2, IntFunction intFunction) {
        return q1.u(this, j, j2);
    }

    @Override // j$.util.stream.B0
    public final /* synthetic */ void forEach(Consumer consumer) {
        q1.r(this, consumer);
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
        q1.o(this, (Integer[]) objArr, i);
    }

    @Override // j$.util.stream.A0
    public final void e(Object obj) {
        IntConsumer intConsumer = (IntConsumer) obj;
        for (int i = 0; i < this.b; i++) {
            intConsumer.accept(this.a[i]);
        }
    }

    @Override // j$.util.stream.A0
    public final void j(int i, Object obj) {
        int i2 = this.b;
        System.arraycopy(this.a, 0, (int[]) obj, i, i2);
    }

    public W0(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.a = new int[(int) j];
        this.b = 0;
    }

    public W0(int[] iArr) {
        this.a = iArr;
        this.b = iArr.length;
    }

    @Override // j$.util.stream.B0
    public final Spliterator spliterator() {
        return DesugarArrays.b(this.a, 0, this.b);
    }

    @Override // j$.util.stream.A0, j$.util.stream.B0
    public final j$.util.c0 spliterator() {
        return DesugarArrays.b(this.a, 0, this.b);
    }

    @Override // j$.util.stream.A0
    public final Object d() {
        int[] iArr = this.a;
        int length = iArr.length;
        int i = this.b;
        return length == i ? iArr : Arrays.copyOf(iArr, i);
    }

    @Override // j$.util.stream.B0
    public final long count() {
        return this.b;
    }

    public String toString() {
        int[] iArr = this.a;
        return String.format("IntArrayNode[%d][%s]", Integer.valueOf(iArr.length - this.b), Arrays.toString(iArr));
    }
}
