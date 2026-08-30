package org.telegram.ui;

import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ld0 implements o1.g {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ld0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // o1.g
    public final void a(o1.h hVar, float f10, float f11) {
        int i10 = this.a;
        Object obj = this.b;
        switch (i10) {
            case 0:
                bg0 bg0Var = ((ng0) obj).Y;
                if (bg0Var != null) {
                    int i11 = bg0.B;
                    View view = bg0Var.c;
                    ViewGroup viewGroup = bg0Var.b;
                    PointF pointF = bg0Var.y;
                    ug.i.b(view, viewGroup, pointF);
                    org.telegram.ui.Components.z10 z10Var = bg0Var.h;
                    z10Var.setTranslationX(pointF.x);
                    z10Var.setTranslationY(pointF.y);
                    bg0Var.requestLayout();
                    break;
                }
                break;
            case 1:
                fo0 fo0Var = (fo0) obj;
                float f12 = f10 / 100.0f;
                fo0Var.b = f12;
                TextView textView = fo0Var.d.R;
                if (textView != null) {
                    textView.setAlpha((f12 * 0.2f) + 0.8f);
                }
                fo0Var.invalidate();
                break;
            case 2:
                tt0 tt0Var = (tt0) obj;
                tt0Var.W = f10;
                tt0Var.b0 = f11;
                tt0Var.G();
                break;
            case 3:
                qu0 qu0Var = (qu0) obj;
                int dp = qu0Var.e > qu0Var.f ? AndroidUtilities.dp(48.0f) : 0;
                org.telegram.ui.Components.k71 k71Var = qu0Var.s.n3;
                int measuredHeight = qu0Var.getMeasuredHeight();
                k71Var.h = (int) (((qu0Var.getMeasuredWidth() - AndroidUtilities.dp(16.0f)) - f10) - dp);
                k71Var.i = measuredHeight;
                View view2 = k71Var.v;
                if (view2 != null) {
                    view2.invalidate();
                    break;
                }
                break;
            case 4:
                t31 t31Var = (t31) obj;
                t31Var.y = f10 / 1000.0f;
                t31Var.invalidate();
                break;
            default:
                j41 j41Var = (j41) obj;
                org.telegram.ui.Components.k71 k71Var2 = j41Var.r.N;
                int measuredHeight2 = j41Var.getMeasuredHeight();
                k71Var2.h = (int) (((j41Var.getMeasuredWidth() - AndroidUtilities.dp(16.0f)) - f10) - 0);
                k71Var2.i = measuredHeight2;
                View view3 = k71Var2.v;
                if (view3 != null) {
                    view3.invalidate();
                    break;
                }
                break;
        }
    }
}
