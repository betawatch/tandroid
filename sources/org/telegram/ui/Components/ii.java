package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class ii extends org.telegram.ui.ActionBar.o1 {
    public final /* synthetic */ ji x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ii(ji jiVar, ji jiVar2) {
        super(jiVar2);
        this.x = jiVar;
    }

    @Override // org.telegram.ui.ActionBar.o1
    public final boolean b() {
        tz tzVar;
        ti tiVar = this.x.B0;
        if ((!tiVar.isDismissed() || tiVar.x0) && tiVar.v1) {
            li liVar = tiVar.B0;
            if (liVar != tiVar.m0 && liVar != tiVar.n0 && !tiVar.o1().m()) {
                return true;
            }
            li liVar2 = tiVar.B0;
            fo foVar = tiVar.m0;
            if (liVar2 == foVar && ((tzVar = foVar.E) == null || tzVar.getVisibility() != 0)) {
                return true;
            }
            li liVar3 = tiVar.B0;
            fo foVar2 = tiVar.n0;
            if (liVar3 == foVar2) {
                tz tzVar2 = foVar2.E;
                return tzVar2 == null || tzVar2.getVisibility() != 0;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.o1
    public final void e(float f7, float f10, boolean z10) {
        ji jiVar = this.x;
        ti tiVar = jiVar.B0;
        tiVar.o2 = f7;
        float f11 = tiVar.g2;
        if (f11 > 0.0f) {
            tiVar.o2 = com.google.android.gms.internal.play_billing.k3.y(f11, tiVar.h2, (tiVar.B0 != tiVar.w0 || z10) ? 1.0f - f10 : f10, f7);
        }
        tiVar.a1.setTranslationY(tiVar.o2);
        tiVar.d1.setTranslationY(tiVar.o2);
        org.telegram.ui.ActionBar.u0 u0Var = tiVar.h1;
        if (u0Var != null) {
            u0Var.setTranslationY(tiVar.o2);
        }
        org.telegram.ui.ActionBar.u0 u0Var2 = tiVar.f1;
        if (u0Var2 != null) {
            u0Var2.setTranslationY(tiVar.d1.getTranslationY());
        }
        ei.x3 x3Var = tiVar.g1;
        if (x3Var != null) {
            x3Var.setTranslationY(tiVar.d1.getTranslationY());
        }
        tiVar.i1.setTranslationY(tiVar.o2);
        tiVar.e2(0);
        tiVar.setCurrentPanTranslationY(tiVar.B0 != tiVar.w0 ? tiVar.o2 : 0.0f);
        jiVar.invalidate();
        tiVar.G0.invalidate();
        tiVar.Y1();
        li liVar = tiVar.B0;
        if (liVar != null) {
            liVar.m(tiVar.o2, f10);
        }
    }

    @Override // org.telegram.ui.ActionBar.o1
    public final void f() {
        boolean z10;
        ti tiVar = this.x.B0;
        tiVar.b2(tiVar.B0, 0);
        tiVar.f2 = tiVar.e2[0];
        tiVar.B0.y();
        if (!(tiVar.B0 instanceof gi.f4) || tiVar.G1) {
            return;
        }
        z10 = ((org.telegram.ui.ActionBar.f3) tiVar).keyboardVisible;
        int dp = z10 ? AndroidUtilities.dp(84.0f) : 0;
        for (int i10 = 0; i10 < tiVar.A0.size(); i10++) {
            ((gi.f4) tiVar.A0.valueAt(i10)).setMeasureOffsetY(dp);
        }
    }

    @Override // org.telegram.ui.ActionBar.o1
    public final void g(int i10, boolean z10) {
        int i11;
        ji jiVar = this.x;
        ti tiVar = jiVar.B0;
        int i12 = tiVar.f2;
        if (i12 <= 0 || i12 == (i11 = tiVar.e2[0]) || !(z10 || tiVar.B0 == tiVar.w0)) {
            tiVar.g2 = -1.0f;
        } else {
            tiVar.g2 = i12;
            tiVar.h2 = i11;
        }
        jiVar.invalidate();
        wh whVar = tiVar.A1;
        if ((tiVar.B0 instanceof gi.f4) && !tiVar.G1) {
            if (z10) {
                whVar.setVisibility(8);
            } else {
                whVar.setVisibility(0);
            }
        }
        tiVar.B0.z(i10, z10);
    }
}
