package org.telegram.ui;

import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
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
                    org.telegram.ui.Components.p00 p00Var = pd0Var.h;
                    p00Var.setTranslationX(pointF.x);
                    p00Var.setTranslationY(pointF.y);
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
                hq0 hq0Var = (hq0) obj;
                hq0Var.c0 = f10;
                hq0Var.e0 = f11;
                hq0Var.G();
                break;
            case 3:
                br0 br0Var = (br0) obj;
                int L = br0Var.e > br0Var.f ? org.telegram.messenger.g0.L(48.0f) : 0;
                org.telegram.ui.Components.q51 q51Var = br0Var.s.p3;
                int measuredHeight = br0Var.getMeasuredHeight();
                q51Var.h = (int) (((br0Var.getMeasuredWidth() - org.telegram.messenger.g0.L(16.0f)) - f10) - L);
                q51Var.i = measuredHeight;
                View view2 = q51Var.v;
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
                org.telegram.ui.Components.q51 q51Var2 = lz0Var.r.O;
                int measuredHeight2 = lz0Var.getMeasuredHeight();
                q51Var2.h = (int) (((lz0Var.getMeasuredWidth() - org.telegram.messenger.g0.L(16.0f)) - f10) - 0);
                q51Var2.i = measuredHeight2;
                View view3 = q51Var2.v;
                if (view3 != null) {
                    view3.invalidate();
                    break;
                }
                break;
        }
    }
}
