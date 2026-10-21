package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class qs0 extends nu0 {
    public final /* synthetic */ uv0 M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qs0(uv0 uv0Var, Context context) {
        super(context);
        this.M = uv0Var;
    }

    @Override // android.view.View
    public final void setTranslationX(float f7) {
        nu0 nu0Var;
        super.setTranslationX(f7);
        uv0 uv0Var = this.M;
        nu0[] nu0VarArr = uv0Var.k0;
        if (uv0Var.g1 && (nu0Var = nu0VarArr[0]) == this) {
            float abs = Math.abs(nu0Var.getTranslationX()) / nu0VarArr[0].getMeasuredWidth();
            uv0Var.b1(abs, nu0VarArr[1].F);
            if (uv0Var.D()) {
                int i10 = uv0Var.x0;
                if (i10 == 2) {
                    uv0Var.o0 = 1.0f - abs;
                } else if (i10 == 1) {
                    uv0Var.o0 = abs;
                }
                uv0Var.v1(abs);
                float a02 = uv0Var.a0(abs);
                uv0Var.p0 = a02;
                uv0Var.r0.setVisibility((a02 == 0.0f || !uv0Var.D() || uv0Var.r0()) ? 4 : 0);
            } else {
                uv0Var.o0 = 0.0f;
            }
            uv0Var.s1(false);
        }
        uv0Var.I();
        uv0Var.K();
        uv0Var.p0();
    }
}
