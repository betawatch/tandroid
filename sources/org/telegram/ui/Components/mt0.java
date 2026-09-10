package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class mt0 extends cv0 {
    public final /* synthetic */ iv0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mt0(iv0 iv0Var, Context context) {
        super(iv0Var, context);
        this.h = iv0Var;
    }

    @Override // s4.h0
    public final void l() {
        super.l();
        iv0 iv0Var = this.h;
        au0 W = iv0Var.W(0);
        if (W == null || W.r.getVisibility() != 0) {
            return;
        }
        iv0Var.I.l();
    }
}
