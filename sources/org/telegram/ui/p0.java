package org.telegram.ui;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class p0 extends w7.x5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ h4 b;

    public /* synthetic */ p0(h4 h4Var, int i10) {
        this.a = i10;
        this.b = h4Var;
    }

    @Override // w7.x5
    public final void a(boolean z10) {
        switch (this.a) {
            case 0:
                if (z10) {
                    this.b.h0.h(false);
                    break;
                }
                break;
            default:
                org.telegram.ui.ActionBar.z2 z2Var = this.b.I;
                if (z2Var != null) {
                    z2Var.D0 = z10;
                    break;
                }
                break;
        }
    }

    @Override // w7.x5
    public void b() {
        switch (this.a) {
            case 0:
                if (org.telegram.messenger.i0.H3()) {
                    org.telegram.messenger.z20.r(null, 2131744219, new org.telegram.ui.Components.cc(this.b.g0, null));
                    break;
                }
                break;
        }
    }
}
