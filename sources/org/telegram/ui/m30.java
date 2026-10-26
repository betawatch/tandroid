package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class m30 extends org.telegram.ui.Components.voip.l0 {
    public final /* synthetic */ v50 Q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m30(v50 v50Var, LaunchActivity launchActivity, b50 b50Var, i30 i30Var, ArrayList arrayList, ChatObject.Call call, v50 v50Var2) {
        super(launchActivity, b50Var, i30Var, arrayList, call, v50Var2);
        this.Q0 = v50Var;
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
        v50 v50Var = this.Q0;
        t50 t50Var = v50Var.B1;
        r40 r40Var = v50Var.O;
        b50 b50Var = v50Var.Q;
        org.telegram.ui.Components.c30 c30Var = v50Var.p2;
        m30 m30Var = v50Var.a2;
        i30 i30Var = v50Var.m2;
        v50Var.s0 = z10;
        if (v50.G3) {
            if (z10 || !m30Var.b) {
                return;
            }
            v50Var.o2.H(v50Var.n2, false, true);
            return;
        }
        if (z10) {
            v50Var.j0[0].d(1, false);
            m30Var.K0[0].d(2, false);
            if (!m30Var.b) {
                b50Var.setVisibility(0);
                r40Var.setVisibility(0);
                if (t50Var != null) {
                    t50Var.setVisibility(0);
                }
            }
            v50Var.O1(true, false);
            v50Var.e.requestLayout();
            if (i30Var.getVisibility() != 0) {
                i30Var.setVisibility(0);
                c30Var.F(i30Var, true);
                c30Var.G(i30Var, false);
            } else {
                c30Var.F(i30Var, true);
                v50Var.O0(true);
            }
        } else {
            if (m30Var.b) {
                r40Var.setVisibility(8);
                b50Var.setVisibility(8);
                if (t50Var != null) {
                    t50Var.setVisibility(8);
                }
            } else {
                i30Var.setVisibility(8);
                c30Var.F(i30Var, false);
            }
            if (i30Var.getVisibility() == 0) {
                for (int i10 = 0; i10 < i30Var.getChildCount(); i10++) {
                    View childAt = i30Var.getChildAt(i10);
                    childAt.setAlpha(1.0f);
                    childAt.setScaleX(1.0f);
                    childAt.setScaleY(1.0f);
                    childAt.setTranslationX(0.0f);
                    childAt.setTranslationY(0.0f);
                    ((org.telegram.ui.Components.b30) childAt).setProgressToFullscreen(m30Var.c);
                }
            }
        }
        v50Var.K2.setVisibility(z10 ? 0 : 8);
        if (v50Var.s0) {
            return;
        }
        v50Var.O0(true);
    }

    @Override // org.telegram.ui.Components.voip.l0
    public final void l() {
        ViewGroup viewGroup;
        invalidate();
        v50 v50Var = this.Q0;
        float f7 = v50Var.U1;
        m30 m30Var = v50Var.a2;
        ((org.telegram.ui.ActionBar.k3) v50Var).navBarColor = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.jg, false), org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.gg, false), Math.max(f7, m30Var == null ? 0.0f : m30Var.c), 1.0f);
        viewGroup = ((org.telegram.ui.ActionBar.k3) v50Var).containerView;
        viewGroup.invalidate();
        v50Var.B1(v50Var.U1);
    }
}
