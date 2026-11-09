package fi;

import org.telegram.ui.yv0;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class oa extends qa {
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;

    public /* synthetic */ oa(Object obj, int i7) {
        this.g = i7;
        this.h = obj;
    }

    @Override // fi.qa
    public final void e() {
        switch (this.g) {
            case 0:
                yv0 yv0Var = (yv0) this.h;
                yv0Var.Q = false;
                yv0Var.invalidate();
                break;
            case 1:
                di.j4 z9 = ((di.q9) this.h).z();
                if (z9 != null) {
                    z9.k0(true);
                    break;
                }
                break;
            default:
                org.telegram.ui.Components.l9 l9Var = (org.telegram.ui.Components.l9) this.h;
                l9Var.post(new v9(l9Var, 3));
                break;
        }
    }

    @Override // fi.qa
    public final void f(boolean z9) {
        switch (this.g) {
            case 0:
                yv0 yv0Var = (yv0) this.h;
                yv0Var.Q = true;
                yv0Var.invalidate();
                break;
            case 1:
                di.j4 z10 = ((di.q9) this.h).z();
                if (z10 != null) {
                    z10.k0(false);
                }
                di.j3 j3Var = this.f;
                if (j3Var != null) {
                    j3Var.setTranslationX(0.0f);
                    this.f.setTranslationY(0.0f);
                    break;
                }
                break;
            default:
                ((org.telegram.ui.Components.l9) this.h).setVisibility(0);
                break;
        }
    }
}
