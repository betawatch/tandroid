package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class ji extends org.telegram.ui.ActionBar.p1 {
    public final /* synthetic */ ki x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ji(ki kiVar, ki kiVar2) {
        super(kiVar2);
        this.x = kiVar;
    }

    @Override // org.telegram.ui.ActionBar.p1
    public final boolean b() {
        nz nzVar;
        xi xiVar = this.x.B0;
        if (!xiVar.isDismissed() && xiVar.s1) {
            pi piVar = xiVar.y0;
            if (piVar != xiVar.m0 && piVar != xiVar.n0 && !xiVar.m1().m()) {
                return true;
            }
            pi piVar2 = xiVar.y0;
            xn xnVar = xiVar.m0;
            if (piVar2 == xnVar && ((nzVar = xnVar.E) == null || nzVar.getVisibility() != 0)) {
                return true;
            }
            pi piVar3 = xiVar.y0;
            xn xnVar2 = xiVar.n0;
            if (piVar3 == xnVar2) {
                nz nzVar2 = xnVar2.E;
                return nzVar2 == null || nzVar2.getVisibility() != 0;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.p1
    public final void e(float f7, float f10, boolean z10) {
        ki kiVar = this.x;
        xi xiVar = kiVar.B0;
        xiVar.l2 = f7;
        float f11 = xiVar.d2;
        if (f11 > 0.0f) {
            xiVar.l2 = com.google.android.gms.internal.vision.e2.z(1.0f, f10, f11 - xiVar.e2, f7);
        }
        xiVar.X0.setTranslationY(xiVar.l2);
        xiVar.a1.setTranslationY(xiVar.l2);
        org.telegram.ui.ActionBar.v0 v0Var = xiVar.e1;
        if (v0Var != null) {
            v0Var.setTranslationY(xiVar.l2);
        }
        org.telegram.ui.ActionBar.v0 v0Var2 = xiVar.c1;
        if (v0Var2 != null) {
            v0Var2.setTranslationY(xiVar.a1.getTranslationY());
        }
        ci.e4 e4Var = xiVar.d1;
        if (e4Var != null) {
            e4Var.setTranslationY(xiVar.a1.getTranslationY());
        }
        xiVar.f1.setTranslationY(xiVar.l2);
        xiVar.Z1(0);
        xiVar.setCurrentPanTranslationY(xiVar.l2);
        kiVar.invalidate();
        xiVar.D0.invalidate();
        xiVar.T1();
        pi piVar = xiVar.y0;
        if (piVar != null) {
            piVar.k(xiVar.l2);
        }
    }

    @Override // org.telegram.ui.ActionBar.p1
    public final void f() {
        boolean z10;
        xi xiVar = this.x.B0;
        xiVar.W1(xiVar.y0, 0);
        xiVar.c2 = xiVar.b2[0];
        xiVar.y0.v();
        if (!(xiVar.y0 instanceof ei.r4) || xiVar.D1) {
            return;
        }
        z10 = ((org.telegram.ui.ActionBar.f3) xiVar).keyboardVisible;
        int dp = z10 ? AndroidUtilities.dp(84.0f) : 0;
        for (int i10 = 0; i10 < xiVar.x0.size(); i10++) {
            ((ei.r4) xiVar.x0.valueAt(i10)).setMeasureOffsetY(dp);
        }
    }

    @Override // org.telegram.ui.ActionBar.p1
    public final void g(int i10, boolean z10) {
        int i11;
        ki kiVar = this.x;
        xi xiVar = kiVar.B0;
        int i12 = xiVar.c2;
        if (i12 <= 0 || i12 == (i11 = xiVar.b2[0]) || !z10) {
            xiVar.d2 = -1.0f;
        } else {
            xiVar.d2 = i12;
            xiVar.e2 = i11;
        }
        kiVar.invalidate();
        wh whVar = xiVar.x1;
        if ((xiVar.y0 instanceof ei.r4) && !xiVar.D1) {
            if (z10) {
                whVar.setVisibility(8);
            } else {
                whVar.setVisibility(0);
            }
        }
        xiVar.y0.w(i10, z10);
    }
}
