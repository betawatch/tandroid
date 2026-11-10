package org.telegram.ui;

import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class db0 implements r1.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ db0(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // r1.d
    public final void a(r1.g gVar, float f10, float f11) {
        int i7 = this.a;
        Object obj = this.b;
        switch (i7) {
            case 0:
                sd0 sd0Var = ((fe0) obj).b0;
                if (sd0Var != null) {
                    int i10 = sd0.F;
                    View view = sd0Var.c;
                    ViewGroup viewGroup = sd0Var.b;
                    PointF pointF = sd0Var.D;
                    jh.k.b(view, viewGroup, pointF);
                    org.telegram.ui.Components.p00 p00Var = sd0Var.h;
                    p00Var.setTranslationX(pointF.x);
                    p00Var.setTranslationY(pointF.y);
                    sd0Var.requestLayout();
                    break;
                }
                break;
            case 1:
                gl0 gl0Var = (gl0) obj;
                float f12 = f10 / 100.0f;
                gl0Var.b = f12;
                TextView textView = gl0Var.d.U;
                if (textView != null) {
                    textView.setAlpha((f12 * 0.2f) + 0.8f);
                }
                gl0Var.invalidate();
                break;
            case 2:
                lq0 lq0Var = (lq0) obj;
                lq0Var.c0 = f10;
                lq0Var.e0 = f11;
                lq0Var.G();
                break;
            case 3:
                fr0 fr0Var = (fr0) obj;
                int L = fr0Var.e > fr0Var.f ? org.telegram.messenger.g0.L(48.0f) : 0;
                org.telegram.ui.Components.v51 v51Var = fr0Var.s.p3;
                int measuredHeight = fr0Var.getMeasuredHeight();
                v51Var.h = (int) (((fr0Var.getMeasuredWidth() - org.telegram.messenger.g0.L(16.0f)) - f10) - L);
                v51Var.i = measuredHeight;
                View view2 = v51Var.v;
                if (view2 != null) {
                    view2.invalidate();
                    break;
                }
                break;
            case 4:
                az0 az0Var = (az0) obj;
                az0Var.D = f10 / 1000.0f;
                az0Var.invalidate();
                break;
            default:
                pz0 pz0Var = (pz0) obj;
                org.telegram.ui.Components.v51 v51Var2 = pz0Var.r.O;
                int measuredHeight2 = pz0Var.getMeasuredHeight();
                v51Var2.h = (int) (((pz0Var.getMeasuredWidth() - org.telegram.messenger.g0.L(16.0f)) - f10) - 0);
                v51Var2.i = measuredHeight2;
                View view3 = v51Var2.v;
                if (view3 != null) {
                    view3.invalidate();
                    break;
                }
                break;
        }
    }
}
