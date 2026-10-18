package ei;

import org.telegram.ui.qz0;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
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
                qz0 qz0Var = (qz0) this.h;
                qz0Var.Q = false;
                qz0Var.invalidate();
                break;
            case 1:
                ci.p4 t10 = ((ci.z9) this.h).t();
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
                qz0 qz0Var = (qz0) this.h;
                qz0Var.Q = true;
                qz0Var.invalidate();
                break;
            case 1:
                ci.p4 t10 = ((ci.z9) this.h).t();
                if (t10 != null) {
                    t10.m0(false);
                }
                ci.q3 q3Var = this.f;
                if (q3Var != null) {
                    q3Var.setTranslationX(0.0f);
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
