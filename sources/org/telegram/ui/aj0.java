package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class aj0 extends fi.d {
    public final /* synthetic */ cj0 k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aj0(cj0 cj0Var, Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, u6Var, true);
        this.k0 = cj0Var;
    }

    @Override // fi.d
    public final float a(float f7, float f10) {
        cj0 cj0Var = this.k0;
        boolean z10 = cj0Var.n0 == 0.0f;
        cj0Var.n0 = f7;
        if (z10) {
            cj0Var.o0 = new org.telegram.ui.Components.kb0(cj0Var, 1);
            cj0Var.S(false);
        }
        return f7;
    }
}
