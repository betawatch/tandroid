package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class fa0 {
    public final /* synthetic */ org.telegram.ui.ActionBar.o2 a;
    public final /* synthetic */ ka0 b;

    public fa0(ka0 ka0Var, org.telegram.ui.ActionBar.o2 o2Var) {
        this.b = ka0Var;
        this.a = o2Var;
    }

    public final void a(boolean z10) {
        ka0 ka0Var = this.b;
        if (ka0Var.getNeededLayoutManager() != ka0Var.getCurrentLayoutManager() && ka0Var.a()) {
            if (ka0Var.f.H0 > 0) {
                ka0Var.J = true;
                ka0Var.o(false);
                return;
            }
            ka0Var.b.setLayoutManager(ka0Var.getNeededLayoutManager());
        }
        if (z10 && !ka0Var.a()) {
            z10 = false;
        }
        ka0Var.o((!z10 || ka0Var.f.K() > 0) ? z10 : false);
    }

    public final void b(boolean z10) {
        this.b.l(z10);
    }

    public final void c() {
        ka0 ka0Var = this.b;
        rp rpVar = ka0Var.F;
        if (ka0Var.b.getLayoutManager() == ka0Var.d || !ka0Var.E) {
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(rpVar);
        AndroidUtilities.runOnUIThread(rpVar, this.a.getFragmentBeginToShow() ? 0L : 100L);
    }
}
