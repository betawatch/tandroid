package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class iq0 extends bs0 {
    public final /* synthetic */ gt0 Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iq0(gt0 gt0Var, Context context) {
        super(context);
        this.Q = gt0Var;
    }

    @Override // android.view.View
    public final void setTranslationX(float f10) {
        bs0 bs0Var;
        float translationX = getTranslationX();
        super.setTranslationX(f10);
        gt0 gt0Var = this.Q;
        bs0[] bs0VarArr = gt0Var.n0;
        if (bs0VarArr[0] == this) {
            float f11 = translationX - f10;
            ri.q qVar = gt0Var.h2;
            if (qVar != null) {
                float f12 = gt0Var.i2 + f11;
                gt0Var.i2 = f12;
                int i7 = (int) f12;
                if (i7 != 0) {
                    gt0Var.i2 = f12 - i7;
                    qVar.h(i7, 0);
                }
            }
        }
        if (gt0Var.j1 && (bs0Var = bs0VarArr[0]) == this) {
            float abs = Math.abs(bs0Var.getTranslationX()) / bs0VarArr[0].getMeasuredWidth();
            gt0Var.l1(abs, bs0VarArr[1].F);
            if (gt0Var.I()) {
                int i10 = gt0Var.A0;
                if (i10 == 2) {
                    gt0Var.r0 = 1.0f - abs;
                } else if (i10 == 1) {
                    gt0Var.r0 = abs;
                }
                gt0Var.M1(abs);
                float k02 = gt0Var.k0(abs);
                gt0Var.s0 = k02;
                gt0Var.u0.setVisibility((k02 == 0.0f || !gt0Var.I() || gt0Var.A0()) ? 4 : 0);
            } else {
                gt0Var.r0 = 0.0f;
            }
            gt0Var.I1(false);
        }
        gt0Var.S();
        gt0Var.U();
    }
}
