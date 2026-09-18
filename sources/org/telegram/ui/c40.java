package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class c40 extends org.telegram.ui.Components.voip.m0 {
    public final /* synthetic */ k60 Q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c40(k60 k60Var, LaunchActivity launchActivity, q50 q50Var, y30 y30Var, ArrayList arrayList, ChatObject.Call call, k60 k60Var2) {
        super(launchActivity, q50Var, y30Var, arrayList, call, k60Var2);
        this.Q0 = k60Var;
    }

    @Override // org.telegram.ui.Components.voip.m0, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.Q0.Z2) {
            return true;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override // org.telegram.ui.Components.voip.m0
    public final void i(boolean z10) {
        k60 k60Var = this.Q0;
        i60 i60Var = k60Var.B1;
        g50 g50Var = k60Var.O;
        q50 q50Var = k60Var.Q;
        org.telegram.ui.Components.s20 s20Var = k60Var.p2;
        c40 c40Var = k60Var.a2;
        y30 y30Var = k60Var.m2;
        k60Var.s0 = z10;
        if (k60.G3) {
            if (z10 || !c40Var.b) {
                return;
            }
            k60Var.o2.H(k60Var.n2, false, true);
            return;
        }
        if (z10) {
            k60Var.j0[0].e(1, false);
            c40Var.K0[0].e(2, false);
            if (!c40Var.b) {
                q50Var.setVisibility(0);
                g50Var.setVisibility(0);
                if (i60Var != null) {
                    i60Var.setVisibility(0);
                }
            }
            k60Var.N1(true, false);
            k60Var.e.requestLayout();
            if (y30Var.getVisibility() != 0) {
                y30Var.setVisibility(0);
                s20Var.F(y30Var, true);
                s20Var.G(y30Var, false);
            } else {
                s20Var.F(y30Var, true);
                k60Var.O0(true);
            }
        } else {
            if (c40Var.b) {
                g50Var.setVisibility(8);
                q50Var.setVisibility(8);
                if (i60Var != null) {
                    i60Var.setVisibility(8);
                }
            } else {
                y30Var.setVisibility(8);
                s20Var.F(y30Var, false);
            }
            if (y30Var.getVisibility() == 0) {
                for (int i10 = 0; i10 < y30Var.getChildCount(); i10++) {
                    View childAt = y30Var.getChildAt(i10);
                    childAt.setAlpha(1.0f);
                    childAt.setScaleX(1.0f);
                    childAt.setScaleY(1.0f);
                    childAt.setTranslationX(0.0f);
                    childAt.setTranslationY(0.0f);
                    ((org.telegram.ui.Components.r20) childAt).setProgressToFullscreen(c40Var.c);
                }
            }
        }
        k60Var.K2.setVisibility(z10 ? 0 : 8);
        if (k60Var.s0) {
            return;
        }
        k60Var.O0(true);
    }

    @Override // org.telegram.ui.Components.voip.m0
    public final void l() {
        ViewGroup viewGroup;
        invalidate();
        k60 k60Var = this.Q0;
        float f7 = k60Var.U1;
        c40 c40Var = k60Var.a2;
        ((org.telegram.ui.ActionBar.g3) k60Var).navBarColor = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.jg, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.gg, false), Math.max(f7, c40Var == null ? 0.0f : c40Var.c), 1.0f);
        viewGroup = ((org.telegram.ui.ActionBar.g3) k60Var).containerView;
        viewGroup.invalidate();
        k60Var.B1(k60Var.U1);
    }
}
