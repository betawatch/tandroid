package org.telegram.ui;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class n0 extends c8.ha {
    public final /* synthetic */ int a;
    public final /* synthetic */ g4 b;

    public /* synthetic */ n0(g4 g4Var, int i7) {
        this.a = i7;
        this.b = g4Var;
    }

    @Override // c8.ha
    public final void a(boolean z10) {
        switch (this.a) {
            case 0:
                if (z10) {
                    this.b.i0.h(false);
                    break;
                }
                break;
            default:
                org.telegram.ui.ActionBar.x2 x2Var = this.b.J;
                if (x2Var != null) {
                    x2Var.E0 = z10;
                    break;
                }
                break;
        }
    }

    @Override // c8.ha
    public void b() {
        switch (this.a) {
            case 0:
                if (org.telegram.messenger.g0.G3()) {
                    org.telegram.messenger.n10.t(null, 2131743959, new org.telegram.ui.Components.lc(this.b.h0, null));
                    break;
                }
                break;
        }
    }
}
