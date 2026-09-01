package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class ur0 extends rt0 {
    public final /* synthetic */ zu0 J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ur0(zu0 zu0Var, Context context) {
        super(context);
        this.J = zu0Var;
    }

    @Override // android.view.View
    public final void setTranslationX(float f10) {
        rt0 rt0Var;
        super.setTranslationX(f10);
        zu0 zu0Var = this.J;
        rt0[] rt0VarArr = zu0Var.h0;
        if (zu0Var.d1 && (rt0Var = rt0VarArr[0]) == this) {
            float abs = Math.abs(rt0Var.getTranslationX()) / rt0VarArr[0].getMeasuredWidth();
            zu0Var.Z0(abs, rt0VarArr[1].C);
            if (zu0Var.D()) {
                int i10 = zu0Var.u0;
                if (i10 == 2) {
                    zu0Var.l0 = 1.0f - abs;
                } else if (i10 == 1) {
                    zu0Var.l0 = abs;
                }
                zu0Var.s1(abs);
                float a02 = zu0Var.a0(abs);
                zu0Var.m0 = a02;
                zu0Var.o0.setVisibility((a02 == 0.0f || !zu0Var.D() || zu0Var.q0()) ? 4 : 0);
            } else {
                zu0Var.l0 = 0.0f;
            }
            zu0Var.q1(false);
        }
        zu0Var.I();
        zu0Var.K();
        zu0Var.o0();
    }
}
