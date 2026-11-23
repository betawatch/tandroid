package org.telegram.ui;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class n0 extends c8.ia {
    public final /* synthetic */ int a;
    public final /* synthetic */ g4 b;

    public /* synthetic */ n0(g4 g4Var, int i7) {
        this.a = i7;
        this.b = g4Var;
    }

    @Override // c8.ia
    public final void a(boolean z10) {
        switch (this.a) {
            case 0:
                if (z10) {
                    this.b.i0.h(false);
                    break;
                }
                break;
            default:
                org.telegram.ui.ActionBar.w2 w2Var = this.b.J;
                if (w2Var != null) {
                    w2Var.E0 = z10;
                    break;
                }
                break;
        }
    }

    @Override // c8.ia
    public void b() {
        switch (this.a) {
            case 0:
                if (org.telegram.messenger.g0.G3()) {
                    org.telegram.messenger.m10.t(null, 2131743949, new org.telegram.ui.Components.kc(this.b.h0, null));
                    break;
                }
                break;
        }
    }
}
