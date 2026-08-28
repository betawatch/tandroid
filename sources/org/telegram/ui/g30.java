package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class g30 extends org.telegram.ui.Components.voip.k0 {
    public final /* synthetic */ o50 M0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g30(o50 o50Var, LaunchActivity launchActivity, u40 u40Var, c30 c30Var, ArrayList arrayList, ChatObject.Call call, o50 o50Var2) {
        super(launchActivity, u40Var, c30Var, arrayList, call, o50Var2);
        this.M0 = o50Var;
    }

    @Override // org.telegram.ui.Components.voip.k0, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.M0.V2) {
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override // org.telegram.ui.Components.voip.k0
    public final void i(boolean z10) {
        o50 o50Var = this.M0;
        m50 m50Var = o50Var.x1;
        k40 k40Var = o50Var.K;
        u40 u40Var = o50Var.M;
        org.telegram.ui.Components.c20 c20Var = o50Var.l2;
        g30 g30Var = o50Var.W1;
        c30 c30Var = o50Var.i2;
        o50Var.o0 = z10;
        if (o50.C3) {
            if (z10 || !g30Var.b) {
                return;
            }
            o50Var.k2.H(o50Var.j2, false, true);
            return;
        }
        if (z10) {
            o50Var.f0[0].e(1, false);
            g30Var.G0[0].e(2, false);
            if (!g30Var.b) {
                u40Var.setVisibility(0);
                k40Var.setVisibility(0);
                if (m50Var != null) {
                    m50Var.setVisibility(0);
                }
            }
            o50Var.N1(true, false);
            o50Var.e.requestLayout();
            if (c30Var.getVisibility() != 0) {
                c30Var.setVisibility(0);
                c20Var.F(c30Var, true);
                c20Var.G(c30Var, false);
            } else {
                c20Var.F(c30Var, true);
                o50Var.O0(true);
            }
        } else {
            if (g30Var.b) {
                k40Var.setVisibility(8);
                u40Var.setVisibility(8);
                if (m50Var != null) {
                    m50Var.setVisibility(8);
                }
            } else {
                c30Var.setVisibility(8);
                c20Var.F(c30Var, false);
            }
            if (c30Var.getVisibility() == 0) {
                for (int i9 = 0; i9 < c30Var.getChildCount(); i9++) {
                    View childAt = c30Var.getChildAt(i9);
                    childAt.setAlpha(1.0f);
                    childAt.setScaleX(1.0f);
                    childAt.setScaleY(1.0f);
                    childAt.setTranslationX(0.0f);
                    childAt.setTranslationY(0.0f);
                    ((org.telegram.ui.Components.b20) childAt).setProgressToFullscreen(g30Var.c);
                }
            }
        }
        o50Var.G2.setVisibility(z10 ? 0 : 8);
        if (o50Var.o0) {
            return;
        }
        o50Var.O0(true);
    }

    @Override // org.telegram.ui.Components.voip.k0
    public final void l() {
        ViewGroup viewGroup;
        invalidate();
        o50 o50Var = this.M0;
        float f10 = o50Var.Q1;
        g30 g30Var = o50Var.W1;
        ((org.telegram.ui.ActionBar.f3) o50Var).navBarColor = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.jg, false), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.gg, false), Math.max(f10, g30Var == null ? 0.0f : g30Var.c), 1.0f);
        viewGroup = ((org.telegram.ui.ActionBar.f3) o50Var).containerView;
        viewGroup.invalidate();
        o50Var.B1(o50Var.Q1);
    }
}
