package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class vr0 extends st0 {
    public final /* synthetic */ zu0 M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vr0(zu0 zu0Var, Context context) {
        super(context);
        this.M = zu0Var;
    }

    @Override // android.view.View
    public final void setTranslationX(float f7) {
        st0 st0Var;
        super.setTranslationX(f7);
        zu0 zu0Var = this.M;
        st0[] st0VarArr = zu0Var.k0;
        if (zu0Var.g1 && (st0Var = st0VarArr[0]) == this) {
            float abs = Math.abs(st0Var.getTranslationX()) / st0VarArr[0].getMeasuredWidth();
            zu0Var.Z0(abs, st0VarArr[1].F);
            if (zu0Var.D()) {
                int i10 = zu0Var.x0;
                if (i10 == 2) {
                    zu0Var.o0 = 1.0f - abs;
                } else if (i10 == 1) {
                    zu0Var.o0 = abs;
                }
                zu0Var.s1(abs);
                float a02 = zu0Var.a0(abs);
                zu0Var.p0 = a02;
                zu0Var.r0.setVisibility((a02 == 0.0f || !zu0Var.D() || zu0Var.q0()) ? 4 : 0);
            } else {
                zu0Var.o0 = 0.0f;
            }
            zu0Var.q1(false);
        }
        zu0Var.I();
        zu0Var.K();
        zu0Var.o0();
    }
}
