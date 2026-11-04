package k2;

import gi.w5;
import j$.util.Objects;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class s1 {
    public static final s1 b;
    public final g9.t0 a;

    static {
        w5 w5Var = new w5(6, false);
        w5Var.b = g9.t0.p(2, 1, 5);
        b = new s1(w5Var);
    }

    public s1(w5 w5Var) {
        this.a = (g9.t0) w5Var.b;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof s1) && this.a.equals(((s1) obj).a);
    }

    public final int hashCode() {
        Boolean bool = Boolean.TRUE;
        return Objects.hash(this.a, null, null, bool, bool, bool, bool, bool);
    }
}
