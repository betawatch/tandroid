package org.telegram.ui;

import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class cb0 implements r1.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ cb0(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // r1.d
    public final void a(r1.g gVar, float f10, float f11) {
        int i7 = this.a;
        Object obj = this.b;
        switch (i7) {
            case 0:
                rd0 rd0Var = ((ee0) obj).b0;
                if (rd0Var != null) {
                    int i10 = rd0.F;
                    View view = rd0Var.c;
                    ViewGroup viewGroup = rd0Var.b;
                    PointF pointF = rd0Var.D;
                    jh.k.b(view, viewGroup, pointF);
                    org.telegram.ui.Components.q00 q00Var = rd0Var.h;
                    q00Var.setTranslationX(pointF.x);
                    q00Var.setTranslationY(pointF.y);
                    rd0Var.requestLayout();
                    break;
                }
                break;
            case 1:
                fl0 fl0Var = (fl0) obj;
                float f12 = f10 / 100.0f;
                fl0Var.b = f12;
                TextView textView = fl0Var.d.U;
                if (textView != null) {
                    textView.setAlpha((f12 * 0.2f) + 0.8f);
                }
                fl0Var.invalidate();
                break;
            case 2:
                kq0 kq0Var = (kq0) obj;
                kq0Var.c0 = f10;
                kq0Var.e0 = f11;
                kq0Var.G();
                break;
            case 3:
                er0 er0Var = (er0) obj;
                int L = er0Var.e > er0Var.f ? org.telegram.messenger.g0.L(48.0f) : 0;
                org.telegram.ui.Components.w51 w51Var = er0Var.s.p3;
                int measuredHeight = er0Var.getMeasuredHeight();
                w51Var.h = (int) (((er0Var.getMeasuredWidth() - org.telegram.messenger.g0.L(16.0f)) - f10) - L);
                w51Var.i = measuredHeight;
                View view2 = w51Var.v;
                if (view2 != null) {
                    view2.invalidate();
                    break;
                }
                break;
            case 4:
                zy0 zy0Var = (zy0) obj;
                zy0Var.D = f10 / 1000.0f;
                zy0Var.invalidate();
                break;
            default:
                oz0 oz0Var = (oz0) obj;
                org.telegram.ui.Components.w51 w51Var2 = oz0Var.r.O;
                int measuredHeight2 = oz0Var.getMeasuredHeight();
                w51Var2.h = (int) (((oz0Var.getMeasuredWidth() - org.telegram.messenger.g0.L(16.0f)) - f10) - 0);
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
