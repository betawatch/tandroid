package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class ij0 extends ci.d {
    public final /* synthetic */ kj0 h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ij0(kj0 kj0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var, true);
        this.h0 = kj0Var;
    }

    @Override // ci.d
    public final float a(float f7, float f10) {
        kj0 kj0Var = this.h0;
        boolean z10 = kj0Var.n0 == 0.0f;
        kj0Var.n0 = f7;
        if (z10) {
            kj0Var.o0 = new org.telegram.ui.Components.db0(kj0Var, 1);
            kj0Var.S(false);
        }
        return f7;
    }
}
