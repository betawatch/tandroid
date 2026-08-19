package j$.util;

import java.util.Collections;
import java.util.Comparator;
import java.util.function.ToIntFunction;

/* loaded from: classes2.dex */
public final /* synthetic */ class Comparator$-EL {
    public static Comparator reversed(Comparator comparator) {
        if (!(comparator instanceof d)) {
            return Collections.reverseOrder(comparator);
        }
        ((d) comparator).getClass();
        return Comparator$-CC.reverseOrder();
    }

    public static c a(Comparator comparator, Comparator comparator2) {
        if (!(comparator instanceof d)) {
            Objects.requireNonNull(comparator2);
            return new c(comparator, comparator2, 0);
        }
        d dVar = (d) comparator;
        dVar.getClass();
        Objects.requireNonNull(comparator2);
        return new c(dVar, comparator2, 0);
    }

    public static Comparator thenComparingInt(Comparator comparator, ToIntFunction toIntFunction) {
        if (!(comparator instanceof d)) {
            return a(comparator, Comparator$-CC.comparingInt(toIntFunction));
        }
        d dVar = (d) comparator;
        dVar.getClass();
        return a(dVar, Comparator$-CC.comparingInt(toIntFunction));
    }
}
