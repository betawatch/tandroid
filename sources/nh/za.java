package nh;

import org.telegram.ui.iz0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class za extends bb {
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;

    public /* synthetic */ za(Object obj, int i10) {
        this.g = i10;
        this.h = obj;
    }

    @Override // nh.bb
    public final void e() {
        switch (this.g) {
            case 0:
                iz0 iz0Var = (iz0) this.h;
                iz0Var.M = false;
                iz0Var.invalidate();
                break;
            case 1:
                lh.d4 t10 = ((lh.i9) this.h).t();
                if (t10 != null) {
                    t10.m0(true);
                    break;
                }
                break;
            default:
                org.telegram.ui.Components.t9 t9Var = (org.telegram.ui.Components.t9) this.h;
                t9Var.post(new m6(t9Var, 8));
                break;
        }
    }

    @Override // nh.bb
    public final void f(boolean z10) {
        switch (this.g) {
            case 0:
                iz0 iz0Var = (iz0) this.h;
                iz0Var.M = true;
                iz0Var.invalidate();
                break;
            case 1:
                lh.d4 t10 = ((lh.i9) this.h).t();
                if (t10 != null) {
                    t10.m0(false);
                }
                lh.h3 h3Var = this.f;
                if (h3Var != null) {
                    h3Var.setTranslationX(0.0f);
                    this.f.setTranslationY(0.0f);
                    break;
                }
                break;
            default:
                ((org.telegram.ui.Components.t9) this.h).setVisibility(0);
                break;
        }
    }
}
