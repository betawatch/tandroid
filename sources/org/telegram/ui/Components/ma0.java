package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class ma0 {
    public final /* synthetic */ org.telegram.ui.ActionBar.p2 a;
    public final /* synthetic */ ra0 b;

    public ma0(ra0 ra0Var, org.telegram.ui.ActionBar.p2 p2Var) {
        this.b = ra0Var;
        this.a = p2Var;
    }

    public final void a(boolean z4) {
        ra0 ra0Var = this.b;
        if (ra0Var.getNeededLayoutManager() != ra0Var.getCurrentLayoutManager() && ra0Var.a()) {
            if (ra0Var.f.I0 > 0) {
                ra0Var.K = true;
                ra0Var.o(false);
                return;
            }
            ra0Var.b.setLayoutManager(ra0Var.getNeededLayoutManager());
        }
        if (z4 && !ra0Var.a()) {
            z4 = false;
        }
        ra0Var.o((!z4 || ra0Var.f.K() > 0) ? z4 : false);
    }

    public final void b(boolean z4) {
        this.b.l(z4);
    }

    public final void c() {
        ra0 ra0Var = this.b;
        xp xpVar = ra0Var.G;
        if (ra0Var.b.getLayoutManager() == ra0Var.d || !ra0Var.F) {
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(xpVar);
        AndroidUtilities.runOnUIThread(xpVar, this.a.getFragmentBeginToShow() ? 0L : 100L);
    }
}
