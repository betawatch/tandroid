package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class ra0 {
    public final /* synthetic */ org.telegram.ui.ActionBar.n2 a;
    public final /* synthetic */ wa0 b;

    public ra0(wa0 wa0Var, org.telegram.ui.ActionBar.n2 n2Var) {
        this.b = wa0Var;
        this.a = n2Var;
    }

    public final void a(boolean z10) {
        wa0 wa0Var = this.b;
        if (wa0Var.getNeededLayoutManager() != wa0Var.getCurrentLayoutManager() && wa0Var.a()) {
            if (wa0Var.f.M0 > 0) {
                wa0Var.N = true;
                wa0Var.o(false);
                return;
            }
            wa0Var.b.setLayoutManager(wa0Var.getNeededLayoutManager());
        }
        if (z10 && !wa0Var.a()) {
            z10 = false;
        }
        wa0Var.o((!z10 || wa0Var.f.K() > 0) ? z10 : false);
    }

    public final void b(boolean z10) {
        this.b.l(z10);
    }

    public final void c() {
        wa0 wa0Var = this.b;
        xp xpVar = wa0Var.J;
        if (wa0Var.b.getLayoutManager() == wa0Var.d || !wa0Var.I) {
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(xpVar);
        AndroidUtilities.runOnUIThread(xpVar, this.a.getFragmentBeginToShow() ? 0L : 100L);
    }
}
