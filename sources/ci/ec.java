package ci;

import org.telegram.ui.l01;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
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
                l01 l01Var = (l01) this.h;
                l01Var.Q = false;
                l01Var.invalidate();
                break;
            case 1:
                ai.f6 t10 = ((ai.kc) this.h).t();
                if (t10 != null) {
                    t10.m0(true);
                    break;
                }
                break;
            default:
                org.telegram.ui.Components.y9 y9Var = (org.telegram.ui.Components.y9) this.h;
                y9Var.post(new androidx.fragment.app.a0(y9Var, 27));
                break;
        }
    }

    @Override // ci.gc
    public final void f(boolean z10) {
        switch (this.g) {
            case 0:
                l01 l01Var = (l01) this.h;
                l01Var.Q = true;
                l01Var.invalidate();
                break;
            case 1:
                ai.f6 t10 = ((ai.kc) this.h).t();
                if (t10 != null) {
                    t10.m0(false);
                }
                ai.b5 b5Var = this.f;
                if (b5Var != null) {
                    b5Var.setTranslationX(0.0f);
                    this.f.setTranslationY(0.0f);
                    break;
                }
                break;
            default:
                ((org.telegram.ui.Components.y9) this.h).setVisibility(0);
                break;
        }
    }
}
