package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import org.telegram.ui.Cells.x7;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.i9;
import org.telegram.ui.Components.yf0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class v0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;

    public /* synthetic */ v0(Object obj, float f7, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = f7;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.a;
        int i11 = 1;
        float f7 = this.b;
        Object obj = this.c;
        switch (i10) {
            case 0:
                y0 y0Var = (y0) obj;
                y0Var.T = null;
                y0Var.a = f7;
                y0Var.invalidate();
                break;
            case 1:
                p3 p3Var = (p3) obj;
                p3Var.i = f7;
                q3 q3Var = p3Var.b;
                if (q3Var != null) {
                    q3Var.invalidate();
                    break;
                }
                break;
            case 2:
                org.telegram.ui.Cells.q6 q6Var = (org.telegram.ui.Cells.q6) obj;
                q6Var.F = f7;
                q6Var.invalidate();
                break;
            case 3:
                ColorMatrix colorMatrix = new ColorMatrix();
                x7 x7Var = (x7) obj;
                x7Var.w = f7;
                colorMatrix.setSaturation(f7);
                if (t6.I.q()) {
                    org.telegram.messenger.i0.h(colorMatrix, (1.0f - x7Var.w) * (-0.3f));
                }
                x7Var.d.setEmojiColorFilter(new ColorMatrixColorFilter(colorMatrix));
                break;
            case 4:
                i9 i9Var = (i9) obj;
                i9Var.g = f7;
                i9Var.invalidateSelf();
                break;
            case 5:
                yf0 yf0Var = (yf0) obj;
                yf0Var.H.e();
                yf0Var.b = f7;
                if (f7 <= 0.0f) {
                    yf0Var.G = -1;
                }
                yf0Var.c(true);
                yf0Var.f = false;
                if (yf0Var.P != null && Math.abs(f7 - 1.0f) < 0.01f) {
                    yf0Var.P.run();
                    break;
                }
                break;
            case 6:
                org.telegram.ui.Wallet.p3 p3Var2 = (org.telegram.ui.Wallet.p3) obj;
                org.telegram.ui.Wallet.l6 l6Var = p3Var2.r;
                l6Var.getClass();
                l6Var.setLayerType(0, null);
                if (f7 != 0.0f) {
                    if (!p3Var2.R) {
                        ValueAnimator valueAnimator = p3Var2.P;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(p3Var2.Q, 1.0f);
                        p3Var2.P = ofFloat;
                        ofFloat.setDuration(320L);
                        p3Var2.P.setInterpolator(gr.g);
                        p3Var2.P.addUpdateListener(new org.telegram.ui.Wallet.m3(p3Var2, i11));
                        p3Var2.P.start();
                        break;
                    }
                } else {
                    p3Var2.b();
                    break;
                }
                break;
            default:
                org.telegram.ui.Wallet.b6 b6Var = (org.telegram.ui.Wallet.b6) obj;
                if (b6Var.m0 == animator) {
                    b6Var.m0 = null;
                    b6Var.L0(f7);
                    b6Var.p0.o(false);
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 5:
                yf0 yf0Var = (yf0) this.c;
                yf0Var.f = true;
                yf0Var.c = this.b;
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
