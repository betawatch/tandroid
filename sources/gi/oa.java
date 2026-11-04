package gi;

import org.telegram.ui.nv0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class oa extends qa {
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;

    public /* synthetic */ oa(Object obj, int i3) {
        this.g = i3;
        this.h = obj;
    }

    @Override // gi.qa
    public final void e() {
        switch (this.g) {
            case 0:
                nv0 nv0Var = (nv0) this.h;
                nv0Var.R = false;
                nv0Var.invalidate();
                break;
            case 1:
                ei.j4 H = ((ei.r9) this.h).H();
                if (H != null) {
                    H.k0(true);
                    break;
                }
                break;
            default:
                org.telegram.ui.Components.k9 k9Var = (org.telegram.ui.Components.k9) this.h;
                k9Var.post(new f6(k9Var, 8));
                break;
        }
    }

    @Override // gi.qa
    public final void f(boolean z10) {
        switch (this.g) {
            case 0:
                nv0 nv0Var = (nv0) this.h;
                nv0Var.R = true;
                nv0Var.invalidate();
                break;
            case 1:
                ei.j4 H = ((ei.r9) this.h).H();
                if (H != null) {
                    H.k0(false);
                }
                ei.m3 m3Var = this.f;
                if (m3Var != null) {
                    m3Var.setTranslationX(0.0f);
                    this.f.setTranslationY(0.0f);
                    break;
                }
                break;
            default:
                ((org.telegram.ui.Components.k9) this.h).setVisibility(0);
                break;
        }
    }
}
