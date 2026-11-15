package org.telegram.ui.Wallet;

import android.view.View;
import android.view.ViewTreeObserver;
import org.telegram.ui.Components.er;
import org.telegram.ui.w61;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
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
        bi.v3 v3Var;
        switch (this.a) {
            case 0:
                y5 y5Var = (y5) ((w61) this.b).c;
                if (y5Var.G) {
                    y5Var.T0();
                    break;
                }
                break;
            case 1:
                n5 n5Var = (n5) this.b;
                y5 y5Var2 = n5Var.e;
                if (y5Var2.a0 != null && (v3Var = y5Var2.a) != null) {
                    boolean z10 = y5Var2.p0 && !v3Var.canScrollVertically(1);
                    if (y5Var2.c0 != z10) {
                        y5Var2.c0 = z10;
                        y5Var2.a0.animate().cancel();
                        if (z10) {
                            y5Var2.a0.setVisibility(0);
                            y5Var2.a0.animate().alpha(1.0f).setDuration(180L).setInterpolator(er.g).start();
                        } else {
                            y5Var2.a0.setAlpha(0.0f);
                            y5Var2.a0.setVisibility(4);
                        }
                    }
                }
                View m10 = y5Var2.a.f3.m(y5Var2.h);
                float y10 = m10 != null ? m10.getY() : 0.0f;
                int height = m10 != null ? m10.getHeight() : 0;
                if (m10 != n5Var.a || y10 != n5Var.b || height != n5Var.c) {
                    n5Var.a = m10;
                    n5Var.b = y10;
                    n5Var.c = height;
                    y5Var2.U0();
                    break;
                }
                break;
            case 2:
                c8 c8Var = (c8) this.b;
                h6 h6Var = c8Var.c;
                float cardRotationX = h6Var.getCardRotationX();
                float cardRotationY = h6Var.getCardRotationY();
                if (cardRotationX != c8Var.b0 || cardRotationY != c8Var.c0) {
                    c8Var.b0 = cardRotationX;
                    c8Var.c0 = cardRotationY;
                    c8Var.M.invalidate();
                    break;
                }
                break;
            default:
                p9 p9Var = (p9) ((hi.y4) this.b).c;
                hi.y4 y4Var = p9Var.x;
                if (y4Var != null && p9Var.a0 != null && y4Var.getHeight() > 0 && p9Var.a0.getHeight() > 0) {
                    float paddingTop = p9Var.fragmentView.getPaddingTop();
                    if (p9Var.w.getVisibility() == 0) {
                        paddingTop = Math.max(paddingTop, (p9Var.w.getScaleY() * (p9Var.w.getContentBottom() - p9Var.w.getPivotY())) + p9Var.w.getPivotY() + p9Var.w.getY());
                    }
                    float max = Math.max(0.0f, Math.min(p9Var.fragmentView.getHeight() - p9Var.fragmentView.getPaddingBottom(), p9Var.a0.getY()) - paddingTop);
                    float min = Math.min(1.0f, Math.max(0.0f, max - (Math.min(org.telegram.messenger.g0.L(12.0f), max / 4.0f) * 2.0f)) / p9Var.x.getHeight());
                    p9Var.x.setPivotX(r5.getWidth() / 2.0f);
                    p9Var.x.setPivotY(r5.getHeight() / 2.0f);
                    p9Var.x.setScaleX(min);
                    p9Var.x.setScaleY(min);
                    p9Var.x.setTranslationY((((max / 2.0f) + paddingTop) - r4.getTop()) - (p9Var.x.getHeight() / 2.0f));
                }
                if (p9Var.b0 != null || p9Var.c0 < 1.0f) {
                    p9Var.G0();
                    break;
                }
                break;
        }
        return true;
    }
}
