package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class pi0 extends fz {
    public final int[] N;
    public final /* synthetic */ dj0 O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pi0(dj0 dj0Var, oi0 oi0Var, int i10) {
        super(i10, oi0Var);
        this.O = dj0Var;
        this.N = new int[2];
    }

    @Override // org.telegram.ui.fz
    public final void g(ez ezVar) {
        dj0 dj0Var = this.O;
        wi0 wi0Var = dj0Var.K;
        if (ezVar == null) {
            return;
        }
        if (dj0Var.l0 != null) {
            ezVar.c = true;
            float f7 = (fz.f() * AndroidUtilities.density) / 1.3f;
            float f10 = f7 / 3.0f;
            ezVar.d = f10;
            ezVar.e = f10;
            ezVar.a = Utilities.clamp(dj0Var.l0.right - (0.75f * f7), AndroidUtilities.displaySize.x - f7, 0.0f);
            ezVar.b = dj0Var.l0.bottom - (f7 / 2.0f);
            return;
        }
        org.telegram.ui.Cells.u1 u1Var = dj0Var.Q;
        if (u1Var == null || !u1Var.isAttachedToWindow() || dj0Var.Q.getMessageObject() == null || dj0Var.Q.getMessageObject().getId() != dj0Var.R) {
            return;
        }
        dj0Var.Q.getLocationOnScreen(this.N);
        ezVar.c = true;
        float f11 = (fz.f() * AndroidUtilities.density) / 1.3f;
        float f12 = f11 / 3.0f;
        ezVar.d = f12;
        ezVar.e = f12;
        float f13 = f11 / 2.0f;
        ezVar.a = Utilities.clamp(((wi0Var.getScaleX() * dj0Var.Q.getTimeX()) + r8[0]) - f13, AndroidUtilities.displaySize.x - f11, 0.0f);
        ezVar.b = ((wi0Var.getScaleY() * dj0Var.Q.getTimeY()) + r8[1]) - f13;
    }
}
