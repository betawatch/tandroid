package j$.util;

import java.util.Collections;
import java.util.Comparator;
import java.util.function.ToIntFunction;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes4.dex */
public final /* synthetic */ class Comparator$-EL {
    public static d a(Comparator comparator, Comparator comparator2) {
        if (comparator instanceof f) {
            Objects.requireNonNull(comparator2);
            return new d((f) comparator, comparator2);
        }
        Objects.requireNonNull(comparator2);
        return new d(comparator, comparator2);
    }

    public static Comparator reversed(Comparator comparator) {
        if (!(comparator instanceof f)) {
            return Collections.reverseOrder(comparator);
        }
        return Comparator$-CC.reverseOrder();
    }

    public static Comparator thenComparingInt(Comparator comparator, ToIntFunction toIntFunction) {
        return comparator instanceof f ? a((f) comparator, Comparator$-CC.comparingInt(toIntFunction)) : a(comparator, Comparator$-CC.comparingInt(toIntFunction));
    }
}
