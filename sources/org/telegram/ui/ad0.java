package org.telegram.ui;

import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ad0 implements o1.g {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ad0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // o1.g
    public final void a(o1.h hVar, float f7, float f10) {
        int i10 = this.a;
        Object obj = this.b;
        switch (i10) {
            case 0:
                sf0 sf0Var = ((eg0) obj).b0;
                if (sf0Var != null) {
                    int i11 = sf0.E;
                    View view = sf0Var.c;
                    ViewGroup viewGroup = sf0Var.b;
                    PointF pointF = sf0Var.y;
                    ih.j.b(view, viewGroup, pointF);
                    org.telegram.ui.Components.h20 h20Var = sf0Var.h;
                    h20Var.setTranslationX(pointF.x);
                    h20Var.setTranslationY(pointF.y);
                    sf0Var.requestLayout();
                    break;
                }
                break;
            case 1:
                co0 co0Var = (co0) obj;
                float f11 = f7 / 100.0f;
                co0Var.b = f11;
                TextView textView = co0Var.d.U;
                if (textView != null) {
                    textView.setAlpha((f11 * 0.2f) + 0.8f);
                }
                co0Var.invalidate();
                break;
            case 2:
                wt0 wt0Var = (wt0) obj;
                wt0Var.c0 = f7;
                wt0Var.e0 = f10;
                wt0Var.G();
                break;
            case 3:
                su0 su0Var = (su0) obj;
                int dp = su0Var.e > su0Var.f ? AndroidUtilities.dp(48.0f) : 0;
                org.telegram.ui.Components.c81 c81Var = su0Var.s.q3;
                int measuredHeight = su0Var.getMeasuredHeight();
                c81Var.h = (int) (((su0Var.getMeasuredWidth() - AndroidUtilities.dp(16.0f)) - f7) - dp);
                c81Var.i = measuredHeight;
                View view2 = c81Var.v;
                if (view2 != null) {
                    view2.invalidate();
                    break;
                }
                break;
            case 4:
                z21 z21Var = (z21) obj;
                z21Var.y = f7 / 1000.0f;
                z21Var.invalidate();
                break;
            default:
                t31 t31Var = (t31) obj;
                org.telegram.ui.Components.c81 c81Var2 = t31Var.r.Q;
                int measuredHeight2 = t31Var.getMeasuredHeight();
                c81Var2.h = (int) (((t31Var.getMeasuredWidth() - AndroidUtilities.dp(16.0f)) - f7) - 0);
                c81Var2.i = measuredHeight2;
                View view3 = c81Var2.v;
                if (view3 != null) {
                    view3.invalidate();
                    break;
                }
                break;
        }
    }
}
