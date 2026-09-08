package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class ki extends org.telegram.ui.ActionBar.p1 {
    public final /* synthetic */ li x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ki(li liVar, li liVar2) {
        super(liVar2);
        this.x = liVar;
    }

    @Override // org.telegram.ui.ActionBar.p1
    public final boolean b() {
        kz kzVar;
        vi viVar = this.x.B0;
        if (!viVar.isDismissed() && viVar.s1) {
            ni niVar = viVar.y0;
            if (niVar != viVar.m0 && niVar != viVar.n0 && !viVar.m1().m()) {
                return true;
            }
            ni niVar2 = viVar.y0;
            tn tnVar = viVar.m0;
            if (niVar2 == tnVar && ((kzVar = tnVar.E) == null || kzVar.getVisibility() != 0)) {
                return true;
            }
            ni niVar3 = viVar.y0;
            tn tnVar2 = viVar.n0;
            if (niVar3 == tnVar2) {
                kz kzVar2 = tnVar2.E;
                return kzVar2 == null || kzVar2.getVisibility() != 0;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.p1
    public final void e(float f7, float f10, boolean z10) {
        li liVar = this.x;
        vi viVar = liVar.B0;
        viVar.l2 = f7;
        float f11 = viVar.d2;
        if (f11 > 0.0f) {
            viVar.l2 = com.google.android.gms.internal.vision.e2.z(1.0f, f10, f11 - viVar.e2, f7);
        }
        viVar.X0.setTranslationY(viVar.l2);
        viVar.a1.setTranslationY(viVar.l2);
        org.telegram.ui.ActionBar.v0 v0Var = viVar.e1;
        if (v0Var != null) {
            v0Var.setTranslationY(viVar.l2);
        }
        org.telegram.ui.ActionBar.v0 v0Var2 = viVar.c1;
        if (v0Var2 != null) {
            v0Var2.setTranslationY(viVar.a1.getTranslationY());
        }
        di.f4 f4Var = viVar.d1;
        if (f4Var != null) {
            f4Var.setTranslationY(viVar.a1.getTranslationY());
        }
        viVar.f1.setTranslationY(viVar.l2);
        viVar.a2(0);
        viVar.setCurrentPanTranslationY(viVar.l2);
        liVar.invalidate();
        viVar.D0.invalidate();
        viVar.U1();
        ni niVar = viVar.y0;
        if (niVar != null) {
            niVar.k(viVar.l2);
        }
    }

    @Override // org.telegram.ui.ActionBar.p1
    public final void f() {
        boolean z10;
        vi viVar = this.x.B0;
        viVar.X1(viVar.y0, 0);
        viVar.c2 = viVar.b2[0];
        viVar.y0.v();
        if (!(viVar.y0 instanceof fi.r4) || viVar.D1) {
            return;
        }
        z10 = ((org.telegram.ui.ActionBar.f3) viVar).keyboardVisible;
        int dp = z10 ? AndroidUtilities.dp(84.0f) : 0;
        for (int i10 = 0; i10 < viVar.x0.size(); i10++) {
            ((fi.r4) viVar.x0.valueAt(i10)).setMeasureOffsetY(dp);
        }
    }

    @Override // org.telegram.ui.ActionBar.p1
    public final void g(int i10, boolean z10) {
        int i11;
        li liVar = this.x;
        vi viVar = liVar.B0;
        int i12 = viVar.c2;
        if (i12 <= 0 || i12 == (i11 = viVar.b2[0]) || !z10) {
            viVar.d2 = -1.0f;
        } else {
            viVar.d2 = i12;
            viVar.e2 = i11;
        }
        liVar.invalidate();
        xh xhVar = viVar.x1;
        if ((viVar.y0 instanceof fi.r4) && !viVar.D1) {
            if (z10) {
                xhVar.setVisibility(8);
            } else {
                xhVar.setVisibility(0);
            }
        }
        viVar.y0.w(i10, z10);
    }
}
