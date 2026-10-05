package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class ok extends jh.e {
    public final /* synthetic */ yn L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ok(yn ynVar, Context context, org.telegram.ui.ActionBar.d6 d6Var, hj hjVar, ah.c cVar) {
        super(cVar, context, hjVar, d6Var);
        this.L = ynVar;
    }

    @Override // jh.e, android.view.View
    public final void setVisibility(int i10) {
        super.setVisibility(i10);
        this.L.yc.j(3, i10 == 0, getMeasuredWidth() > 0);
    }
}
