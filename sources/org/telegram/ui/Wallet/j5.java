package org.telegram.ui.Wallet;

import android.view.View;
import android.view.ViewTreeObserver;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes4.dex */
public final /* synthetic */ class j5 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ j5(int i7, View view) {
        this.a = i7;
        this.b = view;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        fi.w3 w3Var;
        switch (this.a) {
            case 0:
                w5 w5Var = (w5) ((bi.x5) this.b).c;
                if (w5Var.F) {
                    w5Var.S0();
                    break;
                }
                break;
            case 1:
                l5 l5Var = (l5) this.b;
                w5 w5Var2 = l5Var.e;
                if (w5Var2.Z != null && (w3Var = w5Var2.a) != null) {
                    boolean z9 = w5Var2.o0 && !w3Var.canScrollVertically(1);
                    if (w5Var2.b0 != z9) {
                        w5Var2.b0 = z9;
                        w5Var2.Z.animate().cancel();
                        if (z9) {
                            w5Var2.Z.setVisibility(0);
                            w5Var2.Z.animate().alpha(1.0f).setDuration(180L).setInterpolator(xq.g).start();
                        } else {
                            w5Var2.Z.setAlpha(0.0f);
                            w5Var2.Z.setVisibility(4);
                        }
                    }
                }
                View m10 = w5Var2.a.e3.m(w5Var2.h);
                float y10 = m10 != null ? m10.getY() : 0.0f;
                int height = m10 != null ? m10.getHeight() : 0;
                if (m10 != l5Var.a || y10 != l5Var.b || height != l5Var.c) {
                    l5Var.a = m10;
                    l5Var.b = y10;
                    l5Var.c = height;
                    w5Var2.T0();
                    break;
                }
                break;
            case 2:
                a8 a8Var = (a8) this.b;
                f6 f6Var = a8Var.c;
                float cardRotationX = f6Var.getCardRotationX();
                float cardRotationY = f6Var.getCardRotationY();
                if (cardRotationX != a8Var.a0 || cardRotationY != a8Var.b0) {
                    a8Var.a0 = cardRotationX;
                    a8Var.b0 = cardRotationY;
                    a8Var.L.invalidate();
                    break;
                }
                break;
            default:
                l9 l9Var = (l9) ((fi.a5) this.b).c;
                fi.a5 a5Var = l9Var.x;
                if (a5Var != null && l9Var.Z != null && a5Var.getHeight() > 0 && l9Var.Z.getHeight() > 0) {
                    float paddingTop = l9Var.fragmentView.getPaddingTop();
                    if (l9Var.w.getVisibility() == 0) {
                        paddingTop = Math.max(paddingTop, (l9Var.w.getScaleY() * (l9Var.w.getContentBottom() - l9Var.w.getPivotY())) + l9Var.w.getPivotY() + l9Var.w.getY());
                    }
                    float max = Math.max(0.0f, Math.min(l9Var.fragmentView.getHeight() - l9Var.fragmentView.getPaddingBottom(), l9Var.Z.getY()) - paddingTop);
                    float min = Math.min(1.0f, Math.max(0.0f, max - (Math.min(org.telegram.messenger.g0.L(12.0f), max / 4.0f) * 2.0f)) / l9Var.x.getHeight());
                    l9Var.x.setPivotX(r5.getWidth() / 2.0f);
                    l9Var.x.setPivotY(r5.getHeight() / 2.0f);
                    l9Var.x.setScaleX(min);
                    l9Var.x.setScaleY(min);
                    l9Var.x.setTranslationY((((max / 2.0f) + paddingTop) - r4.getTop()) - (l9Var.x.getHeight() / 2.0f));
                }
                if (l9Var.a0 != null || l9Var.b0 < 1.0f) {
                    l9Var.G0();
                    break;
                }
                break;
        }
        return true;
    }
}
