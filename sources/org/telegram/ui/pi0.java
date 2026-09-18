package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class pi0 extends iz {
    public final int[] N;
    public final /* synthetic */ dj0 O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pi0(dj0 dj0Var, oi0 oi0Var, int i10) {
        super(i10, oi0Var);
        this.O = dj0Var;
        this.N = new int[2];
    }

    @Override // org.telegram.ui.iz
    public final void h(hz hzVar) {
        dj0 dj0Var = this.O;
        wi0 wi0Var = dj0Var.K;
        if (hzVar == null) {
            return;
        }
        if (dj0Var.l0 != null) {
            hzVar.c = true;
            float f7 = (iz.f() * AndroidUtilities.density) / 1.3f;
            float f10 = f7 / 3.0f;
            hzVar.d = f10;
            hzVar.e = f10;
            hzVar.a = Utilities.clamp(dj0Var.l0.right - (0.75f * f7), AndroidUtilities.displaySize.x - f7, 0.0f);
            hzVar.b = dj0Var.l0.bottom - (f7 / 2.0f);
            return;
        }
        org.telegram.ui.Cells.t1 t1Var = dj0Var.Q;
        if (t1Var == null || !t1Var.isAttachedToWindow() || dj0Var.Q.getMessageObject() == null || dj0Var.Q.getMessageObject().getId() != dj0Var.R) {
            return;
        }
        dj0Var.Q.getLocationOnScreen(this.N);
        hzVar.c = true;
        float f11 = (iz.f() * AndroidUtilities.density) / 1.3f;
        float f12 = f11 / 3.0f;
        hzVar.d = f12;
        hzVar.e = f12;
        float f13 = f11 / 2.0f;
        hzVar.a = Utilities.clamp(((wi0Var.getScaleX() * dj0Var.Q.getTimeX()) + r8[0]) - f13, AndroidUtilities.displaySize.x - f11, 0.0f);
        hzVar.b = ((wi0Var.getScaleY() * dj0Var.Q.getTimeY()) + r8[1]) - f13;
    }
}
