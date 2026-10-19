package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class ps0 extends mu0 {
    public final /* synthetic */ tv0 M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ps0(tv0 tv0Var, Context context) {
        super(context);
        this.M = tv0Var;
    }

    @Override // android.view.View
    public final void setTranslationX(float f7) {
        mu0 mu0Var;
        super.setTranslationX(f7);
        tv0 tv0Var = this.M;
        mu0[] mu0VarArr = tv0Var.k0;
        if (tv0Var.g1 && (mu0Var = mu0VarArr[0]) == this) {
            float abs = Math.abs(mu0Var.getTranslationX()) / mu0VarArr[0].getMeasuredWidth();
            tv0Var.b1(abs, mu0VarArr[1].F);
            if (tv0Var.D()) {
                int i10 = tv0Var.x0;
                if (i10 == 2) {
                    tv0Var.o0 = 1.0f - abs;
                } else if (i10 == 1) {
                    tv0Var.o0 = abs;
                }
                tv0Var.v1(abs);
                float a02 = tv0Var.a0(abs);
                tv0Var.p0 = a02;
                tv0Var.r0.setVisibility((a02 == 0.0f || !tv0Var.D() || tv0Var.r0()) ? 4 : 0);
            } else {
                tv0Var.o0 = 0.0f;
            }
            tv0Var.s1(false);
        }
        tv0Var.I();
        tv0Var.K();
        tv0Var.p0();
    }
}
