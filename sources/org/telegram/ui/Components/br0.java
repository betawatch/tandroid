package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class br0 extends zs0 {
    public final /* synthetic */ hu0 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public br0(hu0 hu0Var, Context context) {
        super(context);
        this.I = hu0Var;
    }

    @Override // android.view.View
    public final void setTranslationX(float f10) {
        zs0 zs0Var;
        super.setTranslationX(f10);
        hu0 hu0Var = this.I;
        zs0[] zs0VarArr = hu0Var.g0;
        if (hu0Var.c1 && (zs0Var = zs0VarArr[0]) == this) {
            float abs = Math.abs(zs0Var.getTranslationX()) / zs0VarArr[0].getMeasuredWidth();
            hu0Var.Z0(abs, zs0VarArr[1].B);
            if (hu0Var.D()) {
                int i10 = hu0Var.t0;
                if (i10 == 2) {
                    hu0Var.k0 = 1.0f - abs;
                } else if (i10 == 1) {
                    hu0Var.k0 = abs;
                }
                hu0Var.s1(abs);
                float a02 = hu0Var.a0(abs);
                hu0Var.l0 = a02;
                hu0Var.n0.setVisibility((a02 == 0.0f || !hu0Var.D() || hu0Var.q0()) ? 4 : 0);
            } else {
                hu0Var.k0 = 0.0f;
            }
            hu0Var.q1(false);
        }
        hu0Var.I();
        hu0Var.K();
        hu0Var.o0();
    }
}
