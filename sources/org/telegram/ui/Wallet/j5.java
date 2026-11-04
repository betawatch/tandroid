package org.telegram.ui.Wallet;

import android.view.View;
import android.view.ViewTreeObserver;
import org.telegram.ui.Components.xq;
import org.telegram.ui.n61;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class j5 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ j5(int i3, View view) {
        this.a = i3;
        this.b = view;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ai.h4 h4Var;
        switch (this.a) {
            case 0:
                w5 w5Var = (w5) ((n61) this.b).b;
                if (w5Var.G) {
                    w5Var.S0();
                    break;
                }
                break;
            case 1:
                l5 l5Var = (l5) this.b;
                w5 w5Var2 = l5Var.e;
                if (w5Var2.a0 != null && (h4Var = w5Var2.a) != null) {
                    boolean z10 = w5Var2.p0 && !h4Var.canScrollVertically(1);
                    if (w5Var2.c0 != z10) {
                        w5Var2.c0 = z10;
                        w5Var2.a0.animate().cancel();
                        if (z10) {
                            w5Var2.a0.setVisibility(0);
                            w5Var2.a0.animate().alpha(1.0f).setDuration(180L).setInterpolator(xq.g).start();
                        } else {
                            w5Var2.a0.setAlpha(0.0f);
                            w5Var2.a0.setVisibility(4);
                        }
                    }
                }
                View m10 = w5Var2.a.f3.m(w5Var2.h);
                float y9 = m10 != null ? m10.getY() : 0.0f;
                int height = m10 != null ? m10.getHeight() : 0;
                if (m10 != l5Var.a || y9 != l5Var.b || height != l5Var.c) {
                    l5Var.a = m10;
                    l5Var.b = y9;
                    l5Var.c = height;
                    w5Var2.T0();
                    break;
                }
                break;
            case 2:
                b8 b8Var = (b8) this.b;
                f6 f6Var = b8Var.c;
                float cardRotationX = f6Var.getCardRotationX();
                float cardRotationY = f6Var.getCardRotationY();
                if (cardRotationX != b8Var.b0 || cardRotationY != b8Var.c0) {
                    b8Var.b0 = cardRotationX;
                    b8Var.c0 = cardRotationY;
                    b8Var.M.invalidate();
                    break;
                }
                break;
            default:
                m9 m9Var = (m9) ((gi.y4) this.b).c;
                gi.y4 y4Var = m9Var.x;
                if (y4Var != null && m9Var.a0 != null && y4Var.getHeight() > 0 && m9Var.a0.getHeight() > 0) {
                    float paddingTop = m9Var.fragmentView.getPaddingTop();
                    if (m9Var.w.getVisibility() == 0) {
                        paddingTop = Math.max(paddingTop, (m9Var.w.getScaleY() * (m9Var.w.getContentBottom() - m9Var.w.getPivotY())) + m9Var.w.getPivotY() + m9Var.w.getY());
                    }
                    float max = Math.max(0.0f, Math.min(m9Var.fragmentView.getHeight() - m9Var.fragmentView.getPaddingBottom(), m9Var.a0.getY()) - paddingTop);
                    float min = Math.min(1.0f, Math.max(0.0f, max - (Math.min(org.telegram.messenger.g0.L(12.0f), max / 4.0f) * 2.0f)) / m9Var.x.getHeight());
                    m9Var.x.setPivotX(r5.getWidth() / 2.0f);
                    m9Var.x.setPivotY(r5.getHeight() / 2.0f);
                    m9Var.x.setScaleX(min);
                    m9Var.x.setScaleY(min);
                    m9Var.x.setTranslationY((((max / 2.0f) + paddingTop) - r4.getTop()) - (m9Var.x.getHeight() / 2.0f));
                }
                if (m9Var.b0 != null || m9Var.c0 < 1.0f) {
                    m9Var.G0();
                    break;
                }
                break;
        }
        return true;
    }
}
