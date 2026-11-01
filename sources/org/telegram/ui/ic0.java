package org.telegram.ui;

import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ic0 implements o1.g {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ic0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // o1.g
    public final void a(o1.j jVar, float f7, float f10) {
        int i10 = this.a;
        Object obj = this.b;
        switch (i10) {
            case 0:
                ve0 ve0Var = ((gf0) obj).b0;
                if (ve0Var != null) {
                    int i11 = ve0.F;
                    View view = ve0Var.c;
                    ViewGroup viewGroup = ve0Var.b;
                    PointF pointF = ve0Var.D;
                    zg.h.b(view, viewGroup, pointF);
                    org.telegram.ui.Components.f10 f10Var = ve0Var.h;
                    f10Var.setTranslationX(pointF.x);
                    f10Var.setTranslationY(pointF.y);
                    ve0Var.requestLayout();
                    break;
                }
                break;
            case 1:
                mm0 mm0Var = (mm0) obj;
                float f11 = f7 / 100.0f;
                mm0Var.b = f11;
                TextView textView = mm0Var.d.U;
                if (textView != null) {
                    textView.setAlpha((f11 * 0.2f) + 0.8f);
                }
                mm0Var.invalidate();
                break;
            case 2:
                sr0 sr0Var = (sr0) obj;
                sr0Var.c0 = f7;
                sr0Var.e0 = f10;
                sr0Var.G();
                break;
            case 3:
                ls0 ls0Var = (ls0) obj;
                int L = ls0Var.e > ls0Var.f ? org.telegram.messenger.i0.L(48.0f) : 0;
                org.telegram.ui.Components.x61 x61Var = ls0Var.s.q3;
                int measuredHeight = ls0Var.getMeasuredHeight();
                x61Var.h = (int) (((ls0Var.getMeasuredWidth() - org.telegram.messenger.i0.L(16.0f)) - f7) - L);
                x61Var.i = measuredHeight;
                View view2 = x61Var.v;
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
                org.telegram.ui.Components.x61 x61Var2 = b11Var.r.O;
                int measuredHeight2 = b11Var.getMeasuredHeight();
                x61Var2.h = (int) (((b11Var.getMeasuredWidth() - org.telegram.messenger.i0.L(16.0f)) - f7) - 0);
                x61Var2.i = measuredHeight2;
                View view3 = x61Var2.v;
                if (view3 != null) {
                    view3.invalidate();
                    break;
                }
                break;
        }
    }
}
