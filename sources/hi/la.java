package hi;

import org.telegram.ui.vv0;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class la extends na {
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;

    public /* synthetic */ la(Object obj, int i7) {
        this.g = i7;
        this.h = obj;
    }

    @Override // hi.na
    public final void e() {
        switch (this.g) {
            case 0:
                vv0 vv0Var = (vv0) this.h;
                vv0Var.R = false;
                vv0Var.invalidate();
                break;
            case 1:
                fi.b4 z10 = ((fi.i9) this.h).z();
                if (z10 != null) {
                    z10.k0(true);
                    break;
                }
                break;
            default:
                org.telegram.ui.Components.i9 i9Var = (org.telegram.ui.Components.i9) this.h;
                i9Var.post(new e1(i9Var, 17));
                break;
        }
    }

    @Override // hi.na
    public final void f(boolean z10) {
        switch (this.g) {
            case 0:
                vv0 vv0Var = (vv0) this.h;
                vv0Var.R = true;
                vv0Var.invalidate();
                break;
            case 1:
                fi.b4 z11 = ((fi.i9) this.h).z();
                if (z11 != null) {
                    z11.k0(false);
                }
                fi.e3 e3Var = this.f;
                if (e3Var != null) {
                    e3Var.setTranslationX(0.0f);
                    this.f.setTranslationY(0.0f);
                    break;
                }
                break;
            default:
                ((org.telegram.ui.Components.i9) this.h).setVisibility(0);
                break;
        }
    }
}
