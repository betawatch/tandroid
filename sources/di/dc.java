package di;

import org.telegram.ui.r01;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class dc extends fc {
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;

    public /* synthetic */ dc(Object obj, int i10) {
        this.g = i10;
        this.h = obj;
    }

    @Override // di.fc
    public final void e() {
        switch (this.g) {
            case 0:
                r01 r01Var = (r01) this.h;
                r01Var.Q = false;
                r01Var.invalidate();
                break;
            case 1:
                bi.q5 t10 = ((bi.sb) this.h).t();
                if (t10 != null) {
                    t10.m0(true);
                    break;
                }
                break;
            default:
                org.telegram.ui.Components.z9 z9Var = (org.telegram.ui.Components.z9) this.h;
                z9Var.post(new x8(z9Var, 6));
                break;
        }
    }

    @Override // di.fc
    public final void f(boolean z10) {
        switch (this.g) {
            case 0:
                r01 r01Var = (r01) this.h;
                r01Var.Q = true;
                r01Var.invalidate();
                break;
            case 1:
                bi.q5 t10 = ((bi.sb) this.h).t();
                if (t10 != null) {
                    t10.m0(false);
                }
                bi.o4 o4Var = this.f;
                if (o4Var != null) {
                    o4Var.setTranslationX(0.0f);
                    this.f.setTranslationY(0.0f);
                    break;
                }
                break;
            default:
                ((org.telegram.ui.Components.z9) this.h).setVisibility(0);
                break;
        }
    }
}
