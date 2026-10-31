package org.telegram.ui.Wallet;

import android.view.View;
import android.view.ViewTreeObserver;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.ii;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class n5 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ n5(int i10, View view) {
        this.a = i10;
        this.b = view;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ii iiVar;
        switch (this.a) {
            case 0:
                b6 b6Var = (b6) ((fg.i) this.b).c;
                if (b6Var.F) {
                    b6Var.R0();
                    break;
                }
                break;
            case 1:
                p5 p5Var = (p5) this.b;
                b6 b6Var2 = p5Var.e;
                if (b6Var2.Z != null && (iiVar = b6Var2.a) != null) {
                    boolean z10 = b6Var2.o0 && !iiVar.canScrollVertically(1);
                    if (b6Var2.b0 != z10) {
                        b6Var2.b0 = z10;
                        b6Var2.Z.animate().cancel();
                        if (z10) {
                            b6Var2.Z.setVisibility(0);
                            b6Var2.Z.animate().alpha(1.0f).setDuration(180L).setInterpolator(gr.g).start();
                        } else {
                            b6Var2.Z.setAlpha(0.0f);
                            b6Var2.Z.setVisibility(4);
                        }
                    }
                }
                View m10 = b6Var2.a.e3.m(b6Var2.h);
                float y3 = m10 != null ? m10.getY() : 0.0f;
                int height = m10 != null ? m10.getHeight() : 0;
                if (m10 != p5Var.a || y3 != p5Var.b || height != p5Var.c) {
                    p5Var.a = m10;
                    p5Var.b = y3;
                    p5Var.c = height;
                    b6Var2.S0();
                    break;
                }
                break;
            case 2:
                h8 h8Var = (h8) this.b;
                l6 l6Var = h8Var.c;
                float cardRotationX = l6Var.getCardRotationX();
                float cardRotationY = l6Var.getCardRotationY();
                if (cardRotationX != h8Var.a0 || cardRotationY != h8Var.b0) {
                    h8Var.a0 = cardRotationX;
                    h8Var.b0 = cardRotationY;
                    h8Var.L.invalidate();
                    break;
                }
                break;
            default:
                r9 r9Var = (r9) ((jg.d0) this.b).c;
                jg.d0 d0Var = r9Var.x;
                if (d0Var != null && r9Var.Z != null && d0Var.getHeight() > 0 && r9Var.Z.getHeight() > 0) {
                    float paddingTop = r9Var.fragmentView.getPaddingTop();
                    if (r9Var.w.getVisibility() == 0) {
                        paddingTop = Math.max(paddingTop, (r9Var.w.getScaleY() * (r9Var.w.getContentBottom() - r9Var.w.getPivotY())) + r9Var.w.getPivotY() + r9Var.w.getY());
                    }
                    float max = Math.max(0.0f, Math.min(r9Var.fragmentView.getHeight() - r9Var.fragmentView.getPaddingBottom(), r9Var.Z.getY()) - paddingTop);
                    float min = Math.min(1.0f, Math.max(0.0f, max - (Math.min(org.telegram.messenger.i0.L(12.0f), max / 4.0f) * 2.0f)) / r9Var.x.getHeight());
                    r9Var.x.setPivotX(r5.getWidth() / 2.0f);
                    r9Var.x.setPivotY(r5.getHeight() / 2.0f);
                    r9Var.x.setScaleX(min);
                    r9Var.x.setScaleY(min);
                    r9Var.x.setTranslationY((((max / 2.0f) + paddingTop) - r4.getTop()) - (r9Var.x.getHeight() / 2.0f));
                }
                if (r9Var.a0 != null || r9Var.b0 < 1.0f) {
                    r9Var.F0();
                    break;
                }
                break;
        }
        return true;
    }
}
