package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class lk extends kh.e {
    public final /* synthetic */ sn L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lk(sn snVar, Context context, org.telegram.ui.ActionBar.d6 d6Var, dj djVar, bh.b bVar) {
        super(context, bVar, djVar, d6Var);
        this.L = snVar;
    }

    @Override // kh.e, android.view.View
    public final void setVisibility(int i10) {
        super.setVisibility(i10);
        this.L.Bc.i(3, i10 == 0, getMeasuredWidth() > 0);
    }
}
