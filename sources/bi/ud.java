package bi;

import org.telegram.ui.s01;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class ud extends xd {
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;

    public /* synthetic */ ud(Object obj, int i10) {
        this.g = i10;
        this.h = obj;
    }

    @Override // bi.xd
    public final void e() {
        switch (this.g) {
            case 0:
                s01 s01Var = (s01) this.h;
                s01Var.Q = false;
                s01Var.invalidate();
                break;
            case 1:
                zh.a3 t10 = ((zh.u7) this.h).t();
                if (t10 != null) {
                    t10.m0(true);
                    break;
                }
                break;
            default:
                org.telegram.ui.Components.w9 w9Var = (org.telegram.ui.Components.w9) this.h;
                w9Var.post(new wc(w9Var, 3));
                break;
        }
    }

    @Override // bi.xd
    public final void f(boolean z10) {
        switch (this.g) {
            case 0:
                s01 s01Var = (s01) this.h;
                s01Var.Q = true;
                s01Var.invalidate();
                break;
            case 1:
                zh.a3 t10 = ((zh.u7) this.h).t();
                if (t10 != null) {
                    t10.m0(false);
                }
                zh.h2 h2Var = this.f;
                if (h2Var != null) {
                    h2Var.setTranslationX(0.0f);
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
