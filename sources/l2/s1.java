package l2;

import j$.util.Objects;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class s1 {
    public static final s1 b;
    public final h9.t0 a;

    static {
        h9.f1 f1Var = new h9.f1(7, false);
        f1Var.b = h9.t0.p(2, 1, 5);
        b = new s1(f1Var);
    }

    public s1(h9.f1 f1Var) {
        this.a = (h9.t0) f1Var.b;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof s1) && this.a.equals(((s1) obj).a);
    }

    public final int hashCode() {
        Boolean bool = Boolean.TRUE;
        return Objects.hash(this.a, null, null, bool, bool, bool, bool, bool);
    }
}
