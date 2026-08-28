package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class r90 {
    public final /* synthetic */ org.telegram.ui.ActionBar.o2 a;
    public final /* synthetic */ w90 b;

    public r90(w90 w90Var, org.telegram.ui.ActionBar.o2 o2Var) {
        this.b = w90Var;
        this.a = o2Var;
    }

    public final void a(boolean z10) {
        w90 w90Var = this.b;
        if (w90Var.getNeededLayoutManager() != w90Var.getCurrentLayoutManager() && w90Var.a()) {
            if (w90Var.f.H0 > 0) {
                w90Var.J = true;
                w90Var.o(false);
                return;
            }
            w90Var.b.setLayoutManager(w90Var.getNeededLayoutManager());
        }
        if (z10 && !w90Var.a()) {
            z10 = false;
        }
        w90Var.o((!z10 || w90Var.f.K() > 0) ? z10 : false);
    }

    public final void b(boolean z10) {
        this.b.l(z10);
    }

    public final void c() {
        w90 w90Var = this.b;
        np npVar = w90Var.F;
        if (w90Var.b.getLayoutManager() == w90Var.d || !w90Var.E) {
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(npVar);
        AndroidUtilities.runOnUIThread(npVar, this.a.getFragmentBeginToShow() ? 0L : 100L);
    }
}
