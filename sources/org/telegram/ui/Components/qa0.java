package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class qa0 {
    public final /* synthetic */ org.telegram.ui.ActionBar.n2 a;
    public final /* synthetic */ va0 b;

    public qa0(va0 va0Var, org.telegram.ui.ActionBar.n2 n2Var) {
        this.b = va0Var;
        this.a = n2Var;
    }

    public final void a(boolean z10) {
        va0 va0Var = this.b;
        if (va0Var.getNeededLayoutManager() != va0Var.getCurrentLayoutManager() && va0Var.a()) {
            if (va0Var.f.M0 > 0) {
                va0Var.N = true;
                va0Var.o(false);
                return;
            }
            va0Var.b.setLayoutManager(va0Var.getNeededLayoutManager());
        }
        if (z10 && !va0Var.a()) {
            z10 = false;
        }
        va0Var.o((!z10 || va0Var.f.K() > 0) ? z10 : false);
    }

    public final void b(boolean z10) {
        this.b.l(z10);
    }

    public final void c() {
        va0 va0Var = this.b;
        xp xpVar = va0Var.J;
        if (va0Var.b.getLayoutManager() == va0Var.d || !va0Var.I) {
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(xpVar);
        AndroidUtilities.runOnUIThread(xpVar, this.a.getFragmentBeginToShow() ? 0L : 100L);
    }
}
