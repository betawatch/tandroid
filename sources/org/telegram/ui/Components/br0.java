package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class br0 extends ts0 {
    public final /* synthetic */ au0 P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public br0(au0 au0Var, Context context) {
        super(context);
        this.P = au0Var;
    }

    @Override // android.view.View
    public final void setTranslationX(float f7) {
        ts0 ts0Var;
        float translationX = getTranslationX();
        super.setTranslationX(f7);
        au0 au0Var = this.P;
        ts0[] ts0VarArr = au0Var.m0;
        if (ts0VarArr[0] == this) {
            float f10 = translationX - f7;
            ei.r rVar = au0Var.g2;
            if (rVar != null) {
                float f11 = au0Var.h2 + f10;
                au0Var.h2 = f11;
                int i10 = (int) f11;
                if (i10 != 0) {
                    au0Var.h2 = f11 - i10;
                    rVar.h(i10, 0);
                }
            }
        }
        if (au0Var.i1 && (ts0Var = ts0VarArr[0]) == this) {
            float abs = Math.abs(ts0Var.getTranslationX()) / ts0VarArr[0].getMeasuredWidth();
            au0Var.h1(abs, ts0VarArr[1].E);
            if (au0Var.H()) {
                int i11 = au0Var.z0;
                if (i11 == 2) {
                    au0Var.q0 = 1.0f - abs;
                } else if (i11 == 1) {
                    au0Var.q0 = abs;
                }
                au0Var.I1(abs);
                float j02 = au0Var.j0(abs);
                au0Var.r0 = j02;
                au0Var.t0.setVisibility((j02 == 0.0f || !au0Var.H() || au0Var.z0()) ? 4 : 0);
            } else {
                au0Var.q0 = 0.0f;
            }
            au0Var.E1(false);
        }
        au0Var.R();
        au0Var.T();
    }
}
