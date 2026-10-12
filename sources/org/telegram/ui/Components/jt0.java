package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class jt0 extends FragmentContextView {
    public final /* synthetic */ xv0 R0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jt0(xv0 xv0Var, Context context, org.telegram.ui.ActionBar.m2 m2Var, xv0 xv0Var2, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, m2Var, xv0Var2, false, c6Var);
        this.R0 = xv0Var;
    }

    @Override // org.telegram.ui.Components.FragmentContextView, android.view.View
    public final void setVisibility(int i10) {
        xv0 xv0Var = this.R0;
        xv0Var.P0.i(xv0Var.Q0, i10 == 0, true);
    }
}
