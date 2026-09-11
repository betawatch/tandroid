package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class a40 extends org.telegram.ui.Components.voip.l0 {
    public final /* synthetic */ j60 Q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a40(j60 j60Var, LaunchActivity launchActivity, p50 p50Var, w30 w30Var, ArrayList arrayList, ChatObject.Call call, j60 j60Var2) {
        super(launchActivity, p50Var, w30Var, arrayList, call, j60Var2);
        this.Q0 = j60Var;
    }

    @Override // org.telegram.ui.Components.voip.l0, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.Q0.Z2) {
            return true;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override // org.telegram.ui.Components.voip.l0
    public final void i(boolean z10) {
        j60 j60Var = this.Q0;
        h60 h60Var = j60Var.B1;
        f50 f50Var = j60Var.O;
        p50 p50Var = j60Var.Q;
        org.telegram.ui.Components.s20 s20Var = j60Var.p2;
        a40 a40Var = j60Var.a2;
        w30 w30Var = j60Var.m2;
        j60Var.s0 = z10;
        if (j60.G3) {
            if (z10 || !a40Var.b) {
                return;
            }
            j60Var.o2.H(j60Var.n2, false, true);
            return;
        }
        if (z10) {
            j60Var.j0[0].e(1, false);
            a40Var.K0[0].e(2, false);
            if (!a40Var.b) {
                p50Var.setVisibility(0);
                f50Var.setVisibility(0);
                if (h60Var != null) {
                    h60Var.setVisibility(0);
                }
            }
            j60Var.N1(true, false);
            j60Var.e.requestLayout();
            if (w30Var.getVisibility() != 0) {
                w30Var.setVisibility(0);
                s20Var.F(w30Var, true);
                s20Var.G(w30Var, false);
            } else {
                s20Var.F(w30Var, true);
                j60Var.O0(true);
            }
        } else {
            if (a40Var.b) {
                f50Var.setVisibility(8);
                p50Var.setVisibility(8);
                if (h60Var != null) {
                    h60Var.setVisibility(8);
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
        j60Var.K2.setVisibility(z10 ? 0 : 8);
        if (j60Var.s0) {
            return;
        }
        j60Var.O0(true);
    }

    @Override // org.telegram.ui.Components.voip.l0
    public final void l() {
        ViewGroup viewGroup;
        invalidate();
        j60 j60Var = this.Q0;
        float f7 = j60Var.U1;
        a40 a40Var = j60Var.a2;
        ((org.telegram.ui.ActionBar.f3) j60Var).navBarColor = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.jg, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.gg, false), Math.max(f7, a40Var == null ? 0.0f : a40Var.c), 1.0f);
        viewGroup = ((org.telegram.ui.ActionBar.f3) j60Var).containerView;
        viewGroup.invalidate();
        j60Var.B1(j60Var.U1);
    }
}
