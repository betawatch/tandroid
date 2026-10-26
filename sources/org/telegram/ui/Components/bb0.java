package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class bb0 {
    public final /* synthetic */ org.telegram.ui.ActionBar.r2 a;
    public final /* synthetic */ gb0 b;

    public bb0(gb0 gb0Var, org.telegram.ui.ActionBar.r2 r2Var) {
        this.b = gb0Var;
        this.a = r2Var;
    }

    public final void a(boolean z10) {
        gb0 gb0Var = this.b;
        if (gb0Var.getNeededLayoutManager() != gb0Var.getCurrentLayoutManager() && gb0Var.a()) {
            if (gb0Var.f.M0 > 0) {
                gb0Var.N = true;
                gb0Var.o(false);
                return;
            }
            gb0Var.b.setLayoutManager(gb0Var.getNeededLayoutManager());
        }
        if (z10 && !gb0Var.a()) {
            z10 = false;
        }
        gb0Var.o((!z10 || gb0Var.f.K() > 0) ? z10 : false);
    }

    public final void b(boolean z10) {
        this.b.l(z10);
    }

    public final void c() {
        gb0 gb0Var = this.b;
        wa0 wa0Var = gb0Var.J;
        if (gb0Var.b.getLayoutManager() == gb0Var.d || !gb0Var.I) {
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(wa0Var);
        AndroidUtilities.runOnUIThread(wa0Var, this.a.getFragmentBeginToShow() ? 0L : 100L);
    }
}
