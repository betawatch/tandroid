package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class hi0 extends cz {
    public final int[] N;
    public final /* synthetic */ vi0 O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hi0(vi0 vi0Var, gi0 gi0Var, int i10) {
        super(i10, gi0Var);
        this.O = vi0Var;
        this.N = new int[2];
    }

    @Override // org.telegram.ui.cz
    public final void h(bz bzVar) {
        vi0 vi0Var = this.O;
        oi0 oi0Var = vi0Var.K;
        if (bzVar == null) {
            return;
        }
        if (vi0Var.l0 != null) {
            bzVar.c = true;
            float f7 = (cz.f() * AndroidUtilities.density) / 1.3f;
            float f10 = f7 / 3.0f;
            bzVar.d = f10;
            bzVar.e = f10;
            bzVar.a = Utilities.clamp(vi0Var.l0.right - (0.75f * f7), AndroidUtilities.displaySize.x - f7, 0.0f);
            bzVar.b = vi0Var.l0.bottom - (f7 / 2.0f);
            return;
        }
        org.telegram.ui.Cells.u1 u1Var = vi0Var.Q;
        if (u1Var == null || !u1Var.isAttachedToWindow() || vi0Var.Q.getMessageObject() == null || vi0Var.Q.getMessageObject().getId() != vi0Var.R) {
            return;
        }
        vi0Var.Q.getLocationOnScreen(this.N);
        bzVar.c = true;
        float f11 = (cz.f() * AndroidUtilities.density) / 1.3f;
        float f12 = f11 / 3.0f;
        bzVar.d = f12;
        bzVar.e = f12;
        float f13 = f11 / 2.0f;
        bzVar.a = Utilities.clamp(((oi0Var.getScaleX() * vi0Var.Q.getTimeX()) + r8[0]) - f13, AndroidUtilities.displaySize.x - f11, 0.0f);
        bzVar.b = ((oi0Var.getScaleY() * vi0Var.Q.getTimeY()) + r8[1]) - f13;
    }
}
