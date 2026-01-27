package j$.util;

import j$.util.stream.IntStream;
import j$.util.stream.LongStream;
import j$.util.stream.Stream;

/* loaded from: classes2.dex */
public final /* synthetic */ class DesugarArrays {
    public static <T> Stream<T> stream(T[] tArr) {
        return j$.util.stream.w0.f0(Spliterators.m(tArr, 0, tArr.length), false);
    }

    public static IntStream stream(int[] iArr) {
        return j$.util.stream.w0.T(Spliterators.k(iArr, 0, iArr.length));
    }

    public static LongStream stream(long[] jArr) {
        return j$.util.stream.w0.V(Spliterators.l(jArr, 0, jArr.length));
    }
}
