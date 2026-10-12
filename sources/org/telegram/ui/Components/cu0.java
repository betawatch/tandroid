package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class cu0 extends rv0 {
    public final /* synthetic */ xv0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cu0(xv0 xv0Var, Context context) {
        super(xv0Var, context);
        this.h = xv0Var;
    }

    @Override // s4.g0
    public final void l() {
        super.l();
        xv0 xv0Var = this.h;
        qu0 W = xv0Var.W(0);
        if (W == null || W.r.getVisibility() != 0) {
            return;
        }
        xv0Var.I.l();
    }
}
