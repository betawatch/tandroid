// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
