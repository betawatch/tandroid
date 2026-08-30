package kh;

import org.telegram.ui.Components.k6;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final /* synthetic */ class n0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ u0 b;

    public /* synthetic */ n0(u0 u0Var, int i10) {
        this.a = i10;
        this.b = u0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                u0 u0Var = this.b;
                ch.i iVar = u0Var.h;
                ug.f fVar = u0Var.f;
                if (fVar != null) {
                    fVar.d();
                }
                s0 s0Var = u0Var.E;
                if (s0Var != null) {
                    s0Var.setTranslationY(-iVar.c());
                }
                k6 k6Var = u0Var.w;
                if (k6Var != null) {
                    k6Var.setTranslationY(-iVar.c());
                }
                u0Var.o();
                break;
            case 1:
                this.b.E.performClick();
                break;
            default:
                this.b.dismiss();
                break;
        }
    }
}
