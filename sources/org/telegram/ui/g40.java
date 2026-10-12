package org.telegram.ui;

import android.view.ViewGroup;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class g40 extends org.telegram.ui.Components.pi0 {
    public final /* synthetic */ n60 s1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g40(n60 n60Var, LaunchActivity launchActivity, j50 j50Var, t50 t50Var, f40 f40Var) {
        super(launchActivity, j50Var, t50Var, f40Var);
        this.s1 = n60Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        ViewGroup viewGroup;
        super.invalidate();
        viewGroup = ((org.telegram.ui.ActionBar.e3) this.s1).containerView;
        viewGroup.invalidate();
    }
}
