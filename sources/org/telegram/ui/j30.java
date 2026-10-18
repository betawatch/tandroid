package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class j30 extends org.telegram.ui.Components.voip.l0 {
    public final /* synthetic */ s50 Q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j30(s50 s50Var, LaunchActivity launchActivity, y40 y40Var, f30 f30Var, ArrayList arrayList, ChatObject.Call call, s50 s50Var2) {
        super(launchActivity, y40Var, f30Var, arrayList, call, s50Var2);
        this.Q0 = s50Var;
    }

    @Override // org.telegram.ui.Components.voip.l0, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.Q0.Z2) {
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override // org.telegram.ui.Components.voip.l0
    public final void i(boolean z10) {
        s50 s50Var = this.Q0;
        q50 q50Var = s50Var.B1;
        o40 o40Var = s50Var.O;
        y40 y40Var = s50Var.Q;
        org.telegram.ui.Components.a30 a30Var = s50Var.p2;
        j30 j30Var = s50Var.a2;
        f30 f30Var = s50Var.m2;
        s50Var.s0 = z10;
        if (s50.G3) {
            if (z10 || !j30Var.b) {
                return;
            }
            s50Var.o2.H(s50Var.n2, false, true);
            return;
        }
        if (z10) {
            s50Var.j0[0].e(1, false);
            j30Var.K0[0].e(2, false);
            if (!j30Var.b) {
                y40Var.setVisibility(0);
                o40Var.setVisibility(0);
                if (q50Var != null) {
                    q50Var.setVisibility(0);
                }
            }
            s50Var.O1(true, false);
            s50Var.e.requestLayout();
            if (f30Var.getVisibility() != 0) {
                f30Var.setVisibility(0);
                a30Var.F(f30Var, true);
                a30Var.G(f30Var, false);
            } else {
                a30Var.F(f30Var, true);
                s50Var.P0(true);
            }
        } else {
            if (j30Var.b) {
                o40Var.setVisibility(8);
                y40Var.setVisibility(8);
                if (q50Var != null) {
                    q50Var.setVisibility(8);
                }
            } else {
                f30Var.setVisibility(8);
                a30Var.F(f30Var, false);
            }
            if (f30Var.getVisibility() == 0) {
                for (int i10 = 0; i10 < f30Var.getChildCount(); i10++) {
                    View childAt = f30Var.getChildAt(i10);
                    childAt.setAlpha(1.0f);
                    childAt.setScaleX(1.0f);
                    childAt.setScaleY(1.0f);
                    childAt.setTranslationX(0.0f);
                    childAt.setTranslationY(0.0f);
                    ((org.telegram.ui.Components.z20) childAt).setProgressToFullscreen(j30Var.c);
                }
            }
        }
        s50Var.K2.setVisibility(z10 ? 0 : 8);
        if (s50Var.s0) {
            return;
        }
        s50Var.P0(true);
    }

    @Override // org.telegram.ui.Components.voip.l0
    public final void l() {
        ViewGroup viewGroup;
        invalidate();
        s50 s50Var = this.Q0;
        float f7 = s50Var.U1;
        j30 j30Var = s50Var.a2;
        ((org.telegram.ui.ActionBar.f3) s50Var).navBarColor = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.jg, false), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.gg, false), Math.max(f7, j30Var == null ? 0.0f : j30Var.c), 1.0f);
        viewGroup = ((org.telegram.ui.ActionBar.f3) s50Var).containerView;
        viewGroup.invalidate();
        s50Var.C1(s50Var.U1);
    }
}
