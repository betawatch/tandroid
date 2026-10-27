package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class bi0 extends qy {
    public final int[] N;
    public final /* synthetic */ pi0 O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bi0(pi0 pi0Var, ai0 ai0Var, int i10) {
        super(i10, ai0Var);
        this.O = pi0Var;
        this.N = new int[2];
    }

    @Override // org.telegram.ui.qy
    public final void g(py pyVar) {
        pi0 pi0Var = this.O;
        ii0 ii0Var = pi0Var.J;
        if (pyVar == null) {
            return;
        }
        if (pi0Var.k0 != null) {
            pyVar.c = true;
            float f7 = (qy.f() * AndroidUtilities.density) / 1.3f;
            float f10 = f7 / 3.0f;
            pyVar.d = f10;
            pyVar.e = f10;
            pyVar.a = Utilities.clamp(pi0Var.k0.right - (0.75f * f7), AndroidUtilities.displaySize.x - f7, 0.0f);
            pyVar.b = pi0Var.k0.bottom - (f7 / 2.0f);
            return;
        }
        org.telegram.ui.Cells.s1 s1Var = pi0Var.P;
        if (s1Var == null || !s1Var.isAttachedToWindow() || pi0Var.P.getMessageObject() == null || pi0Var.P.getMessageObject().getId() != pi0Var.Q) {
            return;
        }
        pi0Var.P.getLocationOnScreen(this.N);
        pyVar.c = true;
        float f11 = (qy.f() * AndroidUtilities.density) / 1.3f;
        float f12 = f11 / 3.0f;
        pyVar.d = f12;
        pyVar.e = f12;
        float f13 = f11 / 2.0f;
        pyVar.a = Utilities.clamp(((ii0Var.getScaleX() * pi0Var.P.getTimeX()) + r8[0]) - f13, AndroidUtilities.displaySize.x - f11, 0.0f);
        pyVar.b = ((ii0Var.getScaleY() * pi0Var.P.getTimeY()) + r8[1]) - f13;
    }
}
