package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class jb0 {
    public final /* synthetic */ org.telegram.ui.ActionBar.m2 a;
    public final /* synthetic */ ob0 b;

    public jb0(ob0 ob0Var, org.telegram.ui.ActionBar.m2 m2Var) {
        this.b = ob0Var;
        this.a = m2Var;
    }

    public final void a(boolean z10) {
        ob0 ob0Var = this.b;
        if (ob0Var.getNeededLayoutManager() != ob0Var.getCurrentLayoutManager() && ob0Var.a()) {
            if (ob0Var.f.M0 > 0) {
                ob0Var.N = true;
                ob0Var.o(false);
                return;
            }
            ob0Var.b.setLayoutManager(ob0Var.getNeededLayoutManager());
        }
        if (z10 && !ob0Var.a()) {
            z10 = false;
        }
        ob0Var.o((!z10 || ob0Var.f.K() > 0) ? z10 : false);
    }

    public final void b(boolean z10) {
        this.b.l(z10);
    }

    public final void c() {
        ob0 ob0Var = this.b;
        kq kqVar = ob0Var.J;
        if (ob0Var.b.getLayoutManager() == ob0Var.d || !ob0Var.I) {
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(kqVar);
        AndroidUtilities.runOnUIThread(kqVar, this.a.getFragmentBeginToShow() ? 0L : 100L);
    }
}
