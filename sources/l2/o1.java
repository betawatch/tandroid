package l2;

import hi.t5;
import j$.util.Objects;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final class o1 {
    public static final o1 b;
    public final h9.t0 a;

    static {
        t5 t5Var = new t5(10);
        t5Var.b = h9.t0.p(2, 1, 5);
        b = new o1(t5Var);
    }

    public o1(t5 t5Var) {
        this.a = (h9.t0) t5Var.b;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof o1) && this.a.equals(((o1) obj).a);
    }

    public final int hashCode() {
        Boolean bool = Boolean.TRUE;
        return Objects.hash(this.a, null, null, bool, bool, bool, bool, bool);
    }
}
