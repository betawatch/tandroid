// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class l54 {
    public final double a;
    public final k54 b = new k54(9.0d);
    public final k54 c = new k54(3.0d);
    public final k54 d = new k54(9.0d);

    public l54(double d) {
        this.a = d;
    }

    public final double a() {
        k54 k54Var = this.c;
        return k54Var.c >= 0.001d ? Math.min(k54Var.a(), this.b.a()) : this.a;
    }

    public final double b() {
        k54 k54Var = this.d;
        if (k54Var.c >= 0.001d) {
            return k54Var.a();
        }
        return 100.0d;
    }

    public final void c(double d, long j) {
        if (j <= 0) {
            return;
        }
        double max = (j * 8.0d) / (Math.max(d, 50.0d) / 1000.0d);
        this.c.b(1.0d, max);
        this.b.b(1.0d, max);
    }
}
