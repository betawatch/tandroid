package j$.util.function;

import j$.time.v;
import j$.util.Objects;
import java.util.function.Predicate;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes4.dex */
public final /* synthetic */ class Predicate$-CC {
    public static Predicate $default$and(Predicate predicate, Predicate predicate2) {
        Objects.requireNonNull(predicate2);
        return new h(predicate, predicate2, (byte) 0);
    }

    public static Predicate $default$negate(Predicate predicate) {
        return new v((byte) 2, predicate);
    }

    public static Predicate $default$or(Predicate predicate, Predicate predicate2) {
        Objects.requireNonNull(predicate2);
        return new h(predicate, predicate2, (byte) 1);
    }
}
