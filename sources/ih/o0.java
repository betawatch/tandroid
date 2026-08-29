package ih;

import org.telegram.ui.Components.o6;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final /* synthetic */ class o0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ v0 b;

    public /* synthetic */ o0(v0 v0Var, int i10) {
        this.a = i10;
        this.b = v0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                v0 v0Var = this.b;
                ah.i iVar = v0Var.h;
                sg.f fVar = v0Var.f;
                if (fVar != null) {
                    fVar.d();
                }
                t0 t0Var = v0Var.D;
                if (t0Var != null) {
                    t0Var.setTranslationY(-iVar.c());
                }
                o6 o6Var = v0Var.w;
                if (o6Var != null) {
                    o6Var.setTranslationY(-iVar.c());
                }
                v0Var.o();
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
