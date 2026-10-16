package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class e40 extends org.telegram.ui.Components.voip.l0 {
    public final /* synthetic */ n60 Q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e40(n60 n60Var, LaunchActivity launchActivity, t50 t50Var, a40 a40Var, ArrayList arrayList, ChatObject.Call call, n60 n60Var2) {
        super(launchActivity, t50Var, a40Var, arrayList, call, n60Var2);
        this.Q0 = n60Var;
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
        n60 n60Var = this.Q0;
        l60 l60Var = n60Var.B1;
        j50 j50Var = n60Var.O;
        t50 t50Var = n60Var.Q;
        org.telegram.ui.Components.f30 f30Var = n60Var.p2;
        e40 e40Var = n60Var.a2;
        a40 a40Var = n60Var.m2;
        n60Var.s0 = z10;
        if (n60.G3) {
            if (z10 || !e40Var.b) {
                return;
            }
            n60Var.o2.H(n60Var.n2, false, true);
            return;
        }
        if (z10) {
            n60Var.j0[0].e(1, false);
            e40Var.K0[0].e(2, false);
            if (!e40Var.b) {
                t50Var.setVisibility(0);
                j50Var.setVisibility(0);
                if (l60Var != null) {
                    l60Var.setVisibility(0);
                }
            }
            n60Var.O1(true, false);
            n60Var.e.requestLayout();
            if (a40Var.getVisibility() != 0) {
                a40Var.setVisibility(0);
                f30Var.F(a40Var, true);
                f30Var.G(a40Var, false);
            } else {
                f30Var.F(a40Var, true);
                n60Var.P0(true);
            }
        } else {
            if (e40Var.b) {
                j50Var.setVisibility(8);
                t50Var.setVisibility(8);
                if (l60Var != null) {
                    l60Var.setVisibility(8);
                }
            } else {
                a40Var.setVisibility(8);
                f30Var.F(a40Var, false);
            }
            if (a40Var.getVisibility() == 0) {
                for (int i10 = 0; i10 < a40Var.getChildCount(); i10++) {
                    View childAt = a40Var.getChildAt(i10);
                    childAt.setAlpha(1.0f);
                    childAt.setScaleX(1.0f);
                    childAt.setScaleY(1.0f);
                    childAt.setTranslationX(0.0f);
                    childAt.setTranslationY(0.0f);
                    ((org.telegram.ui.Components.e30) childAt).setProgressToFullscreen(e40Var.c);
                }
            }
        }
        n60Var.K2.setVisibility(z10 ? 0 : 8);
        if (n60Var.s0) {
            return;
        }
        n60Var.P0(true);
    }

    @Override // org.telegram.ui.Components.voip.l0
    public final void l() {
        ViewGroup viewGroup;
        invalidate();
        n60 n60Var = this.Q0;
        float f7 = n60Var.U1;
        e40 e40Var = n60Var.a2;
        ((org.telegram.ui.ActionBar.e3) n60Var).navBarColor = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.jg, false), org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.gg, false), Math.max(f7, e40Var == null ? 0.0f : e40Var.c), 1.0f);
        viewGroup = ((org.telegram.ui.ActionBar.e3) n60Var).containerView;
        viewGroup.invalidate();
        n60Var.C1(n60Var.U1);
    }
}
