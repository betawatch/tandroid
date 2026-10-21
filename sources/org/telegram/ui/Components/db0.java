package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class db0 {
    public final /* synthetic */ org.telegram.ui.ActionBar.n2 a;
    public final /* synthetic */ ib0 b;

    public db0(ib0 ib0Var, org.telegram.ui.ActionBar.n2 n2Var) {
        this.b = ib0Var;
        this.a = n2Var;
    }

    public final void a(boolean z10) {
        ib0 ib0Var = this.b;
        if (ib0Var.getNeededLayoutManager() != ib0Var.getCurrentLayoutManager() && ib0Var.a()) {
            if (ib0Var.f.M0 > 0) {
                ib0Var.N = true;
                ib0Var.o(false);
                return;
            }
            ib0Var.b.setLayoutManager(ib0Var.getNeededLayoutManager());
        }
        if (z10 && !ib0Var.a()) {
            z10 = false;
        }
        ib0Var.o((!z10 || ib0Var.f.K() > 0) ? z10 : false);
    }

    public final void b(boolean z10) {
        this.b.l(z10);
    }

    public final void c() {
        ib0 ib0Var = this.b;
        hq hqVar = ib0Var.J;
        if (ib0Var.b.getLayoutManager() == ib0Var.d || !ib0Var.I) {
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(hqVar);
        AndroidUtilities.runOnUIThread(hqVar, this.a.getFragmentBeginToShow() ? 0L : 100L);
    }
}
