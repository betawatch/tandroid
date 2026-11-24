// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class bn8 {
    public final String a;
    public final int b;
    public final int c;
    public final boolean d;

    public bn8(int i, int i2, String str, boolean z) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bn8)) {
            return false;
        }
        bn8 bn8Var = (bn8) obj;
        return this.a.equals(bn8Var.a) && this.b == bn8Var.b && this.c == bn8Var.c && this.d == bn8Var.d;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b) * 31) + this.c) * 31) + (this.d ? 1231 : 1237);
    }

    public final String toString() {
        return "ProcessDetails(processName=" + this.a + ", pid=" + this.b + ", importance=" + this.c + ", isDefaultProcess=" + this.d + ')';
    }
}
