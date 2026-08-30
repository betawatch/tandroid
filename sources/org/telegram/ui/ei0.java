package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class ei0 extends bz {
    public final int[] K;
    public final /* synthetic */ si0 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ei0(si0 si0Var, di0 di0Var, int i10) {
        super(i10, di0Var);
        this.L = si0Var;
        this.K = new int[2];
    }

    @Override // org.telegram.ui.bz
    public final void h(az azVar) {
        si0 si0Var = this.L;
        li0 li0Var = si0Var.H;
        if (azVar == null) {
            return;
        }
        if (si0Var.i0 != null) {
            azVar.c = true;
            float f10 = (bz.f() * AndroidUtilities.density) / 1.3f;
            float f11 = f10 / 3.0f;
            azVar.d = f11;
            azVar.e = f11;
            azVar.a = Utilities.clamp(si0Var.i0.right - (0.75f * f10), AndroidUtilities.displaySize.x - f10, 0.0f);
            azVar.b = si0Var.i0.bottom - (f10 / 2.0f);
            return;
        }
        org.telegram.ui.Cells.t1 t1Var = si0Var.N;
        if (t1Var == null || !t1Var.isAttachedToWindow() || si0Var.N.getMessageObject() == null || si0Var.N.getMessageObject().getId() != si0Var.O) {
            return;
        }
        si0Var.N.getLocationOnScreen(this.K);
        azVar.c = true;
        float f12 = (bz.f() * AndroidUtilities.density) / 1.3f;
        float f13 = f12 / 3.0f;
        azVar.d = f13;
        azVar.e = f13;
        float f14 = f12 / 2.0f;
        azVar.a = Utilities.clamp(((li0Var.getScaleX() * si0Var.N.getTimeX()) + r8[0]) - f14, AndroidUtilities.displaySize.x - f12, 0.0f);
        azVar.b = ((li0Var.getScaleY() * si0Var.N.getTimeY()) + r8[1]) - f14;
    }
}
