package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class bj0 extends ei.d {
    public final /* synthetic */ dj0 h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bj0(dj0 dj0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var, true);
        this.h0 = dj0Var;
    }

    @Override // ei.d
    public final float a(float f7, float f10) {
        dj0 dj0Var = this.h0;
        boolean z10 = dj0Var.n0 == 0.0f;
        dj0Var.n0 = f7;
        if (z10) {
            dj0Var.o0 = new org.telegram.ui.Components.mb0(dj0Var, 1);
            dj0Var.T(false);
        }
        return f7;
    }
}
