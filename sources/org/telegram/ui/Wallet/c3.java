package org.telegram.ui.Wallet;

import android.content.Context;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final class c3 extends tg.s {
    public final /* synthetic */ d3 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c3(d3 d3Var, Context context, z2 z2Var) {
        super(context, z2Var);
        this.x = d3Var;
    }

    @Override // tg.s
    public final void a() {
        d3 d3Var = this.x;
        d3Var.o = true;
        setPaused(true);
        setVisibility(8);
        d3Var.a.invalidate();
    }
}
