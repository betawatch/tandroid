package n7;

import j$.util.Objects;
import java.util.Comparator;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public abstract class q0 {
    public static final Comparator a;

    static {
        Comparator comparator;
        try {
            Object[] enumConstants = Class.forName(q0.class.getName().concat("$UnsafeComparator")).getEnumConstants();
            Objects.requireNonNull(enumConstants);
            comparator = (Comparator) enumConstants[0];
        } catch (Throwable unused) {
            comparator = p0.a;
        }
        a = comparator;
    }
}
