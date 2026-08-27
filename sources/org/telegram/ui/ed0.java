package org.telegram.ui;

import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ed0 implements o1.g {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ed0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // o1.g
    public final void a(o1.h hVar, float f10, float f11) {
        int i10 = this.a;
        Object obj = this.b;
        switch (i10) {
            case 0:
                wf0 wf0Var = ((ig0) obj).X;
                if (wf0Var != null) {
                    int i11 = wf0.A;
                    View view = wf0Var.c;
                    ViewGroup viewGroup = wf0Var.b;
                    PointF pointF = wf0Var.y;
                    qg.j.b(view, viewGroup, pointF);
                    org.telegram.ui.Components.m10 m10Var = wf0Var.h;
                    m10Var.setTranslationX(pointF.x);
                    m10Var.setTranslationY(pointF.y);
                    wf0Var.requestLayout();
                    break;
                }
                break;
            case 1:
                zn0 zn0Var = (zn0) obj;
                float f12 = f10 / 100.0f;
                zn0Var.b = f12;
                TextView textView = zn0Var.d.Q;
                if (textView != null) {
                    textView.setAlpha((f12 * 0.2f) + 0.8f);
                }
                zn0Var.invalidate();
                break;
            case 2:
                nt0 nt0Var = (nt0) obj;
                nt0Var.V = f10;
                nt0Var.a0 = f11;
                nt0Var.G();
                break;
            case 3:
                ju0 ju0Var = (ju0) obj;
                int dp = ju0Var.e > ju0Var.f ? AndroidUtilities.dp(48.0f) : 0;
                org.telegram.ui.Components.o61 o61Var = ju0Var.s.m3;
                int measuredHeight = ju0Var.getMeasuredHeight();
                o61Var.h = (int) (((ju0Var.getMeasuredWidth() - AndroidUtilities.dp(16.0f)) - f10) - dp);
                o61Var.i = measuredHeight;
                View view2 = o61Var.v;
                if (view2 != null) {
                    view2.invalidate();
                    break;
                }
                break;
            case 4:
                g31 g31Var = (g31) obj;
                g31Var.y = f10 / 1000.0f;
                g31Var.invalidate();
                break;
            default:
                w31 w31Var = (w31) obj;
                org.telegram.ui.Components.o61 o61Var2 = w31Var.r.M;
                int measuredHeight2 = w31Var.getMeasuredHeight();
                o61Var2.h = (int) (((w31Var.getMeasuredWidth() - AndroidUtilities.dp(16.0f)) - f10) - 0);
                o61Var2.i = measuredHeight2;
                View view3 = o61Var2.v;
                if (view3 != null) {
                    view3.invalidate();
                    break;
                }
                break;
        }
    }
}
