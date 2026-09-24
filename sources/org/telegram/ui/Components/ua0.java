package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class ua0 {
    public final /* synthetic */ org.telegram.ui.ActionBar.m2 a;
    public final /* synthetic */ za0 b;

    public ua0(za0 za0Var, org.telegram.ui.ActionBar.m2 m2Var) {
        this.b = za0Var;
        this.a = m2Var;
    }

    public final void a(boolean z10) {
        za0 za0Var = this.b;
        if (za0Var.getNeededLayoutManager() != za0Var.getCurrentLayoutManager() && za0Var.a()) {
            if (za0Var.f.M0 > 0) {
                za0Var.N = true;
                za0Var.o(false);
                return;
            }
            za0Var.b.setLayoutManager(za0Var.getNeededLayoutManager());
        }
        if (z10 && !za0Var.a()) {
            z10 = false;
        }
        za0Var.o((!z10 || za0Var.f.K() > 0) ? z10 : false);
    }

    public final void b(boolean z10) {
        this.b.l(z10);
    }

    public final void c() {
        za0 za0Var = this.b;
        yp ypVar = za0Var.J;
        if (za0Var.b.getLayoutManager() == za0Var.d || !za0Var.I) {
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(ypVar);
        AndroidUtilities.runOnUIThread(ypVar, this.a.getFragmentBeginToShow() ? 0L : 100L);
    }
}
