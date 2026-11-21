package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class kq0 extends ds0 {
    public final /* synthetic */ jt0 Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kq0(jt0 jt0Var, Context context) {
        super(context);
        this.Q = jt0Var;
    }

    @Override // android.view.View
    public final void setTranslationX(float f10) {
        ds0 ds0Var;
        float translationX = getTranslationX();
        super.setTranslationX(f10);
        jt0 jt0Var = this.Q;
        ds0[] ds0VarArr = jt0Var.n0;
        if (ds0VarArr[0] == this) {
            float f11 = translationX - f10;
            ri.q qVar = jt0Var.h2;
            if (qVar != null) {
                float f12 = jt0Var.i2 + f11;
                jt0Var.i2 = f12;
                int i7 = (int) f12;
                if (i7 != 0) {
                    jt0Var.i2 = f12 - i7;
                    qVar.h(i7, 0);
                }
            }
        }
        if (jt0Var.j1 && (ds0Var = ds0VarArr[0]) == this) {
            float abs = Math.abs(ds0Var.getTranslationX()) / ds0VarArr[0].getMeasuredWidth();
            jt0Var.l1(abs, ds0VarArr[1].F);
            if (jt0Var.I()) {
                int i10 = jt0Var.A0;
                if (i10 == 2) {
                    jt0Var.r0 = 1.0f - abs;
                } else if (i10 == 1) {
                    jt0Var.r0 = abs;
                }
                jt0Var.M1(abs);
                float k02 = jt0Var.k0(abs);
                jt0Var.s0 = k02;
                jt0Var.u0.setVisibility((k02 == 0.0f || !jt0Var.I() || jt0Var.A0()) ? 4 : 0);
            } else {
                jt0Var.r0 = 0.0f;
            }
            jt0Var.I1(false);
        }
        jt0Var.S();
        jt0Var.U();
    }
}
