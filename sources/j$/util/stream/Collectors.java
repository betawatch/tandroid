package j$.util.stream;

import j$.util.stream.Collector;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import java.util.function.Supplier;

/* loaded from: classes2.dex */
public final class Collectors {
    public static final Set a;
    public static final Set b;
    public static final Set c;

    static {
        Collector.Characteristics characteristics = Collector.Characteristics.CONCURRENT;
        Collector.Characteristics characteristics2 = Collector.Characteristics.UNORDERED;
        Collector.Characteristics characteristics3 = Collector.Characteristics.IDENTITY_FINISH;
        Collections.unmodifiableSet(EnumSet.of(characteristics, characteristics2, characteristics3));
        Collections.unmodifiableSet(EnumSet.of(characteristics, characteristics2));
        a = Collections.unmodifiableSet(EnumSet.of(characteristics3));
        b = Collections.unmodifiableSet(EnumSet.of(characteristics2, characteristics3));
        c = Collections.EMPTY_SET;
        Collections.unmodifiableSet(EnumSet.of(characteristics2));
    }

    public static <T, C extends Collection<T>> Collector<T, ?, C> toCollection(Supplier<C> supplier) {
        return new i(supplier, new j$.time.format.a(10), new j$.time.format.a(11), a);
    }

    public static <T> Collector<T, ?, List<T>> toList() {
        return new i(new j$.time.format.a(12), new j$.time.format.a(13), new j$.time.format.a(18), a);
    }

    public static <T> Collector<T, ?, Set<T>> toSet() {
        return new i(new j$.time.format.a(15), new j$.time.format.a(16), new j$.time.format.a(23), b);
    }

    public static Collector<CharSequence, ?, String> joining(CharSequence charSequence) {
        return new i(new j$.time.t(5, charSequence), new j$.time.format.a(20), new j$.time.format.a(21), new j$.time.format.a(22), c);
    }

    public static void a(double[] dArr, double d) {
        double d2 = d - dArr[1];
        double d3 = dArr[0];
        double d4 = d3 + d2;
        dArr[1] = (d4 - d3) - d2;
        dArr[0] = d4;
    }
}
