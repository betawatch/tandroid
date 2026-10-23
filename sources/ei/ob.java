package ei;

import org.telegram.ui.oz0;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes4.dex */
public final class ob extends qb {
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;

    public /* synthetic */ ob(Object obj, int i10) {
        this.g = i10;
        this.h = obj;
    }

    @Override // ei.qb
    public final void e() {
        switch (this.g) {
            case 0:
                oz0 oz0Var = (oz0) this.h;
                oz0Var.Q = false;
                oz0Var.invalidate();
                break;
            case 1:
                ci.q4 t10 = ((ci.aa) this.h).t();
                if (t10 != null) {
                    t10.m0(true);
                    break;
                }
                break;
            default:
                org.telegram.ui.Components.w9 w9Var = (org.telegram.ui.Components.w9) this.h;
                w9Var.post(new com.google.firebase.messaging.s(w9Var, 27));
                break;
        }
    }

    @Override // ei.qb
    public final void f(boolean z10) {
        switch (this.g) {
            case 0:
                oz0 oz0Var = (oz0) this.h;
                oz0Var.Q = true;
                oz0Var.invalidate();
                break;
            case 1:
                ci.q4 t10 = ((ci.aa) this.h).t();
                if (t10 != null) {
                    t10.m0(false);
                }
                ci.r3 r3Var = this.f;
                if (r3Var != null) {
                    r3Var.setTranslationX(0.0f);
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
