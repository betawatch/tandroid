package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import org.telegram.ui.Cells.t7;
import org.telegram.ui.Components.n9;
import org.telegram.ui.Components.we0;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class t0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;

    public /* synthetic */ t0(Object obj, float f10, int i7) {
        this.a = i7;
        this.c = obj;
        this.b = f10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i7 = this.a;
        int i10 = 1;
        float f10 = this.b;
        Object obj = this.c;
        switch (i7) {
            case 0:
                w0 w0Var = (w0) obj;
                w0Var.T = null;
                w0Var.a = f10;
                w0Var.invalidate();
                break;
            case 1:
                j3 j3Var = (j3) obj;
                j3Var.i = f10;
                k3 k3Var = j3Var.b;
                if (k3Var != null) {
                    k3Var.invalidate();
                    break;
                }
                break;
            case 2:
                org.telegram.ui.Cells.m6 m6Var = (org.telegram.ui.Cells.m6) obj;
                m6Var.F = f10;
                m6Var.invalidate();
                break;
            case 3:
                ColorMatrix colorMatrix = new ColorMatrix();
                t7 t7Var = (t7) obj;
                t7Var.w = f10;
                colorMatrix.setSaturation(f10);
                if (l6.I.q()) {
                    org.telegram.messenger.g0.h(colorMatrix, (1.0f - t7Var.w) * (-0.3f));
                }
                t7Var.d.setEmojiColorFilter(new ColorMatrixColorFilter(colorMatrix));
                break;
            case 4:
                n9 n9Var = (n9) obj;
                n9Var.g = f10;
                n9Var.invalidateSelf();
                break;
            case 5:
                we0 we0Var = (we0) obj;
                we0Var.H.e();
                we0Var.b = f10;
                if (f10 <= 0.0f) {
                    we0Var.G = -1;
                }
                we0Var.c(true);
                we0Var.f = false;
                if (we0Var.P != null && Math.abs(f10 - 1.0f) < 0.01f) {
                    we0Var.P.run();
                    break;
                }
                break;
            case 6:
                org.telegram.ui.Wallet.n3 n3Var = (org.telegram.ui.Wallet.n3) obj;
                org.telegram.ui.Wallet.f6 f6Var = n3Var.r;
                f6Var.getClass();
                f6Var.setLayerType(0, null);
                if (f10 != 0.0f) {
                    if (!n3Var.R) {
                        ValueAnimator valueAnimator = n3Var.P;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(n3Var.Q, 1.0f);
                        n3Var.P = ofFloat;
                        ofFloat.setDuration(320L);
                        n3Var.P.setInterpolator(xq.g);
                        n3Var.P.addUpdateListener(new org.telegram.ui.Wallet.k3(n3Var, i10));
                        n3Var.P.start();
                        break;
                    }
                } else {
                    n3Var.b();
                    break;
                }
                break;
            default:
                org.telegram.ui.Wallet.w5 w5Var = (org.telegram.ui.Wallet.w5) obj;
                if (w5Var.m0 == animator) {
                    w5Var.m0 = null;
                    w5Var.M0(f10);
                    w5Var.p0.o(false);
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 5:
                we0 we0Var = (we0) this.c;
                we0Var.f = true;
                we0Var.c = this.b;
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
