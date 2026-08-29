package ag;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class j1 {
    public final double a;
    public final double b;
    public final double c;
    public boolean d;

    public j1(double d, double d10, double d11) {
        this.a = d;
        this.b = d10;
        this.c = d11;
    }

    public final float a(j1 j1Var) {
        return (float) Math.sqrt(Math.pow(this.c - j1Var.c, 2.0d) + Math.pow(this.b - j1Var.b, 2.0d) + Math.pow(this.a - j1Var.a, 2.0d));
    }

    public final j1 b(j1 j1Var) {
        return new j1((this.a + j1Var.a) * 0.5d, (this.b + j1Var.b) * 0.5d, (this.c + j1Var.c) * 0.5d);
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j1)) {
            return false;
        }
        j1 j1Var = (j1) obj;
        return this.a == j1Var.a && this.b == j1Var.b && this.c == j1Var.c;
    }

    public j1(double d, double d10, double d11, int i10) {
        this.a = d;
        this.b = d10;
        this.c = d11;
        this.d = true;
    }
}
