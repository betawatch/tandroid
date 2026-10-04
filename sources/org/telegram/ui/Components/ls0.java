package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class ls0 extends iu0 {
    public final /* synthetic */ pv0 M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ls0(pv0 pv0Var, Context context) {
        super(context);
        this.M = pv0Var;
    }

    @Override // android.view.View
    public final void setTranslationX(float f7) {
        iu0 iu0Var;
        super.setTranslationX(f7);
        pv0 pv0Var = this.M;
        iu0[] iu0VarArr = pv0Var.k0;
        if (pv0Var.g1 && (iu0Var = iu0VarArr[0]) == this) {
            float abs = Math.abs(iu0Var.getTranslationX()) / iu0VarArr[0].getMeasuredWidth();
            pv0Var.Z0(abs, iu0VarArr[1].F);
            if (pv0Var.D()) {
                int i10 = pv0Var.x0;
                if (i10 == 2) {
                    pv0Var.o0 = 1.0f - abs;
                } else if (i10 == 1) {
                    pv0Var.o0 = abs;
                }
                pv0Var.s1(abs);
                float a02 = pv0Var.a0(abs);
                pv0Var.p0 = a02;
                pv0Var.r0.setVisibility((a02 == 0.0f || !pv0Var.D() || pv0Var.q0()) ? 4 : 0);
            } else {
                pv0Var.o0 = 0.0f;
            }
            pv0Var.q1(false);
        }
        pv0Var.I();
        pv0Var.K();
        pv0Var.o0();
    }
}
