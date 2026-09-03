package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class tr0 extends qt0 {
    public final /* synthetic */ yu0 J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tr0(yu0 yu0Var, Context context) {
        super(context);
        this.J = yu0Var;
    }

    @Override // android.view.View
    public final void setTranslationX(float f10) {
        qt0 qt0Var;
        super.setTranslationX(f10);
        yu0 yu0Var = this.J;
        qt0[] qt0VarArr = yu0Var.h0;
        if (yu0Var.d1 && (qt0Var = qt0VarArr[0]) == this) {
            float abs = Math.abs(qt0Var.getTranslationX()) / qt0VarArr[0].getMeasuredWidth();
            yu0Var.Z0(abs, qt0VarArr[1].C);
            if (yu0Var.D()) {
                int i10 = yu0Var.u0;
                if (i10 == 2) {
                    yu0Var.l0 = 1.0f - abs;
                } else if (i10 == 1) {
                    yu0Var.l0 = abs;
                }
                yu0Var.s1(abs);
                float a02 = yu0Var.a0(abs);
                yu0Var.m0 = a02;
                yu0Var.o0.setVisibility((a02 == 0.0f || !yu0Var.D() || yu0Var.q0()) ? 4 : 0);
            } else {
                yu0Var.l0 = 0.0f;
            }
            yu0Var.q1(false);
        }
        yu0Var.I();
        yu0Var.K();
        yu0Var.o0();
    }
}
