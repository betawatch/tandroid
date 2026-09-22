package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class hs0 extends eu0 {
    public final /* synthetic */ lv0 M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hs0(lv0 lv0Var, Context context) {
        super(context);
        this.M = lv0Var;
    }

    @Override // android.view.View
    public final void setTranslationX(float f7) {
        eu0 eu0Var;
        super.setTranslationX(f7);
        lv0 lv0Var = this.M;
        eu0[] eu0VarArr = lv0Var.k0;
        if (lv0Var.g1 && (eu0Var = eu0VarArr[0]) == this) {
            float abs = Math.abs(eu0Var.getTranslationX()) / eu0VarArr[0].getMeasuredWidth();
            lv0Var.Z0(abs, eu0VarArr[1].F);
            if (lv0Var.D()) {
                int i10 = lv0Var.x0;
                if (i10 == 2) {
                    lv0Var.o0 = 1.0f - abs;
                } else if (i10 == 1) {
                    lv0Var.o0 = abs;
                }
                lv0Var.s1(abs);
                float a02 = lv0Var.a0(abs);
                lv0Var.p0 = a02;
                lv0Var.r0.setVisibility((a02 == 0.0f || !lv0Var.D() || lv0Var.q0()) ? 4 : 0);
            } else {
                lv0Var.o0 = 0.0f;
            }
            lv0Var.q1(false);
        }
        lv0Var.I();
        lv0Var.K();
        lv0Var.o0();
    }
}
