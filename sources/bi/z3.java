package bi;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zh.h0 b;

    public /* synthetic */ z3(zh.h0 h0Var, int i7) {
        this.a = i7;
        this.b = h0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.dismiss();
                break;
            case 1:
                zh.h0 h0Var = this.b;
                rh.h hVar = h0Var.q1;
                jh.f fVar = h0Var.p1;
                if (fVar != null) {
                    fVar.d();
                }
                zh.g0 g0Var = h0Var.B1;
                if (g0Var != null) {
                    g0Var.setTranslationY(-hVar.d());
                }
                org.telegram.ui.Components.i6 i6Var = h0Var.v1;
                if (i6Var != null) {
                    i6Var.setTranslationY(-hVar.d());
                }
                h0Var.I0();
                break;
            case 2:
                this.b.B1.performClick();
                break;
            default:
                this.b.r1.I0();
                break;
        }
    }
}
