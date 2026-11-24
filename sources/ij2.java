// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final class ij2 {
    public final String a;
    public final String b;

    public ij2(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ij2)) {
            return false;
        }
        ij2 ij2Var = (ij2) obj;
        return this.a.equals(ij2Var.a) && this.b.equals(ij2Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
