package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class fi extends org.telegram.ui.ActionBar.q1 {
    public final /* synthetic */ gi x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fi(gi giVar, gi giVar2) {
        super(giVar2);
        this.x = giVar;
    }

    @Override // org.telegram.ui.ActionBar.q1
    public final boolean b() {
        sz szVar;
        ti tiVar = this.x.q0;
        if ((!tiVar.isDismissed() || tiVar.x0) && tiVar.v1) {
            li liVar = tiVar.B0;
            if (liVar != tiVar.m0 && liVar != tiVar.n0 && !tiVar.r1().m()) {
                return true;
            }
            li liVar2 = tiVar.B0;
            go goVar = tiVar.m0;
            if (liVar2 == goVar && ((szVar = goVar.E) == null || szVar.getVisibility() != 0)) {
                return true;
            }
            li liVar3 = tiVar.B0;
            go goVar2 = tiVar.n0;
            if (liVar3 == goVar2) {
                sz szVar2 = goVar2.E;
                return szVar2 == null || szVar2.getVisibility() != 0;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.q1
    public final void e(float f7, float f10, boolean z10) {
        gi giVar = this.x;
        ti tiVar = giVar.q0;
        tiVar.o2 = f7;
        float f11 = tiVar.g2;
        if (f11 > 0.0f) {
            tiVar.o2 = c3.h0.z(f11, tiVar.h2, (tiVar.B0 != tiVar.w0 || z10) ? 1.0f - f10 : f10, f7);
        }
        tiVar.a1.setTranslationY(tiVar.o2);
        tiVar.d1.setTranslationY(tiVar.o2);
        org.telegram.ui.ActionBar.w0 w0Var = tiVar.h1;
        if (w0Var != null) {
            w0Var.setTranslationY(tiVar.o2);
        }
        org.telegram.ui.ActionBar.w0 w0Var2 = tiVar.f1;
        if (w0Var2 != null) {
            w0Var2.setTranslationY(tiVar.d1.getTranslationY());
        }
        fi.v3 v3Var = tiVar.g1;
        if (v3Var != null) {
            v3Var.setTranslationY(tiVar.d1.getTranslationY());
        }
        tiVar.i1.setTranslationY(tiVar.o2);
        tiVar.h2(0);
        tiVar.setCurrentPanTranslationY(tiVar.B0 != tiVar.w0 ? tiVar.o2 : 0.0f);
        giVar.invalidate();
        tiVar.G0.invalidate();
        tiVar.b2();
        li liVar = tiVar.B0;
        if (liVar != null) {
            liVar.m(tiVar.o2, f10);
        }
    }

    @Override // org.telegram.ui.ActionBar.q1
    public final void f() {
        boolean z10;
        ti tiVar = this.x.q0;
        tiVar.e2(tiVar.B0, 0);
        tiVar.f2 = tiVar.e2[0];
        tiVar.B0.x();
        if (!(tiVar.B0 instanceof hi.o4) || tiVar.G1) {
            return;
        }
        z10 = ((org.telegram.ui.ActionBar.k3) tiVar).keyboardVisible;
        int dp = z10 ? AndroidUtilities.dp(84.0f) : 0;
        for (int i10 = 0; i10 < tiVar.A0.size(); i10++) {
            ((hi.o4) tiVar.A0.valueAt(i10)).setMeasureOffsetY(dp);
        }
    }

    @Override // org.telegram.ui.ActionBar.q1
    public final void g(int i10, boolean z10) {
        int i11;
        gi giVar = this.x;
        ti tiVar = giVar.q0;
        int i12 = tiVar.f2;
        if (i12 <= 0 || i12 == (i11 = tiVar.e2[0]) || !(z10 || tiVar.B0 == tiVar.w0)) {
            tiVar.g2 = -1.0f;
        } else {
            tiVar.g2 = i12;
            tiVar.h2 = i11;
        }
        giVar.invalidate();
        th thVar = tiVar.A1;
        if ((tiVar.B0 instanceof hi.o4) && !tiVar.G1) {
            if (z10) {
                thVar.setVisibility(8);
            } else {
                thVar.setVisibility(0);
            }
        }
        tiVar.B0.y(i10, z10);
    }
}
