package ai;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
public final /* synthetic */ class e4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ yh.i0 b;

    public /* synthetic */ e4(yh.i0 i0Var, int i10) {
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
                yh.i0 i0Var = this.b;
                qh.i iVar = i0Var.h;
                ih.f fVar = i0Var.f;
                if (fVar != null) {
                    fVar.d();
                }
                yh.h0 h0Var = i0Var.H;
                if (h0Var != null) {
                    h0Var.setTranslationY(-iVar.d());
                }
                org.telegram.ui.Components.q6 q6Var = i0Var.w;
                if (q6Var != null) {
                    q6Var.setTranslationY(-iVar.d());
                }
                i0Var.p();
                break;
            default:
                this.b.H.performClick();
                break;
        }
    }
}
