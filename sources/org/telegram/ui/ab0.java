package org.telegram.ui;

import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
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
                pd0 pd0Var = ((de0) obj).c0;
                if (pd0Var != null) {
                    int i10 = pd0.G;
                    View view = pd0Var.c;
                    ViewGroup viewGroup = pd0Var.b;
                    PointF pointF = pd0Var.E;
                    jh.k.b(view, viewGroup, pointF);
                    org.telegram.ui.Components.a10 a10Var = pd0Var.h;
                    a10Var.setTranslationX(pointF.x);
                    a10Var.setTranslationY(pointF.y);
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
                jq0 jq0Var = (jq0) obj;
                jq0Var.d0 = f10;
                jq0Var.f0 = f11;
                jq0Var.G();
                break;
            case 3:
                cr0 cr0Var = (cr0) obj;
                int L = cr0Var.e > cr0Var.f ? org.telegram.messenger.g0.L(48.0f) : 0;
                org.telegram.ui.Components.l61 l61Var = cr0Var.s.q3;
                int measuredHeight = cr0Var.getMeasuredHeight();
                l61Var.h = (int) (((cr0Var.getMeasuredWidth() - org.telegram.messenger.g0.L(16.0f)) - f10) - L);
                l61Var.i = measuredHeight;
                View view2 = l61Var.v;
                if (view2 != null) {
                    view2.invalidate();
                    break;
                }
                break;
            case 4:
                xy0 xy0Var = (xy0) obj;
                xy0Var.E = f10 / 1000.0f;
                xy0Var.invalidate();
                break;
            default:
                mz0 mz0Var = (mz0) obj;
                org.telegram.ui.Components.l61 l61Var2 = mz0Var.r.P;
                int measuredHeight2 = mz0Var.getMeasuredHeight();
                l61Var2.h = (int) (((mz0Var.getMeasuredWidth() - org.telegram.messenger.g0.L(16.0f)) - f10) - 0);
                l61Var2.i = measuredHeight2;
                View view3 = l61Var2.v;
                if (view3 != null) {
                    view3.invalidate();
                    break;
                }
                break;
        }
    }
}
