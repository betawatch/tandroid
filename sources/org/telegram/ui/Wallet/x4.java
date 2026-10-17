package org.telegram.ui.Wallet;

import android.view.View;
import android.view.ViewTreeObserver;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.u61;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final /* synthetic */ class x4 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ x4(int i10, View view) {
        this.a = i10;
        this.b = view;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        u61 u61Var;
        switch (this.a) {
            case 0:
                ah.v vVar = (ah.v) this.b;
                l5 l5Var = (l5) vVar.c;
                if (l5Var.F || l5Var.G) {
                    l5Var.L0();
                }
                if (l5Var.G) {
                    vVar.invalidate();
                    break;
                }
                break;
            case 1:
                z4 z4Var = (z4) this.b;
                l5 l5Var2 = z4Var.e;
                if (l5Var2.a0 != null && (u61Var = l5Var2.a) != null) {
                    boolean z10 = l5Var2.p0 && !u61Var.canScrollVertically(1);
                    if (l5Var2.c0 != z10) {
                        l5Var2.c0 = z10;
                        l5Var2.a0.animate().cancel();
                        if (z10) {
                            l5Var2.a0.setVisibility(0);
                            l5Var2.a0.animate().alpha(1.0f).setDuration(180L).setInterpolator(bs.g).start();
                        } else {
                            l5Var2.a0.setAlpha(0.0f);
                            l5Var2.a0.setVisibility(4);
                        }
                    }
                }
                View m10 = l5Var2.a.V2.m(l5Var2.f);
                float y3 = m10 != null ? m10.getY() : 0.0f;
                int height = m10 != null ? m10.getHeight() : 0;
                if (m10 != z4Var.a || y3 != z4Var.b || height != z4Var.c) {
                    z4Var.a = m10;
                    z4Var.b = y3;
                    z4Var.c = height;
                    l5Var2.M0();
                    break;
                }
                break;
            case 2:
                w7 w7Var = (w7) this.b;
                v5 v5Var = w7Var.c;
                float cardRotationX = v5Var.getCardRotationX();
                float cardRotationY = v5Var.getCardRotationY();
                if (cardRotationX != w7Var.a0 || cardRotationY != w7Var.b0) {
                    w7Var.a0 = cardRotationX;
                    w7Var.b0 = cardRotationY;
                    w7Var.L.invalidate();
                    break;
                }
                break;
            default:
                l9 l9Var = (l9) ((ei.m5) this.b).c;
                ei.m5 m5Var = l9Var.v;
                if (m5Var != null && l9Var.W != null && m5Var.getHeight() > 0 && l9Var.W.getHeight() > 0) {
                    float paddingTop = l9Var.fragmentView.getPaddingTop();
                    if (l9Var.s.getVisibility() == 0) {
                        paddingTop = Math.max(paddingTop, (l9Var.s.getScaleY() * (l9Var.s.getContentBottom() - l9Var.s.getPivotY())) + l9Var.s.getPivotY() + l9Var.s.getY());
                    }
                    float max = Math.max(0.0f, Math.min(l9Var.fragmentView.getHeight() - l9Var.fragmentView.getPaddingBottom(), l9Var.W.getY()) - paddingTop);
                    float min = Math.min(1.0f, Math.max(0.0f, max - (Math.min(AndroidUtilities.dp(12.0f), max / 4.0f) * 2.0f)) / l9Var.v.getHeight());
                    l9Var.v.setPivotX(r5.getWidth() / 2.0f);
                    l9Var.v.setPivotY(r5.getHeight() / 2.0f);
                    l9Var.v.setScaleX(min);
                    l9Var.v.setScaleY(min);
                    l9Var.v.setTranslationY((((max / 2.0f) + paddingTop) - r4.getTop()) - (l9Var.v.getHeight() / 2.0f));
                }
                if (l9Var.X != null || l9Var.Y < 1.0f) {
                    l9Var.A0();
                    break;
                }
                break;
        }
        return true;
    }
}
