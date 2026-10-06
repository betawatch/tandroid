package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class a40 extends org.telegram.ui.Components.voip.m0 {
    public final /* synthetic */ h60 Q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a40(h60 h60Var, LaunchActivity launchActivity, o50 o50Var, w30 w30Var, ArrayList arrayList, ChatObject.Call call, h60 h60Var2) {
        super(launchActivity, o50Var, w30Var, arrayList, call, h60Var2);
        this.Q0 = h60Var;
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
        h60 h60Var = this.Q0;
        f60 f60Var = h60Var.B1;
        e50 e50Var = h60Var.O;
        o50 o50Var = h60Var.Q;
        org.telegram.ui.Components.w20 w20Var = h60Var.p2;
        a40 a40Var = h60Var.a2;
        w30 w30Var = h60Var.m2;
        h60Var.s0 = z10;
        if (h60.G3) {
            if (z10 || !a40Var.b) {
                return;
            }
            h60Var.o2.H(h60Var.n2, false, true);
            return;
        }
        if (z10) {
            h60Var.j0[0].e(1, false);
            a40Var.K0[0].e(2, false);
            if (!a40Var.b) {
                o50Var.setVisibility(0);
                e50Var.setVisibility(0);
                if (f60Var != null) {
                    f60Var.setVisibility(0);
                }
            }
            h60Var.N1(true, false);
            h60Var.e.requestLayout();
            if (w30Var.getVisibility() != 0) {
                w30Var.setVisibility(0);
                w20Var.F(w30Var, true);
                w20Var.G(w30Var, false);
            } else {
                w20Var.F(w30Var, true);
                h60Var.O0(true);
            }
        } else {
            if (a40Var.b) {
                e50Var.setVisibility(8);
                o50Var.setVisibility(8);
                if (f60Var != null) {
                    f60Var.setVisibility(8);
                }
            } else {
                w30Var.setVisibility(8);
                w20Var.F(w30Var, false);
            }
            if (w30Var.getVisibility() == 0) {
                for (int i10 = 0; i10 < w30Var.getChildCount(); i10++) {
                    View childAt = w30Var.getChildAt(i10);
                    childAt.setAlpha(1.0f);
                    childAt.setScaleX(1.0f);
                    childAt.setScaleY(1.0f);
                    childAt.setTranslationX(0.0f);
                    childAt.setTranslationY(0.0f);
                    ((org.telegram.ui.Components.v20) childAt).setProgressToFullscreen(a40Var.c);
                }
            }
        }
        h60Var.K2.setVisibility(z10 ? 0 : 8);
        if (h60Var.s0) {
            return;
        }
        h60Var.O0(true);
    }

    @Override // org.telegram.ui.Components.voip.m0
    public final void l() {
        ViewGroup viewGroup;
        invalidate();
        h60 h60Var = this.Q0;
        float f7 = h60Var.U1;
        a40 a40Var = h60Var.a2;
        ((org.telegram.ui.ActionBar.f3) h60Var).navBarColor = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.jg, false), org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.gg, false), Math.max(f7, a40Var == null ? 0.0f : a40Var.c), 1.0f);
        viewGroup = ((org.telegram.ui.ActionBar.f3) h60Var).containerView;
        viewGroup.invalidate();
        h60Var.B1(h60Var.U1);
    }
}
