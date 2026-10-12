package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class ht0 extends wx0 {
    public final /* synthetic */ xv0 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ht0(xv0 xv0Var, Context context, f10 f10Var) {
        super(context, f10Var, 1, null);
        this.K = xv0Var;
    }

    @Override // org.telegram.ui.Components.wx0
    public final void a() {
        invalidate();
        this.K.E0();
    }
}
