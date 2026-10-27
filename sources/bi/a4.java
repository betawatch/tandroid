package bi;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class a4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zh.i0 b;

    public /* synthetic */ a4(zh.i0 i0Var, int i10) {
        this.a = i10;
        this.b = i0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.dismiss();
                break;
            case 1:
                zh.i0 i0Var = this.b;
                rh.i iVar = i0Var.h;
                jh.f fVar = i0Var.f;
                if (fVar != null) {
                    fVar.d();
                }
                zh.h0 h0Var = i0Var.H;
                if (h0Var != null) {
                    h0Var.setTranslationY(-iVar.d());
                }
                org.telegram.ui.Components.s6 s6Var = i0Var.w;
                if (s6Var != null) {
                    s6Var.setTranslationY(-iVar.d());
                }
                i0Var.q();
                break;
            case 2:
                this.b.H.performClick();
                break;
            default:
                this.b.n.F0();
                break;
        }
    }
}
