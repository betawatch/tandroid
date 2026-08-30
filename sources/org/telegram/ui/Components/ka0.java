package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class ka0 {
    public final /* synthetic */ org.telegram.ui.ActionBar.p2 a;
    public final /* synthetic */ pa0 b;

    public ka0(pa0 pa0Var, org.telegram.ui.ActionBar.p2 p2Var) {
        this.b = pa0Var;
        this.a = p2Var;
    }

    public final void a(boolean z4) {
        pa0 pa0Var = this.b;
        if (pa0Var.getNeededLayoutManager() != pa0Var.getCurrentLayoutManager() && pa0Var.a()) {
            if (pa0Var.f.I0 > 0) {
                pa0Var.K = true;
                pa0Var.o(false);
                return;
            }
            pa0Var.b.setLayoutManager(pa0Var.getNeededLayoutManager());
        }
        if (z4 && !pa0Var.a()) {
            z4 = false;
        }
        pa0Var.o((!z4 || pa0Var.f.K() > 0) ? z4 : false);
    }

    public final void b(boolean z4) {
        this.b.l(z4);
    }

    public final void c() {
        pa0 pa0Var = this.b;
        vp vpVar = pa0Var.G;
        if (pa0Var.b.getLayoutManager() == pa0Var.d || !pa0Var.F) {
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(vpVar);
        AndroidUtilities.runOnUIThread(vpVar, this.a.getFragmentBeginToShow() ? 0L : 100L);
    }
}
