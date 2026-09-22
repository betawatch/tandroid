package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class pj0 extends ci.d {
    public final /* synthetic */ rj0 h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pj0(rj0 rj0Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var, true);
        this.h0 = rj0Var;
    }

    @Override // ci.d
    public final float a(float f7, float f10) {
        rj0 rj0Var = this.h0;
        boolean z10 = rj0Var.n0 == 0.0f;
        rj0Var.n0 = f7;
        if (z10) {
            rj0Var.o0 = new org.telegram.ui.Components.ra0(rj0Var, 1);
            rj0Var.S(false);
        }
        return f7;
    }
}
