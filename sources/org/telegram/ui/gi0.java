package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class gi0 extends dz {
    public final int[] K;
    public final /* synthetic */ ui0 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gi0(ui0 ui0Var, fi0 fi0Var, int i10) {
        super(i10, fi0Var);
        this.L = ui0Var;
        this.K = new int[2];
    }

    @Override // org.telegram.ui.dz
    public final void h(cz czVar) {
        ui0 ui0Var = this.L;
        ni0 ni0Var = ui0Var.H;
        if (czVar == null) {
            return;
        }
        if (ui0Var.i0 != null) {
            czVar.c = true;
            float f10 = (dz.f() * AndroidUtilities.density) / 1.3f;
            float f11 = f10 / 3.0f;
            czVar.d = f11;
            czVar.e = f11;
            czVar.a = Utilities.clamp(ui0Var.i0.right - (0.75f * f10), AndroidUtilities.displaySize.x - f10, 0.0f);
            czVar.b = ui0Var.i0.bottom - (f10 / 2.0f);
            return;
        }
        org.telegram.ui.Cells.s1 s1Var = ui0Var.N;
        if (s1Var == null || !s1Var.isAttachedToWindow() || ui0Var.N.getMessageObject() == null || ui0Var.N.getMessageObject().getId() != ui0Var.O) {
            return;
        }
        ui0Var.N.getLocationOnScreen(this.K);
        czVar.c = true;
        float f12 = (dz.f() * AndroidUtilities.density) / 1.3f;
        float f13 = f12 / 3.0f;
        czVar.d = f13;
        czVar.e = f13;
        float f14 = f12 / 2.0f;
        czVar.a = Utilities.clamp(((ni0Var.getScaleX() * ui0Var.N.getTimeX()) + r8[0]) - f14, AndroidUtilities.displaySize.x - f12, 0.0f);
        czVar.b = ((ni0Var.getScaleY() * ui0Var.N.getTimeY()) + r8[1]) - f14;
    }
}
