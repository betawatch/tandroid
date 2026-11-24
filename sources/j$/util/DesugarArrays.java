package j$.util;

import j$.util.stream.IntStream;
import j$.util.stream.LongStream;
import j$.util.stream.Stream;
import j$.util.stream.b7;
import j$.util.stream.w3;

/* loaded from: classes4.dex */
public final /* synthetic */ class DesugarArrays {
    public static j1 a(Object[] objArr, int i, int i2) {
        Spliterators.a(((Object[]) Objects.requireNonNull(objArr)).length, i, i2);
        return new j1(objArr, i, i2, 1040);
    }

    public static p1 b(int[] iArr, int i, int i2) {
        Spliterators.a(((int[]) Objects.requireNonNull(iArr)).length, i, i2);
        return new p1(iArr, i, i2, 1040);
    }

    public static r1 c(long[] jArr, int i, int i2) {
        Spliterators.a(((long[]) Objects.requireNonNull(jArr)).length, i, i2);
        return new r1(jArr, i, i2, 1040);
    }

    public static IntStream stream(int[] iArr) {
        p1 b = b(iArr, 0, iArr.length);
        return new j$.util.stream.z0(b, b7.l(b), false);
    }

    public static <T> Stream<T> stream(T[] tArr) {
        return w3.a0(a(tArr, 0, tArr.length), false);
    }

    public static LongStream stream(long[] jArr) {
        r1 c = c(jArr, 0, jArr.length);
        return new j$.util.stream.i1(c, b7.l(c), false);
    }
}
