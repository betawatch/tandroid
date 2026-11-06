package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class zp0 extends sr0 {
    public final /* synthetic */ xs0 P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zp0(xs0 xs0Var, Context context) {
        super(context);
        this.P = xs0Var;
    }

    @Override // android.view.View
    public final void setTranslationX(float f10) {
        sr0 sr0Var;
        float translationX = getTranslationX();
        super.setTranslationX(f10);
        xs0 xs0Var = this.P;
        sr0[] sr0VarArr = xs0Var.m0;
        if (sr0VarArr[0] == this) {
            float f11 = translationX - f10;
            oi.q qVar = xs0Var.g2;
            if (qVar != null) {
                float f12 = xs0Var.h2 + f11;
                xs0Var.h2 = f12;
                int i7 = (int) f12;
                if (i7 != 0) {
                    xs0Var.h2 = f12 - i7;
                    qVar.h(i7, 0);
                }
            }
        }
        if (xs0Var.i1 && (sr0Var = sr0VarArr[0]) == this) {
            float abs = Math.abs(sr0Var.getTranslationX()) / sr0VarArr[0].getMeasuredWidth();
            xs0Var.j1(abs, sr0VarArr[1].E);
            if (xs0Var.I()) {
                int i10 = xs0Var.z0;
                if (i10 == 2) {
                    xs0Var.q0 = 1.0f - abs;
                } else if (i10 == 1) {
                    xs0Var.q0 = abs;
                }
                xs0Var.K1(abs);
                float k02 = xs0Var.k0(abs);
                xs0Var.r0 = k02;
                xs0Var.t0.setVisibility((k02 == 0.0f || !xs0Var.I() || xs0Var.A0()) ? 4 : 0);
            } else {
                xs0Var.q0 = 0.0f;
            }
            xs0Var.G1(false);
        }
        xs0Var.S();
        xs0Var.U();
    }
}
