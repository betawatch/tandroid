package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class b20 extends org.telegram.ui.Components.voip.k0 {
    public final /* synthetic */ e40 Q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b20(e40 e40Var, LaunchActivity launchActivity, m30 m30Var, x10 x10Var, ArrayList arrayList, org.telegram.messenger.r3 r3Var, e40 e40Var2) {
        super(launchActivity, m30Var, x10Var, arrayList, r3Var, e40Var2);
        this.Q0 = e40Var;
    }

    @Override // org.telegram.ui.Components.voip.k0, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.Q0.Q4) {
            return true;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override // org.telegram.ui.Components.voip.k0
    public final void i(boolean z9) {
        e40 e40Var = this.Q0;
        c40 c40Var = e40Var.s3;
        b30 b30Var = e40Var.F1;
        m30 m30Var = e40Var.H1;
        org.telegram.ui.Components.i10 i10Var = e40Var.g4;
        b20 b20Var = e40Var.R3;
        x10 x10Var = e40Var.d4;
        e40Var.j2 = z9;
        if (e40.x5) {
            if (z9 || !b20Var.b) {
                return;
            }
            e40Var.f4.H(e40Var.e4, false, true);
            return;
        }
        if (z9) {
            e40Var.a2[0].d(1, false);
            b20Var.K0[0].d(2, false);
            if (!b20Var.b) {
                m30Var.setVisibility(0);
                b30Var.setVisibility(0);
                if (c40Var != null) {
                    c40Var.setVisibility(0);
                }
            }
            e40Var.T1(true, false);
            e40Var.l1.requestLayout();
            if (x10Var.getVisibility() != 0) {
                x10Var.setVisibility(0);
                i10Var.F(x10Var, true);
                i10Var.G(x10Var, false);
            } else {
                i10Var.F(x10Var, true);
                e40Var.Q0(true);
            }
        } else {
            if (b20Var.b) {
                b30Var.setVisibility(8);
                m30Var.setVisibility(8);
                if (c40Var != null) {
                    c40Var.setVisibility(8);
                }
            } else {
                x10Var.setVisibility(8);
                i10Var.F(x10Var, false);
            }
            if (x10Var.getVisibility() == 0) {
                for (int i7 = 0; i7 < x10Var.getChildCount(); i7++) {
                    View childAt = x10Var.getChildAt(i7);
                    childAt.setAlpha(1.0f);
                    childAt.setScaleX(1.0f);
                    childAt.setScaleY(1.0f);
                    childAt.setTranslationX(0.0f);
                    childAt.setTranslationY(0.0f);
                    ((org.telegram.ui.Components.h10) childAt).setProgressToFullscreen(b20Var.c);
                }
            }
        }
        e40Var.B4.setVisibility(z9 ? 0 : 8);
        if (e40Var.j2) {
            return;
        }
        e40Var.Q0(true);
    }

    @Override // org.telegram.ui.Components.voip.k0
    public final void l() {
        invalidate();
        e40 e40Var = this.Q0;
        float f10 = e40Var.L3;
        b20 b20Var = e40Var.R3;
        e40Var.G0 = org.telegram.messenger.g0.S0(Math.max(f10, b20Var == null ? 0.0f : b20Var.c), 1.0f, org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.Xg, false), org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.Ug, false));
        e40Var.b.invalidate();
        e40Var.G1(e40Var.L3);
    }
}
