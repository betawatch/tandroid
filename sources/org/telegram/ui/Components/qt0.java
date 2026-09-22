package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class qt0 extends fv0 {
    public final /* synthetic */ lv0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qt0(lv0 lv0Var, Context context) {
        super(lv0Var, context);
        this.h = lv0Var;
    }

    @Override // s4.h0
    public final void l() {
        super.l();
        lv0 lv0Var = this.h;
        eu0 W = lv0Var.W(0);
        if (W == null || W.r.getVisibility() != 0) {
            return;
        }
        lv0Var.I.l();
    }
}
