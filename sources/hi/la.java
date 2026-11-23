package hi;

import org.telegram.ui.wv0;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes4.dex */
public final class la extends na {
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;

    public /* synthetic */ la(Object obj, int i7) {
        this.g = i7;
        this.h = obj;
    }

    @Override // hi.na
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
                q9Var.post(new l(q9Var, 21));
                break;
        }
    }

    @Override // hi.na
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
