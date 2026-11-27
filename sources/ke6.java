// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ke6 implements fd {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qh6 b;

    public /* synthetic */ ke6(qh6 qh6Var, byte b) {
        this.a = b;
        this.b = qh6Var;
    }

    @Override // fd
    public final void w(id idVar, int i) {
        byte b = this.a;
        qh6 qh6Var = this.b;
        switch (b) {
            case 0:
                qh6Var.b[qh6Var.a].d();
                qh6Var.y1(true, true);
                break;
            default:
                qh6Var.m0 = true;
                if (qh6Var.a != 0) {
                    qh6Var.J1(0, true, null, true);
                    break;
                }
                break;
        }
    }
}
