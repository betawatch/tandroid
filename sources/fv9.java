// default package

import j$.util.Objects;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class fv9 {
    public static final fv9 b;
    public final bp5 a;

    static {
        k09 k09Var = new k09((byte) 7);
        k09Var.b = bp5.p(2, 1, 5);
        b = new fv9(k09Var);
    }

    public fv9(k09 k09Var) {
        this.a = (bp5) k09Var.b;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof fv9) && this.a.equals(((fv9) obj).a);
    }

    public final int hashCode() {
        Boolean bool = Boolean.TRUE;
        return Objects.hash(this.a, null, null, bool, bool, bool, bool, bool);
    }
}
