package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class zp0 extends tr0 {
    public final /* synthetic */ ys0 P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zp0(ys0 ys0Var, Context context) {
        super(context);
        this.P = ys0Var;
    }

    @Override // android.view.View
    public final void setTranslationX(float f10) {
        tr0 tr0Var;
        float translationX = getTranslationX();
        super.setTranslationX(f10);
        ys0 ys0Var = this.P;
        tr0[] tr0VarArr = ys0Var.m0;
        if (tr0VarArr[0] == this) {
            float f11 = translationX - f10;
            oi.q qVar = ys0Var.g2;
            if (qVar != null) {
                float f12 = ys0Var.h2 + f11;
                ys0Var.h2 = f12;
                int i7 = (int) f12;
                if (i7 != 0) {
                    ys0Var.h2 = f12 - i7;
                    qVar.h(i7, 0);
                }
            }
        }
        if (ys0Var.i1 && (tr0Var = tr0VarArr[0]) == this) {
            float abs = Math.abs(tr0Var.getTranslationX()) / tr0VarArr[0].getMeasuredWidth();
            ys0Var.l1(abs, tr0VarArr[1].E);
            if (ys0Var.I()) {
                int i10 = ys0Var.z0;
                if (i10 == 2) {
                    ys0Var.q0 = 1.0f - abs;
                } else if (i10 == 1) {
                    ys0Var.q0 = abs;
                }
                ys0Var.M1(abs);
                float k02 = ys0Var.k0(abs);
                ys0Var.r0 = k02;
                ys0Var.t0.setVisibility((k02 == 0.0f || !ys0Var.I() || ys0Var.A0()) ? 4 : 0);
            } else {
                ys0Var.q0 = 0.0f;
            }
            ys0Var.I1(false);
        }
        ys0Var.S();
        ys0Var.U();
    }
}
