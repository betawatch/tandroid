package org.telegram.ui;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
                org.telegram.ui.ActionBar.w2 w2Var = this.b.I;
                if (w2Var != null) {
                    w2Var.D0 = z9;
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
                    org.telegram.messenger.camera.q.r(null, 2131744194, new org.telegram.ui.Components.gc(this.b.g0, null));
                    break;
                }
                break;
        }
    }
}
