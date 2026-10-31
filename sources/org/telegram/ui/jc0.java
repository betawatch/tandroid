package org.telegram.ui;

import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class jc0 implements o1.g {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ jc0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // o1.g
    public final void a(o1.j jVar, float f7, float f10) {
        int i10 = this.a;
        Object obj = this.b;
        switch (i10) {
            case 0:
                we0 we0Var = ((hf0) obj).b0;
                if (we0Var != null) {
                    int i11 = we0.F;
                    View view = we0Var.c;
                    ViewGroup viewGroup = we0Var.b;
                    PointF pointF = we0Var.D;
                    zg.h.b(view, viewGroup, pointF);
                    org.telegram.ui.Components.f10 f10Var = we0Var.h;
                    f10Var.setTranslationX(pointF.x);
                    f10Var.setTranslationY(pointF.y);
                    we0Var.requestLayout();
                    break;
                }
                break;
            case 1:
                om0 om0Var = (om0) obj;
                float f11 = f7 / 100.0f;
                om0Var.b = f11;
                TextView textView = om0Var.d.U;
                if (textView != null) {
                    textView.setAlpha((f11 * 0.2f) + 0.8f);
                }
                om0Var.invalidate();
                break;
            case 2:
                tr0 tr0Var = (tr0) obj;
                tr0Var.c0 = f7;
                tr0Var.e0 = f10;
                tr0Var.G();
                break;
            case 3:
                ms0 ms0Var = (ms0) obj;
                int L = ms0Var.e > ms0Var.f ? org.telegram.messenger.i0.L(48.0f) : 0;
                org.telegram.ui.Components.w61 w61Var = ms0Var.s.q3;
                int measuredHeight = ms0Var.getMeasuredHeight();
                w61Var.h = (int) (((ms0Var.getMeasuredWidth() - org.telegram.messenger.i0.L(16.0f)) - f7) - L);
                w61Var.i = measuredHeight;
                View view2 = w61Var.v;
                if (view2 != null) {
                    view2.invalidate();
                    break;
                }
                break;
            case 4:
                k01 k01Var = (k01) obj;
                k01Var.D = f7 / 1000.0f;
                k01Var.invalidate();
                break;
            default:
                b11 b11Var = (b11) obj;
                org.telegram.ui.Components.w61 w61Var2 = b11Var.r.O;
                int measuredHeight2 = b11Var.getMeasuredHeight();
                w61Var2.h = (int) (((b11Var.getMeasuredWidth() - org.telegram.messenger.i0.L(16.0f)) - f7) - 0);
                w61Var2.i = measuredHeight2;
                View view3 = w61Var2.v;
                if (view3 != null) {
                    view3.invalidate();
                    break;
                }
                break;
        }
    }
}
