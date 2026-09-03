package k9;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class z0 extends b2 {
    public final int a;
    public final String b;
    public final String c;
    public final boolean d;

    public z0(int i10, String str, String str2, boolean z4) {
        this.a = i10;
        this.b = str;
        this.c = str2;
        this.d = z4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b2) {
            z0 z0Var = (z0) ((b2) obj);
            if (this.a == z0Var.a && this.b.equals(z0Var.b) && this.c.equals(z0Var.c) && this.d == z0Var.d) {
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
