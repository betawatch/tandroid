package cg;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class h1 {
    public final double a;
    public final double b;
    public final double c;
    public boolean d;

    public h1(double d, double d10, double d11) {
        this.a = d;
        this.b = d10;
        this.c = d11;
    }

    public final float a(h1 h1Var) {
        return (float) Math.sqrt(Math.pow(this.c - h1Var.c, 2.0d) + Math.pow(this.b - h1Var.b, 2.0d) + Math.pow(this.a - h1Var.a, 2.0d));
    }

    public final h1 b(h1 h1Var) {
        return new h1((this.a + h1Var.a) * 0.5d, (this.b + h1Var.b) * 0.5d, (this.c + h1Var.c) * 0.5d);
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h1)) {
            return false;
        }
        h1 h1Var = (h1) obj;
        return this.a == h1Var.a && this.b == h1Var.b && this.c == h1Var.c;
    }

    public h1(double d, double d10, double d11, int i10) {
        this.a = d;
        this.b = d10;
        this.c = d11;
        this.d = true;
    }
}
