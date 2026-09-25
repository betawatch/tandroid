package ci;

import org.telegram.ui.d01;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
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
                d01 d01Var = (d01) this.h;
                d01Var.Q = false;
                d01Var.invalidate();
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
                d01 d01Var = (d01) this.h;
                d01Var.Q = true;
                d01Var.invalidate();
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
