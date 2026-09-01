package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class ok extends xg.e {
    public final /* synthetic */ xn I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ok(xn xnVar, Context context, org.telegram.ui.ActionBar.g6 g6Var, fj fjVar, og.a aVar) {
        super(context, aVar, g6Var, fjVar);
        this.I = xnVar;
    }

    @Override // xg.e, android.view.View
    public final void setVisibility(int i10) {
        super.setVisibility(i10);
        this.I.yc.h(3, i10 == 0, getMeasuredWidth() > 0);
    }
}
