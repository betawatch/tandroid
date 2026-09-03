package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
