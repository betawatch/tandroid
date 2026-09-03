package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class bi extends org.telegram.ui.ActionBar.r1 {
    public final /* synthetic */ ci x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bi(ci ciVar, ci ciVar2) {
        super(ciVar2);
        this.x = ciVar;
    }

    @Override // org.telegram.ui.ActionBar.r1
    public final boolean b() {
        mz mzVar;
        mi miVar = this.x.y0;
        if (!miVar.isDismissed() && miVar.p1) {
            ei eiVar = miVar.v0;
            if (eiVar != miVar.j0 && eiVar != miVar.k0 && !miVar.m1().m()) {
                return true;
            }
            ei eiVar2 = miVar.v0;
            rn rnVar = miVar.j0;
            if (eiVar2 == rnVar && ((mzVar = rnVar.B) == null || mzVar.getVisibility() != 0)) {
                return true;
            }
            ei eiVar3 = miVar.v0;
            rn rnVar2 = miVar.k0;
            if (eiVar3 == rnVar2) {
                mz mzVar2 = rnVar2.B;
                return mzVar2 == null || mzVar2.getVisibility() != 0;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.r1
    public final void e(float f10, float f11, boolean z4) {
        ci ciVar = this.x;
        mi miVar = ciVar.y0;
        miVar.i2 = f10;
        float f12 = miVar.a2;
        if (f12 > 0.0f) {
            miVar.i2 = e2.c.w(1.0f, f11, f12 - miVar.b2, f10);
        }
        miVar.U0.setTranslationY(miVar.i2);
        miVar.X0.setTranslationY(miVar.i2);
        org.telegram.ui.ActionBar.w0 w0Var = miVar.b1;
        if (w0Var != null) {
            w0Var.setTranslationY(miVar.i2);
        }
        org.telegram.ui.ActionBar.w0 w0Var2 = miVar.Z0;
        if (w0Var2 != null) {
            w0Var2.setTranslationY(miVar.X0.getTranslationY());
        }
        qh.e3 e3Var = miVar.a1;
        if (e3Var != null) {
            e3Var.setTranslationY(miVar.X0.getTranslationY());
        }
        miVar.c1.setTranslationY(miVar.i2);
        miVar.a2(0);
        miVar.setCurrentPanTranslationY(miVar.i2);
        ciVar.invalidate();
        miVar.A0.invalidate();
        miVar.U1();
        ei eiVar = miVar.v0;
        if (eiVar != null) {
            eiVar.k(miVar.i2);
        }
    }

    @Override // org.telegram.ui.ActionBar.r1
    public final void f() {
        boolean z4;
        mi miVar = this.x.y0;
        miVar.X1(miVar.v0, 0);
        miVar.Z1 = miVar.Y1[0];
        miVar.v0.v();
        if (!(miVar.v0 instanceof sh.n3) || miVar.A1) {
            return;
        }
        z4 = ((org.telegram.ui.ActionBar.h3) miVar).keyboardVisible;
        int dp = z4 ? AndroidUtilities.dp(84.0f) : 0;
        for (int i10 = 0; i10 < miVar.u0.size(); i10++) {
            ((sh.n3) miVar.u0.valueAt(i10)).setMeasureOffsetY(dp);
        }
    }

    @Override // org.telegram.ui.ActionBar.r1
    public final void g(int i10, boolean z4) {
        int i11;
        ci ciVar = this.x;
        mi miVar = ciVar.y0;
        int i12 = miVar.Z1;
        if (i12 <= 0 || i12 == (i11 = miVar.Y1[0]) || !z4) {
            miVar.a2 = -1.0f;
        } else {
            miVar.a2 = i12;
            miVar.b2 = i11;
        }
        ciVar.invalidate();
        mh mhVar = miVar.u1;
        if ((miVar.v0 instanceof sh.n3) && !miVar.A1) {
            if (z4) {
                mhVar.setVisibility(8);
            } else {
                mhVar.setVisibility(0);
            }
        }
        miVar.v0.w(i10, z4);
    }
}
