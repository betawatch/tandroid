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
    static final Set a;
    static final Set b;
    static final Set c;

    static {
        Collector.Characteristics characteristics = Collector.Characteristics.CONCURRENT;
        Collector.Characteristics characteristics2 = Collector.Characteristics.UNORDERED;
        Collector.Characteristics characteristics3 = Collector.Characteristics.IDENTITY_FINISH;
        Collections.unmodifiableSet(EnumSet.of(characteristics, characteristics2, characteristics3));
        Collections.unmodifiableSet(EnumSet.of(characteristics, characteristics2));
        a = Collections.unmodifiableSet(EnumSet.of(characteristics3));
        b = Collections.unmodifiableSet(EnumSet.of(characteristics2, characteristics3));
        c = Collections.emptySet();
        Collections.unmodifiableSet(EnumSet.of(characteristics2));
    }

    public static <T, C extends Collection<T>> Collector<T, ?, C> toCollection(Supplier<C> supplier) {
        return new l(supplier, new j(21), new j(0), a);
    }

    public static <T> Collector<T, ?, List<T>> toList() {
        return new l(new j(22), new j(23), new j(1), a);
    }

    public static <T> Collector<T, ?, Set<T>> toSet() {
        return new l(new j(25), new j(26), new j(3), b);
    }

    public static Collector<CharSequence, ?, String> joining(CharSequence charSequence) {
        return new l(new a(1, charSequence), new j(28), new j(29), new k(0), c);
    }

    static void a(double[] dArr, double d) {
        double d2 = d - dArr[1];
        double d3 = dArr[0];
        double d4 = d3 + d2;
        dArr[1] = (d4 - d3) - d2;
        dArr[0] = d4;
    }
}
