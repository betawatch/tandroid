package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class zp0 extends rr0 {
    public final /* synthetic */ ws0 Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zp0(ws0 ws0Var, Context context) {
        super(context);
        this.Q = ws0Var;
    }

    @Override // android.view.View
    public final void setTranslationX(float f10) {
        rr0 rr0Var;
        float translationX = getTranslationX();
        super.setTranslationX(f10);
        ws0 ws0Var = this.Q;
        rr0[] rr0VarArr = ws0Var.n0;
        if (rr0VarArr[0] == this) {
            float f11 = translationX - f10;
            pi.q qVar = ws0Var.h2;
            if (qVar != null) {
                float f12 = ws0Var.i2 + f11;
                ws0Var.i2 = f12;
                int i3 = (int) f12;
                if (i3 != 0) {
                    ws0Var.i2 = f12 - i3;
                    qVar.h(i3, 0);
                }
            }
        }
        if (ws0Var.j1 && (rr0Var = rr0VarArr[0]) == this) {
            float abs = Math.abs(rr0Var.getTranslationX()) / rr0VarArr[0].getMeasuredWidth();
            ws0Var.j1(abs, rr0VarArr[1].F);
            if (ws0Var.I()) {
                int i10 = ws0Var.A0;
                if (i10 == 2) {
                    ws0Var.r0 = 1.0f - abs;
                } else if (i10 == 1) {
                    ws0Var.r0 = abs;
                }
                ws0Var.K1(abs);
                float k02 = ws0Var.k0(abs);
                ws0Var.s0 = k02;
                ws0Var.u0.setVisibility((k02 == 0.0f || !ws0Var.I() || ws0Var.A0()) ? 4 : 0);
            } else {
                ws0Var.r0 = 0.0f;
            }
            ws0Var.G1(false);
        }
        ws0Var.S();
        ws0Var.U();
    }
}
