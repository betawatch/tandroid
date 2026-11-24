package j$.util.function;

import j$.time.v;
import j$.util.Objects;
import java.util.function.Predicate;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
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
