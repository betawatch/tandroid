package org.telegram.ui.Wallet;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.hs;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
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
        e71 e71Var;
        switch (this.a) {
            case 0:
                ci.m6 m6Var = (ci.m6) this.b;
                a5 a5Var = (a5) m6Var.c;
                if (a5Var.F || a5Var.G) {
                    a5Var.B0();
                }
                if (a5Var.G) {
                    m6Var.invalidate();
                    break;
                }
                break;
            case 1:
                n4 n4Var = (n4) this.b;
                a5 a5Var2 = n4Var.e;
                if (a5Var2.a0 != null && (e71Var = a5Var2.a) != null) {
                    boolean z10 = a5Var2.m0 && !e71Var.canScrollVertically(1);
                    if (a5Var2.c0 != z10) {
                        a5Var2.c0 = z10;
                        a5Var2.a0.animate().cancel();
                        if (z10) {
                            a5Var2.a0.setVisibility(0);
                            a5Var2.a0.animate().alpha(1.0f).setDuration(180L).setInterpolator(hs.g).start();
                        } else {
                            a5Var2.a0.setAlpha(0.0f);
                            a5Var2.a0.setVisibility(4);
                        }
                    }
                }
                View m10 = a5Var2.a.V2.m(a5Var2.f);
                float y3 = m10 != null ? m10.getY() : 0.0f;
                int height = m10 != null ? m10.getHeight() : 0;
                if (m10 != n4Var.a || y3 != n4Var.b || height != n4Var.c) {
                    n4Var.a = m10;
                    n4Var.b = y3;
                    n4Var.c = height;
                    a5Var2.C0();
                    break;
                }
                break;
            default:
                j8 j8Var = (j8) ((ci.w5) this.b).c;
                ci.w5 w5Var = j8Var.v;
                if (w5Var != null && j8Var.W != null && w5Var.getHeight() > 0 && j8Var.W.getHeight() > 0) {
                    float paddingTop = j8Var.fragmentView.getPaddingTop();
                    if (j8Var.s.getVisibility() == 0) {
                        paddingTop = Math.max(paddingTop, (j8Var.s.getScaleY() * (j8Var.s.getContentBottom() - j8Var.s.getPivotY())) + j8Var.s.getPivotY() + j8Var.s.getY());
                    }
                    float max = Math.max(0.0f, Math.min(j8Var.fragmentView.getHeight() - j8Var.fragmentView.getPaddingBottom(), j8Var.W.getY()) - paddingTop);
                    float min = Math.min(1.0f, Math.max(0.0f, max - (Math.min(AndroidUtilities.dp(12.0f), max / 4.0f) * 2.0f)) / j8Var.v.getHeight());
                    j8Var.v.setPivotX(r5.getWidth() / 2.0f);
                    j8Var.v.setPivotY(r5.getHeight() / 2.0f);
                    j8Var.v.setScaleX(min);
                    j8Var.v.setScaleY(min);
                    j8Var.v.setTranslationY((((max / 2.0f) + paddingTop) - r4.getTop()) - (j8Var.v.getHeight() / 2.0f));
                }
                if (j8Var.X != null || j8Var.Y < 1.0f) {
                    j8Var.A0();
                    break;
                }
                break;
        }
        return true;
    }
}
