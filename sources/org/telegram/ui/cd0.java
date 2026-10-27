package org.telegram.ui;

import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class cd0 implements o1.g {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ cd0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // o1.g
    public final void a(o1.h hVar, float f7, float f10) {
        int i10 = this.a;
        Object obj = this.b;
        switch (i10) {
            case 0:
                vf0 vf0Var = ((ig0) obj).b0;
                if (vf0Var != null) {
                    int i11 = vf0.F;
                    View view = vf0Var.c;
                    ViewGroup viewGroup = vf0Var.b;
                    PointF pointF = vf0Var.y;
                    jh.k.b(view, viewGroup, pointF);
                    org.telegram.ui.Components.j20 j20Var = vf0Var.h;
                    j20Var.setTranslationX(pointF.x);
                    j20Var.setTranslationY(pointF.y);
                    vf0Var.requestLayout();
                    break;
                }
                break;
            case 1:
                no0 no0Var = (no0) obj;
                float f11 = f7 / 100.0f;
                no0Var.b = f11;
                TextView textView = no0Var.d.U;
                if (textView != null) {
                    textView.setAlpha((f11 * 0.2f) + 0.8f);
                }
                no0Var.invalidate();
                break;
            case 2:
                du0 du0Var = (du0) obj;
                du0Var.c0 = f7;
                du0Var.e0 = f10;
                du0Var.G();
                break;
            case 3:
                zu0 zu0Var = (zu0) obj;
                int dp = zu0Var.e > zu0Var.f ? AndroidUtilities.dp(48.0f) : 0;
                org.telegram.ui.Components.v81 v81Var = zu0Var.s.q3;
                int measuredHeight = zu0Var.getMeasuredHeight();
                v81Var.h = (int) (((zu0Var.getMeasuredWidth() - AndroidUtilities.dp(16.0f)) - f7) - dp);
                v81Var.i = measuredHeight;
                View view2 = v81Var.v;
                if (view2 != null) {
                    view2.invalidate();
                    break;
                }
                break;
            case 4:
                g31 g31Var = (g31) obj;
                g31Var.y = f7 / 1000.0f;
                g31Var.invalidate();
                break;
            default:
                z31 z31Var = (z31) obj;
                org.telegram.ui.Components.v81 v81Var2 = z31Var.r.Q;
                int measuredHeight2 = z31Var.getMeasuredHeight();
                v81Var2.h = (int) (((z31Var.getMeasuredWidth() - AndroidUtilities.dp(16.0f)) - f7) - 0);
                v81Var2.i = measuredHeight2;
                View view3 = v81Var2.v;
                if (view3 != null) {
                    view3.invalidate();
                    break;
                }
                break;
        }
    }
}
