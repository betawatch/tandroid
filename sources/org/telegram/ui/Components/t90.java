package org.telegram.ui.Components;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class t90 {
    public final /* synthetic */ org.telegram.ui.ActionBar.k2 a;
    public final /* synthetic */ y90 b;

    public t90(y90 y90Var, org.telegram.ui.ActionBar.k2 k2Var) {
        this.b = y90Var;
        this.a = k2Var;
    }

    public final void a(boolean z10) {
        y90 y90Var = this.b;
        if (y90Var.getNeededLayoutManager() != y90Var.getCurrentLayoutManager() && y90Var.a()) {
            if (y90Var.f.M0 > 0) {
                y90Var.N = true;
                y90Var.o(false);
                return;
            }
            y90Var.b.setLayoutManager(y90Var.getNeededLayoutManager());
        }
        if (z10 && !y90Var.a()) {
            z10 = false;
        }
        y90Var.o((!z10 || y90Var.f.K() > 0) ? z10 : false);
    }

    public final void b(boolean z10) {
        this.b.l(z10);
    }

    public final void c() {
        y90 y90Var = this.b;
        ho hoVar = y90Var.J;
        if (y90Var.b.getLayoutManager() == y90Var.d || !y90Var.I) {
            return;
        }
        org.telegram.messenger.i0.r(hoVar);
        org.telegram.messenger.i0.h3(hoVar, this.a.getFragmentBeginToShow() ? 0L : 100L);
    }
}
