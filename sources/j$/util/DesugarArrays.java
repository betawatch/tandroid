package j$.util;

import j$.util.stream.IntStream;
import j$.util.stream.Stream;
import j$.util.stream.w0;

/* loaded from: classes2.dex */
public final /* synthetic */ class DesugarArrays {
    public static <T> Stream<T> stream(T[] tArr) {
        return w0.f0(Spliterators.m(tArr, 0, tArr.length), false);
    }

    public static IntStream stream(int[] iArr) {
        return w0.T(Spliterators.k(iArr, 0, iArr.length));
    }
}
