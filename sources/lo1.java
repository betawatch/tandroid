// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class lo1 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qy b;

    public /* synthetic */ lo1(qy qyVar, byte b) {
        this.a = b;
        this.b = qyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        qy qyVar = this.b;
        switch (b) {
            case 0:
                hl.E3(qyVar);
                break;
            default:
                xg8 xg8Var = (xg8) qyVar.g2;
                wb2 wb2Var = xg8Var.n;
                if (wb2Var != null && wb2Var.getDelegate() != null) {
                    xg8Var.n.getDelegate().l1(xg8Var.n, false);
                    break;
                }
                break;
        }
    }
}
