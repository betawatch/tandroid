package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class li0 extends gz {
    public final int[] N;
    public final /* synthetic */ zi0 O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public li0(zi0 zi0Var, ki0 ki0Var, int i10) {
        super(i10, ki0Var);
        this.O = zi0Var;
        this.N = new int[2];
    }

    @Override // org.telegram.ui.gz
    public final void h(fz fzVar) {
        zi0 zi0Var = this.O;
        si0 si0Var = zi0Var.K;
        if (fzVar == null) {
            return;
        }
        if (zi0Var.l0 != null) {
            fzVar.c = true;
            float f7 = (gz.f() * AndroidUtilities.density) / 1.3f;
            float f10 = f7 / 3.0f;
            fzVar.d = f10;
            fzVar.e = f10;
            fzVar.a = Utilities.clamp(zi0Var.l0.right - (0.75f * f7), AndroidUtilities.displaySize.x - f7, 0.0f);
            fzVar.b = zi0Var.l0.bottom - (f7 / 2.0f);
            return;
        }
        org.telegram.ui.Cells.u1 u1Var = zi0Var.Q;
        if (u1Var == null || !u1Var.isAttachedToWindow() || zi0Var.Q.getMessageObject() == null || zi0Var.Q.getMessageObject().getId() != zi0Var.R) {
            return;
        }
        zi0Var.Q.getLocationOnScreen(this.N);
        fzVar.c = true;
        float f11 = (gz.f() * AndroidUtilities.density) / 1.3f;
        float f12 = f11 / 3.0f;
        fzVar.d = f12;
        fzVar.e = f12;
        float f13 = f11 / 2.0f;
        fzVar.a = Utilities.clamp(((si0Var.getScaleX() * zi0Var.Q.getTimeX()) + r8[0]) - f13, AndroidUtilities.displaySize.x - f11, 0.0f);
        fzVar.b = ((si0Var.getScaleY() * zi0Var.Q.getTimeY()) + r8[1]) - f13;
    }
}
