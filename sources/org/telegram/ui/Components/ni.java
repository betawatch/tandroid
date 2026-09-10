package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class ni extends org.telegram.ui.ActionBar.r1 {
    public final /* synthetic */ oi x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ni(oi oiVar, oi oiVar2) {
        super(oiVar2);
        this.x = oiVar;
    }

    @Override // org.telegram.ui.ActionBar.r1
    public final boolean b() {
        rz rzVar;
        yi yiVar = this.x.B0;
        if (!yiVar.isDismissed() && yiVar.s1) {
            qi qiVar = yiVar.y0;
            if (qiVar != yiVar.m0 && qiVar != yiVar.n0 && !yiVar.m1().m()) {
                return true;
            }
            qi qiVar2 = yiVar.y0;
            zn znVar = yiVar.m0;
            if (qiVar2 == znVar && ((rzVar = znVar.E) == null || rzVar.getVisibility() != 0)) {
                return true;
            }
            qi qiVar3 = yiVar.y0;
            zn znVar2 = yiVar.n0;
            if (qiVar3 == znVar2) {
                rz rzVar2 = znVar2.E;
                return rzVar2 == null || rzVar2.getVisibility() != 0;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.r1
    public final void e(float f7, float f10, boolean z10) {
        oi oiVar = this.x;
        yi yiVar = oiVar.B0;
        yiVar.l2 = f7;
        float f11 = yiVar.d2;
        if (f11 > 0.0f) {
            yiVar.l2 = com.google.android.gms.internal.vision.e2.z(1.0f, f10, f11 - yiVar.e2, f7);
        }
        yiVar.X0.setTranslationY(yiVar.l2);
        yiVar.a1.setTranslationY(yiVar.l2);
        org.telegram.ui.ActionBar.w0 w0Var = yiVar.e1;
        if (w0Var != null) {
            w0Var.setTranslationY(yiVar.l2);
        }
        org.telegram.ui.ActionBar.w0 w0Var2 = yiVar.c1;
        if (w0Var2 != null) {
            w0Var2.setTranslationY(yiVar.a1.getTranslationY());
        }
        bi.x4 x4Var = yiVar.d1;
        if (x4Var != null) {
            x4Var.setTranslationY(yiVar.a1.getTranslationY());
        }
        yiVar.f1.setTranslationY(yiVar.l2);
        yiVar.a2(0);
        yiVar.setCurrentPanTranslationY(yiVar.l2);
        oiVar.invalidate();
        yiVar.D0.invalidate();
        yiVar.U1();
        qi qiVar = yiVar.y0;
        if (qiVar != null) {
            qiVar.k(yiVar.l2);
        }
    }

    @Override // org.telegram.ui.ActionBar.r1
    public final void f() {
        boolean z10;
        yi yiVar = this.x.B0;
        yiVar.X1(yiVar.y0, 0);
        yiVar.c2 = yiVar.b2[0];
        yiVar.y0.v();
        if (!(yiVar.y0 instanceof di.u4) || yiVar.D1) {
            return;
        }
        z10 = ((org.telegram.ui.ActionBar.h3) yiVar).keyboardVisible;
        int dp = z10 ? AndroidUtilities.dp(84.0f) : 0;
        for (int i10 = 0; i10 < yiVar.x0.size(); i10++) {
            ((di.u4) yiVar.x0.valueAt(i10)).setMeasureOffsetY(dp);
        }
    }

    @Override // org.telegram.ui.ActionBar.r1
    public final void g(int i10, boolean z10) {
        int i11;
        oi oiVar = this.x;
        yi yiVar = oiVar.B0;
        int i12 = yiVar.c2;
        if (i12 <= 0 || i12 == (i11 = yiVar.b2[0]) || !z10) {
            yiVar.d2 = -1.0f;
        } else {
            yiVar.d2 = i12;
            yiVar.e2 = i11;
        }
        oiVar.invalidate();
        ai aiVar = yiVar.x1;
        if ((yiVar.y0 instanceof di.u4) && !yiVar.D1) {
            if (z10) {
                aiVar.setVisibility(8);
            } else {
                aiVar.setVisibility(0);
            }
        }
        yiVar.y0.w(i10, z10);
    }
}
