package ci;

import org.telegram.ui.m01;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes4.dex */
public final class hc extends jc {
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;

    public /* synthetic */ hc(Object obj, int i10) {
        this.g = i10;
        this.h = obj;
    }

    @Override // ci.jc
    public final void e() {
        switch (this.g) {
            case 0:
                m01 m01Var = (m01) this.h;
                m01Var.Q = false;
                m01Var.invalidate();
                break;
            case 1:
                ai.f6 t10 = ((ai.jc) this.h).t();
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

    @Override // ci.jc
    public final void f(boolean z10) {
        switch (this.g) {
            case 0:
                m01 m01Var = (m01) this.h;
                m01Var.Q = true;
                m01Var.invalidate();
                break;
            case 1:
                ai.f6 t10 = ((ai.jc) this.h).t();
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
