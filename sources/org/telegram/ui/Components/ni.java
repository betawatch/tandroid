package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class ni extends org.telegram.ui.ActionBar.p1 {
    public final /* synthetic */ oi x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ni(oi oiVar, oi oiVar2) {
        super(oiVar2);
        this.x = oiVar;
    }

    @Override // org.telegram.ui.ActionBar.p1
    public final boolean b() {
        a00 a00Var;
        yi yiVar = this.x.B0;
        if ((!yiVar.isDismissed() || yiVar.x0) && yiVar.v1) {
            qi qiVar = yiVar.B0;
            if (qiVar != yiVar.m0 && qiVar != yiVar.n0 && !yiVar.o1().m()) {
                return true;
            }
            qi qiVar2 = yiVar.B0;
            lo loVar = yiVar.m0;
            if (qiVar2 == loVar && ((a00Var = loVar.E) == null || a00Var.getVisibility() != 0)) {
                return true;
            }
            qi qiVar3 = yiVar.B0;
            lo loVar2 = yiVar.n0;
            if (qiVar3 == loVar2) {
                a00 a00Var2 = loVar2.E;
                return a00Var2 == null || a00Var2.getVisibility() != 0;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.p1
    public final void e(float f7, float f10, boolean z10) {
        oi oiVar = this.x;
        yi yiVar = oiVar.B0;
        yiVar.o2 = f7;
        float f11 = yiVar.g2;
        if (f11 > 0.0f) {
            yiVar.o2 = com.google.android.gms.internal.vision.e2.y(f11, yiVar.h2, (yiVar.B0 != yiVar.w0 || z10) ? 1.0f - f10 : f10, f7);
        }
        yiVar.a1.setTranslationY(yiVar.o2);
        yiVar.d1.setTranslationY(yiVar.o2);
        org.telegram.ui.ActionBar.v0 v0Var = yiVar.h1;
        if (v0Var != null) {
            v0Var.setTranslationY(yiVar.o2);
        }
        org.telegram.ui.ActionBar.v0 v0Var2 = yiVar.f1;
        if (v0Var2 != null) {
            v0Var2.setTranslationY(yiVar.d1.getTranslationY());
        }
        ci.d4 d4Var = yiVar.g1;
        if (d4Var != null) {
            d4Var.setTranslationY(yiVar.d1.getTranslationY());
        }
        yiVar.i1.setTranslationY(yiVar.o2);
        yiVar.e2(0);
        yiVar.setCurrentPanTranslationY(yiVar.B0 != yiVar.w0 ? yiVar.o2 : 0.0f);
        oiVar.invalidate();
        yiVar.G0.invalidate();
        yiVar.Y1();
        qi qiVar = yiVar.B0;
        if (qiVar != null) {
            qiVar.m(yiVar.o2, f10);
        }
    }

    @Override // org.telegram.ui.ActionBar.p1
    public final void f() {
        boolean z10;
        yi yiVar = this.x.B0;
        yiVar.b2(yiVar.B0, 0);
        yiVar.f2 = yiVar.e2[0];
        yiVar.B0.y();
        if (!(yiVar.B0 instanceof ei.p4) || yiVar.G1) {
            return;
        }
        z10 = ((org.telegram.ui.ActionBar.f3) yiVar).keyboardVisible;
        int dp = z10 ? AndroidUtilities.dp(84.0f) : 0;
        for (int i10 = 0; i10 < yiVar.A0.size(); i10++) {
            ((ei.p4) yiVar.A0.valueAt(i10)).setMeasureOffsetY(dp);
        }
    }

    @Override // org.telegram.ui.ActionBar.p1
    public final void g(int i10, boolean z10) {
        int i11;
        oi oiVar = this.x;
        yi yiVar = oiVar.B0;
        int i12 = yiVar.f2;
        if (i12 <= 0 || i12 == (i11 = yiVar.e2[0]) || !(z10 || yiVar.B0 == yiVar.w0)) {
            yiVar.g2 = -1.0f;
        } else {
            yiVar.g2 = i12;
            yiVar.h2 = i11;
        }
        oiVar.invalidate();
        ai aiVar = yiVar.A1;
        if ((yiVar.B0 instanceof ei.p4) && !yiVar.G1) {
            if (z10) {
                aiVar.setVisibility(8);
            } else {
                aiVar.setVisibility(0);
            }
        }
        yiVar.B0.z(i10, z10);
    }
}
