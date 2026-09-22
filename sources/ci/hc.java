package ci;

import org.telegram.ui.n01;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
                n01 n01Var = (n01) this.h;
                n01Var.Q = false;
                n01Var.invalidate();
                break;
            case 1:
                ai.f6 t10 = ((ai.jc) this.h).t();
                if (t10 != null) {
                    t10.m0(true);
                    break;
                }
                break;
            default:
                org.telegram.ui.Components.u9 u9Var = (org.telegram.ui.Components.u9) this.h;
                u9Var.post(new androidx.fragment.app.a0(u9Var, 27));
                break;
        }
    }

    @Override // ci.jc
    public final void f(boolean z10) {
        switch (this.g) {
            case 0:
                n01 n01Var = (n01) this.h;
                n01Var.Q = true;
                n01Var.invalidate();
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
                ((org.telegram.ui.Components.u9) this.h).setVisibility(0);
                break;
        }
    }
}
