// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class ba0 extends h03 {
    public final String a;
    public final int b;
    public final int c;
    public final boolean d;

    public ba0(int i, int i2, String str, boolean z) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h03) {
            ba0 ba0Var = (ba0) ((h03) obj);
            if (this.a.equals(ba0Var.a) && this.b == ba0Var.b && this.c == ba0Var.c && this.d == ba0Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ (this.d ? 1231 : 1237);
    }

    public final String toString() {
        return "ProcessDetails{processName=" + this.a + ", pid=" + this.b + ", importance=" + this.c + ", defaultProcess=" + this.d + "}";
    }
}
