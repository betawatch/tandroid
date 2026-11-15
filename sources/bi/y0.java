package bi;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class y0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f1 b;

    public /* synthetic */ y0(f1 f1Var, int i7) {
        this.a = i7;
        this.b = f1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                f1 f1Var = this.b;
                rh.h hVar = f1Var.r1;
                jh.f fVar = f1Var.q1;
                if (fVar != null) {
                    fVar.d();
                }
                d1 d1Var = f1Var.C1;
                if (d1Var != null) {
                    d1Var.setTranslationY(-hVar.d());
                }
                org.telegram.ui.Components.h6 h6Var = f1Var.w1;
                if (h6Var != null) {
                    h6Var.setTranslationY(-hVar.d());
                }
                f1Var.I0();
                break;
            case 1:
                this.b.C1.performClick();
                break;
            case 2:
                this.b.s1.X0();
                break;
            default:
                this.b.dismiss();
                break;
        }
    }
}
