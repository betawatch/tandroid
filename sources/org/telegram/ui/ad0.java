package org.telegram.ui;

import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
                tf0 tf0Var = ((gg0) obj).b0;
                if (tf0Var != null) {
                    int i11 = tf0.F;
                    View view = tf0Var.c;
                    ViewGroup viewGroup = tf0Var.b;
                    PointF pointF = tf0Var.y;
                    jh.k.b(view, viewGroup, pointF);
                    org.telegram.ui.Components.j20 j20Var = tf0Var.h;
                    j20Var.setTranslationX(pointF.x);
                    j20Var.setTranslationY(pointF.y);
                    tf0Var.requestLayout();
                    break;
                }
                break;
            case 1:
                lo0 lo0Var = (lo0) obj;
                float f11 = f7 / 100.0f;
                lo0Var.b = f11;
                TextView textView = lo0Var.d.U;
                if (textView != null) {
                    textView.setAlpha((f11 * 0.2f) + 0.8f);
                }
                lo0Var.invalidate();
                break;
            case 2:
                bu0 bu0Var = (bu0) obj;
                bu0Var.c0 = f7;
                bu0Var.e0 = f10;
                bu0Var.G();
                break;
            case 3:
                xu0 xu0Var = (xu0) obj;
                int dp = xu0Var.e > xu0Var.f ? AndroidUtilities.dp(48.0f) : 0;
                org.telegram.ui.Components.u81 u81Var = xu0Var.s.q3;
                int measuredHeight = xu0Var.getMeasuredHeight();
                u81Var.h = (int) (((xu0Var.getMeasuredWidth() - AndroidUtilities.dp(16.0f)) - f7) - dp);
                u81Var.i = measuredHeight;
                View view2 = u81Var.v;
                if (view2 != null) {
                    view2.invalidate();
                    break;
                }
                break;
            case 4:
                e31 e31Var = (e31) obj;
                e31Var.y = f7 / 1000.0f;
                e31Var.invalidate();
                break;
            default:
                w31 w31Var = (w31) obj;
                org.telegram.ui.Components.u81 u81Var2 = w31Var.r.Q;
                int measuredHeight2 = w31Var.getMeasuredHeight();
                u81Var2.h = (int) (((w31Var.getMeasuredWidth() - AndroidUtilities.dp(16.0f)) - f7) - 0);
                u81Var2.i = measuredHeight2;
                View view3 = u81Var2.v;
                if (view3 != null) {
                    view3.invalidate();
                    break;
                }
                break;
        }
    }
}
