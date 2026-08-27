package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class bj0 extends lh.d {
    public final /* synthetic */ dj0 d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bj0(dj0 dj0Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var, true);
        this.d0 = dj0Var;
    }

    @Override // lh.d
    public final float a(float f10, float f11) {
        dj0 dj0Var = this.d0;
        boolean z10 = dj0Var.j0 == 0.0f;
        dj0Var.j0 = f10;
        if (z10) {
            dj0Var.k0 = new cg.r2(dj0Var, 2);
            dj0Var.S(false);
        }
        return f10;
    }
}
