// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class jf8 {
    public final double a;
    public final double b;
    public final double c;
    public boolean d;

    public jf8(double d, double d2, double d3, int i) {
        this.a = d;
        this.b = d2;
        this.c = d3;
        this.d = true;
    }

    public final float a(jf8 jf8Var) {
        return (float) Math.sqrt(Math.pow(this.c - jf8Var.c, 2.0d) + Math.pow(this.b - jf8Var.b, 2.0d) + Math.pow(this.a - jf8Var.a, 2.0d));
    }

    public final jf8 b(jf8 jf8Var) {
        return new jf8((this.a + jf8Var.a) * 0.5d, (this.b + jf8Var.b) * 0.5d, (this.c + jf8Var.c) * 0.5d);
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof jf8)) {
            return false;
        }
        jf8 jf8Var = (jf8) obj;
        return this.a == jf8Var.a && this.b == jf8Var.b && this.c == jf8Var.c;
    }

    public jf8(double d, double d2, double d3) {
        this.a = d;
        this.b = d2;
        this.c = d3;
    }
}
