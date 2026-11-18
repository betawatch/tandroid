package l2;

import hi.u5;
import j$.util.Objects;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final class o1 {
    public static final o1 b;
    public final h9.t0 a;

    static {
        u5 u5Var = new u5(10);
        u5Var.b = h9.t0.p(2, 1, 5);
        b = new o1(u5Var);
    }

    public o1(u5 u5Var) {
        this.a = (h9.t0) u5Var.b;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof o1) && this.a.equals(((o1) obj).a);
    }

    public final int hashCode() {
        Boolean bool = Boolean.TRUE;
        return Objects.hash(this.a, null, null, bool, bool, bool, bool, bool);
    }
}
