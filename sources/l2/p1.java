package l2;

import j$.util.Objects;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class p1 {
    public static final p1 b;
    public final h9.t0 a;

    static {
        hi.u0 u0Var = new hi.u0(11);
        u0Var.b = h9.t0.p(2, 1, 5);
        b = new p1(u0Var);
    }

    public p1(hi.u0 u0Var) {
        this.a = (h9.t0) u0Var.b;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof p1) && this.a.equals(((p1) obj).a);
    }

    public final int hashCode() {
        Boolean bool = Boolean.TRUE;
        return Objects.hash(this.a, null, null, bool, bool, bool, bool, bool);
    }
}
