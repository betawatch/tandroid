// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final class hj8 {
    public final String a;
    public final String b;
    public final int c;

    public hj8(String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = str2.hashCode() + (str.hashCode() * 31);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof hj8)) {
            return false;
        }
        hj8 hj8Var = (hj8) obj;
        return this.a.equals(hj8Var.a) && this.b.equals(hj8Var.b);
    }

    public final int hashCode() {
        return this.c;
    }
}
