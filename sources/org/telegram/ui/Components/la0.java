package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class la0 {
    public final /* synthetic */ org.telegram.ui.ActionBar.p2 a;
    public final /* synthetic */ qa0 b;

    public la0(qa0 qa0Var, org.telegram.ui.ActionBar.p2 p2Var) {
        this.b = qa0Var;
        this.a = p2Var;
    }

    public final void a(boolean z4) {
        qa0 qa0Var = this.b;
        if (qa0Var.getNeededLayoutManager() != qa0Var.getCurrentLayoutManager() && qa0Var.a()) {
            if (qa0Var.f.I0 > 0) {
                qa0Var.K = true;
                qa0Var.o(false);
                return;
            }
            qa0Var.b.setLayoutManager(qa0Var.getNeededLayoutManager());
        }
        if (z4 && !qa0Var.a()) {
            z4 = false;
        }
        qa0Var.o((!z4 || qa0Var.f.K() > 0) ? z4 : false);
    }

    public final void b(boolean z4) {
        this.b.l(z4);
    }

    public final void c() {
        qa0 qa0Var = this.b;
        up upVar = qa0Var.G;
        if (qa0Var.b.getLayoutManager() == qa0Var.d || !qa0Var.F) {
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(upVar);
        AndroidUtilities.runOnUIThread(upVar, this.a.getFragmentBeginToShow() ? 0L : 100L);
    }
}
