package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import org.telegram.ui.Cells.s7;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.ye0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
        int i10 = 0;
        float f10 = this.b;
        Object obj = this.c;
        switch (i7) {
            case 0:
                w0 w0Var = (w0) obj;
                w0Var.U = null;
                w0Var.a = f10;
                w0Var.invalidate();
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
                if (j6.I.q()) {
                    org.telegram.messenger.g0.h(colorMatrix, (1.0f - s7Var.w) * (-0.3f));
                }
                s7Var.d.setEmojiColorFilter(new ColorMatrixColorFilter(colorMatrix));
                break;
            case 4:
                k9 k9Var = (k9) obj;
                k9Var.g = f10;
                k9Var.invalidateSelf();
                break;
            case 5:
                ye0 ye0Var = (ye0) obj;
                ye0Var.I.e();
                ye0Var.b = f10;
                if (f10 <= 0.0f) {
                    ye0Var.H = -1;
                }
                ye0Var.c(true);
                ye0Var.f = false;
                if (ye0Var.Q != null && Math.abs(f10 - 1.0f) < 0.01f) {
                    ye0Var.Q.run();
                    break;
                }
                break;
            case 6:
                org.telegram.ui.Wallet.o3 o3Var = (org.telegram.ui.Wallet.o3) obj;
                org.telegram.ui.Wallet.h6 h6Var = o3Var.r;
                h6Var.getClass();
                h6Var.setLayerType(0, null);
                if (f10 != 0.0f) {
                    if (!o3Var.S) {
                        ValueAnimator valueAnimator = o3Var.Q;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(o3Var.R, 1.0f);
                        o3Var.Q = ofFloat;
                        ofFloat.setDuration(320L);
                        o3Var.Q.setInterpolator(er.g);
                        o3Var.Q.addUpdateListener(new org.telegram.ui.Wallet.h3(o3Var, i10));
                        o3Var.Q.start();
                        break;
                    }
                } else {
                    o3Var.b();
                    break;
                }
                break;
            default:
                org.telegram.ui.Wallet.y5 y5Var = (org.telegram.ui.Wallet.y5) obj;
                if (y5Var.n0 == animator) {
                    y5Var.n0 = null;
                    y5Var.N0(f10);
                    y5Var.q0.k(false);
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 5:
                ye0 ye0Var = (ye0) this.c;
                ye0Var.f = true;
                ye0Var.c = this.b;
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
