package j$.util;

import java.util.Collections;
import java.util.Comparator;
import java.util.function.ToIntFunction;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
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
