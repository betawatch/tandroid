// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final class dr2 extends cr2 {
    public double d;
    public double e;
    public double f;
    public double g;

    public final er2 u(qr2 qr2Var) {
        double d = this.d;
        r(d >= this.e && d <= this.f, Double.valueOf(d));
        er2 er2Var = new er2(s(), this.d, this.e, this.f, this.g, this.a);
        q(qr2Var, er2Var);
        return er2Var;
    }

    public final void v(double d) {
        if (d >= 0.0d) {
            this.g = d;
        } else {
            throw new IllegalArgumentException("precision " + d);
        }
    }

    public final void w() {
        this.e = 0.0d;
        this.f = Double.MAX_VALUE;
    }
}
