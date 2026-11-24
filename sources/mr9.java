// default package

import j$.util.Objects;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class mr9 {
    public static final mr9 b;
    public final ym5 a;

    static {
        v39 v39Var = new v39((byte) 6);
        v39Var.b = ym5.p(2, 1, 5);
        b = new mr9(v39Var);
    }

    public mr9(v39 v39Var) {
        this.a = (ym5) v39Var.b;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof mr9) && this.a.equals(((mr9) obj).a);
    }

    public final int hashCode() {
        Boolean bool = Boolean.TRUE;
        return Objects.hash(this.a, null, null, bool, bool, bool, bool, bool);
    }
}
