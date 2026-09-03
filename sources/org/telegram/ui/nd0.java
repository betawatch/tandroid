package org.telegram.ui;

import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class nd0 implements o1.g {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ nd0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // o1.g
    public final void a(o1.h hVar, float f10, float f11) {
        int i10 = this.a;
        Object obj = this.b;
        switch (i10) {
            case 0:
                dg0 dg0Var = ((pg0) obj).Y;
                if (dg0Var != null) {
                    int i11 = dg0.B;
                    View view = dg0Var.c;
                    ViewGroup viewGroup = dg0Var.b;
                    PointF pointF = dg0Var.y;
                    ug.i.b(view, viewGroup, pointF);
                    org.telegram.ui.Components.a20 a20Var = dg0Var.h;
                    a20Var.setTranslationX(pointF.x);
                    a20Var.setTranslationY(pointF.y);
                    dg0Var.requestLayout();
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
                org.telegram.ui.Components.k71 k71Var = xu0Var.s.n3;
                int measuredHeight = xu0Var.getMeasuredHeight();
                k71Var.h = (int) (((xu0Var.getMeasuredWidth() - AndroidUtilities.dp(16.0f)) - f10) - dp);
                k71Var.i = measuredHeight;
                View view2 = k71Var.v;
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
                org.telegram.ui.Components.k71 k71Var2 = q41Var.r.N;
                int measuredHeight2 = q41Var.getMeasuredHeight();
                k71Var2.h = (int) (((q41Var.getMeasuredWidth() - AndroidUtilities.dp(16.0f)) - f10) - 0);
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
