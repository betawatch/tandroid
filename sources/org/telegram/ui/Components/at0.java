package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class at0 extends tu0 {
    public final /* synthetic */ aw0 P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public at0(aw0 aw0Var, Context context) {
        super(context);
        this.P = aw0Var;
    }

    @Override // android.view.View
    public final void setTranslationX(float f7) {
        tu0 tu0Var;
        float translationX = getTranslationX();
        super.setTranslationX(f7);
        aw0 aw0Var = this.P;
        tu0[] tu0VarArr = aw0Var.m0;
        if (tu0VarArr[0] == this) {
            float f10 = translationX - f7;
            oi.q qVar = aw0Var.g2;
            if (qVar != null) {
                float f11 = aw0Var.h2 + f10;
                aw0Var.h2 = f11;
                int i10 = (int) f11;
                if (i10 != 0) {
                    aw0Var.h2 = f11 - i10;
                    qVar.h(i10, 0);
                }
            }
        }
        if (aw0Var.i1 && (tu0Var = tu0VarArr[0]) == this) {
            float abs = Math.abs(tu0Var.getTranslationX()) / tu0VarArr[0].getMeasuredWidth();
            aw0Var.f1(abs, tu0VarArr[1].E);
            if (aw0Var.G()) {
                int i11 = aw0Var.z0;
                if (i11 == 2) {
                    aw0Var.q0 = 1.0f - abs;
                } else if (i11 == 1) {
                    aw0Var.q0 = abs;
                }
                aw0Var.G1(abs);
                float h02 = aw0Var.h0(abs);
                aw0Var.r0 = h02;
                aw0Var.t0.setVisibility((h02 == 0.0f || !aw0Var.G() || aw0Var.x0()) ? 4 : 0);
            } else {
                aw0Var.q0 = 0.0f;
            }
            aw0Var.C1(false);
        }
        aw0Var.P();
        aw0Var.R();
    }
}
