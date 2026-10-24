package org.telegram.ui;

import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final /* synthetic */ class dd0 implements o1.g {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ dd0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // o1.g
    public final void a(o1.h hVar, float f7, float f10) {
        int i10 = this.a;
        Object obj = this.b;
        switch (i10) {
            case 0:
                wf0 wf0Var = ((ig0) obj).b0;
                if (wf0Var != null) {
                    int i11 = wf0.F;
                    View view = wf0Var.c;
                    ViewGroup viewGroup = wf0Var.b;
                    PointF pointF = wf0Var.y;
                    ih.k.b(view, viewGroup, pointF);
                    org.telegram.ui.Components.h20 h20Var = wf0Var.h;
                    h20Var.setTranslationX(pointF.x);
                    h20Var.setTranslationY(pointF.y);
                    wf0Var.requestLayout();
                    break;
                }
                break;
            case 1:
                eo0 eo0Var = (eo0) obj;
                float f11 = f7 / 100.0f;
                eo0Var.b = f11;
                TextView textView = eo0Var.d.U;
                if (textView != null) {
                    textView.setAlpha((f11 * 0.2f) + 0.8f);
                }
                eo0Var.invalidate();
                break;
            case 2:
                xt0 xt0Var = (xt0) obj;
                xt0Var.c0 = f7;
                xt0Var.e0 = f10;
                xt0Var.G();
                break;
            case 3:
                tu0 tu0Var = (tu0) obj;
                int dp = tu0Var.e > tu0Var.f ? AndroidUtilities.dp(48.0f) : 0;
                org.telegram.ui.Components.l81 l81Var = tu0Var.s.q3;
                int measuredHeight = tu0Var.getMeasuredHeight();
                l81Var.h = (int) (((tu0Var.getMeasuredWidth() - AndroidUtilities.dp(16.0f)) - f7) - dp);
                l81Var.i = measuredHeight;
                View view2 = l81Var.v;
                if (view2 != null) {
                    view2.invalidate();
                    break;
                }
                break;
            case 4:
                b31 b31Var = (b31) obj;
                b31Var.y = f7 / 1000.0f;
                b31Var.invalidate();
                break;
            default:
                v31 v31Var = (v31) obj;
                org.telegram.ui.Components.l81 l81Var2 = v31Var.r.Q;
                int measuredHeight2 = v31Var.getMeasuredHeight();
                l81Var2.h = (int) (((v31Var.getMeasuredWidth() - AndroidUtilities.dp(16.0f)) - f7) - 0);
                l81Var2.i = measuredHeight2;
                View view3 = l81Var2.v;
                if (view3 != null) {
                    view3.invalidate();
                    break;
                }
                break;
        }
    }
}
