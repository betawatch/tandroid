package org.telegram.ui;

import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class ab0 implements r1.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ab0(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // r1.d
    public final void a(r1.g gVar, float f10, float f11) {
        int i7 = this.a;
        Object obj = this.b;
        switch (i7) {
            case 0:
                pd0 pd0Var = ((ce0) obj).c0;
                if (pd0Var != null) {
                    int i10 = pd0.G;
                    View view = pd0Var.c;
                    ViewGroup viewGroup = pd0Var.b;
                    PointF pointF = pd0Var.E;
                    jh.k.b(view, viewGroup, pointF);
                    org.telegram.ui.Components.t00 t00Var = pd0Var.h;
                    t00Var.setTranslationX(pointF.x);
                    t00Var.setTranslationY(pointF.y);
                    pd0Var.requestLayout();
                    break;
                }
                break;
            case 1:
                gl0 gl0Var = (gl0) obj;
                float f12 = f10 / 100.0f;
                gl0Var.b = f12;
                TextView textView = gl0Var.d.V;
                if (textView != null) {
                    textView.setAlpha((f12 * 0.2f) + 0.8f);
                }
                gl0Var.invalidate();
                break;
            case 2:
                hq0 hq0Var = (hq0) obj;
                hq0Var.d0 = f10;
                hq0Var.f0 = f11;
                hq0Var.G();
                break;
            case 3:
                ar0 ar0Var = (ar0) obj;
                int L = ar0Var.e > ar0Var.f ? org.telegram.messenger.g0.L(48.0f) : 0;
                org.telegram.ui.Components.w51 w51Var = ar0Var.s.q3;
                int measuredHeight = ar0Var.getMeasuredHeight();
                w51Var.h = (int) (((ar0Var.getMeasuredWidth() - org.telegram.messenger.g0.L(16.0f)) - f10) - L);
                w51Var.i = measuredHeight;
                View view2 = w51Var.v;
                if (view2 != null) {
                    view2.invalidate();
                    break;
                }
                break;
            case 4:
                uy0 uy0Var = (uy0) obj;
                uy0Var.E = f10 / 1000.0f;
                uy0Var.invalidate();
                break;
            default:
                jz0 jz0Var = (jz0) obj;
                org.telegram.ui.Components.w51 w51Var2 = jz0Var.r.P;
                int measuredHeight2 = jz0Var.getMeasuredHeight();
                w51Var2.h = (int) (((jz0Var.getMeasuredWidth() - org.telegram.messenger.g0.L(16.0f)) - f10) - 0);
                w51Var2.i = measuredHeight2;
                View view3 = w51Var2.v;
                if (view3 != null) {
                    view3.invalidate();
                    break;
                }
                break;
        }
    }
}
