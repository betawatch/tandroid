// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final /* synthetic */ class ky6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qy6 b;
    public final /* synthetic */ og8 c;

    public /* synthetic */ ky6(qy6 qy6Var, og8 og8Var, byte b) {
        this.a = b;
        this.b = qy6Var;
        this.c = og8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        og8 og8Var = this.c;
        qy6 qy6Var = this.b;
        switch (b) {
            case 0:
                qy6Var.p.N(qy6Var.f0(og8Var));
                qy6Var.l.D(og8Var.q().a(17) ? og8Var.y0() : asb.a);
                break;
            default:
                qy6Var.p.N(qy6Var.f0(og8Var));
                break;
        }
    }
}
