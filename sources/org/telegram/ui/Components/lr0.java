package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class lr0 extends it0 {
    public final /* synthetic */ qu0 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lr0(qu0 qu0Var, Context context) {
        super(context);
        this.I = qu0Var;
    }

    @Override // android.view.View
    public final void setTranslationX(float f9) {
        it0 it0Var;
        super.setTranslationX(f9);
        qu0 qu0Var = this.I;
        it0[] it0VarArr = qu0Var.g0;
        if (qu0Var.c1 && (it0Var = it0VarArr[0]) == this) {
            float abs = Math.abs(it0Var.getTranslationX()) / it0VarArr[0].getMeasuredWidth();
            qu0Var.Z0(abs, it0VarArr[1].B);
            if (qu0Var.D()) {
                int i10 = qu0Var.t0;
                if (i10 == 2) {
                    qu0Var.k0 = 1.0f - abs;
                } else if (i10 == 1) {
                    qu0Var.k0 = abs;
                }
                qu0Var.s1(abs);
                float a02 = qu0Var.a0(abs);
                qu0Var.l0 = a02;
                qu0Var.n0.setVisibility((a02 == 0.0f || !qu0Var.D() || qu0Var.q0()) ? 4 : 0);
            } else {
                qu0Var.k0 = 0.0f;
            }
            qu0Var.q1(false);
        }
        qu0Var.I();
        qu0Var.K();
        qu0Var.o0();
    }
}
