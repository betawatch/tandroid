// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class np5 extends uj5 {
    public final String b;
    public final String c;
    public final String d;

    public np5(String str, String str2, String str3) {
        super("----");
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || np5.class != obj.getClass()) {
            return false;
        }
        np5 np5Var = (np5) obj;
        return this.c.equals(np5Var.c) && this.b.equals(np5Var.b) && this.d.equals(np5Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ir2.j(ir2.j(527, 31, this.b), 31, this.c);
    }

    @Override // uj5
    public final String toString() {
        return this.a + ": domain=" + this.b + ", description=" + this.c;
    }
}
