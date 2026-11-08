package l2;

import j$.util.Objects;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
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
