package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class vh extends org.telegram.ui.ActionBar.p1 {
    public final /* synthetic */ wh x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vh(wh whVar, wh whVar2) {
        super(whVar2);
        this.x = whVar;
    }

    @Override // org.telegram.ui.ActionBar.p1
    public final boolean b() {
        yy yyVar;
        gi giVar = this.x.x0;
        if (!giVar.isDismissed() && giVar.o1) {
            yh yhVar = giVar.u0;
            if (yhVar != giVar.i0 && yhVar != giVar.j0 && !giVar.m1().m()) {
                return true;
            }
            yh yhVar2 = giVar.u0;
            in inVar = giVar.i0;
            if (yhVar2 == inVar && ((yyVar = inVar.A) == null || yyVar.getVisibility() != 0)) {
                return true;
            }
            yh yhVar3 = giVar.u0;
            in inVar2 = giVar.j0;
            if (yhVar3 == inVar2) {
                yy yyVar2 = inVar2.A;
                return yyVar2 == null || yyVar2.getVisibility() != 0;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.p1
    public final void e(float f10, float f11, boolean z10) {
        wh whVar = this.x;
        gi giVar = whVar.x0;
        giVar.h2 = f10;
        float f12 = giVar.Z1;
        if (f12 > 0.0f) {
            giVar.h2 = com.google.android.recaptcha.internal.a.z(1.0f, f11, f12 - giVar.a2, f10);
        }
        giVar.T0.setTranslationY(giVar.h2);
        giVar.W0.setTranslationY(giVar.h2);
        org.telegram.ui.ActionBar.v0 v0Var = giVar.a1;
        if (v0Var != null) {
            v0Var.setTranslationY(giVar.h2);
        }
        org.telegram.ui.ActionBar.v0 v0Var2 = giVar.Y0;
        if (v0Var2 != null) {
            v0Var2.setTranslationY(giVar.W0.getTranslationY());
        }
        lh.w3 w3Var = giVar.Z0;
        if (w3Var != null) {
            w3Var.setTranslationY(giVar.W0.getTranslationY());
        }
        giVar.b1.setTranslationY(giVar.h2);
        giVar.a2(0);
        giVar.setCurrentPanTranslationY(giVar.h2);
        whVar.invalidate();
        giVar.z0.invalidate();
        giVar.U1();
        yh yhVar = giVar.u0;
        if (yhVar != null) {
            yhVar.k(giVar.h2);
        }
    }

    @Override // org.telegram.ui.ActionBar.p1
    public final void f() {
        boolean z10;
        gi giVar = this.x.x0;
        giVar.X1(giVar.u0, 0);
        giVar.Y1 = giVar.X1[0];
        giVar.u0.w();
        if (!(giVar.u0 instanceof nh.e4) || giVar.z1) {
            return;
        }
        z10 = ((org.telegram.ui.ActionBar.e3) giVar).keyboardVisible;
        int dp = z10 ? AndroidUtilities.dp(84.0f) : 0;
        for (int i10 = 0; i10 < giVar.t0.size(); i10++) {
            ((nh.e4) giVar.t0.valueAt(i10)).setMeasureOffsetY(dp);
        }
    }

    @Override // org.telegram.ui.ActionBar.p1
    public final void g(int i10, boolean z10) {
        int i11;
        wh whVar = this.x;
        gi giVar = whVar.x0;
        int i12 = giVar.Y1;
        if (i12 <= 0 || i12 == (i11 = giVar.X1[0]) || !z10) {
            giVar.Z1 = -1.0f;
        } else {
            giVar.Z1 = i12;
            giVar.a2 = i11;
        }
        whVar.invalidate();
        ih ihVar = giVar.t1;
        if ((giVar.u0 instanceof nh.e4) && !giVar.z1) {
            if (z10) {
                ihVar.setVisibility(8);
            } else {
                ihVar.setVisibility(0);
            }
        }
        giVar.u0.x(i10, z10);
    }
}
