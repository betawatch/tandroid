package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class b20 extends org.telegram.ui.Components.voip.k0 {
    public final /* synthetic */ f40 R0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b20(f40 f40Var, LaunchActivity launchActivity, n30 n30Var, x10 x10Var, ArrayList arrayList, org.telegram.messenger.t3 t3Var, f40 f40Var2) {
        super(launchActivity, n30Var, x10Var, arrayList, t3Var, f40Var2);
        this.R0 = f40Var;
    }

    @Override // org.telegram.ui.Components.voip.k0, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.R0.Y4) {
            return true;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override // org.telegram.ui.Components.voip.k0
    public final void i(boolean z10) {
        f40 f40Var = this.R0;
        d40 d40Var = f40Var.A3;
        d30 d30Var = f40Var.J1;
        n30 n30Var = f40Var.L1;
        org.telegram.ui.Components.v10 v10Var = f40Var.o4;
        b20 b20Var = f40Var.Z3;
        x10 x10Var = f40Var.l4;
        f40Var.n2 = z10;
        if (f40.F5) {
            if (z10 || !b20Var.b) {
                return;
            }
            f40Var.n4.H(f40Var.m4, false, true);
            return;
        }
        if (z10) {
            f40Var.e2[0].d(1, false);
            b20Var.L0[0].d(2, false);
            if (!b20Var.b) {
                n30Var.setVisibility(0);
                d30Var.setVisibility(0);
                if (d40Var != null) {
                    d40Var.setVisibility(0);
                }
            }
            f40Var.W1(true, false);
            f40Var.p1.requestLayout();
            if (x10Var.getVisibility() != 0) {
                x10Var.setVisibility(0);
                v10Var.F(x10Var, true);
                v10Var.G(x10Var, false);
            } else {
                v10Var.F(x10Var, true);
                f40Var.R0(true);
            }
        } else {
            if (b20Var.b) {
                d30Var.setVisibility(8);
                n30Var.setVisibility(8);
                if (d40Var != null) {
                    d40Var.setVisibility(8);
                }
            } else {
                x10Var.setVisibility(8);
                v10Var.F(x10Var, false);
            }
            if (x10Var.getVisibility() == 0) {
                for (int i7 = 0; i7 < x10Var.getChildCount(); i7++) {
                    View childAt = x10Var.getChildAt(i7);
                    childAt.setAlpha(1.0f);
                    childAt.setScaleX(1.0f);
                    childAt.setScaleY(1.0f);
                    childAt.setTranslationX(0.0f);
                    childAt.setTranslationY(0.0f);
                    ((org.telegram.ui.Components.u10) childAt).setProgressToFullscreen(b20Var.c);
                }
            }
        }
        f40Var.J4.setVisibility(z10 ? 0 : 8);
        if (f40Var.n2) {
            return;
        }
        f40Var.R0(true);
    }

    @Override // org.telegram.ui.Components.voip.k0
    public final void l() {
        invalidate();
        f40 f40Var = this.R0;
        float f10 = f40Var.T3;
        b20 b20Var = f40Var.Z3;
        f40Var.H0 = org.telegram.messenger.g0.S0(Math.max(f10, b20Var == null ? 0.0f : b20Var.c), 1.0f, org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.ah, false), org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Xg, false));
        f40Var.b.invalidate();
        f40Var.H1(f40Var.T3);
    }
}
