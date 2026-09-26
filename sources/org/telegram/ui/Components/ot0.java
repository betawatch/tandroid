package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class ot0 extends dv0 {
    public final /* synthetic */ jv0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ot0(jv0 jv0Var, Context context) {
        super(jv0Var, context);
        this.h = jv0Var;
    }

    @Override // s4.h0
    public final void l() {
        super.l();
        jv0 jv0Var = this.h;
        cu0 W = jv0Var.W(0);
        if (W == null || W.r.getVisibility() != 0) {
            return;
        }
        jv0Var.I.l();
    }
}
