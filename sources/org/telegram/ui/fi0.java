package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class fi0 extends cz {
    public final int[] K;
    public final /* synthetic */ ti0 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fi0(ti0 ti0Var, ei0 ei0Var, int i10) {
        super(i10, ei0Var);
        this.L = ti0Var;
        this.K = new int[2];
    }

    @Override // org.telegram.ui.cz
    public final void h(bz bzVar) {
        ti0 ti0Var = this.L;
        mi0 mi0Var = ti0Var.H;
        if (bzVar == null) {
            return;
        }
        if (ti0Var.i0 != null) {
            bzVar.c = true;
            float f10 = (cz.f() * AndroidUtilities.density) / 1.3f;
            float f11 = f10 / 3.0f;
            bzVar.d = f11;
            bzVar.e = f11;
            bzVar.a = Utilities.clamp(ti0Var.i0.right - (0.75f * f10), AndroidUtilities.displaySize.x - f10, 0.0f);
            bzVar.b = ti0Var.i0.bottom - (f10 / 2.0f);
            return;
        }
        org.telegram.ui.Cells.t1 t1Var = ti0Var.N;
        if (t1Var == null || !t1Var.isAttachedToWindow() || ti0Var.N.getMessageObject() == null || ti0Var.N.getMessageObject().getId() != ti0Var.O) {
            return;
        }
        ti0Var.N.getLocationOnScreen(this.K);
        bzVar.c = true;
        float f12 = (cz.f() * AndroidUtilities.density) / 1.3f;
        float f13 = f12 / 3.0f;
        bzVar.d = f13;
        bzVar.e = f13;
        float f14 = f12 / 2.0f;
        bzVar.a = Utilities.clamp(((mi0Var.getScaleX() * ti0Var.N.getTimeX()) + r8[0]) - f14, AndroidUtilities.displaySize.x - f12, 0.0f);
        bzVar.b = ((mi0Var.getScaleY() * ti0Var.N.getTimeY()) + r8[1]) - f14;
    }
}
