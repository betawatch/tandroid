package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class ni0 extends gz {
    public final int[] N;
    public final /* synthetic */ bj0 O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ni0(bj0 bj0Var, mi0 mi0Var, int i10) {
        super(i10, mi0Var);
        this.O = bj0Var;
        this.N = new int[2];
    }

    @Override // org.telegram.ui.gz
    public final void h(fz fzVar) {
        bj0 bj0Var = this.O;
        ui0 ui0Var = bj0Var.K;
        if (fzVar == null) {
            return;
        }
        if (bj0Var.l0 != null) {
            fzVar.c = true;
            float f7 = (gz.f() * AndroidUtilities.density) / 1.3f;
            float f10 = f7 / 3.0f;
            fzVar.d = f10;
            fzVar.e = f10;
            fzVar.a = Utilities.clamp(bj0Var.l0.right - (0.75f * f7), AndroidUtilities.displaySize.x - f7, 0.0f);
            fzVar.b = bj0Var.l0.bottom - (f7 / 2.0f);
            return;
        }
        org.telegram.ui.Cells.t1 t1Var = bj0Var.Q;
        if (t1Var == null || !t1Var.isAttachedToWindow() || bj0Var.Q.getMessageObject() == null || bj0Var.Q.getMessageObject().getId() != bj0Var.R) {
            return;
        }
        bj0Var.Q.getLocationOnScreen(this.N);
        fzVar.c = true;
        float f11 = (gz.f() * AndroidUtilities.density) / 1.3f;
        float f12 = f11 / 3.0f;
        fzVar.d = f12;
        fzVar.e = f12;
        float f13 = f11 / 2.0f;
        fzVar.a = Utilities.clamp(((ui0Var.getScaleX() * bj0Var.Q.getTimeX()) + r8[0]) - f13, AndroidUtilities.displaySize.x - f11, 0.0f);
        fzVar.b = ((ui0Var.getScaleY() * bj0Var.Q.getTimeY()) + r8[1]) - f13;
    }
}
