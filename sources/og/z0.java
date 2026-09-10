package og;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class z0 {
    public final double a;
    public final double b;
    public final double c;
    public boolean d;

    public z0(double d, double d10, double d11) {
        this.a = d;
        this.b = d10;
        this.c = d11;
    }

    public final float a(z0 z0Var) {
        return (float) Math.sqrt(Math.pow(this.c - z0Var.c, 2.0d) + Math.pow(this.b - z0Var.b, 2.0d) + Math.pow(this.a - z0Var.a, 2.0d));
    }

    public final z0 b(z0 z0Var) {
        return new z0((this.a + z0Var.a) * 0.5d, (this.b + z0Var.b) * 0.5d, (this.c + z0Var.c) * 0.5d);
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof z0)) {
            return false;
        }
        z0 z0Var = (z0) obj;
        return this.a == z0Var.a && this.b == z0Var.b && this.c == z0Var.c;
    }

    public z0(double d, double d10, double d11, int i10) {
        this.a = d;
        this.b = d10;
        this.c = d11;
        this.d = true;
    }
}
