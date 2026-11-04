package org.telegram.ui.Components;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class x80 {
    public final /* synthetic */ org.telegram.ui.ActionBar.d2 a;
    public final /* synthetic */ c90 b;

    public x80(c90 c90Var, org.telegram.ui.ActionBar.d2 d2Var) {
        this.b = c90Var;
        this.a = d2Var;
    }

    public final void a(boolean z10) {
        c90 c90Var = this.b;
        if (c90Var.getNeededLayoutManager() != c90Var.getCurrentLayoutManager() && c90Var.a()) {
            if (c90Var.f.N0 > 0) {
                c90Var.O = true;
                c90Var.o(false);
                return;
            }
            c90Var.b.setLayoutManager(c90Var.getNeededLayoutManager());
        }
        if (z10 && !c90Var.a()) {
            z10 = false;
        }
        c90Var.o((!z10 || c90Var.f.K() > 0) ? z10 : false);
    }

    public final void b(boolean z10) {
        this.b.l(z10);
    }

    public final void c() {
        c90 c90Var = this.b;
        gp gpVar = c90Var.K;
        if (c90Var.b.getLayoutManager() == c90Var.d || !c90Var.J) {
            return;
        }
        org.telegram.messenger.g0.r(gpVar);
        org.telegram.messenger.g0.i3(gpVar, this.a.getFragmentBeginToShow() ? 0L : 100L);
    }
}
