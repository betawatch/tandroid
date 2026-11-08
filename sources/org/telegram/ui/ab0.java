package org.telegram.ui;

import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
                pd0 pd0Var = ((ce0) obj).b0;
                if (pd0Var != null) {
                    int i10 = pd0.F;
                    View view = pd0Var.c;
                    ViewGroup viewGroup = pd0Var.b;
                    PointF pointF = pd0Var.D;
                    jh.k.b(view, viewGroup, pointF);
                    org.telegram.ui.Components.q00 q00Var = pd0Var.h;
                    q00Var.setTranslationX(pointF.x);
                    q00Var.setTranslationY(pointF.y);
                    pd0Var.requestLayout();
                    break;
                }
                break;
            case 1:
                dl0 dl0Var = (dl0) obj;
                float f12 = f10 / 100.0f;
                dl0Var.b = f12;
                TextView textView = dl0Var.d.U;
                if (textView != null) {
                    textView.setAlpha((f12 * 0.2f) + 0.8f);
                }
                dl0Var.invalidate();
                break;
            case 2:
                iq0 iq0Var = (iq0) obj;
                iq0Var.c0 = f10;
                iq0Var.e0 = f11;
                iq0Var.G();
                break;
            case 3:
                cr0 cr0Var = (cr0) obj;
                int L = cr0Var.e > cr0Var.f ? org.telegram.messenger.g0.L(48.0f) : 0;
                org.telegram.ui.Components.v51 v51Var = cr0Var.s.p3;
                int measuredHeight = cr0Var.getMeasuredHeight();
                v51Var.h = (int) (((cr0Var.getMeasuredWidth() - org.telegram.messenger.g0.L(16.0f)) - f10) - L);
                v51Var.i = measuredHeight;
                View view2 = v51Var.v;
                if (view2 != null) {
                    view2.invalidate();
                    break;
                }
                break;
            case 4:
                wy0 wy0Var = (wy0) obj;
                wy0Var.D = f10 / 1000.0f;
                wy0Var.invalidate();
                break;
            default:
                lz0 lz0Var = (lz0) obj;
                org.telegram.ui.Components.v51 v51Var2 = lz0Var.r.O;
                int measuredHeight2 = lz0Var.getMeasuredHeight();
                v51Var2.h = (int) (((lz0Var.getMeasuredWidth() - org.telegram.messenger.g0.L(16.0f)) - f10) - 0);
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
