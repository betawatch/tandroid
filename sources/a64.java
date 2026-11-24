// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class a64 {
    public final double a;
    public final z54 b = new z54(9.0d);
    public final z54 c = new z54(3.0d);
    public final z54 d = new z54(9.0d);

    public a64(double d) {
        this.a = d;
    }

    public final double a() {
        z54 z54Var = this.c;
        return z54Var.c >= 0.001d ? Math.min(z54Var.a(), this.b.a()) : this.a;
    }

    public final double b() {
        z54 z54Var = this.d;
        if (z54Var.c >= 0.001d) {
            return z54Var.a();
        }
        return 100.0d;
    }

    public final void c(long j, double d) {
        if (j <= 0) {
            return;
        }
        double max = (j * 8.0d) / (Math.max(d, 50.0d) / 1000.0d);
        this.c.b(1.0d, max);
        this.b.b(1.0d, max);
    }
}
