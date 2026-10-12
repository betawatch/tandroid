package org.telegram.ui;

import android.view.ViewGroup;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class p30 extends s4.k {
    public final /* synthetic */ n60 F;

    public p30(n60 n60Var) {
        this.F = n60Var;
    }

    @Override // s4.k
    public final void P(s4.b1 b1Var) {
        ViewGroup viewGroup;
        n60 n60Var = this.F;
        n60Var.Q.invalidate();
        n60Var.a2.invalidate();
        viewGroup = ((org.telegram.ui.ActionBar.e3) n60Var).containerView;
        viewGroup.invalidate();
        n60.K0(n60Var);
    }
}
