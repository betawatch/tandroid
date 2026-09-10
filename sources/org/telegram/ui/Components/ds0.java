package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class ds0 extends au0 {
    public final /* synthetic */ iv0 M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ds0(iv0 iv0Var, Context context) {
        super(context);
        this.M = iv0Var;
    }

    @Override // android.view.View
    public final void setTranslationX(float f7) {
        au0 au0Var;
        super.setTranslationX(f7);
        iv0 iv0Var = this.M;
        au0[] au0VarArr = iv0Var.k0;
        if (iv0Var.g1 && (au0Var = au0VarArr[0]) == this) {
            float abs = Math.abs(au0Var.getTranslationX()) / au0VarArr[0].getMeasuredWidth();
            iv0Var.Z0(abs, au0VarArr[1].F);
            if (iv0Var.D()) {
                int i10 = iv0Var.x0;
                if (i10 == 2) {
                    iv0Var.o0 = 1.0f - abs;
                } else if (i10 == 1) {
                    iv0Var.o0 = abs;
                }
                iv0Var.s1(abs);
                float a02 = iv0Var.a0(abs);
                iv0Var.p0 = a02;
                iv0Var.r0.setVisibility((a02 == 0.0f || !iv0Var.D() || iv0Var.q0()) ? 4 : 0);
            } else {
                iv0Var.o0 = 0.0f;
            }
            iv0Var.q1(false);
        }
        iv0Var.I();
        iv0Var.K();
        iv0Var.o0();
    }
}
