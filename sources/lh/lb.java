package lh;

import org.telegram.ui.iz0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class lb extends nb {
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;

    public /* synthetic */ lb(Object obj, int i10) {
        this.g = i10;
        this.h = obj;
    }

    @Override // lh.nb
    public final void e() {
        switch (this.g) {
            case 0:
                iz0 iz0Var = (iz0) this.h;
                iz0Var.M = false;
                iz0Var.invalidate();
                break;
            case 1:
                jh.e4 t10 = ((jh.i9) this.h).t();
                if (t10 != null) {
                    t10.m0(true);
                    break;
                }
                break;
            default:
                org.telegram.ui.Components.n9 n9Var = (org.telegram.ui.Components.n9) this.h;
                n9Var.post(new kh.c(n9Var, 24));
                break;
        }
    }

    @Override // lh.nb
    public final void f(boolean z10) {
        switch (this.g) {
            case 0:
                iz0 iz0Var = (iz0) this.h;
                iz0Var.M = true;
                iz0Var.invalidate();
                break;
            case 1:
                jh.e4 t10 = ((jh.i9) this.h).t();
                if (t10 != null) {
                    t10.m0(false);
                }
                jh.j3 j3Var = this.f;
                if (j3Var != null) {
                    j3Var.setTranslationX(0.0f);
                    this.f.setTranslationY(0.0f);
                    break;
                }
                break;
            default:
                ((org.telegram.ui.Components.n9) this.h).setVisibility(0);
                break;
        }
    }
}
