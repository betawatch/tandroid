package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class cj0 extends fi.d {
    public final /* synthetic */ ej0 k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cj0(ej0 ej0Var, Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, u6Var, true);
        this.k0 = ej0Var;
    }

    @Override // fi.d
    public final float a(float f7, float f10) {
        ej0 ej0Var = this.k0;
        boolean z10 = ej0Var.n0 == 0.0f;
        ej0Var.n0 = f7;
        if (z10) {
            ej0Var.o0 = new org.telegram.ui.Components.lb0(ej0Var, 1);
            ej0Var.S(false);
        }
        return f7;
    }
}
