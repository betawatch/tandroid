package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class ut0 extends jv0 {
    public final /* synthetic */ pv0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ut0(pv0 pv0Var, Context context) {
        super(pv0Var, context);
        this.h = pv0Var;
    }

    @Override // s4.h0
    public final void l() {
        super.l();
        pv0 pv0Var = this.h;
        iu0 W = pv0Var.W(0);
        if (W == null || W.r.getVisibility() != 0) {
            return;
        }
        pv0Var.I.l();
    }
}
