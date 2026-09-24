package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class fs0 extends cu0 {
    public final /* synthetic */ jv0 M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fs0(jv0 jv0Var, Context context) {
        super(context);
        this.M = jv0Var;
    }

    @Override // android.view.View
    public final void setTranslationX(float f7) {
        cu0 cu0Var;
        super.setTranslationX(f7);
        jv0 jv0Var = this.M;
        cu0[] cu0VarArr = jv0Var.k0;
        if (jv0Var.g1 && (cu0Var = cu0VarArr[0]) == this) {
            float abs = Math.abs(cu0Var.getTranslationX()) / cu0VarArr[0].getMeasuredWidth();
            jv0Var.Z0(abs, cu0VarArr[1].F);
            if (jv0Var.D()) {
                int i10 = jv0Var.x0;
                if (i10 == 2) {
                    jv0Var.o0 = 1.0f - abs;
                } else if (i10 == 1) {
                    jv0Var.o0 = abs;
                }
                jv0Var.s1(abs);
                float a02 = jv0Var.a0(abs);
                jv0Var.p0 = a02;
                jv0Var.r0.setVisibility((a02 == 0.0f || !jv0Var.D() || jv0Var.q0()) ? 4 : 0);
            } else {
                jv0Var.o0 = 0.0f;
            }
            jv0Var.q1(false);
        }
        jv0Var.I();
        jv0Var.K();
        jv0Var.o0();
    }
}
