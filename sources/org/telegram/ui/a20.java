package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class a20 extends org.telegram.ui.Components.voip.l0 {
    public final /* synthetic */ e40 R0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a20(e40 e40Var, LaunchActivity launchActivity, m30 m30Var, w10 w10Var, ArrayList arrayList, org.telegram.messenger.t3 t3Var, e40 e40Var2) {
        super(launchActivity, m30Var, w10Var, arrayList, t3Var, e40Var2);
        this.R0 = e40Var;
    }

    @Override // org.telegram.ui.Components.voip.l0, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.R0.Y4) {
            return true;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override // org.telegram.ui.Components.voip.l0
    public final void i(boolean z10) {
        e40 e40Var = this.R0;
        c40 c40Var = e40Var.A3;
        c30 c30Var = e40Var.J1;
        m30 m30Var = e40Var.L1;
        org.telegram.ui.Components.t10 t10Var = e40Var.o4;
        a20 a20Var = e40Var.Z3;
        w10 w10Var = e40Var.l4;
        e40Var.n2 = z10;
        if (e40.F5) {
            if (z10 || !a20Var.b) {
                return;
            }
            e40Var.n4.H(e40Var.m4, false, true);
            return;
        }
        if (z10) {
            e40Var.e2[0].d(1, false);
            a20Var.L0[0].d(2, false);
            if (!a20Var.b) {
                m30Var.setVisibility(0);
                c30Var.setVisibility(0);
                if (c40Var != null) {
                    c40Var.setVisibility(0);
                }
            }
            e40Var.V1(true, false);
            e40Var.p1.requestLayout();
            if (w10Var.getVisibility() != 0) {
                w10Var.setVisibility(0);
                t10Var.F(w10Var, true);
                t10Var.G(w10Var, false);
            } else {
                t10Var.F(w10Var, true);
                e40Var.R0(true);
            }
        } else {
            if (a20Var.b) {
                c30Var.setVisibility(8);
                m30Var.setVisibility(8);
                if (c40Var != null) {
                    c40Var.setVisibility(8);
                }
            } else {
                w10Var.setVisibility(8);
                t10Var.F(w10Var, false);
            }
            if (w10Var.getVisibility() == 0) {
                for (int i7 = 0; i7 < w10Var.getChildCount(); i7++) {
                    View childAt = w10Var.getChildAt(i7);
                    childAt.setAlpha(1.0f);
                    childAt.setScaleX(1.0f);
                    childAt.setScaleY(1.0f);
                    childAt.setTranslationX(0.0f);
                    childAt.setTranslationY(0.0f);
                    ((org.telegram.ui.Components.s10) childAt).setProgressToFullscreen(a20Var.c);
                }
            }
        }
        e40Var.J4.setVisibility(z10 ? 0 : 8);
        if (e40Var.n2) {
            return;
        }
        e40Var.R0(true);
    }

    @Override // org.telegram.ui.Components.voip.l0
    public final void l() {
        invalidate();
        e40 e40Var = this.R0;
        float f10 = e40Var.T3;
        a20 a20Var = e40Var.Z3;
        e40Var.H0 = org.telegram.messenger.g0.S0(Math.max(f10, a20Var == null ? 0.0f : a20Var.c), 1.0f, org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.ah, false), org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Xg, false));
        e40Var.b.invalidate();
        e40Var.H1(e40Var.T3);
    }
}
