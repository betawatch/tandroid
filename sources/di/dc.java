package di;

import org.telegram.ui.s01;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
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
                s01 s01Var = (s01) this.h;
                s01Var.Q = false;
                s01Var.invalidate();
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
                s01 s01Var = (s01) this.h;
                s01Var.Q = true;
                s01Var.invalidate();
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
