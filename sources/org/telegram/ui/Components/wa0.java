package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class wa0 {
    public final /* synthetic */ org.telegram.ui.ActionBar.m2 a;
    public final /* synthetic */ bb0 b;

    public wa0(bb0 bb0Var, org.telegram.ui.ActionBar.m2 m2Var) {
        this.b = bb0Var;
        this.a = m2Var;
    }

    public final void a(boolean z10) {
        bb0 bb0Var = this.b;
        if (bb0Var.getNeededLayoutManager() != bb0Var.getCurrentLayoutManager() && bb0Var.a()) {
            if (bb0Var.f.M0 > 0) {
                bb0Var.N = true;
                bb0Var.o(false);
                return;
            }
            bb0Var.b.setLayoutManager(bb0Var.getNeededLayoutManager());
        }
        if (z10 && !bb0Var.a()) {
            z10 = false;
        }
        bb0Var.o((!z10 || bb0Var.f.K() > 0) ? z10 : false);
    }

    public final void b(boolean z10) {
        this.b.l(z10);
    }

    public final void c() {
        bb0 bb0Var = this.b;
        zp zpVar = bb0Var.J;
        if (bb0Var.b.getLayoutManager() == bb0Var.d || !bb0Var.I) {
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(zpVar);
        AndroidUtilities.runOnUIThread(zpVar, this.a.getFragmentBeginToShow() ? 0L : 100L);
    }
}
