package ai;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ i1 b;

    public /* synthetic */ a1(i1 i1Var, int i3) {
        this.a = i3;
        this.b = i1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                i1 i1Var = this.b;
                sh.h hVar = i1Var.o1;
                kh.f fVar = i1Var.n1;
                if (fVar != null) {
                    fVar.d();
                }
                g1 g1Var = i1Var.z1;
                if (g1Var != null) {
                    g1Var.setTranslationY(-hVar.d());
                }
                org.telegram.ui.Components.h6 h6Var = i1Var.t1;
                if (h6Var != null) {
                    h6Var.setTranslationY(-hVar.d());
                }
                i1Var.I0();
                break;
            case 1:
                this.b.z1.performClick();
                break;
            case 2:
                this.b.p1.H0();
                break;
            default:
                this.b.dismiss();
                break;
        }
    }
}
