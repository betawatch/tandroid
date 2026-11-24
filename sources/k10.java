// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class k10 {
    public static final k10 d = new j10().a();
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public k10(j10 j10Var) {
        this.a = j10Var.a;
        this.b = j10Var.b;
        this.c = j10Var.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k10.class != obj.getClass()) {
            return false;
        }
        k10 k10Var = (k10) obj;
        return this.a == k10Var.a && this.b == k10Var.b && this.c == k10Var.c;
    }

    public final int hashCode() {
        return ((this.a ? 1 : 0) << 2) + ((this.b ? 1 : 0) << 1) + (this.c ? 1 : 0);
    }
}
