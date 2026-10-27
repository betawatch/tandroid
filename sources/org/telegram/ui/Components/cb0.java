package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class cb0 {
    public final /* synthetic */ org.telegram.ui.ActionBar.r2 a;
    public final /* synthetic */ hb0 b;

    public cb0(hb0 hb0Var, org.telegram.ui.ActionBar.r2 r2Var) {
        this.b = hb0Var;
        this.a = r2Var;
    }

    public final void a(boolean z10) {
        hb0 hb0Var = this.b;
        if (hb0Var.getNeededLayoutManager() != hb0Var.getCurrentLayoutManager() && hb0Var.a()) {
            if (hb0Var.f.M0 > 0) {
                hb0Var.N = true;
                hb0Var.o(false);
                return;
            }
            hb0Var.b.setLayoutManager(hb0Var.getNeededLayoutManager());
        }
        if (z10 && !hb0Var.a()) {
            z10 = false;
        }
        hb0Var.o((!z10 || hb0Var.f.K() > 0) ? z10 : false);
    }

    public final void b(boolean z10) {
        this.b.l(z10);
    }

    public final void c() {
        hb0 hb0Var = this.b;
        xa0 xa0Var = hb0Var.J;
        if (hb0Var.b.getLayoutManager() == hb0Var.d || !hb0Var.I) {
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(xa0Var);
        AndroidUtilities.runOnUIThread(xa0Var, this.a.getFragmentBeginToShow() ? 0L : 100L);
    }
}
