package j$.util;

import j$.util.function.ToIntFunction;
import java.util.Collections;
import java.util.Comparator;

/* loaded from: classes2.dex */
public final /* synthetic */ class Comparator$-EL {
    public static Comparator reversed(Comparator comparator) {
        if (!(comparator instanceof c)) {
            return Collections.reverseOrder(comparator);
        }
        ((d) ((c) comparator)).getClass();
        return Comparator$-CC.reverseOrder();
    }

    public static b a(Comparator comparator, Comparator comparator2) {
        if (!(comparator instanceof c)) {
            comparator2.getClass();
            return new b(comparator, comparator2, 0);
        }
        d dVar = (d) ((c) comparator);
        dVar.getClass();
        comparator2.getClass();
        return new b(dVar, comparator2, 0);
    }

    public static Comparator thenComparingInt(Comparator comparator, ToIntFunction toIntFunction) {
        if (!(comparator instanceof c)) {
            return a(comparator, Comparator$-CC.comparingInt(toIntFunction));
        }
        d dVar = (d) ((c) comparator);
        dVar.getClass();
        return a(dVar, Comparator$-CC.comparingInt(toIntFunction));
    }
}
