// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class aw4 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hw4 b;

    public /* synthetic */ aw4(hw4 hw4Var, byte b) {
        this.a = b;
        this.b = hw4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        hw4 hw4Var = this.b;
        switch (b) {
            case 0:
                v2d v2dVar = hw4Var.q1;
                z92 z92Var = hw4Var.p1;
                if (z92Var != null) {
                    z92Var.d();
                }
                fw4 fw4Var = hw4Var.B1;
                if (fw4Var != null) {
                    fw4Var.setTranslationY(-v2dVar.d());
                }
                in inVar = hw4Var.v1;
                if (inVar != null) {
                    inVar.setTranslationY(-v2dVar.d());
                }
                hw4Var.E0();
                break;
            case 1:
                hw4Var.B1.performClick();
                break;
            case 2:
                hw4Var.r1.p1();
                break;
            default:
                hw4Var.dismiss();
                break;
        }
    }
}
