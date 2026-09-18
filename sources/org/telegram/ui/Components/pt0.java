package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class pt0 extends ev0 {
    public final /* synthetic */ kv0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pt0(kv0 kv0Var, Context context) {
        super(kv0Var, context);
        this.h = kv0Var;
    }

    @Override // s4.h0
    public final void l() {
        super.l();
        kv0 kv0Var = this.h;
        du0 W = kv0Var.W(0);
        if (W == null || W.r.getVisibility() != 0) {
            return;
        }
        kv0Var.I.l();
    }
}
