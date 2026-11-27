// default package

import j$.util.Objects;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class fv9 {
    public static final fv9 b;
    public final bp5 a;

    static {
        l09 l09Var = new l09((byte) 7);
        l09Var.b = bp5.p(2, 1, 5);
        b = new fv9(l09Var);
    }

    public fv9(l09 l09Var) {
        this.a = (bp5) l09Var.b;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof fv9) && this.a.equals(((fv9) obj).a);
    }

    public final int hashCode() {
        Boolean bool = Boolean.TRUE;
        return Objects.hash(this.a, null, null, bool, bool, bool, bool, bool);
    }
}
