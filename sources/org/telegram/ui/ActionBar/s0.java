package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import org.telegram.ui.Cells.s7;
import org.telegram.ui.Components.m9;
import org.telegram.ui.Components.xe0;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class s0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;

    public /* synthetic */ s0(Object obj, float f10, int i3) {
        this.a = i3;
        this.c = obj;
        this.b = f10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i3 = this.a;
        int i10 = 1;
        float f10 = this.b;
        Object obj = this.c;
        switch (i3) {
            case 0:
                v0 v0Var = (v0) obj;
                v0Var.U = null;
                v0Var.a = f10;
                v0Var.invalidate();
                break;
            case 1:
                i3 i3Var = (i3) obj;
                i3Var.i = f10;
                j3 j3Var = i3Var.b;
                if (j3Var != null) {
                    j3Var.invalidate();
                    break;
                }
                break;
            case 2:
                org.telegram.ui.Cells.l6 l6Var = (org.telegram.ui.Cells.l6) obj;
                l6Var.G = f10;
                l6Var.invalidate();
                break;
            case 3:
                ColorMatrix colorMatrix = new ColorMatrix();
                s7 s7Var = (s7) obj;
                s7Var.w = f10;
                colorMatrix.setSaturation(f10);
                if (k6.I.q()) {
                    org.telegram.messenger.g0.h(colorMatrix, (1.0f - s7Var.w) * (-0.3f));
                }
                s7Var.d.setEmojiColorFilter(new ColorMatrixColorFilter(colorMatrix));
                break;
            case 4:
                m9 m9Var = (m9) obj;
                m9Var.g = f10;
                m9Var.invalidateSelf();
                break;
            case 5:
                xe0 xe0Var = (xe0) obj;
                xe0Var.I.e();
                xe0Var.b = f10;
                if (f10 <= 0.0f) {
                    xe0Var.H = -1;
                }
                xe0Var.c(true);
                xe0Var.f = false;
                if (xe0Var.Q != null && Math.abs(f10 - 1.0f) < 0.01f) {
                    xe0Var.Q.run();
                    break;
                }
                break;
            case 6:
                org.telegram.ui.Wallet.n3 n3Var = (org.telegram.ui.Wallet.n3) obj;
                org.telegram.ui.Wallet.f6 f6Var = n3Var.r;
                f6Var.getClass();
                f6Var.setLayerType(0, null);
                if (f10 != 0.0f) {
                    if (!n3Var.S) {
                        ValueAnimator valueAnimator = n3Var.Q;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(n3Var.R, 1.0f);
                        n3Var.Q = ofFloat;
                        ofFloat.setDuration(320L);
                        n3Var.Q.setInterpolator(xq.g);
                        n3Var.Q.addUpdateListener(new org.telegram.ui.Wallet.k3(n3Var, i10));
                        n3Var.Q.start();
                        break;
                    }
                } else {
                    n3Var.b();
                    break;
                }
                break;
            default:
                org.telegram.ui.Wallet.w5 w5Var = (org.telegram.ui.Wallet.w5) obj;
                if (w5Var.n0 == animator) {
                    w5Var.n0 = null;
                    w5Var.M0(f10);
                    w5Var.q0.k(false);
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 5:
                xe0 xe0Var = (xe0) this.c;
                xe0Var.f = true;
                xe0Var.c = this.b;
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
