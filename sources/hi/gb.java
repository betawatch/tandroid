package hi;

import org.telegram.ui.vv0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class gb extends ib {
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;

    public /* synthetic */ gb(Object obj, int i7) {
        this.g = i7;
        this.h = obj;
    }

    @Override // hi.ib
    public final void e() {
        switch (this.g) {
            case 0:
                vv0 vv0Var = (vv0) this.h;
                vv0Var.R = false;
                vv0Var.invalidate();
                break;
            case 1:
                fi.z3 z10 = ((fi.f9) this.h).z();
                if (z10 != null) {
                    z10.k0(true);
                    break;
                }
                break;
            default:
                org.telegram.ui.Components.p9 p9Var = (org.telegram.ui.Components.p9) this.h;
                p9Var.post(new w(p9Var, 21));
                break;
        }
    }

    @Override // hi.ib
    public final void f(boolean z10) {
        switch (this.g) {
            case 0:
                vv0 vv0Var = (vv0) this.h;
                vv0Var.R = true;
                vv0Var.invalidate();
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
                ((org.telegram.ui.Components.p9) this.h).setVisibility(0);
                break;
        }
    }
}
