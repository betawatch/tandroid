package org.telegram.ui;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class n0 extends c8.da {
    public final /* synthetic */ int a;
    public final /* synthetic */ g4 b;

    public /* synthetic */ n0(g4 g4Var, int i7) {
        this.a = i7;
        this.b = g4Var;
    }

    @Override // c8.da
    public final void a(boolean z9) {
        switch (this.a) {
            case 0:
                if (z9) {
                    this.b.h0.h(false);
                    break;
                }
                break;
            default:
                org.telegram.ui.ActionBar.v2 v2Var = this.b.I;
                if (v2Var != null) {
                    v2Var.D0 = z9;
                    break;
                }
                break;
        }
    }

    @Override // c8.da
    public void b() {
        switch (this.a) {
            case 0:
                if (org.telegram.messenger.g0.I3()) {
                    org.telegram.messenger.camera.q.r(null, 2131744195, new org.telegram.ui.Components.hc(this.b.g0, null));
                    break;
                }
                break;
        }
    }
}
