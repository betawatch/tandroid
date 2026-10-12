package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class ns0 extends yh.q2 {
    public final /* synthetic */ xv0 U;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ns0(int i10, long j10, Context context, org.telegram.ui.ActionBar.m2 m2Var, org.telegram.ui.ActionBar.c6 c6Var, xv0 xv0Var) {
        super(i10, j10, context, m2Var, c6Var);
        this.U = xv0Var;
    }

    @Override // yh.q2
    public final void p(boolean z10) {
        xv0 xv0Var = this.U;
        TextView textView = xv0Var.q0;
        textView.setVisibility(0);
        textView.animate().alpha(z10 ? 1.0f : 0.0f).scaleX(z10 ? 1.0f : 0.4f).scaleY(z10 ? 1.0f : 0.4f).withEndAction(new sn0(2, this, z10)).start();
        xv0Var.q1(true);
    }
}
