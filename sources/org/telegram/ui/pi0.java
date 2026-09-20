package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class pi0 extends gz {
    public final int[] N;
    public final /* synthetic */ dj0 O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pi0(dj0 dj0Var, oi0 oi0Var, int i10) {
        super(i10, oi0Var);
        this.O = dj0Var;
        this.N = new int[2];
    }

    @Override // org.telegram.ui.gz
    public final void h(fz fzVar) {
        dj0 dj0Var = this.O;
        wi0 wi0Var = dj0Var.K;
        if (fzVar == null) {
            return;
        }
        if (dj0Var.l0 != null) {
            fzVar.c = true;
            float f7 = (gz.f() * AndroidUtilities.density) / 1.3f;
            float f10 = f7 / 3.0f;
            fzVar.d = f10;
            fzVar.e = f10;
            fzVar.a = Utilities.clamp(dj0Var.l0.right - (0.75f * f7), AndroidUtilities.displaySize.x - f7, 0.0f);
            fzVar.b = dj0Var.l0.bottom - (f7 / 2.0f);
            return;
        }
        org.telegram.ui.Cells.u1 u1Var = dj0Var.Q;
        if (u1Var == null || !u1Var.isAttachedToWindow() || dj0Var.Q.getMessageObject() == null || dj0Var.Q.getMessageObject().getId() != dj0Var.R) {
            return;
        }
        dj0Var.Q.getLocationOnScreen(this.N);
        fzVar.c = true;
        float f11 = (gz.f() * AndroidUtilities.density) / 1.3f;
        float f12 = f11 / 3.0f;
        fzVar.d = f12;
        fzVar.e = f12;
        float f13 = f11 / 2.0f;
        fzVar.a = Utilities.clamp(((wi0Var.getScaleX() * dj0Var.Q.getTimeX()) + r8[0]) - f13, AndroidUtilities.displaySize.x - f11, 0.0f);
        fzVar.b = ((wi0Var.getScaleY() * dj0Var.Q.getTimeY()) + r8[1]) - f13;
    }
}
