package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class aq0 extends ur0 {
    public final /* synthetic */ zs0 P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aq0(zs0 zs0Var, Context context) {
        super(context);
        this.P = zs0Var;
    }

    @Override // android.view.View
    public final void setTranslationX(float f10) {
        ur0 ur0Var;
        float translationX = getTranslationX();
        super.setTranslationX(f10);
        zs0 zs0Var = this.P;
        ur0[] ur0VarArr = zs0Var.m0;
        if (ur0VarArr[0] == this) {
            float f11 = translationX - f10;
            oi.q qVar = zs0Var.g2;
            if (qVar != null) {
                float f12 = zs0Var.h2 + f11;
                zs0Var.h2 = f12;
                int i7 = (int) f12;
                if (i7 != 0) {
                    zs0Var.h2 = f12 - i7;
                    qVar.h(i7, 0);
                }
            }
        }
        if (zs0Var.i1 && (ur0Var = ur0VarArr[0]) == this) {
            float abs = Math.abs(ur0Var.getTranslationX()) / ur0VarArr[0].getMeasuredWidth();
            zs0Var.l1(abs, ur0VarArr[1].E);
            if (zs0Var.I()) {
                int i10 = zs0Var.z0;
                if (i10 == 2) {
                    zs0Var.q0 = 1.0f - abs;
                } else if (i10 == 1) {
                    zs0Var.q0 = abs;
                }
                zs0Var.M1(abs);
                float k02 = zs0Var.k0(abs);
                zs0Var.r0 = k02;
                zs0Var.t0.setVisibility((k02 == 0.0f || !zs0Var.I() || zs0Var.A0()) ? 4 : 0);
            } else {
                zs0Var.q0 = 0.0f;
            }
            zs0Var.I1(false);
        }
        zs0Var.S();
        zs0Var.U();
    }
}
