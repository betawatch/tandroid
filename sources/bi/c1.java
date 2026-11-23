package bi;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class c1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k1 b;

    public /* synthetic */ c1(k1 k1Var, int i7) {
        this.a = i7;
        this.b = k1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                k1 k1Var = this.b;
                rh.h hVar = k1Var.r1;
                jh.f fVar = k1Var.q1;
                if (fVar != null) {
                    fVar.d();
                }
                h1 h1Var = k1Var.C1;
                if (h1Var != null) {
                    h1Var.setTranslationY(-hVar.d());
                }
                org.telegram.ui.Components.n6 n6Var = k1Var.w1;
                if (n6Var != null) {
                    n6Var.setTranslationY(-hVar.d());
                }
                k1Var.J0();
                break;
            case 1:
                this.b.C1.performClick();
                break;
            case 2:
                this.b.s1.k1();
                break;
            default:
                this.b.dismiss();
                break;
        }
    }
}
