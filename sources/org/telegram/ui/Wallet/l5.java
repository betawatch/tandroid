package org.telegram.ui.Wallet;

import android.view.View;
import android.view.ViewTreeObserver;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes4.dex */
public final /* synthetic */ class l5 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ l5(int i7, View view) {
        this.a = i7;
        this.b = view;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        fi.w3 w3Var;
        switch (this.a) {
            case 0:
                y5 y5Var = (y5) ((bi.x5) this.b).c;
                if (y5Var.F) {
                    y5Var.S0();
                    break;
                }
                break;
            case 1:
                n5 n5Var = (n5) this.b;
                y5 y5Var2 = n5Var.e;
                if (y5Var2.Z != null && (w3Var = y5Var2.a) != null) {
                    boolean z9 = y5Var2.o0 && !w3Var.canScrollVertically(1);
                    if (y5Var2.b0 != z9) {
                        y5Var2.b0 = z9;
                        y5Var2.Z.animate().cancel();
                        if (z9) {
                            y5Var2.Z.setVisibility(0);
                            y5Var2.Z.animate().alpha(1.0f).setDuration(180L).setInterpolator(xq.g).start();
                        } else {
                            y5Var2.Z.setAlpha(0.0f);
                            y5Var2.Z.setVisibility(4);
                        }
                    }
                }
                View m10 = y5Var2.a.e3.m(y5Var2.h);
                float y10 = m10 != null ? m10.getY() : 0.0f;
                int height = m10 != null ? m10.getHeight() : 0;
                if (m10 != n5Var.a || y10 != n5Var.b || height != n5Var.c) {
                    n5Var.a = m10;
                    n5Var.b = y10;
                    n5Var.c = height;
                    y5Var2.T0();
                    break;
                }
                break;
            case 2:
                c8 c8Var = (c8) this.b;
                h6 h6Var = c8Var.c;
                float cardRotationX = h6Var.getCardRotationX();
                float cardRotationY = h6Var.getCardRotationY();
                if (cardRotationX != c8Var.a0 || cardRotationY != c8Var.b0) {
                    c8Var.a0 = cardRotationX;
                    c8Var.b0 = cardRotationY;
                    c8Var.L.invalidate();
                    break;
                }
                break;
            default:
                n9 n9Var = (n9) ((fi.a5) this.b).c;
                fi.a5 a5Var = n9Var.x;
                if (a5Var != null && n9Var.Z != null && a5Var.getHeight() > 0 && n9Var.Z.getHeight() > 0) {
                    float paddingTop = n9Var.fragmentView.getPaddingTop();
                    if (n9Var.w.getVisibility() == 0) {
                        paddingTop = Math.max(paddingTop, (n9Var.w.getScaleY() * (n9Var.w.getContentBottom() - n9Var.w.getPivotY())) + n9Var.w.getPivotY() + n9Var.w.getY());
                    }
                    float max = Math.max(0.0f, Math.min(n9Var.fragmentView.getHeight() - n9Var.fragmentView.getPaddingBottom(), n9Var.Z.getY()) - paddingTop);
                    float min = Math.min(1.0f, Math.max(0.0f, max - (Math.min(org.telegram.messenger.g0.L(12.0f), max / 4.0f) * 2.0f)) / n9Var.x.getHeight());
                    n9Var.x.setPivotX(r5.getWidth() / 2.0f);
                    n9Var.x.setPivotY(r5.getHeight() / 2.0f);
                    n9Var.x.setScaleX(min);
                    n9Var.x.setScaleY(min);
                    n9Var.x.setTranslationY((((max / 2.0f) + paddingTop) - r4.getTop()) - (n9Var.x.getHeight() / 2.0f));
                }
                if (n9Var.a0 != null || n9Var.b0 < 1.0f) {
                    n9Var.G0();
                    break;
                }
                break;
        }
        return true;
    }
}
