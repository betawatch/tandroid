package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class c20 extends org.telegram.ui.Components.voip.k0 {
    public final /* synthetic */ f40 Q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c20(f40 f40Var, LaunchActivity launchActivity, n30 n30Var, y10 y10Var, ArrayList arrayList, org.telegram.messenger.r3 r3Var, f40 f40Var2) {
        super(launchActivity, n30Var, y10Var, arrayList, r3Var, f40Var2);
        this.Q0 = f40Var;
    }

    @Override // org.telegram.ui.Components.voip.k0, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.Q0.T4) {
            return true;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override // org.telegram.ui.Components.voip.k0
    public final void i(boolean z9) {
        f40 f40Var = this.Q0;
        d40 d40Var = f40Var.v3;
        c30 c30Var = f40Var.I1;
        n30 n30Var = f40Var.K1;
        org.telegram.ui.Components.h10 h10Var = f40Var.j4;
        c20 c20Var = f40Var.U3;
        y10 y10Var = f40Var.g4;
        f40Var.m2 = z9;
        if (f40.A5) {
            if (z9 || !c20Var.b) {
                return;
            }
            f40Var.i4.H(f40Var.h4, false, true);
            return;
        }
        if (z9) {
            f40Var.d2[0].d(1, false);
            c20Var.K0[0].d(2, false);
            if (!c20Var.b) {
                n30Var.setVisibility(0);
                c30Var.setVisibility(0);
                if (d40Var != null) {
                    d40Var.setVisibility(0);
                }
            }
            f40Var.T1(true, false);
            f40Var.o1.requestLayout();
            if (y10Var.getVisibility() != 0) {
                y10Var.setVisibility(0);
                h10Var.F(y10Var, true);
                h10Var.G(y10Var, false);
            } else {
                h10Var.F(y10Var, true);
                f40Var.Q0(true);
            }
        } else {
            if (c20Var.b) {
                c30Var.setVisibility(8);
                n30Var.setVisibility(8);
                if (d40Var != null) {
                    d40Var.setVisibility(8);
                }
            } else {
                y10Var.setVisibility(8);
                h10Var.F(y10Var, false);
            }
            if (y10Var.getVisibility() == 0) {
                for (int i7 = 0; i7 < y10Var.getChildCount(); i7++) {
                    View childAt = y10Var.getChildAt(i7);
                    childAt.setAlpha(1.0f);
                    childAt.setScaleX(1.0f);
                    childAt.setScaleY(1.0f);
                    childAt.setTranslationX(0.0f);
                    childAt.setTranslationY(0.0f);
                    ((org.telegram.ui.Components.g10) childAt).setProgressToFullscreen(c20Var.c);
                }
            }
        }
        f40Var.E4.setVisibility(z9 ? 0 : 8);
        if (f40Var.m2) {
            return;
        }
        f40Var.Q0(true);
    }

    @Override // org.telegram.ui.Components.voip.k0
    public final void l() {
        invalidate();
        f40 f40Var = this.Q0;
        float f10 = f40Var.O3;
        c20 c20Var = f40Var.U3;
        f40Var.G0 = org.telegram.messenger.g0.S0(Math.max(f10, c20Var == null ? 0.0f : c20Var.c), 1.0f, org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Xg, false), org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Ug, false));
        f40Var.b.invalidate();
        f40Var.G1(f40Var.O3);
    }
}
