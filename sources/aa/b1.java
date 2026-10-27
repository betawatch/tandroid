package aa;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class b1 extends d2 {
    public final int a;
    public final String b;
    public final String c;
    public final boolean d;

    public b1(int i10, String str, String str2, boolean z10) {
        this.a = i10;
        this.b = str;
        this.c = str2;
        this.d = z10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d2) {
            b1 b1Var = (b1) ((d2) obj);
            if (this.a == b1Var.a && this.b.equals(b1Var.b) && this.c.equals(b1Var.c) && this.d == b1Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ (this.d ? 1231 : 1237);
    }

    public final String toString() {
        return "OperatingSystem{platform=" + this.a + ", version=" + this.b + ", buildVersion=" + this.c + ", jailbroken=" + this.d + "}";
    }
}
