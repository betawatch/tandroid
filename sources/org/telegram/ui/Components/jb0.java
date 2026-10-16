package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
