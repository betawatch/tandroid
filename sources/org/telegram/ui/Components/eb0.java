package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class eb0 {
    public final /* synthetic */ org.telegram.ui.ActionBar.o2 a;
    public final /* synthetic */ jb0 b;

    public eb0(jb0 jb0Var, org.telegram.ui.ActionBar.o2 o2Var) {
        this.b = jb0Var;
        this.a = o2Var;
    }

    public final void a(boolean z10) {
        jb0 jb0Var = this.b;
        if (jb0Var.getNeededLayoutManager() != jb0Var.getCurrentLayoutManager() && jb0Var.a()) {
            if (jb0Var.f.M0 > 0) {
                jb0Var.N = true;
                jb0Var.o(false);
                return;
            }
            jb0Var.b.setLayoutManager(jb0Var.getNeededLayoutManager());
        }
        if (z10 && !jb0Var.a()) {
            z10 = false;
        }
        jb0Var.o((!z10 || jb0Var.f.K() > 0) ? z10 : false);
    }

    public final void b(boolean z10) {
        this.b.l(z10);
    }

    public final void c() {
        jb0 jb0Var = this.b;
        zp zpVar = jb0Var.J;
        if (jb0Var.b.getLayoutManager() == jb0Var.d || !jb0Var.I) {
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(zpVar);
        AndroidUtilities.runOnUIThread(zpVar, this.a.getFragmentBeginToShow() ? 0L : 100L);
    }
}
