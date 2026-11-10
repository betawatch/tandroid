package org.telegram.ui.Wallet;

import android.view.View;
import android.view.ViewTreeObserver;
import org.telegram.ui.Components.wq;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes4.dex */
public final /* synthetic */ class m5 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ m5(int i7, View view) {
        this.a = i7;
        this.b = view;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        fi.w3 w3Var;
        switch (this.a) {
            case 0:
                z5 z5Var = (z5) ((bi.x5) this.b).c;
                if (z5Var.F) {
                    z5Var.T0();
                    break;
                }
                break;
            case 1:
                o5 o5Var = (o5) this.b;
                z5 z5Var2 = o5Var.e;
                if (z5Var2.Z != null && (w3Var = z5Var2.a) != null) {
                    boolean z9 = z5Var2.o0 && !w3Var.canScrollVertically(1);
                    if (z5Var2.b0 != z9) {
                        z5Var2.b0 = z9;
                        z5Var2.Z.animate().cancel();
                        if (z9) {
                            z5Var2.Z.setVisibility(0);
                            z5Var2.Z.animate().alpha(1.0f).setDuration(180L).setInterpolator(wq.g).start();
                        } else {
                            z5Var2.Z.setAlpha(0.0f);
                            z5Var2.Z.setVisibility(4);
                        }
                    }
                }
                View m10 = z5Var2.a.e3.m(z5Var2.h);
                float y10 = m10 != null ? m10.getY() : 0.0f;
                int height = m10 != null ? m10.getHeight() : 0;
                if (m10 != o5Var.a || y10 != o5Var.b || height != o5Var.c) {
                    o5Var.a = m10;
                    o5Var.b = y10;
                    o5Var.c = height;
                    z5Var2.U0();
                    break;
                }
                break;
            case 2:
                d8 d8Var = (d8) this.b;
                i6 i6Var = d8Var.c;
                float cardRotationX = i6Var.getCardRotationX();
                float cardRotationY = i6Var.getCardRotationY();
                if (cardRotationX != d8Var.a0 || cardRotationY != d8Var.b0) {
                    d8Var.a0 = cardRotationX;
                    d8Var.b0 = cardRotationY;
                    d8Var.L.invalidate();
                    break;
                }
                break;
            default:
                o9 o9Var = (o9) ((fi.a5) this.b).c;
                fi.a5 a5Var = o9Var.x;
                if (a5Var != null && o9Var.Z != null && a5Var.getHeight() > 0 && o9Var.Z.getHeight() > 0) {
                    float paddingTop = o9Var.fragmentView.getPaddingTop();
                    if (o9Var.w.getVisibility() == 0) {
                        paddingTop = Math.max(paddingTop, (o9Var.w.getScaleY() * (o9Var.w.getContentBottom() - o9Var.w.getPivotY())) + o9Var.w.getPivotY() + o9Var.w.getY());
                    }
                    float max = Math.max(0.0f, Math.min(o9Var.fragmentView.getHeight() - o9Var.fragmentView.getPaddingBottom(), o9Var.Z.getY()) - paddingTop);
                    float min = Math.min(1.0f, Math.max(0.0f, max - (Math.min(org.telegram.messenger.g0.L(12.0f), max / 4.0f) * 2.0f)) / o9Var.x.getHeight());
                    o9Var.x.setPivotX(r5.getWidth() / 2.0f);
                    o9Var.x.setPivotY(r5.getHeight() / 2.0f);
                    o9Var.x.setScaleX(min);
                    o9Var.x.setScaleY(min);
                    o9Var.x.setTranslationY((((max / 2.0f) + paddingTop) - r4.getTop()) - (o9Var.x.getHeight() / 2.0f));
                }
                if (o9Var.a0 != null || o9Var.b0 < 1.0f) {
                    o9Var.G0();
                    break;
                }
                break;
        }
        return true;
    }
}
