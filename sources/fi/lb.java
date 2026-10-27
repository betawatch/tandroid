package fi;

import org.telegram.ui.yz0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
                yz0 yz0Var = (yz0) this.h;
                yz0Var.Q = false;
                yz0Var.invalidate();
                break;
            case 1:
                di.q4 u10 = ((di.y9) this.h).u();
                if (u10 != null) {
                    u10.k0(true);
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
                yz0 yz0Var = (yz0) this.h;
                yz0Var.Q = true;
                yz0Var.invalidate();
                break;
            case 1:
                di.q4 u10 = ((di.y9) this.h).u();
                if (u10 != null) {
                    u10.k0(false);
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
