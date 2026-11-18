package hi;

import org.telegram.ui.wv0;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final class ma extends oa {
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;

    public /* synthetic */ ma(Object obj, int i7) {
        this.g = i7;
        this.h = obj;
    }

    @Override // hi.oa
    public final void e() {
        switch (this.g) {
            case 0:
                wv0 wv0Var = (wv0) this.h;
                wv0Var.R = false;
                wv0Var.invalidate();
                break;
            case 1:
                fi.z3 z10 = ((fi.f9) this.h).z();
                if (z10 != null) {
                    z10.k0(true);
                    break;
                }
                break;
            default:
                org.telegram.ui.Components.q9 q9Var = (org.telegram.ui.Components.q9) this.h;
                q9Var.post(new k(q9Var, 21));
                break;
        }
    }

    @Override // hi.oa
    public final void f(boolean z10) {
        switch (this.g) {
            case 0:
                wv0 wv0Var = (wv0) this.h;
                wv0Var.R = true;
                wv0Var.invalidate();
                break;
            case 1:
                fi.z3 z11 = ((fi.f9) this.h).z();
                if (z11 != null) {
                    z11.k0(false);
                }
                fi.c3 c3Var = this.f;
                if (c3Var != null) {
                    c3Var.setTranslationX(0.0f);
                    this.f.setTranslationY(0.0f);
                    break;
                }
                break;
            default:
                ((org.telegram.ui.Components.q9) this.h).setVisibility(0);
                break;
        }
    }
}
