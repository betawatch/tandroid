// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class k00 {
    public static final k00 d = new j00().a();
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public k00(j00 j00Var) {
        this.a = j00Var.a;
        this.b = j00Var.b;
        this.c = j00Var.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k00.class != obj.getClass()) {
            return false;
        }
        k00 k00Var = (k00) obj;
        return this.a == k00Var.a && this.b == k00Var.b && this.c == k00Var.c;
    }

    public final int hashCode() {
        return ((this.a ? 1 : 0) << 2) + ((this.b ? 1 : 0) << 1) + (this.c ? 1 : 0);
    }
}
