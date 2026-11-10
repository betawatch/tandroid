package fi;

import org.telegram.ui.zv0;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
                zv0 zv0Var = (zv0) this.h;
                zv0Var.Q = false;
                zv0Var.invalidate();
                break;
            case 1:
                di.j4 z9 = ((di.q9) this.h).z();
                if (z9 != null) {
                    z9.k0(true);
                    break;
                }
                break;
            default:
                org.telegram.ui.Components.k9 k9Var = (org.telegram.ui.Components.k9) this.h;
                k9Var.post(new v9(k9Var, 3));
                break;
        }
    }

    @Override // fi.qa
    public final void f(boolean z9) {
        switch (this.g) {
            case 0:
                zv0 zv0Var = (zv0) this.h;
                zv0Var.Q = true;
                zv0Var.invalidate();
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
                ((org.telegram.ui.Components.k9) this.h).setVisibility(0);
                break;
        }
    }
}
