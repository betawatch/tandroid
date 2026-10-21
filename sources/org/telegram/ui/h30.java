package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class h30 extends org.telegram.ui.Components.voip.l0 {
    public final /* synthetic */ q50 Q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h30(q50 q50Var, LaunchActivity launchActivity, w40 w40Var, d30 d30Var, ArrayList arrayList, ChatObject.Call call, q50 q50Var2) {
        super(launchActivity, w40Var, d30Var, arrayList, call, q50Var2);
        this.Q0 = q50Var;
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
        q50 q50Var = this.Q0;
        o50 o50Var = q50Var.B1;
        m40 m40Var = q50Var.O;
        w40 w40Var = q50Var.Q;
        org.telegram.ui.Components.a30 a30Var = q50Var.p2;
        h30 h30Var = q50Var.a2;
        d30 d30Var = q50Var.m2;
        q50Var.s0 = z10;
        if (q50.G3) {
            if (z10 || !h30Var.b) {
                return;
            }
            q50Var.o2.H(q50Var.n2, false, true);
            return;
        }
        if (z10) {
            q50Var.j0[0].e(1, false);
            h30Var.K0[0].e(2, false);
            if (!h30Var.b) {
                w40Var.setVisibility(0);
                m40Var.setVisibility(0);
                if (o50Var != null) {
                    o50Var.setVisibility(0);
                }
            }
            q50Var.O1(true, false);
            q50Var.e.requestLayout();
            if (d30Var.getVisibility() != 0) {
                d30Var.setVisibility(0);
                a30Var.F(d30Var, true);
                a30Var.G(d30Var, false);
            } else {
                a30Var.F(d30Var, true);
                q50Var.P0(true);
            }
        } else {
            if (h30Var.b) {
                m40Var.setVisibility(8);
                w40Var.setVisibility(8);
                if (o50Var != null) {
                    o50Var.setVisibility(8);
                }
            } else {
                d30Var.setVisibility(8);
                a30Var.F(d30Var, false);
            }
            if (d30Var.getVisibility() == 0) {
                for (int i10 = 0; i10 < d30Var.getChildCount(); i10++) {
                    View childAt = d30Var.getChildAt(i10);
                    childAt.setAlpha(1.0f);
                    childAt.setScaleX(1.0f);
                    childAt.setScaleY(1.0f);
                    childAt.setTranslationX(0.0f);
                    childAt.setTranslationY(0.0f);
                    ((org.telegram.ui.Components.z20) childAt).setProgressToFullscreen(h30Var.c);
                }
            }
        }
        q50Var.K2.setVisibility(z10 ? 0 : 8);
        if (q50Var.s0) {
            return;
        }
        q50Var.P0(true);
    }

    @Override // org.telegram.ui.Components.voip.l0
    public final void l() {
        ViewGroup viewGroup;
        invalidate();
        q50 q50Var = this.Q0;
        float f7 = q50Var.U1;
        h30 h30Var = q50Var.a2;
        ((org.telegram.ui.ActionBar.f3) q50Var).navBarColor = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.jg, false), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.gg, false), Math.max(f7, h30Var == null ? 0.0f : h30Var.c), 1.0f);
        viewGroup = ((org.telegram.ui.ActionBar.f3) q50Var).containerView;
        viewGroup.invalidate();
        q50Var.C1(q50Var.U1);
    }
}
