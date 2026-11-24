// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class kd2 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qd2 b;

    public /* synthetic */ kd2(qd2 qd2Var, byte b) {
        this.a = b;
        this.b = qd2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        qd2 qd2Var = this.b;
        switch (b) {
            case 0:
                nm7.f(qd2Var.C.a).k(nm7.w2, Long.valueOf(qd2Var.c), Long.valueOf(qd2Var.b.id), Boolean.FALSE);
                break;
            case 1:
                qd2Var.E = false;
                qd2Var.d();
                nm7.f(qd2Var.C.a).k(nm7.C2, new Object[0]);
                break;
            case 2:
            default:
                qd2Var.e();
                break;
        }
    }
}
