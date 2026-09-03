package dg;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class g1 {
    public final double a;
    public final double b;
    public final double c;
    public boolean d;

    public g1(double d, double d10, double d11) {
        this.a = d;
        this.b = d10;
        this.c = d11;
    }

    public final float a(g1 g1Var) {
        return (float) Math.sqrt(Math.pow(this.c - g1Var.c, 2.0d) + Math.pow(this.b - g1Var.b, 2.0d) + Math.pow(this.a - g1Var.a, 2.0d));
    }

    public final g1 b(g1 g1Var) {
        return new g1((this.a + g1Var.a) * 0.5d, (this.b + g1Var.b) * 0.5d, (this.c + g1Var.c) * 0.5d);
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g1)) {
            return false;
        }
        g1 g1Var = (g1) obj;
        return this.a == g1Var.a && this.b == g1Var.b && this.c == g1Var.c;
    }

    public g1(double d, double d10, double d11, int i10) {
        this.a = d;
        this.b = d10;
        this.c = d11;
        this.d = true;
    }
}
