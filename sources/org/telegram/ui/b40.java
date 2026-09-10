package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class b40 extends org.telegram.ui.Components.voip.m0 {
    public final /* synthetic */ j60 Q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b40(j60 j60Var, LaunchActivity launchActivity, p50 p50Var, x30 x30Var, ArrayList arrayList, ChatObject.Call call, j60 j60Var2) {
        super(launchActivity, p50Var, x30Var, arrayList, call, j60Var2);
        this.Q0 = j60Var;
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
        j60 j60Var = this.Q0;
        h60 h60Var = j60Var.B1;
        f50 f50Var = j60Var.O;
        p50 p50Var = j60Var.Q;
        org.telegram.ui.Components.b30 b30Var = j60Var.p2;
        b40 b40Var = j60Var.a2;
        x30 x30Var = j60Var.m2;
        j60Var.s0 = z10;
        if (j60.G3) {
            if (z10 || !b40Var.b) {
                return;
            }
            j60Var.o2.H(j60Var.n2, false, true);
            return;
        }
        if (z10) {
            j60Var.j0[0].e(1, false);
            b40Var.K0[0].e(2, false);
            if (!b40Var.b) {
                p50Var.setVisibility(0);
                f50Var.setVisibility(0);
                if (h60Var != null) {
                    h60Var.setVisibility(0);
                }
            }
            j60Var.N1(true, false);
            j60Var.e.requestLayout();
            if (x30Var.getVisibility() != 0) {
                x30Var.setVisibility(0);
                b30Var.F(x30Var, true);
                b30Var.G(x30Var, false);
            } else {
                b30Var.F(x30Var, true);
                j60Var.O0(true);
            }
        } else {
            if (b40Var.b) {
                f50Var.setVisibility(8);
                p50Var.setVisibility(8);
                if (h60Var != null) {
                    h60Var.setVisibility(8);
                }
            } else {
                x30Var.setVisibility(8);
                b30Var.F(x30Var, false);
            }
            if (x30Var.getVisibility() == 0) {
                for (int i10 = 0; i10 < x30Var.getChildCount(); i10++) {
                    View childAt = x30Var.getChildAt(i10);
                    childAt.setAlpha(1.0f);
                    childAt.setScaleX(1.0f);
                    childAt.setScaleY(1.0f);
                    childAt.setTranslationX(0.0f);
                    childAt.setTranslationY(0.0f);
                    ((org.telegram.ui.Components.a30) childAt).setProgressToFullscreen(b40Var.c);
                }
            }
        }
        j60Var.K2.setVisibility(z10 ? 0 : 8);
        if (j60Var.s0) {
            return;
        }
        j60Var.O0(true);
    }

    @Override // org.telegram.ui.Components.voip.m0
    public final void l() {
        ViewGroup viewGroup;
        invalidate();
        j60 j60Var = this.Q0;
        float f7 = j60Var.U1;
        b40 b40Var = j60Var.a2;
        ((org.telegram.ui.ActionBar.h3) j60Var).navBarColor = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.jg, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.gg, false), Math.max(f7, b40Var == null ? 0.0f : b40Var.c), 1.0f);
        viewGroup = ((org.telegram.ui.ActionBar.h3) j60Var).containerView;
        viewGroup.invalidate();
        j60Var.B1(j60Var.U1);
    }
}
