package org.telegram.ui;

import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
                qd0 qd0Var = ((de0) obj).c0;
                if (qd0Var != null) {
                    int i10 = qd0.G;
                    View view = qd0Var.c;
                    ViewGroup viewGroup = qd0Var.b;
                    PointF pointF = qd0Var.E;
                    jh.k.b(view, viewGroup, pointF);
                    org.telegram.ui.Components.a10 a10Var = qd0Var.h;
                    a10Var.setTranslationX(pointF.x);
                    a10Var.setTranslationY(pointF.y);
                    qd0Var.requestLayout();
                    break;
                }
                break;
            case 1:
                il0 il0Var = (il0) obj;
                float f12 = f10 / 100.0f;
                il0Var.b = f12;
                TextView textView = il0Var.d.V;
                if (textView != null) {
                    textView.setAlpha((f12 * 0.2f) + 0.8f);
                }
                il0Var.invalidate();
                break;
            case 2:
                jq0 jq0Var = (jq0) obj;
                jq0Var.d0 = f10;
                jq0Var.f0 = f11;
                jq0Var.G();
                break;
            case 3:
                cr0 cr0Var = (cr0) obj;
                int L = cr0Var.e > cr0Var.f ? org.telegram.messenger.g0.L(48.0f) : 0;
                org.telegram.ui.Components.h61 h61Var = cr0Var.s.q3;
                int measuredHeight = cr0Var.getMeasuredHeight();
                h61Var.h = (int) (((cr0Var.getMeasuredWidth() - org.telegram.messenger.g0.L(16.0f)) - f10) - L);
                h61Var.i = measuredHeight;
                View view2 = h61Var.v;
                if (view2 != null) {
                    view2.invalidate();
                    break;
                }
                break;
            case 4:
                yy0 yy0Var = (yy0) obj;
                yy0Var.E = f10 / 1000.0f;
                yy0Var.invalidate();
                break;
            default:
                nz0 nz0Var = (nz0) obj;
                org.telegram.ui.Components.h61 h61Var2 = nz0Var.r.P;
                int measuredHeight2 = nz0Var.getMeasuredHeight();
                h61Var2.h = (int) (((nz0Var.getMeasuredWidth() - org.telegram.messenger.g0.L(16.0f)) - f10) - 0);
                h61Var2.i = measuredHeight2;
                View view3 = h61Var2.v;
                if (view3 != null) {
                    view3.invalidate();
                    break;
                }
                break;
        }
    }
}
