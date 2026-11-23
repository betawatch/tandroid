package org.telegram.ui.Components;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class q90 {
    public final /* synthetic */ org.telegram.ui.ActionBar.g2 a;
    public final /* synthetic */ v90 b;

    public q90(v90 v90Var, org.telegram.ui.ActionBar.g2 g2Var) {
        this.b = v90Var;
        this.a = g2Var;
    }

    public final void a(boolean z10) {
        v90 v90Var = this.b;
        if (v90Var.getNeededLayoutManager() != v90Var.getCurrentLayoutManager() && v90Var.a()) {
            if (v90Var.f.N0 > 0) {
                v90Var.O = true;
                v90Var.o(false);
                return;
            }
            v90Var.b.setLayoutManager(v90Var.getNeededLayoutManager());
        }
        if (z10 && !v90Var.a()) {
            z10 = false;
        }
        v90Var.o((!z10 || v90Var.f.K() > 0) ? z10 : false);
    }

    public final void b(boolean z10) {
        this.b.l(z10);
    }

    public final void c() {
        v90 v90Var = this.b;
        oo ooVar = v90Var.K;
        if (v90Var.b.getLayoutManager() == v90Var.d || !v90Var.J) {
            return;
        }
        org.telegram.messenger.g0.r(ooVar);
        org.telegram.messenger.g0.h3(ooVar, this.a.getFragmentBeginToShow() ? 0L : 100L);
    }
}
