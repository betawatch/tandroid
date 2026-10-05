package ci;

import org.telegram.ui.f01;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes4.dex */
public final class dc extends fc {
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;

    public /* synthetic */ dc(Object obj, int i10) {
        this.g = i10;
        this.h = obj;
    }

    @Override // ci.fc
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

    @Override // ci.fc
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
