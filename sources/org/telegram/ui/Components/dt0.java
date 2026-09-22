package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class dt0 extends su0 {
    public final /* synthetic */ yu0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dt0(yu0 yu0Var, Context context) {
        super(yu0Var, context);
        this.h = yu0Var;
    }

    @Override // s4.h0
    public final void l() {
        super.l();
        yu0 yu0Var = this.h;
        rt0 W = yu0Var.W(0);
        if (W == null || W.r.getVisibility() != 0) {
            return;
        }
        yu0Var.I.l();
    }
}
