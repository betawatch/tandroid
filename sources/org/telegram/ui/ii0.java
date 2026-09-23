package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class ii0 extends dz {
    public final int[] N;
    public final /* synthetic */ wi0 O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ii0(wi0 wi0Var, hi0 hi0Var, int i10) {
        super(i10, hi0Var);
        this.O = wi0Var;
        this.N = new int[2];
    }

    @Override // org.telegram.ui.dz
    public final void h(cz czVar) {
        wi0 wi0Var = this.O;
        pi0 pi0Var = wi0Var.K;
        if (czVar == null) {
            return;
        }
        if (wi0Var.l0 != null) {
            czVar.c = true;
            float f7 = (dz.f() * AndroidUtilities.density) / 1.3f;
            float f10 = f7 / 3.0f;
            czVar.d = f10;
            czVar.e = f10;
            czVar.a = Utilities.clamp(wi0Var.l0.right - (0.75f * f7), AndroidUtilities.displaySize.x - f7, 0.0f);
            czVar.b = wi0Var.l0.bottom - (f7 / 2.0f);
            return;
        }
        org.telegram.ui.Cells.t1 t1Var = wi0Var.Q;
        if (t1Var == null || !t1Var.isAttachedToWindow() || wi0Var.Q.getMessageObject() == null || wi0Var.Q.getMessageObject().getId() != wi0Var.R) {
            return;
        }
        wi0Var.Q.getLocationOnScreen(this.N);
        czVar.c = true;
        float f11 = (dz.f() * AndroidUtilities.density) / 1.3f;
        float f12 = f11 / 3.0f;
        czVar.d = f12;
        czVar.e = f12;
        float f13 = f11 / 2.0f;
        czVar.a = Utilities.clamp(((pi0Var.getScaleX() * wi0Var.Q.getTimeX()) + r8[0]) - f13, AndroidUtilities.displaySize.x - f11, 0.0f);
        czVar.b = ((pi0Var.getScaleY() * wi0Var.Q.getTimeY()) + r8[1]) - f13;
    }
}
