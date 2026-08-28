package o1;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class k {
    public double a;
    public double b;
    public boolean c;
    public double d;
    public double e;
    public double f;
    public double g;
    public double h;
    public double i;
    public final e j;

    public k() {
        this.a = Math.sqrt(1500.0d);
        this.b = 0.5d;
        this.c = false;
        this.i = Double.MAX_VALUE;
        this.j = new e();
    }

    public final void a(float f10) {
        if (f10 < 0.0f) {
            throw new IllegalArgumentException("Damping ratio must be non-negative");
        }
        this.b = f10;
        this.c = false;
    }

    public final void b(float f10) {
        if (f10 <= 0.0f) {
            throw new IllegalArgumentException("Spring stiffness constant must be positive.");
        }
        this.a = Math.sqrt(f10);
        this.c = false;
    }

    public final e c(double d, double d9, long j10) {
        double sin;
        double cos;
        if (!this.c) {
            if (this.i == Double.MAX_VALUE) {
                throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
            }
            double d10 = this.b;
            if (d10 > 1.0d) {
                double d11 = this.a;
                this.f = (Math.sqrt((d10 * d10) - 1.0d) * d11) + ((-d10) * d11);
                double d12 = this.b;
                double d13 = this.a;
                this.g = ((-d12) * d13) - (Math.sqrt((d12 * d12) - 1.0d) * d13);
            } else if (d10 >= 0.0d && d10 < 1.0d) {
                this.h = Math.sqrt(1.0d - (d10 * d10)) * this.a;
            }
            this.c = true;
        }
        double d14 = j10 / 1000.0d;
        double d15 = d - this.i;
        double d16 = this.b;
        if (d16 > 1.0d) {
            double d17 = this.g;
            double d18 = ((d17 * d15) - d9) / (d17 - this.f);
            double d19 = d15 - d18;
            sin = (Math.pow(2.718281828459045d, this.f * d14) * d18) + (Math.pow(2.718281828459045d, d17 * d14) * d19);
            double d20 = this.g;
            double pow = Math.pow(2.718281828459045d, d20 * d14) * d19 * d20;
            double d21 = this.f;
            cos = (Math.pow(2.718281828459045d, d21 * d14) * d18 * d21) + pow;
        } else if (d16 == 1.0d) {
            double d22 = this.a;
            double d23 = (d22 * d15) + d9;
            double d24 = (d23 * d14) + d15;
            double pow2 = Math.pow(2.718281828459045d, (-d22) * d14) * d24;
            double pow3 = Math.pow(2.718281828459045d, (-this.a) * d14) * d24;
            double d25 = -this.a;
            cos = (Math.pow(2.718281828459045d, d25 * d14) * d23) + (pow3 * d25);
            sin = pow2;
        } else {
            double d26 = 1.0d / this.h;
            double d27 = this.a;
            double d28 = ((d16 * d27 * d15) + d9) * d26;
            sin = ((Math.sin(this.h * d14) * d28) + (Math.cos(this.h * d14) * d15)) * Math.pow(2.718281828459045d, (-d16) * d27 * d14);
            double d29 = this.a;
            double d30 = this.b;
            double d31 = (-d29) * sin * d30;
            double pow4 = Math.pow(2.718281828459045d, (-d30) * d29 * d14);
            double d32 = this.h;
            double sin2 = Math.sin(d32 * d14) * (-d32) * d15;
            double d33 = this.h;
            cos = (((Math.cos(d33 * d14) * d28 * d33) + sin2) * pow4) + d31;
        }
        float f10 = (float) (sin + this.i);
        e eVar = this.j;
        eVar.a = f10;
        eVar.b = (float) cos;
        return eVar;
    }

    public k(float f10) {
        this.a = Math.sqrt(1500.0d);
        this.b = 0.5d;
        this.c = false;
        this.j = new e();
        this.i = f10;
    }
}
