package ai;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final /* synthetic */ class f4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ yh.j0 b;

    public /* synthetic */ f4(yh.j0 j0Var, int i10) {
        this.a = i10;
        this.b = j0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.dismiss();
                break;
            case 1:
                yh.j0 j0Var = this.b;
                qh.i iVar = j0Var.h;
                ih.f fVar = j0Var.f;
                if (fVar != null) {
                    fVar.d();
                }
                yh.i0 i0Var = j0Var.H;
                if (i0Var != null) {
                    i0Var.setTranslationY(-iVar.d());
                }
                org.telegram.ui.Components.q6 q6Var = j0Var.w;
                if (q6Var != null) {
                    q6Var.setTranslationY(-iVar.d());
                }
                j0Var.p();
                break;
            default:
                this.b.H.performClick();
                break;
        }
    }
}
