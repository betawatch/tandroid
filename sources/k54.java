// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class k54 {
    public final double a;
    public double b;
    public double c;

    public k54(double d) {
        this.a = d != 0.0d ? Math.exp((-0.6931471805599453d) / d) : 0.0d;
    }

    public final double a() {
        double d = this.a;
        if (d != 0.0d) {
            double pow = 1.0d - Math.pow(d, this.c);
            if (pow != 0.0d) {
                return this.b / pow;
            }
        }
        return this.b;
    }

    public final void b(double d, double d2) {
        double pow = Math.pow(this.a, d);
        this.b = (pow * this.b) + ((1.0d - pow) * d2);
        this.c += d;
    }
}
