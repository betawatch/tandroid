package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class ur0 extends rt0 {
    public final /* synthetic */ yu0 M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ur0(yu0 yu0Var, Context context) {
        super(context);
        this.M = yu0Var;
    }

    @Override // android.view.View
    public final void setTranslationX(float f7) {
        rt0 rt0Var;
        super.setTranslationX(f7);
        yu0 yu0Var = this.M;
        rt0[] rt0VarArr = yu0Var.k0;
        if (yu0Var.g1 && (rt0Var = rt0VarArr[0]) == this) {
            float abs = Math.abs(rt0Var.getTranslationX()) / rt0VarArr[0].getMeasuredWidth();
            yu0Var.Z0(abs, rt0VarArr[1].F);
            if (yu0Var.D()) {
                int i10 = yu0Var.x0;
                if (i10 == 2) {
                    yu0Var.o0 = 1.0f - abs;
                } else if (i10 == 1) {
                    yu0Var.o0 = abs;
                }
                yu0Var.s1(abs);
                float a02 = yu0Var.a0(abs);
                yu0Var.p0 = a02;
                yu0Var.r0.setVisibility((a02 == 0.0f || !yu0Var.D() || yu0Var.q0()) ? 4 : 0);
            } else {
                yu0Var.o0 = 0.0f;
            }
            yu0Var.q1(false);
        }
        yu0Var.I();
        yu0Var.K();
        yu0Var.o0();
    }
}
