package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class jq0 extends ds0 {
    public final /* synthetic */ it0 Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jq0(it0 it0Var, Context context) {
        super(context);
        this.Q = it0Var;
    }

    @Override // android.view.View
    public final void setTranslationX(float f10) {
        ds0 ds0Var;
        float translationX = getTranslationX();
        super.setTranslationX(f10);
        it0 it0Var = this.Q;
        ds0[] ds0VarArr = it0Var.n0;
        if (ds0VarArr[0] == this) {
            float f11 = translationX - f10;
            ri.q qVar = it0Var.h2;
            if (qVar != null) {
                float f12 = it0Var.i2 + f11;
                it0Var.i2 = f12;
                int i7 = (int) f12;
                if (i7 != 0) {
                    it0Var.i2 = f12 - i7;
                    qVar.h(i7, 0);
                }
            }
        }
        if (it0Var.j1 && (ds0Var = ds0VarArr[0]) == this) {
            float abs = Math.abs(ds0Var.getTranslationX()) / ds0VarArr[0].getMeasuredWidth();
            it0Var.l1(abs, ds0VarArr[1].F);
            if (it0Var.I()) {
                int i10 = it0Var.A0;
                if (i10 == 2) {
                    it0Var.r0 = 1.0f - abs;
                } else if (i10 == 1) {
                    it0Var.r0 = abs;
                }
                it0Var.M1(abs);
                float k02 = it0Var.k0(abs);
                it0Var.s0 = k02;
                it0Var.u0.setVisibility((k02 == 0.0f || !it0Var.I() || it0Var.A0()) ? 4 : 0);
            } else {
                it0Var.r0 = 0.0f;
            }
            it0Var.I1(false);
        }
        it0Var.S();
        it0Var.U();
    }
}
