package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class v90 {
    public final /* synthetic */ org.telegram.ui.ActionBar.n2 a;
    public final /* synthetic */ aa0 b;

    public v90(aa0 aa0Var, org.telegram.ui.ActionBar.n2 n2Var) {
        this.b = aa0Var;
        this.a = n2Var;
    }

    public final void a(boolean z10) {
        aa0 aa0Var = this.b;
        if (aa0Var.getNeededLayoutManager() != aa0Var.getCurrentLayoutManager() && aa0Var.a()) {
            if (aa0Var.f.H0 > 0) {
                aa0Var.J = true;
                aa0Var.o(false);
                return;
            }
            aa0Var.b.setLayoutManager(aa0Var.getNeededLayoutManager());
        }
        if (z10 && !aa0Var.a()) {
            z10 = false;
        }
        aa0Var.o((!z10 || aa0Var.f.K() > 0) ? z10 : false);
    }

    public final void b(boolean z10) {
        this.b.l(z10);
    }

    public final void c() {
        aa0 aa0Var = this.b;
        lp lpVar = aa0Var.F;
        if (aa0Var.b.getLayoutManager() == aa0Var.d || !aa0Var.E) {
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(lpVar);
        AndroidUtilities.runOnUIThread(lpVar, this.a.getFragmentBeginToShow() ? 0L : 100L);
    }
}
