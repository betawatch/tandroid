package ci;

import org.telegram.ui.f01;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes4.dex */
public final class ec extends gc {
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;

    public /* synthetic */ ec(Object obj, int i10) {
        this.g = i10;
        this.h = obj;
    }

    @Override // ci.gc
    public final void e() {
        switch (this.g) {
            case 0:
                f01 f01Var = (f01) this.h;
                f01Var.Q = false;
                f01Var.invalidate();
                break;
            case 1:
                ai.e6 t10 = ((ai.jc) this.h).t();
                if (t10 != null) {
                    t10.m0(true);
                    break;
                }
                break;
            default:
                org.telegram.ui.Components.w9 w9Var = (org.telegram.ui.Components.w9) this.h;
                w9Var.post(new androidx.fragment.app.a0(w9Var, 27));
                break;
        }
    }

    @Override // ci.gc
    public final void f(boolean z10) {
        switch (this.g) {
            case 0:
                f01 f01Var = (f01) this.h;
                f01Var.Q = true;
                f01Var.invalidate();
                break;
            case 1:
                ai.e6 t10 = ((ai.jc) this.h).t();
                if (t10 != null) {
                    t10.m0(false);
                }
                ai.a5 a5Var = this.f;
                if (a5Var != null) {
                    a5Var.setTranslationX(0.0f);
                    this.f.setTranslationY(0.0f);
                    break;
                }
                break;
            default:
                ((org.telegram.ui.Components.w9) this.h).setVisibility(0);
                break;
        }
    }
}
