package org.telegram.ui;

import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class nd0 implements o1.g {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ nd0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // o1.g
    public final void a(o1.h hVar, float f7, float f10) {
        int i10 = this.a;
        Object obj = this.b;
        switch (i10) {
            case 0:
                eg0 eg0Var = ((qg0) obj).b0;
                if (eg0Var != null) {
                    int i11 = eg0.E;
                    View view = eg0Var.c;
                    ViewGroup viewGroup = eg0Var.b;
                    PointF pointF = eg0Var.y;
                    hh.k.b(view, viewGroup, pointF);
                    org.telegram.ui.Components.z10 z10Var = eg0Var.h;
                    z10Var.setTranslationX(pointF.x);
                    z10Var.setTranslationY(pointF.y);
                    eg0Var.requestLayout();
                    break;
                }
                break;
            case 1:
                ko0 ko0Var = (ko0) obj;
                float f11 = f7 / 100.0f;
                ko0Var.b = f11;
                TextView textView = ko0Var.d.U;
                if (textView != null) {
                    textView.setAlpha((f11 * 0.2f) + 0.8f);
                }
                ko0Var.invalidate();
                break;
            case 2:
                gu0 gu0Var = (gu0) obj;
                gu0Var.c0 = f7;
                gu0Var.e0 = f10;
                gu0Var.G();
                break;
            case 3:
                cv0 cv0Var = (cv0) obj;
                int dp = cv0Var.e > cv0Var.f ? AndroidUtilities.dp(48.0f) : 0;
                org.telegram.ui.Components.u71 u71Var = cv0Var.s.q3;
                int measuredHeight = cv0Var.getMeasuredHeight();
                u71Var.h = (int) (((cv0Var.getMeasuredWidth() - AndroidUtilities.dp(16.0f)) - f7) - dp);
                u71Var.i = measuredHeight;
                View view2 = u71Var.v;
                if (view2 != null) {
                    view2.invalidate();
                    break;
                }
                break;
            case 4:
                d41 d41Var = (d41) obj;
                d41Var.y = f7 / 1000.0f;
                d41Var.invalidate();
                break;
            default:
                v41 v41Var = (v41) obj;
                org.telegram.ui.Components.u71 u71Var2 = v41Var.r.Q;
                int measuredHeight2 = v41Var.getMeasuredHeight();
                u71Var2.h = (int) (((v41Var.getMeasuredWidth() - AndroidUtilities.dp(16.0f)) - f7) - 0);
                u71Var2.i = measuredHeight2;
                View view3 = u71Var2.v;
                if (view3 != null) {
                    view3.invalidate();
                    break;
                }
                break;
        }
    }
}
