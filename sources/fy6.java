// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class fy6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ly6 b;
    public final /* synthetic */ cf8 c;

    public /* synthetic */ fy6(ly6 ly6Var, cf8 cf8Var, byte b) {
        this.a = b;
        this.b = ly6Var;
        this.c = cf8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        cf8 cf8Var = this.c;
        ly6 ly6Var = this.b;
        switch (b) {
            case 0:
                ly6Var.p.P(ly6Var.f0(cf8Var));
                ly6Var.l.D(cf8Var.q().a(17) ? cf8Var.y0() : bqb.a);
                break;
            default:
                ly6Var.p.P(ly6Var.f0(cf8Var));
                break;
        }
    }
}
