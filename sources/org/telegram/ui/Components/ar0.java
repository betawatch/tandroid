package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ar0 extends ss0 {
    public final /* synthetic */ zt0 P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ar0(zt0 zt0Var, Context context) {
        super(context);
        this.P = zt0Var;
    }

    @Override // android.view.View
    public final void setTranslationX(float f7) {
        ss0 ss0Var;
        float translationX = getTranslationX();
        super.setTranslationX(f7);
        zt0 zt0Var = this.P;
        ss0[] ss0VarArr = zt0Var.m0;
        if (ss0VarArr[0] == this) {
            float f10 = translationX - f7;
            ei.r rVar = zt0Var.g2;
            if (rVar != null) {
                float f11 = zt0Var.h2 + f10;
                zt0Var.h2 = f11;
                int i10 = (int) f11;
                if (i10 != 0) {
                    zt0Var.h2 = f11 - i10;
                    rVar.h(i10, 0);
                }
            }
        }
        if (zt0Var.i1 && (ss0Var = ss0VarArr[0]) == this) {
            float abs = Math.abs(ss0Var.getTranslationX()) / ss0VarArr[0].getMeasuredWidth();
            zt0Var.g1(abs, ss0VarArr[1].E);
            if (zt0Var.H()) {
                int i11 = zt0Var.z0;
                if (i11 == 2) {
                    zt0Var.q0 = 1.0f - abs;
                } else if (i11 == 1) {
                    zt0Var.q0 = abs;
                }
                zt0Var.H1(abs);
                float i02 = zt0Var.i0(abs);
                zt0Var.r0 = i02;
                zt0Var.t0.setVisibility((i02 == 0.0f || !zt0Var.H() || zt0Var.y0()) ? 4 : 0);
            } else {
                zt0Var.q0 = 0.0f;
            }
            zt0Var.D1(false);
        }
        zt0Var.Q();
        zt0Var.S();
    }
}
