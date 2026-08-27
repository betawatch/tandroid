package gh;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class q0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ x0 b;

    public /* synthetic */ q0(x0 x0Var, int i10) {
        this.a = i10;
        this.b = x0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                x0 x0Var = this.b;
                yg.i iVar = x0Var.h;
                qg.g gVar = x0Var.f;
                if (gVar != null) {
                    gVar.d();
                }
                v0 v0Var = x0Var.D;
                if (v0Var != null) {
                    v0Var.setTranslationY(-iVar.c());
                }
                org.telegram.ui.Components.j6 j6Var = x0Var.w;
                if (j6Var != null) {
                    j6Var.setTranslationY(-iVar.c());
                }
                x0Var.p();
                break;
            case 1:
                this.b.D.performClick();
                break;
            default:
                this.b.dismiss();
                break;
        }
    }
}
