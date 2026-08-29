package j$.util;

import j$.util.stream.IntStream;
import j$.util.stream.LongStream;
import j$.util.stream.Stream;
import j$.util.stream.t3;
import j$.util.stream.v6;

/* loaded from: classes2.dex */
public final /* synthetic */ class DesugarArrays {
    public static j1 a(Object[] objArr, int i10, int i11) {
        Spliterators.a(((Object[]) Objects.requireNonNull(objArr)).length, i10, i11);
        return new j1(objArr, i10, i11, 1040);
    }

    public static p1 b(int[] iArr, int i10, int i11) {
        Spliterators.a(((int[]) Objects.requireNonNull(iArr)).length, i10, i11);
        return new p1(iArr, i10, i11, 1040);
    }

    public static r1 c(long[] jArr, int i10, int i11) {
        Spliterators.a(((long[]) Objects.requireNonNull(jArr)).length, i10, i11);
        return new r1(jArr, i10, i11, 1040);
    }

    public static <T> Stream<T> stream(T[] tArr) {
        return t3.E0(a(tArr, 0, tArr.length), false);
    }

    public static IntStream stream(int[] iArr) {
        p1 b10 = b(iArr, 0, iArr.length);
        return new j$.util.stream.w0(b10, v6.l(b10), false);
    }

    public static LongStream stream(long[] jArr) {
        r1 c3 = c(jArr, 0, jArr.length);
        return new j$.util.stream.f1(c3, v6.l(c3), false);
    }
}
