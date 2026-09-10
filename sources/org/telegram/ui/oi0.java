package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class oi0 extends iz {
    public final int[] N;
    public final /* synthetic */ cj0 O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oi0(cj0 cj0Var, ni0 ni0Var, int i10) {
        super(i10, ni0Var);
        this.O = cj0Var;
        this.N = new int[2];
    }

    @Override // org.telegram.ui.iz
    public final void h(hz hzVar) {
        cj0 cj0Var = this.O;
        vi0 vi0Var = cj0Var.K;
        if (hzVar == null) {
            return;
        }
        if (cj0Var.l0 != null) {
            hzVar.c = true;
            float f7 = (iz.f() * AndroidUtilities.density) / 1.3f;
            float f10 = f7 / 3.0f;
            hzVar.d = f10;
            hzVar.e = f10;
            hzVar.a = Utilities.clamp(cj0Var.l0.right - (0.75f * f7), AndroidUtilities.displaySize.x - f7, 0.0f);
            hzVar.b = cj0Var.l0.bottom - (f7 / 2.0f);
            return;
        }
        org.telegram.ui.Cells.t1 t1Var = cj0Var.Q;
        if (t1Var == null || !t1Var.isAttachedToWindow() || cj0Var.Q.getMessageObject() == null || cj0Var.Q.getMessageObject().getId() != cj0Var.R) {
            return;
        }
        cj0Var.Q.getLocationOnScreen(this.N);
        hzVar.c = true;
        float f11 = (iz.f() * AndroidUtilities.density) / 1.3f;
        float f12 = f11 / 3.0f;
        hzVar.d = f12;
        hzVar.e = f12;
        float f13 = f11 / 2.0f;
        hzVar.a = Utilities.clamp(((vi0Var.getScaleX() * cj0Var.Q.getTimeX()) + r8[0]) - f13, AndroidUtilities.displaySize.x - f11, 0.0f);
        hzVar.b = ((vi0Var.getScaleY() * cj0Var.Q.getTimeY()) + r8[1]) - f13;
    }
}
