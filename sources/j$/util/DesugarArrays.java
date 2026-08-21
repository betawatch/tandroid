package j$.util;

import j$.util.stream.IntStream;
import j$.util.stream.LongStream;
import j$.util.stream.S2;
import j$.util.stream.Stream;
import j$.util.stream.r1;

/* loaded from: classes2.dex */
public final /* synthetic */ class DesugarArrays {
    public static i0 a(Object[] objArr, int i, int i2) {
        Spliterators.a(((Object[]) Objects.requireNonNull(objArr)).length, i, i2);
        return new i0(objArr, i, i2, 1040);
    }

    public static o0 b(int[] iArr, int i, int i2) {
        Spliterators.a(((int[]) Objects.requireNonNull(iArr)).length, i, i2);
        return new o0(iArr, i, i2, 1040);
    }

    public static q0 c(long[] jArr, int i, int i2) {
        Spliterators.a(((long[]) Objects.requireNonNull(jArr)).length, i, i2);
        return new q0(jArr, i, i2, 1040);
    }

    public static <T> Stream<T> stream(T[] tArr) {
        return r1.a0(a(tArr, 0, tArr.length), false);
    }

    public static IntStream stream(int[] iArr) {
        o0 b = b(iArr, 0, iArr.length);
        return new j$.util.stream.W(b, S2.p(b), false);
    }

    public static LongStream stream(long[] jArr) {
        q0 c = c(jArr, 0, jArr.length);
        return new j$.util.stream.e0(c, S2.p(c), false);
    }
}
