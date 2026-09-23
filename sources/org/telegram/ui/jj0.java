package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class jj0 extends ci.d {
    public final /* synthetic */ lj0 h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jj0(lj0 lj0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var, true);
        this.h0 = lj0Var;
    }

    @Override // ci.d
    public final float a(float f7, float f10) {
        lj0 lj0Var = this.h0;
        boolean z10 = lj0Var.n0 == 0.0f;
        lj0Var.n0 = f7;
        if (z10) {
            lj0Var.o0 = new org.telegram.ui.Components.sa0(lj0Var, 1);
            lj0Var.S(false);
        }
        return f7;
    }
}
