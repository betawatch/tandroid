package j$.util.stream;

import j$.util.function.Supplier;
import j$.util.stream.Collector;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

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
    }

    public static <T, C extends Collection<T>> Collector<T, ?, C> toCollection(Supplier<C> supplier) {
        return new l(supplier, new k(14), new j(0), a);
    }

    public static <T> Collector<T, ?, List<T>> toList() {
        return new l(new k(17), new k(18), new j(1), a);
    }

    public static <T> Collector<T, ?, Set<T>> toSet() {
        return new l(new k(19), new k(20), new j(2), b);
    }

    static void a(double[] dArr, double d) {
        double d2 = d - dArr[1];
        double d3 = dArr[0];
        double d4 = d3 + d2;
        dArr[1] = (d4 - d3) - d2;
        dArr[0] = d4;
    }
}
