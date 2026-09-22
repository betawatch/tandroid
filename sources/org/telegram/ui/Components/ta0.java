package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class ta0 {
    public final /* synthetic */ org.telegram.ui.ActionBar.n2 a;
    public final /* synthetic */ ya0 b;

    public ta0(ya0 ya0Var, org.telegram.ui.ActionBar.n2 n2Var) {
        this.b = ya0Var;
        this.a = n2Var;
    }

    public final void a(boolean z10) {
        ya0 ya0Var = this.b;
        if (ya0Var.getNeededLayoutManager() != ya0Var.getCurrentLayoutManager() && ya0Var.a()) {
            if (ya0Var.f.M0 > 0) {
                ya0Var.N = true;
                ya0Var.o(false);
                return;
            }
            ya0Var.b.setLayoutManager(ya0Var.getNeededLayoutManager());
        }
        if (z10 && !ya0Var.a()) {
            z10 = false;
        }
        ya0Var.o((!z10 || ya0Var.f.K() > 0) ? z10 : false);
    }

    public final void b(boolean z10) {
        this.b.l(z10);
    }

    public final void c() {
        ya0 ya0Var = this.b;
        xp xpVar = ya0Var.J;
        if (ya0Var.b.getLayoutManager() == ya0Var.d || !ya0Var.I) {
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(xpVar);
        AndroidUtilities.runOnUIThread(xpVar, this.a.getFragmentBeginToShow() ? 0L : 100L);
    }
}
