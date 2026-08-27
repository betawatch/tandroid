package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class hk extends sg.e {
    public final /* synthetic */ rn H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hk(rn rnVar, Context context, org.telegram.ui.ActionBar.c6 c6Var, zi ziVar, jg.a aVar) {
        super(context, aVar, ziVar, c6Var);
        this.H = rnVar;
    }

    @Override // sg.e, android.view.View
    public final void setVisibility(int i10) {
        super.setVisibility(i10);
        this.H.xc.j(3, i10 == 0, getMeasuredWidth() > 0);
    }
}
