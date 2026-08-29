package org.telegram.ui;

import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class cd0 implements o1.h {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ cd0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // o1.h
    public final void a(o1.i iVar, float f9, float f10) {
        int i10 = this.a;
        Object obj = this.b;
        switch (i10) {
            case 0:
                tf0 tf0Var = ((fg0) obj).X;
                if (tf0Var != null) {
                    int i11 = tf0.A;
                    View view = tf0Var.c;
                    ViewGroup viewGroup = tf0Var.b;
                    PointF pointF = tf0Var.y;
                    sg.i.b(view, viewGroup, pointF);
                    org.telegram.ui.Components.u10 u10Var = tf0Var.h;
                    u10Var.setTranslationX(pointF.x);
                    u10Var.setTranslationY(pointF.y);
                    tf0Var.requestLayout();
                    break;
                }
                break;
            case 1:
                xn0 xn0Var = (xn0) obj;
                float f11 = f9 / 100.0f;
                xn0Var.b = f11;
                TextView textView = xn0Var.d.Q;
                if (textView != null) {
                    textView.setAlpha((f11 * 0.2f) + 0.8f);
                }
                xn0Var.invalidate();
                break;
            case 2:
                kt0 kt0Var = (kt0) obj;
                kt0Var.V = f9;
                kt0Var.a0 = f10;
                kt0Var.G();
                break;
            case 3:
                gu0 gu0Var = (gu0) obj;
                int dp = gu0Var.e > gu0Var.f ? AndroidUtilities.dp(48.0f) : 0;
                org.telegram.ui.Components.z61 z61Var = gu0Var.s.m3;
                int measuredHeight = gu0Var.getMeasuredHeight();
                z61Var.h = (int) (((gu0Var.getMeasuredWidth() - AndroidUtilities.dp(16.0f)) - f9) - dp);
                z61Var.i = measuredHeight;
                View view2 = z61Var.v;
                if (view2 != null) {
                    view2.invalidate();
                    break;
                }
                break;
            case 4:
                h31 h31Var = (h31) obj;
                h31Var.y = f9 / 1000.0f;
                h31Var.invalidate();
                break;
            default:
                z31 z31Var = (z31) obj;
                org.telegram.ui.Components.z61 z61Var2 = z31Var.r.M;
                int measuredHeight2 = z31Var.getMeasuredHeight();
                z61Var2.h = (int) (((z31Var.getMeasuredWidth() - AndroidUtilities.dp(16.0f)) - f9) - 0);
                z61Var2.i = measuredHeight2;
                View view3 = z61Var2.v;
                if (view3 != null) {
                    view3.invalidate();
                    break;
                }
                break;
        }
    }
}
