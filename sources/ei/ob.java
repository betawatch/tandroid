package ei;

import org.telegram.ui.sz0;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
                sz0 sz0Var = (sz0) this.h;
                sz0Var.Q = false;
                sz0Var.invalidate();
                break;
            case 1:
                ci.p4 t10 = ((ci.z9) this.h).t();
                if (t10 != null) {
                    t10.l0(true);
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
                sz0 sz0Var = (sz0) this.h;
                sz0Var.Q = true;
                sz0Var.invalidate();
                break;
            case 1:
                ci.p4 t10 = ((ci.z9) this.h).t();
                if (t10 != null) {
                    t10.l0(false);
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
