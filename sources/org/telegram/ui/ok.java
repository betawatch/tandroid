package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class ok extends jh.e {
    public final /* synthetic */ xn L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ok(xn xnVar, Context context, org.telegram.ui.ActionBar.d6 d6Var, gj gjVar, ah.c cVar) {
        super(cVar, context, gjVar, d6Var);
        this.L = xnVar;
    }

    @Override // jh.e, android.view.View
    public final void setVisibility(int i10) {
        super.setVisibility(i10);
        this.L.Ac.j(3, i10 == 0, getMeasuredWidth() > 0);
    }
}
