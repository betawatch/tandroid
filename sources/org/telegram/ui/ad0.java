package org.telegram.ui;

import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ad0 implements o1.g {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ad0(Object obj, int i9) {
        this.a = i9;
        this.b = obj;
    }

    @Override // o1.g
    public final void a(o1.h hVar, float f10, float f11) {
        int i9 = this.a;
        Object obj = this.b;
        switch (i9) {
            case 0:
                tf0 tf0Var = ((fg0) obj).X;
                if (tf0Var != null) {
                    int i10 = tf0.A;
                    View view = tf0Var.c;
                    ViewGroup viewGroup = tf0Var.b;
                    PointF pointF = tf0Var.y;
                    pg.i.b(view, viewGroup, pointF);
                    org.telegram.ui.Components.j10 j10Var = tf0Var.h;
                    j10Var.setTranslationX(pointF.x);
                    j10Var.setTranslationY(pointF.y);
                    tf0Var.requestLayout();
                    break;
                }
                break;
            case 1:
                yn0 yn0Var = (yn0) obj;
                float f12 = f10 / 100.0f;
                yn0Var.b = f12;
                TextView textView = yn0Var.d.Q;
                if (textView != null) {
                    textView.setAlpha((f12 * 0.2f) + 0.8f);
                }
                yn0Var.invalidate();
                break;
            case 2:
                mt0 mt0Var = (mt0) obj;
                mt0Var.V = f10;
                mt0Var.a0 = f11;
                mt0Var.G();
                break;
            case 3:
                iu0 iu0Var = (iu0) obj;
                int dp = iu0Var.e > iu0Var.f ? AndroidUtilities.dp(48.0f) : 0;
                org.telegram.ui.Components.m61 m61Var = iu0Var.s.m3;
                int measuredHeight = iu0Var.getMeasuredHeight();
                m61Var.h = (int) (((iu0Var.getMeasuredWidth() - AndroidUtilities.dp(16.0f)) - f10) - dp);
                m61Var.i = measuredHeight;
                View view2 = m61Var.v;
                if (view2 != null) {
                    view2.invalidate();
                    break;
                }
                break;
            case 4:
                h31 h31Var = (h31) obj;
                h31Var.y = f10 / 1000.0f;
                h31Var.invalidate();
                break;
            default:
                x31 x31Var = (x31) obj;
                org.telegram.ui.Components.m61 m61Var2 = x31Var.r.M;
                int measuredHeight2 = x31Var.getMeasuredHeight();
                m61Var2.h = (int) (((x31Var.getMeasuredWidth() - AndroidUtilities.dp(16.0f)) - f10) - 0);
                m61Var2.i = measuredHeight2;
                View view3 = m61Var2.v;
                if (view3 != null) {
                    view3.invalidate();
                    break;
                }
                break;
        }
    }
}
