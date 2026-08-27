package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class ls0 extends bu0 {
    public final /* synthetic */ hu0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ls0(hu0 hu0Var, Context context) {
        super(hu0Var, context);
        this.h = hu0Var;
    }

    @Override // f2.q0
    public final void l() {
        super.l();
        hu0 hu0Var = this.h;
        zs0 W = hu0Var.W(0);
        if (W == null || W.r.getVisibility() != 0) {
            return;
        }
        hu0Var.E.l();
    }
}
