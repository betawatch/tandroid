package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class ai0 extends qy {
    public final int[] N;
    public final /* synthetic */ oi0 O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ai0(oi0 oi0Var, zh0 zh0Var, int i10) {
        super(i10, zh0Var);
        this.O = oi0Var;
        this.N = new int[2];
    }

    @Override // org.telegram.ui.qy
    public final void g(py pyVar) {
        oi0 oi0Var = this.O;
        hi0 hi0Var = oi0Var.K;
        if (pyVar == null) {
            return;
        }
        if (oi0Var.l0 != null) {
            pyVar.c = true;
            float f7 = (qy.f() * AndroidUtilities.density) / 1.3f;
            float f10 = f7 / 3.0f;
            pyVar.d = f10;
            pyVar.e = f10;
            pyVar.a = Utilities.clamp(oi0Var.l0.right - (0.75f * f7), AndroidUtilities.displaySize.x - f7, 0.0f);
            pyVar.b = oi0Var.l0.bottom - (f7 / 2.0f);
            return;
        }
        org.telegram.ui.Cells.u1 u1Var = oi0Var.Q;
        if (u1Var == null || !u1Var.isAttachedToWindow() || oi0Var.Q.getMessageObject() == null || oi0Var.Q.getMessageObject().getId() != oi0Var.R) {
            return;
        }
        oi0Var.Q.getLocationOnScreen(this.N);
        pyVar.c = true;
        float f11 = (qy.f() * AndroidUtilities.density) / 1.3f;
        float f12 = f11 / 3.0f;
        pyVar.d = f12;
        pyVar.e = f12;
        float f13 = f11 / 2.0f;
        pyVar.a = Utilities.clamp(((hi0Var.getScaleX() * oi0Var.Q.getTimeX()) + r8[0]) - f13, AndroidUtilities.displaySize.x - f11, 0.0f);
        pyVar.b = ((hi0Var.getScaleY() * oi0Var.Q.getTimeY()) + r8[1]) - f13;
    }
}
