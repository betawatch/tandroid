package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class ki extends org.telegram.ui.ActionBar.o1 {
    public final /* synthetic */ li x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ki(li liVar, li liVar2) {
        super(liVar2);
        this.x = liVar;
    }

    @Override // org.telegram.ui.ActionBar.o1
    public final boolean b() {
        wz wzVar;
        vi viVar = this.x.B0;
        if ((!viVar.isDismissed() || viVar.x0) && viVar.v1) {
            ni niVar = viVar.B0;
            if (niVar != viVar.m0 && niVar != viVar.n0 && !viVar.o1().m()) {
                return true;
            }
            ni niVar2 = viVar.B0;
            io ioVar = viVar.m0;
            if (niVar2 == ioVar && ((wzVar = ioVar.E) == null || wzVar.getVisibility() != 0)) {
                return true;
            }
            ni niVar3 = viVar.B0;
            io ioVar2 = viVar.n0;
            if (niVar3 == ioVar2) {
                wz wzVar2 = ioVar2.E;
                return wzVar2 == null || wzVar2.getVisibility() != 0;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.o1
    public final void e(float f7, float f10, boolean z10) {
        li liVar = this.x;
        vi viVar = liVar.B0;
        viVar.o2 = f7;
        float f11 = viVar.g2;
        if (f11 > 0.0f) {
            viVar.o2 = com.google.android.gms.internal.play_billing.k3.y(f11, viVar.h2, (viVar.B0 != viVar.w0 || z10) ? 1.0f - f10 : f10, f7);
        }
        viVar.a1.setTranslationY(viVar.o2);
        viVar.d1.setTranslationY(viVar.o2);
        org.telegram.ui.ActionBar.u0 u0Var = viVar.h1;
        if (u0Var != null) {
            u0Var.setTranslationY(viVar.o2);
        }
        org.telegram.ui.ActionBar.u0 u0Var2 = viVar.f1;
        if (u0Var2 != null) {
            u0Var2.setTranslationY(viVar.d1.getTranslationY());
        }
        di.d4 d4Var = viVar.g1;
        if (d4Var != null) {
            d4Var.setTranslationY(viVar.d1.getTranslationY());
        }
        viVar.i1.setTranslationY(viVar.o2);
        viVar.e2(0);
        viVar.setCurrentPanTranslationY(viVar.B0 != viVar.w0 ? viVar.o2 : 0.0f);
        liVar.invalidate();
        viVar.G0.invalidate();
        viVar.Y1();
        ni niVar = viVar.B0;
        if (niVar != null) {
            niVar.m(viVar.o2, f10);
        }
    }

    @Override // org.telegram.ui.ActionBar.o1
    public final void f() {
        boolean z10;
        vi viVar = this.x.B0;
        viVar.b2(viVar.B0, 0);
        viVar.f2 = viVar.e2[0];
        viVar.B0.y();
        if (!(viVar.B0 instanceof fi.q4) || viVar.G1) {
            return;
        }
        z10 = ((org.telegram.ui.ActionBar.e3) viVar).keyboardVisible;
        int dp = z10 ? AndroidUtilities.dp(84.0f) : 0;
        for (int i10 = 0; i10 < viVar.A0.size(); i10++) {
            ((fi.q4) viVar.A0.valueAt(i10)).setMeasureOffsetY(dp);
        }
    }

    @Override // org.telegram.ui.ActionBar.o1
    public final void g(int i10, boolean z10) {
        int i11;
        li liVar = this.x;
        vi viVar = liVar.B0;
        int i12 = viVar.f2;
        if (i12 <= 0 || i12 == (i11 = viVar.e2[0]) || !(z10 || viVar.B0 == viVar.w0)) {
            viVar.g2 = -1.0f;
        } else {
            viVar.g2 = i12;
            viVar.h2 = i11;
        }
        liVar.invalidate();
        xh xhVar = viVar.A1;
        if ((viVar.B0 instanceof fi.q4) && !viVar.G1) {
            if (z10) {
                xhVar.setVisibility(8);
            } else {
                xhVar.setVisibility(0);
            }
        }
        viVar.B0.z(i10, z10);
    }
}
