package org.telegram.ui;

import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class md0 implements o1.g {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ md0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // o1.g
    public final void a(o1.h hVar, float f10, float f11) {
        int i10 = this.a;
        Object obj = this.b;
        switch (i10) {
            case 0:
                cg0 cg0Var = ((og0) obj).Y;
                if (cg0Var != null) {
                    int i11 = cg0.B;
                    View view = cg0Var.c;
                    ViewGroup viewGroup = cg0Var.b;
                    PointF pointF = cg0Var.y;
                    vg.i.b(view, viewGroup, pointF);
                    org.telegram.ui.Components.a20 a20Var = cg0Var.h;
                    a20Var.setTranslationX(pointF.x);
                    a20Var.setTranslationY(pointF.y);
                    cg0Var.requestLayout();
                    break;
                }
                break;
            case 1:
                ho0 ho0Var = (ho0) obj;
                float f12 = f10 / 100.0f;
                ho0Var.b = f12;
                TextView textView = ho0Var.d.R;
                if (textView != null) {
                    textView.setAlpha((f12 * 0.2f) + 0.8f);
                }
                ho0Var.invalidate();
                break;
            case 2:
                vt0 vt0Var = (vt0) obj;
                vt0Var.W = f10;
                vt0Var.b0 = f11;
                vt0Var.G();
                break;
            case 3:
                su0 su0Var = (su0) obj;
                int dp = su0Var.e > su0Var.f ? AndroidUtilities.dp(48.0f) : 0;
                org.telegram.ui.Components.m71 m71Var = su0Var.s.n3;
                int measuredHeight = su0Var.getMeasuredHeight();
                m71Var.h = (int) (((su0Var.getMeasuredWidth() - AndroidUtilities.dp(16.0f)) - f10) - dp);
                m71Var.i = measuredHeight;
                View view2 = m71Var.v;
                if (view2 != null) {
                    view2.invalidate();
                    break;
                }
                break;
            case 4:
                v31 v31Var = (v31) obj;
                v31Var.y = f10 / 1000.0f;
                v31Var.invalidate();
                break;
            default:
                l41 l41Var = (l41) obj;
                org.telegram.ui.Components.m71 m71Var2 = l41Var.r.N;
                int measuredHeight2 = l41Var.getMeasuredHeight();
                m71Var2.h = (int) (((l41Var.getMeasuredWidth() - AndroidUtilities.dp(16.0f)) - f10) - 0);
                m71Var2.i = measuredHeight2;
                View view3 = m71Var2.v;
                if (view3 != null) {
                    view3.invalidate();
                    break;
                }
                break;
        }
    }
}
