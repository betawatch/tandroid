package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class ok extends wg.e {
    public final /* synthetic */ xn I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ok(xn xnVar, Context context, org.telegram.ui.ActionBar.f6 f6Var, fj fjVar, ng.a aVar) {
        super(context, aVar, f6Var, fjVar);
        this.I = xnVar;
    }

    @Override // wg.e, android.view.View
    public final void setVisibility(int i10) {
        super.setVisibility(i10);
        this.I.yc.h(3, i10 == 0, getMeasuredWidth() > 0);
    }
}
