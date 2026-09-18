package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class ia0 {
    public final /* synthetic */ org.telegram.ui.ActionBar.o2 a;
    public final /* synthetic */ na0 b;

    public ia0(na0 na0Var, org.telegram.ui.ActionBar.o2 o2Var) {
        this.b = na0Var;
        this.a = o2Var;
    }

    public final void a(boolean z10) {
        na0 na0Var = this.b;
        if (na0Var.getNeededLayoutManager() != na0Var.getCurrentLayoutManager() && na0Var.a()) {
            if (na0Var.f.M0 > 0) {
                na0Var.N = true;
                na0Var.o(false);
                return;
            }
            na0Var.b.setLayoutManager(na0Var.getNeededLayoutManager());
        }
        if (z10 && !na0Var.a()) {
            z10 = false;
        }
        na0Var.o((!z10 || na0Var.f.K() > 0) ? z10 : false);
    }

    public final void b(boolean z10) {
        this.b.l(z10);
    }

    public final void c() {
        na0 na0Var = this.b;
        xp xpVar = na0Var.J;
        if (na0Var.b.getLayoutManager() == na0Var.d || !na0Var.I) {
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(xpVar);
        AndroidUtilities.runOnUIThread(xpVar, this.a.getFragmentBeginToShow() ? 0L : 100L);
    }
}
