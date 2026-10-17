package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class os0 extends lu0 {
    public final /* synthetic */ sv0 M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public os0(sv0 sv0Var, Context context) {
        super(context);
        this.M = sv0Var;
    }

    @Override // android.view.View
    public final void setTranslationX(float f7) {
        lu0 lu0Var;
        super.setTranslationX(f7);
        sv0 sv0Var = this.M;
        lu0[] lu0VarArr = sv0Var.k0;
        if (sv0Var.g1 && (lu0Var = lu0VarArr[0]) == this) {
            float abs = Math.abs(lu0Var.getTranslationX()) / lu0VarArr[0].getMeasuredWidth();
            sv0Var.b1(abs, lu0VarArr[1].F);
            if (sv0Var.D()) {
                int i10 = sv0Var.x0;
                if (i10 == 2) {
                    sv0Var.o0 = 1.0f - abs;
                } else if (i10 == 1) {
                    sv0Var.o0 = abs;
                }
                sv0Var.v1(abs);
                float a02 = sv0Var.a0(abs);
                sv0Var.p0 = a02;
                sv0Var.r0.setVisibility((a02 == 0.0f || !sv0Var.D() || sv0Var.r0()) ? 4 : 0);
            } else {
                sv0Var.o0 = 0.0f;
            }
            sv0Var.s1(false);
        }
        sv0Var.I();
        sv0Var.K();
        sv0Var.p0();
    }
}
