package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class li extends org.telegram.ui.ActionBar.o1 {
    public final /* synthetic */ mi x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public li(mi miVar, mi miVar2) {
        super(miVar2);
        this.x = miVar;
    }

    @Override // org.telegram.ui.ActionBar.o1
    public final boolean b() {
        lz lzVar;
        wi wiVar = this.x.B0;
        if (!wiVar.isDismissed() && wiVar.s1) {
            oi oiVar = wiVar.y0;
            if (oiVar != wiVar.m0 && oiVar != wiVar.n0 && !wiVar.m1().m()) {
                return true;
            }
            oi oiVar2 = wiVar.y0;
            vn vnVar = wiVar.m0;
            if (oiVar2 == vnVar && ((lzVar = vnVar.E) == null || lzVar.getVisibility() != 0)) {
                return true;
            }
            oi oiVar3 = wiVar.y0;
            vn vnVar2 = wiVar.n0;
            if (oiVar3 == vnVar2) {
                lz lzVar2 = vnVar2.E;
                return lzVar2 == null || lzVar2.getVisibility() != 0;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.o1
    public final void e(float f7, float f10, boolean z10) {
        mi miVar = this.x;
        wi wiVar = miVar.B0;
        wiVar.l2 = f7;
        float f11 = wiVar.d2;
        if (f11 > 0.0f) {
            wiVar.l2 = com.google.android.gms.internal.vision.e2.z(1.0f, f10, f11 - wiVar.e2, f7);
        }
        wiVar.X0.setTranslationY(wiVar.l2);
        wiVar.a1.setTranslationY(wiVar.l2);
        org.telegram.ui.ActionBar.u0 u0Var = wiVar.e1;
        if (u0Var != null) {
            u0Var.setTranslationY(wiVar.l2);
        }
        org.telegram.ui.ActionBar.u0 u0Var2 = wiVar.c1;
        if (u0Var2 != null) {
            u0Var2.setTranslationY(wiVar.a1.getTranslationY());
        }
        ci.e4 e4Var = wiVar.d1;
        if (e4Var != null) {
            e4Var.setTranslationY(wiVar.a1.getTranslationY());
        }
        wiVar.f1.setTranslationY(wiVar.l2);
        wiVar.a2(0);
        wiVar.setCurrentPanTranslationY(wiVar.l2);
        miVar.invalidate();
        wiVar.D0.invalidate();
        wiVar.U1();
        oi oiVar = wiVar.y0;
        if (oiVar != null) {
            oiVar.k(wiVar.l2);
        }
    }

    @Override // org.telegram.ui.ActionBar.o1
    public final void f() {
        boolean z10;
        wi wiVar = this.x.B0;
        wiVar.X1(wiVar.y0, 0);
        wiVar.c2 = wiVar.b2[0];
        wiVar.y0.v();
        if (!(wiVar.y0 instanceof ei.q4) || wiVar.D1) {
            return;
        }
        z10 = ((org.telegram.ui.ActionBar.e3) wiVar).keyboardVisible;
        int dp = z10 ? AndroidUtilities.dp(84.0f) : 0;
        for (int i10 = 0; i10 < wiVar.x0.size(); i10++) {
            ((ei.q4) wiVar.x0.valueAt(i10)).setMeasureOffsetY(dp);
        }
    }

    @Override // org.telegram.ui.ActionBar.o1
    public final void g(int i10, boolean z10) {
        int i11;
        mi miVar = this.x;
        wi wiVar = miVar.B0;
        int i12 = wiVar.c2;
        if (i12 <= 0 || i12 == (i11 = wiVar.b2[0]) || !z10) {
            wiVar.d2 = -1.0f;
        } else {
            wiVar.d2 = i12;
            wiVar.e2 = i11;
        }
        miVar.invalidate();
        yh yhVar = wiVar.x1;
        if ((wiVar.y0 instanceof ei.q4) && !wiVar.D1) {
            if (z10) {
                yhVar.setVisibility(8);
            } else {
                yhVar.setVisibility(0);
            }
        }
        wiVar.y0.w(i10, z10);
    }
}
