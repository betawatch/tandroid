package j$.util.stream;

import j$.util.function.Supplier;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes2.dex */
public final class Collectors {
    static final Set a;
    static final Set b;

    static {
        h hVar = h.CONCURRENT;
        h hVar2 = h.UNORDERED;
        h hVar3 = h.IDENTITY_FINISH;
        Collections.unmodifiableSet(EnumSet.of(hVar, hVar2, hVar3));
        Collections.unmodifiableSet(EnumSet.of(hVar, hVar2));
        a = Collections.unmodifiableSet(EnumSet.of(hVar3));
        b = Collections.unmodifiableSet(EnumSet.of(hVar2, hVar3));
        Collections.emptySet();
    }

    static void a(double[] dArr, double d) {
        double d2 = d - dArr[1];
        double d3 = dArr[0];
        double d4 = d3 + d2;
        dArr[1] = (d4 - d3) - d2;
        dArr[0] = d4;
    }

    public static <T, C extends Collection<T>> Collector<T, ?, C> toCollection(Supplier<C> supplier) {
        return new m(supplier, new l(14), new k(0), a);
    }

    public static <T> Collector<T, ?, List<T>> toList() {
        return new m(new l(17), new l(18), new k(1), a);
    }

    public static <T> Collector<T, ?, Set<T>> toSet() {
        return new m(new l(19), new l(20), new k(2), b);
    }
}
