package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class ci0 extends qy {
    public final int[] N;
    public final /* synthetic */ qi0 O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ci0(qi0 qi0Var, bi0 bi0Var, int i10) {
        super(i10, bi0Var);
        this.O = qi0Var;
        this.N = new int[2];
    }

    @Override // org.telegram.ui.qy
    public final void g(py pyVar) {
        qi0 qi0Var = this.O;
        ji0 ji0Var = qi0Var.J;
        if (pyVar == null) {
            return;
        }
        if (qi0Var.k0 != null) {
            pyVar.c = true;
            float f7 = (qy.f() * AndroidUtilities.density) / 1.3f;
            float f10 = f7 / 3.0f;
            pyVar.d = f10;
            pyVar.e = f10;
            pyVar.a = Utilities.clamp(qi0Var.k0.right - (0.75f * f7), AndroidUtilities.displaySize.x - f7, 0.0f);
            pyVar.b = qi0Var.k0.bottom - (f7 / 2.0f);
            return;
        }
        org.telegram.ui.Cells.t1 t1Var = qi0Var.P;
        if (t1Var == null || !t1Var.isAttachedToWindow() || qi0Var.P.getMessageObject() == null || qi0Var.P.getMessageObject().getId() != qi0Var.Q) {
            return;
        }
        qi0Var.P.getLocationOnScreen(this.N);
        pyVar.c = true;
        float f11 = (qy.f() * AndroidUtilities.density) / 1.3f;
        float f12 = f11 / 3.0f;
        pyVar.d = f12;
        pyVar.e = f12;
        float f13 = f11 / 2.0f;
        pyVar.a = Utilities.clamp(((ji0Var.getScaleX() * qi0Var.P.getTimeX()) + r8[0]) - f13, AndroidUtilities.displaySize.x - f11, 0.0f);
        pyVar.b = ((ji0Var.getScaleY() * qi0Var.P.getTimeY()) + r8[1]) - f13;
    }
}
