package org.telegram.ui;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class kf0 extends fx {
    public final int[] O;
    public final /* synthetic */ vf0 P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kf0(vf0 vf0Var, jf0 jf0Var, int i3) {
        super(i3, jf0Var);
        this.P = vf0Var;
        this.O = new int[2];
    }

    @Override // org.telegram.ui.fx
    public final void g(ex exVar) {
        vf0 vf0Var = this.P;
        rf0 rf0Var = vf0Var.K;
        if (exVar == null) {
            return;
        }
        if (vf0Var.l0 != null) {
            exVar.c = true;
            float f10 = (fx.f() * org.telegram.messenger.g0.p) / 1.3f;
            float f11 = f10 / 3.0f;
            exVar.d = f11;
            exVar.e = f11;
            exVar.a = Utilities.i(vf0Var.l0.right - (0.75f * f10), org.telegram.messenger.g0.q.x - f10, 0.0f);
            exVar.b = vf0Var.l0.bottom - (f10 / 2.0f);
            return;
        }
        org.telegram.ui.Cells.q1 q1Var = vf0Var.Q;
        if (q1Var == null || !q1Var.isAttachedToWindow() || vf0Var.Q.getMessageObject() == null || vf0Var.Q.getMessageObject().f1() != vf0Var.R) {
            return;
        }
        vf0Var.Q.getLocationOnScreen(this.O);
        exVar.c = true;
        float f12 = (fx.f() * org.telegram.messenger.g0.p) / 1.3f;
        float f13 = f12 / 3.0f;
        exVar.d = f13;
        exVar.e = f13;
        float f14 = f12 / 2.0f;
        exVar.a = Utilities.i(((rf0Var.getScaleX() * vf0Var.Q.getTimeX()) + r8[0]) - f14, org.telegram.messenger.g0.q.x - f12, 0.0f);
        exVar.b = ((rf0Var.getScaleY() * vf0Var.Q.getTimeY()) + r8[1]) - f14;
    }
}
