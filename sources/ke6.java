// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
