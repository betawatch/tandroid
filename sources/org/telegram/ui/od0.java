package org.telegram.ui;

import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class od0 implements o1.g {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ od0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // o1.g
    public final void a(o1.h hVar, float f7, float f10) {
        int i10 = this.a;
        Object obj = this.b;
        switch (i10) {
            case 0:
                fg0 fg0Var = ((rg0) obj).b0;
                if (fg0Var != null) {
                    int i11 = fg0.E;
                    View view = fg0Var.c;
                    ViewGroup viewGroup = fg0Var.b;
                    PointF pointF = fg0Var.y;
                    hh.k.b(view, viewGroup, pointF);
                    org.telegram.ui.Components.z10 z10Var = fg0Var.h;
                    z10Var.setTranslationX(pointF.x);
                    z10Var.setTranslationY(pointF.y);
                    fg0Var.requestLayout();
                    break;
                }
                break;
            case 1:
                mo0 mo0Var = (mo0) obj;
                float f11 = f7 / 100.0f;
                mo0Var.b = f11;
                TextView textView = mo0Var.d.U;
                if (textView != null) {
                    textView.setAlpha((f11 * 0.2f) + 0.8f);
                }
                mo0Var.invalidate();
                break;
            case 2:
                hu0 hu0Var = (hu0) obj;
                hu0Var.c0 = f7;
                hu0Var.e0 = f10;
                hu0Var.G();
                break;
            case 3:
                dv0 dv0Var = (dv0) obj;
                int dp = dv0Var.e > dv0Var.f ? AndroidUtilities.dp(48.0f) : 0;
                org.telegram.ui.Components.h71 h71Var = dv0Var.s.q3;
                int measuredHeight = dv0Var.getMeasuredHeight();
                h71Var.h = (int) (((dv0Var.getMeasuredWidth() - AndroidUtilities.dp(16.0f)) - f7) - dp);
                h71Var.i = measuredHeight;
                View view2 = h71Var.v;
                if (view2 != null) {
                    view2.invalidate();
                    break;
                }
                break;
            case 4:
                e41 e41Var = (e41) obj;
                e41Var.y = f7 / 1000.0f;
                e41Var.invalidate();
                break;
            default:
                u41 u41Var = (u41) obj;
                org.telegram.ui.Components.h71 h71Var2 = u41Var.r.Q;
                int measuredHeight2 = u41Var.getMeasuredHeight();
                h71Var2.h = (int) (((u41Var.getMeasuredWidth() - AndroidUtilities.dp(16.0f)) - f7) - 0);
                h71Var2.i = measuredHeight2;
                View view3 = h71Var2.v;
                if (view3 != null) {
                    view3.invalidate();
                    break;
                }
                break;
        }
    }
}
