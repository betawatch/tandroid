package org.telegram.ui.Wallet;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.es;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final /* synthetic */ class l4 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ViewGroup b;

    public /* synthetic */ l4(ViewGroup viewGroup, int i10) {
        this.a = i10;
        this.b = viewGroup;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        b71 b71Var;
        switch (this.a) {
            case 0:
                ah.v vVar = (ah.v) this.b;
                z4 z4Var = (z4) vVar.c;
                if (z4Var.F || z4Var.G) {
                    z4Var.B0();
                }
                if (z4Var.G) {
                    vVar.invalidate();
                    break;
                }
                break;
            case 1:
                n4 n4Var = (n4) this.b;
                z4 z4Var2 = n4Var.e;
                if (z4Var2.a0 != null && (b71Var = z4Var2.a) != null) {
                    boolean z10 = z4Var2.m0 && !b71Var.canScrollVertically(1);
                    if (z4Var2.c0 != z10) {
                        z4Var2.c0 = z10;
                        z4Var2.a0.animate().cancel();
                        if (z10) {
                            z4Var2.a0.setVisibility(0);
                            z4Var2.a0.animate().alpha(1.0f).setDuration(180L).setInterpolator(es.g).start();
                        } else {
                            z4Var2.a0.setAlpha(0.0f);
                            z4Var2.a0.setVisibility(4);
                        }
                    }
                }
                View m10 = z4Var2.a.V2.m(z4Var2.f);
                float y3 = m10 != null ? m10.getY() : 0.0f;
                int height = m10 != null ? m10.getHeight() : 0;
                if (m10 != n4Var.a || y3 != n4Var.b || height != n4Var.c) {
                    n4Var.a = m10;
                    n4Var.b = y3;
                    n4Var.c = height;
                    z4Var2.C0();
                    break;
                }
                break;
            default:
                i8 i8Var = (i8) ((di.v5) this.b).c;
                di.v5 v5Var = i8Var.v;
                if (v5Var != null && i8Var.W != null && v5Var.getHeight() > 0 && i8Var.W.getHeight() > 0) {
                    float paddingTop = i8Var.fragmentView.getPaddingTop();
                    if (i8Var.s.getVisibility() == 0) {
                        paddingTop = Math.max(paddingTop, (i8Var.s.getScaleY() * (i8Var.s.getContentBottom() - i8Var.s.getPivotY())) + i8Var.s.getPivotY() + i8Var.s.getY());
                    }
                    float max = Math.max(0.0f, Math.min(i8Var.fragmentView.getHeight() - i8Var.fragmentView.getPaddingBottom(), i8Var.W.getY()) - paddingTop);
                    float min = Math.min(1.0f, Math.max(0.0f, max - (Math.min(AndroidUtilities.dp(12.0f), max / 4.0f) * 2.0f)) / i8Var.v.getHeight());
                    i8Var.v.setPivotX(r5.getWidth() / 2.0f);
                    i8Var.v.setPivotY(r5.getHeight() / 2.0f);
                    i8Var.v.setScaleX(min);
                    i8Var.v.setScaleY(min);
                    i8Var.v.setTranslationY((((max / 2.0f) + paddingTop) - r4.getTop()) - (i8Var.v.getHeight() / 2.0f));
                }
                if (i8Var.X != null || i8Var.Y < 1.0f) {
                    i8Var.A0();
                    break;
                }
                break;
        }
        return true;
    }
}
