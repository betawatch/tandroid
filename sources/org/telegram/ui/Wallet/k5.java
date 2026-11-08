package org.telegram.ui.Wallet;

import android.view.View;
import android.view.ViewTreeObserver;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes4.dex */
public final /* synthetic */ class k5 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ k5(int i7, View view) {
        this.a = i7;
        this.b = view;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        fi.w3 w3Var;
        switch (this.a) {
            case 0:
                x5 x5Var = (x5) ((bi.x5) this.b).c;
                if (x5Var.F) {
                    x5Var.S0();
                    break;
                }
                break;
            case 1:
                m5 m5Var = (m5) this.b;
                x5 x5Var2 = m5Var.e;
                if (x5Var2.Z != null && (w3Var = x5Var2.a) != null) {
                    boolean z9 = x5Var2.o0 && !w3Var.canScrollVertically(1);
                    if (x5Var2.b0 != z9) {
                        x5Var2.b0 = z9;
                        x5Var2.Z.animate().cancel();
                        if (z9) {
                            x5Var2.Z.setVisibility(0);
                            x5Var2.Z.animate().alpha(1.0f).setDuration(180L).setInterpolator(xq.g).start();
                        } else {
                            x5Var2.Z.setAlpha(0.0f);
                            x5Var2.Z.setVisibility(4);
                        }
                    }
                }
                View m10 = x5Var2.a.e3.m(x5Var2.h);
                float y10 = m10 != null ? m10.getY() : 0.0f;
                int height = m10 != null ? m10.getHeight() : 0;
                if (m10 != m5Var.a || y10 != m5Var.b || height != m5Var.c) {
                    m5Var.a = m10;
                    m5Var.b = y10;
                    m5Var.c = height;
                    x5Var2.T0();
                    break;
                }
                break;
            case 2:
                b8 b8Var = (b8) this.b;
                g6 g6Var = b8Var.c;
                float cardRotationX = g6Var.getCardRotationX();
                float cardRotationY = g6Var.getCardRotationY();
                if (cardRotationX != b8Var.a0 || cardRotationY != b8Var.b0) {
                    b8Var.a0 = cardRotationX;
                    b8Var.b0 = cardRotationY;
                    b8Var.L.invalidate();
                    break;
                }
                break;
            default:
                m9 m9Var = (m9) ((fi.a5) this.b).c;
                fi.a5 a5Var = m9Var.x;
                if (a5Var != null && m9Var.Z != null && a5Var.getHeight() > 0 && m9Var.Z.getHeight() > 0) {
                    float paddingTop = m9Var.fragmentView.getPaddingTop();
                    if (m9Var.w.getVisibility() == 0) {
                        paddingTop = Math.max(paddingTop, (m9Var.w.getScaleY() * (m9Var.w.getContentBottom() - m9Var.w.getPivotY())) + m9Var.w.getPivotY() + m9Var.w.getY());
                    }
                    float max = Math.max(0.0f, Math.min(m9Var.fragmentView.getHeight() - m9Var.fragmentView.getPaddingBottom(), m9Var.Z.getY()) - paddingTop);
                    float min = Math.min(1.0f, Math.max(0.0f, max - (Math.min(org.telegram.messenger.g0.L(12.0f), max / 4.0f) * 2.0f)) / m9Var.x.getHeight());
                    m9Var.x.setPivotX(r5.getWidth() / 2.0f);
                    m9Var.x.setPivotY(r5.getHeight() / 2.0f);
                    m9Var.x.setScaleX(min);
                    m9Var.x.setScaleY(min);
                    m9Var.x.setTranslationY((((max / 2.0f) + paddingTop) - r4.getTop()) - (m9Var.x.getHeight() / 2.0f));
                }
                if (m9Var.a0 != null || m9Var.b0 < 1.0f) {
                    m9Var.G0();
                    break;
                }
                break;
        }
        return true;
    }
}
