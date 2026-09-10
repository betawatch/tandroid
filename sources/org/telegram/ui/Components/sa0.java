package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class sa0 {
    public final /* synthetic */ org.telegram.ui.ActionBar.p2 a;
    public final /* synthetic */ xa0 b;

    public sa0(xa0 xa0Var, org.telegram.ui.ActionBar.p2 p2Var) {
        this.b = xa0Var;
        this.a = p2Var;
    }

    public final void a(boolean z10) {
        xa0 xa0Var = this.b;
        if (xa0Var.getNeededLayoutManager() != xa0Var.getCurrentLayoutManager() && xa0Var.a()) {
            if (xa0Var.f.L0 > 0) {
                xa0Var.N = true;
                xa0Var.o(false);
                return;
            }
            xa0Var.b.setLayoutManager(xa0Var.getNeededLayoutManager());
        }
        if (z10 && !xa0Var.a()) {
            z10 = false;
        }
        xa0Var.o((!z10 || xa0Var.f.K() > 0) ? z10 : false);
    }

    public final void b(boolean z10) {
        this.b.l(z10);
    }

    public final void c() {
        xa0 xa0Var = this.b;
        dq dqVar = xa0Var.J;
        if (xa0Var.b.getLayoutManager() == xa0Var.d || !xa0Var.I) {
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(dqVar);
        AndroidUtilities.runOnUIThread(dqVar, this.a.getFragmentBeginToShow() ? 0L : 100L);
    }
}
