package j$.util.stream;

import j$.util.DesugarArrays;
import j$.util.Spliterator;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
public class z2 implements a2 {
    public final int[] a;
    public int b;

    @Override // j$.util.stream.e2
    public final /* synthetic */ e2 e(long j10, long j11, IntFunction intFunction) {
        return t3.T(this, j10, j11);
    }

    @Override // j$.util.stream.e2
    public final /* synthetic */ void forEach(Consumer consumer) {
        t3.Q(this, consumer);
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
        t3.N(this, (Integer[]) objArr, i9);
    }

    @Override // j$.util.stream.d2
    public final void c(int i9, Object obj) {
        int i10 = this.b;
        System.arraycopy(this.a, 0, (int[]) obj, i9, i10);
    }

    @Override // j$.util.stream.d2
    public final void d(Object obj) {
        IntConsumer intConsumer = (IntConsumer) obj;
        for (int i9 = 0; i9 < this.b; i9++) {
            intConsumer.accept(this.a[i9]);
        }
    }

    public z2(long j10) {
        if (j10 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.a = new int[(int) j10];
        this.b = 0;
    }

    public z2(int[] iArr) {
        this.a = iArr;
        this.b = iArr.length;
    }

    @Override // j$.util.stream.e2
    public final Spliterator spliterator() {
        return DesugarArrays.b(this.a, 0, this.b);
    }

    @Override // j$.util.stream.d2, j$.util.stream.e2
    public final j$.util.d1 spliterator() {
        return DesugarArrays.b(this.a, 0, this.b);
    }

    @Override // j$.util.stream.d2
    public final Object b() {
        int[] iArr = this.a;
        int length = iArr.length;
        int i9 = this.b;
        return length == i9 ? iArr : Arrays.copyOf(iArr, i9);
    }

    @Override // j$.util.stream.e2
    public final long count() {
        return this.b;
    }

    public String toString() {
        int[] iArr = this.a;
        return String.format("IntArrayNode[%d][%s]", Integer.valueOf(iArr.length - this.b), Arrays.toString(iArr));
    }
}
