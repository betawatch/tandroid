package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class cm extends org.telegram.ui.Cells.h0 {
    public final /* synthetic */ km L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cm(km kmVar, Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, i10, d6Var);
        this.L = kmVar;
    }

    @Override // org.telegram.ui.Cells.h0
    public final int getSideMenuWidth() {
        xn xnVar = this.L.Q;
        int i10 = xn.Gc;
        return xnVar.R8();
    }
}
