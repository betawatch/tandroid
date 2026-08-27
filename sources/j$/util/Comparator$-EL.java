package j$.util;

import java.util.Collections;
import java.util.Comparator;
import java.util.function.ToIntFunction;

/* loaded from: classes2.dex */
public final /* synthetic */ class Comparator$-EL {
    public static Comparator reversed(Comparator comparator) {
        if (comparator instanceof e) {
            ((f) ((e) comparator)).getClass();
            return Comparator$-CC.reverseOrder();
        }
        return Collections.reverseOrder(comparator);
    }

    public static d a(Comparator comparator, Comparator comparator2) {
        if (comparator instanceof e) {
            f fVar = (f) ((e) comparator);
            fVar.getClass();
            Objects.requireNonNull(comparator2);
            return new d(fVar, comparator2, 0);
        }
        Objects.requireNonNull(comparator2);
        return new d(comparator, comparator2, 0);
    }

    public static Comparator thenComparingInt(Comparator comparator, ToIntFunction toIntFunction) {
        if (comparator instanceof e) {
            f fVar = (f) ((e) comparator);
            fVar.getClass();
            return a(fVar, Comparator$-CC.comparingInt(toIntFunction));
        }
        return a(comparator, Comparator$-CC.comparingInt(toIntFunction));
    }
}
