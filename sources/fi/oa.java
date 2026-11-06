package fi;

import org.telegram.ui.wv0;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
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
                wv0 wv0Var = (wv0) this.h;
                wv0Var.Q = false;
                wv0Var.invalidate();
                break;
            case 1:
                di.i4 z9 = ((di.p9) this.h).z();
                if (z9 != null) {
                    z9.k0(true);
                    break;
                }
                break;
            default:
                org.telegram.ui.Components.l9 l9Var = (org.telegram.ui.Components.l9) this.h;
                l9Var.post(new h9(l9Var, 4));
                break;
        }
    }

    @Override // fi.qa
    public final void f(boolean z9) {
        switch (this.g) {
            case 0:
                wv0 wv0Var = (wv0) this.h;
                wv0Var.Q = true;
                wv0Var.invalidate();
                break;
            case 1:
                di.i4 z10 = ((di.p9) this.h).z();
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
