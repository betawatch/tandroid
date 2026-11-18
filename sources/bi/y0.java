package bi;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class y0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ g1 b;

    public /* synthetic */ y0(g1 g1Var, int i7) {
        this.a = i7;
        this.b = g1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                g1 g1Var = this.b;
                rh.h hVar = g1Var.r1;
                jh.f fVar = g1Var.q1;
                if (fVar != null) {
                    fVar.d();
                }
                d1 d1Var = g1Var.C1;
                if (d1Var != null) {
                    d1Var.setTranslationY(-hVar.d());
                }
                org.telegram.ui.Components.n6 n6Var = g1Var.w1;
                if (n6Var != null) {
                    n6Var.setTranslationY(-hVar.d());
                }
                g1Var.J0();
                break;
            case 1:
                this.b.C1.performClick();
                break;
            case 2:
                this.b.s1.f1();
                break;
            default:
                this.b.dismiss();
                break;
        }
    }
}
