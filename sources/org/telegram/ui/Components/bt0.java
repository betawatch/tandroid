package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class bt0 extends uu0 {
    public final /* synthetic */ bw0 P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bt0(bw0 bw0Var, Context context) {
        super(context);
        this.P = bw0Var;
    }

    @Override // android.view.View
    public final void setTranslationX(float f7) {
        uu0 uu0Var;
        float translationX = getTranslationX();
        super.setTranslationX(f7);
        bw0 bw0Var = this.P;
        uu0[] uu0VarArr = bw0Var.m0;
        if (uu0VarArr[0] == this) {
            float f10 = translationX - f7;
            oi.q qVar = bw0Var.g2;
            if (qVar != null) {
                float f11 = bw0Var.h2 + f10;
                bw0Var.h2 = f11;
                int i10 = (int) f11;
                if (i10 != 0) {
                    bw0Var.h2 = f11 - i10;
                    qVar.h(i10, 0);
                }
            }
        }
        if (bw0Var.i1 && (uu0Var = uu0VarArr[0]) == this) {
            float abs = Math.abs(uu0Var.getTranslationX()) / uu0VarArr[0].getMeasuredWidth();
            bw0Var.f1(abs, uu0VarArr[1].E);
            if (bw0Var.G()) {
                int i11 = bw0Var.z0;
                if (i11 == 2) {
                    bw0Var.q0 = 1.0f - abs;
                } else if (i11 == 1) {
                    bw0Var.q0 = abs;
                }
                bw0Var.G1(abs);
                float h02 = bw0Var.h0(abs);
                bw0Var.r0 = h02;
                bw0Var.t0.setVisibility((h02 == 0.0f || !bw0Var.G() || bw0Var.x0()) ? 4 : 0);
            } else {
                bw0Var.q0 = 0.0f;
            }
            bw0Var.C1(false);
        }
        bw0Var.P();
        bw0Var.R();
    }
}
