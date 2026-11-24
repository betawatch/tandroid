package j$.util.stream;

import j$.util.DesugarArrays;
import j$.util.Spliterator;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.LongConsumer;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes4.dex */
public class l3 implements f2 {
    public final long[] a;
    public int b;

    public l3(long j) {
        if (j >= 2147483639) {
            j$.time.g.c("Stream size exceeds max array size");
            throw null;
        }
        this.a = new long[(int) j];
        this.b = 0;
    }

    @Override // j$.util.stream.g2, j$.util.stream.h2
    public final g2 a(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.g2
    public final Object b() {
        long[] jArr = this.a;
        int length = jArr.length;
        int i = this.b;
        return length == i ? jArr : Arrays.copyOf(jArr, i);
    }

    @Override // j$.util.stream.g2
    public final void c(int i, Object obj) {
        int i2 = this.b;
        System.arraycopy(this.a, 0, (long[]) obj, i, i2);
    }

    @Override // j$.util.stream.h2
    public final long count() {
        return this.b;
    }

    @Override // j$.util.stream.g2
    public final void d(Object obj) {
        LongConsumer longConsumer = (LongConsumer) obj;
        for (int i = 0; i < this.b; i++) {
            longConsumer.accept(this.a[i]);
        }
    }

    @Override // j$.util.stream.h2
    public final /* synthetic */ h2 e(long j, long j2, IntFunction intFunction) {
        return w3.v(this, j, j2);
    }

    @Override // j$.util.stream.h2
    public final /* synthetic */ void f(Object[] objArr, int i) {
        w3.p(this, (Long[]) objArr, i);
    }

    @Override // j$.util.stream.h2
    public final /* synthetic */ void forEach(Consumer consumer) {
        w3.s(this, consumer);
    }

    @Override // j$.util.stream.h2
    public final /* synthetic */ Object[] g(IntFunction intFunction) {
        return w3.m(this, intFunction);
    }

    @Override // j$.util.stream.h2
    public final int h() {
        return 0;
    }

    @Override // j$.util.stream.g2, j$.util.stream.h2
    public final j$.util.d1 spliterator() {
        return DesugarArrays.c(this.a, 0, this.b);
    }

    public String toString() {
        long[] jArr = this.a;
        return String.format("LongArrayNode[%d][%s]", Integer.valueOf(jArr.length - this.b), Arrays.toString(jArr));
    }

    @Override // j$.util.stream.h2
    public final h2 a(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.h2
    public final Spliterator spliterator() {
        return DesugarArrays.c(this.a, 0, this.b);
    }

    public l3(long[] jArr) {
        this.a = jArr;
        this.b = jArr.length;
    }
}
