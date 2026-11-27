// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
