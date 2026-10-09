package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class xs0 extends uu0 {
    public final /* synthetic */ bw0 M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xs0(bw0 bw0Var, Context context) {
        super(context);
        this.M = bw0Var;
    }

    @Override // android.view.View
    public final void setTranslationX(float f7) {
        uu0 uu0Var;
        super.setTranslationX(f7);
        bw0 bw0Var = this.M;
        uu0[] uu0VarArr = bw0Var.k0;
        if (bw0Var.g1 && (uu0Var = uu0VarArr[0]) == this) {
            float abs = Math.abs(uu0Var.getTranslationX()) / uu0VarArr[0].getMeasuredWidth();
            bw0Var.Z0(abs, uu0VarArr[1].F);
            if (bw0Var.D()) {
                int i10 = bw0Var.x0;
                if (i10 == 2) {
                    bw0Var.o0 = 1.0f - abs;
                } else if (i10 == 1) {
                    bw0Var.o0 = abs;
                }
                bw0Var.s1(abs);
                float a02 = bw0Var.a0(abs);
                bw0Var.p0 = a02;
                bw0Var.r0.setVisibility((a02 == 0.0f || !bw0Var.D() || bw0Var.q0()) ? 4 : 0);
            } else {
                bw0Var.o0 = 0.0f;
            }
            bw0Var.q1(false);
        }
        bw0Var.I();
        bw0Var.K();
        bw0Var.o0();
    }
}
