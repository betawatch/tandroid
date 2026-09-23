package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class ja0 {
    public final /* synthetic */ org.telegram.ui.ActionBar.n2 a;
    public final /* synthetic */ oa0 b;

    public ja0(oa0 oa0Var, org.telegram.ui.ActionBar.n2 n2Var) {
        this.b = oa0Var;
        this.a = n2Var;
    }

    public final void a(boolean z10) {
        oa0 oa0Var = this.b;
        if (oa0Var.getNeededLayoutManager() != oa0Var.getCurrentLayoutManager() && oa0Var.a()) {
            if (oa0Var.f.M0 > 0) {
                oa0Var.N = true;
                oa0Var.o(false);
                return;
            }
            oa0Var.b.setLayoutManager(oa0Var.getNeededLayoutManager());
        }
        if (z10 && !oa0Var.a()) {
            z10 = false;
        }
        oa0Var.o((!z10 || oa0Var.f.K() > 0) ? z10 : false);
    }

    public final void b(boolean z10) {
        this.b.l(z10);
    }

    public final void c() {
        oa0 oa0Var = this.b;
        yp ypVar = oa0Var.J;
        if (oa0Var.b.getLayoutManager() == oa0Var.d || !oa0Var.I) {
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(ypVar);
        AndroidUtilities.runOnUIThread(ypVar, this.a.getFragmentBeginToShow() ? 0L : 100L);
    }
}
