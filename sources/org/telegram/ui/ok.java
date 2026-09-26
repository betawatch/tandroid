package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class ok extends jh.e {
    public final /* synthetic */ wn L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ok(wn wnVar, Context context, org.telegram.ui.ActionBar.d6 d6Var, gj gjVar, ah.c cVar) {
        super(cVar, context, gjVar, d6Var);
        this.L = wnVar;
    }

    @Override // jh.e, android.view.View
    public final void setVisibility(int i10) {
        super.setVisibility(i10);
        this.L.Ac.j(3, i10 == 0, getMeasuredWidth() > 0);
    }
}
