package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class a40 extends org.telegram.ui.Components.voip.m0 {
    public final /* synthetic */ i60 Q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a40(i60 i60Var, LaunchActivity launchActivity, o50 o50Var, w30 w30Var, ArrayList arrayList, ChatObject.Call call, i60 i60Var2) {
        super(launchActivity, o50Var, w30Var, arrayList, call, i60Var2);
        this.Q0 = i60Var;
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
        i60 i60Var = this.Q0;
        g60 g60Var = i60Var.B1;
        e50 e50Var = i60Var.O;
        o50 o50Var = i60Var.Q;
        org.telegram.ui.Components.s20 s20Var = i60Var.p2;
        a40 a40Var = i60Var.a2;
        w30 w30Var = i60Var.m2;
        i60Var.s0 = z10;
        if (i60.G3) {
            if (z10 || !a40Var.b) {
                return;
            }
            i60Var.o2.H(i60Var.n2, false, true);
            return;
        }
        if (z10) {
            i60Var.j0[0].e(1, false);
            a40Var.K0[0].e(2, false);
            if (!a40Var.b) {
                o50Var.setVisibility(0);
                e50Var.setVisibility(0);
                if (g60Var != null) {
                    g60Var.setVisibility(0);
                }
            }
            i60Var.N1(true, false);
            i60Var.e.requestLayout();
            if (w30Var.getVisibility() != 0) {
                w30Var.setVisibility(0);
                s20Var.F(w30Var, true);
                s20Var.G(w30Var, false);
            } else {
                s20Var.F(w30Var, true);
                i60Var.O0(true);
            }
        } else {
            if (a40Var.b) {
                e50Var.setVisibility(8);
                o50Var.setVisibility(8);
                if (g60Var != null) {
                    g60Var.setVisibility(8);
                }
            } else {
                w30Var.setVisibility(8);
                s20Var.F(w30Var, false);
            }
            if (w30Var.getVisibility() == 0) {
                for (int i10 = 0; i10 < w30Var.getChildCount(); i10++) {
                    View childAt = w30Var.getChildAt(i10);
                    childAt.setAlpha(1.0f);
                    childAt.setScaleX(1.0f);
                    childAt.setScaleY(1.0f);
                    childAt.setTranslationX(0.0f);
                    childAt.setTranslationY(0.0f);
                    ((org.telegram.ui.Components.r20) childAt).setProgressToFullscreen(a40Var.c);
                }
            }
        }
        i60Var.K2.setVisibility(z10 ? 0 : 8);
        if (i60Var.s0) {
            return;
        }
        i60Var.O0(true);
    }

    @Override // org.telegram.ui.Components.voip.m0
    public final void l() {
        ViewGroup viewGroup;
        invalidate();
        i60 i60Var = this.Q0;
        float f7 = i60Var.U1;
        a40 a40Var = i60Var.a2;
        ((org.telegram.ui.ActionBar.f3) i60Var).navBarColor = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.jg, false), org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.gg, false), Math.max(f7, a40Var == null ? 0.0f : a40Var.c), 1.0f);
        viewGroup = ((org.telegram.ui.ActionBar.f3) i60Var).containerView;
        viewGroup.invalidate();
        i60Var.B1(i60Var.U1);
    }
}
