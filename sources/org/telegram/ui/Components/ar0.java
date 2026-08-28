package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ar0 extends xs0 {
    public final /* synthetic */ eu0 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ar0(eu0 eu0Var, Context context) {
        super(context);
        this.I = eu0Var;
    }

    @Override // android.view.View
    public final void setTranslationX(float f10) {
        xs0 xs0Var;
        super.setTranslationX(f10);
        eu0 eu0Var = this.I;
        xs0[] xs0VarArr = eu0Var.g0;
        if (eu0Var.c1 && (xs0Var = xs0VarArr[0]) == this) {
            float abs = Math.abs(xs0Var.getTranslationX()) / xs0VarArr[0].getMeasuredWidth();
            eu0Var.Z0(abs, xs0VarArr[1].B);
            if (eu0Var.D()) {
                int i9 = eu0Var.t0;
                if (i9 == 2) {
                    eu0Var.k0 = 1.0f - abs;
                } else if (i9 == 1) {
                    eu0Var.k0 = abs;
                }
                eu0Var.s1(abs);
                float a02 = eu0Var.a0(abs);
                eu0Var.l0 = a02;
                eu0Var.n0.setVisibility((a02 == 0.0f || !eu0Var.D() || eu0Var.q0()) ? 4 : 0);
            } else {
                eu0Var.k0 = 0.0f;
            }
            eu0Var.q1(false);
        }
        eu0Var.I();
        eu0Var.K();
        eu0Var.o0();
    }
}
