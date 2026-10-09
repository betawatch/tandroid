package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class kb0 {
    public final /* synthetic */ org.telegram.ui.ActionBar.n2 a;
    public final /* synthetic */ pb0 b;

    public kb0(pb0 pb0Var, org.telegram.ui.ActionBar.n2 n2Var) {
        this.b = pb0Var;
        this.a = n2Var;
    }

    public final void a(boolean z10) {
        pb0 pb0Var = this.b;
        if (pb0Var.getNeededLayoutManager() != pb0Var.getCurrentLayoutManager() && pb0Var.a()) {
            if (pb0Var.f.M0 > 0) {
                pb0Var.N = true;
                pb0Var.o(false);
                return;
            }
            pb0Var.b.setLayoutManager(pb0Var.getNeededLayoutManager());
        }
        if (z10 && !pb0Var.a()) {
            z10 = false;
        }
        pb0Var.o((!z10 || pb0Var.f.K() > 0) ? z10 : false);
    }

    public final void b(boolean z10) {
        this.b.l(z10);
    }

    public final void c() {
        pb0 pb0Var = this.b;
        nq nqVar = pb0Var.J;
        if (pb0Var.b.getLayoutManager() == pb0Var.d || !pb0Var.I) {
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(nqVar);
        AndroidUtilities.runOnUIThread(nqVar, this.a.getFragmentBeginToShow() ? 0L : 100L);
    }
}
