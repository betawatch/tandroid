package fi;

import org.telegram.ui.wz0;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class lb extends nb {
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;

    public /* synthetic */ lb(Object obj, int i10) {
        this.g = i10;
        this.h = obj;
    }

    @Override // fi.nb
    public final void e() {
        switch (this.g) {
            case 0:
                wz0 wz0Var = (wz0) this.h;
                wz0Var.Q = false;
                wz0Var.invalidate();
                break;
            case 1:
                di.q4 t10 = ((di.y9) this.h).t();
                if (t10 != null) {
                    t10.k0(true);
                    break;
                }
                break;
            default:
                org.telegram.ui.Components.y9 y9Var = (org.telegram.ui.Components.y9) this.h;
                y9Var.post(new ua(y9Var, 1));
                break;
        }
    }

    @Override // fi.nb
    public final void f(boolean z10) {
        switch (this.g) {
            case 0:
                wz0 wz0Var = (wz0) this.h;
                wz0Var.Q = true;
                wz0Var.invalidate();
                break;
            case 1:
                di.q4 t10 = ((di.y9) this.h).t();
                if (t10 != null) {
                    t10.k0(false);
                }
                di.q3 q3Var = this.f;
                if (q3Var != null) {
                    q3Var.setTranslationX(0.0f);
                    this.f.setTranslationY(0.0f);
                    break;
                }
                break;
            default:
                ((org.telegram.ui.Components.y9) this.h).setVisibility(0);
                break;
        }
    }
}
