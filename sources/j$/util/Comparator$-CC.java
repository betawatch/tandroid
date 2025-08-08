package j$.util;

import j$.util.function.Function;
import j$.util.function.ToDoubleFunction;
import j$.util.function.ToIntFunction;
import j$.util.function.ToLongFunction;
import java.util.Collections;
import java.util.Comparator;

/* loaded from: classes2.dex */
public final /* synthetic */ class Comparator$-CC {
    public static <T, U extends Comparable<? super U>> Comparator<T> comparing(Function<? super T, ? extends U> function) {
        function.getClass();
        return new a(function, 2);
    }

    public static <T> Comparator<T> comparingDouble(ToDoubleFunction<? super T> toDoubleFunction) {
        toDoubleFunction.getClass();
        return new a(toDoubleFunction, 1);
    }

    public static <T> Comparator<T> comparingInt(ToIntFunction<? super T> toIntFunction) {
        toIntFunction.getClass();
        return new a(toIntFunction, 0);
    }

    public static <T> Comparator<T> comparingLong(ToLongFunction<? super T> toLongFunction) {
        toLongFunction.getClass();
        return new a(toLongFunction, 3);
    }

    public static <T extends Comparable<? super T>> Comparator<T> reverseOrder() {
        return Collections.reverseOrder();
    }

    public static Comparator a() {
        return d.INSTANCE;
    }
}
