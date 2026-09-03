package org.telegram.ui;

import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class md0 implements o1.g {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ md0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // o1.g
    public final void a(o1.h hVar, float f10, float f11) {
        int i10 = this.a;
        Object obj = this.b;
        switch (i10) {
            case 0:
                cg0 cg0Var = ((og0) obj).Y;
                if (cg0Var != null) {
                    int i11 = cg0.B;
                    View view = cg0Var.c;
                    ViewGroup viewGroup = cg0Var.b;
                    PointF pointF = cg0Var.y;
                    vg.i.b(view, viewGroup, pointF);
                    org.telegram.ui.Components.a20 a20Var = cg0Var.h;
                    a20Var.setTranslationX(pointF.x);
                    a20Var.setTranslationY(pointF.y);
                    cg0Var.requestLayout();
                    break;
                }
                break;
            case 1:
                ho0 ho0Var = (ho0) obj;
                float f12 = f10 / 100.0f;
                ho0Var.b = f12;
                TextView textView = ho0Var.d.R;
                if (textView != null) {
                    textView.setAlpha((f12 * 0.2f) + 0.8f);
                }
                ho0Var.invalidate();
                break;
            case 2:
                au0 au0Var = (au0) obj;
                au0Var.W = f10;
                au0Var.b0 = f11;
                au0Var.G();
                break;
            case 3:
                xu0 xu0Var = (xu0) obj;
                int dp = xu0Var.e > xu0Var.f ? AndroidUtilities.dp(48.0f) : 0;
                org.telegram.ui.Components.l71 l71Var = xu0Var.s.n3;
                int measuredHeight = xu0Var.getMeasuredHeight();
                l71Var.h = (int) (((xu0Var.getMeasuredWidth() - AndroidUtilities.dp(16.0f)) - f10) - dp);
                l71Var.i = measuredHeight;
                View view2 = l71Var.v;
                if (view2 != null) {
                    view2.invalidate();
                    break;
                }
                break;
            case 4:
                a41 a41Var = (a41) obj;
                a41Var.y = f10 / 1000.0f;
                a41Var.invalidate();
                break;
            default:
                q41 q41Var = (q41) obj;
                org.telegram.ui.Components.l71 l71Var2 = q41Var.r.N;
                int measuredHeight2 = q41Var.getMeasuredHeight();
                l71Var2.h = (int) (((q41Var.getMeasuredWidth() - AndroidUtilities.dp(16.0f)) - f10) - 0);
                l71Var2.i = measuredHeight2;
                View view3 = l71Var2.v;
                if (view3 != null) {
                    view3.invalidate();
                    break;
                }
                break;
        }
    }
}
