package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Cells.n6;
import org.telegram.ui.Cells.y7;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.qh0;
import org.telegram.ui.Components.y9;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class y0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;

    public /* synthetic */ y0(Object obj, float f7, int i10) {
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
                b1 b1Var = (b1) obj;
                b1Var.T = null;
                b1Var.a = f7;
                b1Var.invalidate();
                break;
            case 1:
                v3 v3Var = (v3) obj;
                v3Var.i = f7;
                w3 w3Var = v3Var.b;
                if (w3Var != null) {
                    w3Var.invalidate();
                    break;
                }
                break;
            case 2:
                n6 n6Var = (n6) obj;
                n6Var.F = f7;
                n6Var.invalidate();
                break;
            case 3:
                ColorMatrix colorMatrix = new ColorMatrix();
                y7 y7Var = (y7) obj;
                y7Var.v = f7;
                colorMatrix.setSaturation(f7);
                if (h6.I.q()) {
                    AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, (1.0f - y7Var.v) * (-0.3f));
                }
                y7Var.d.setEmojiColorFilter(new ColorMatrixColorFilter(colorMatrix));
                break;
            case 4:
                y9 y9Var = (y9) obj;
                y9Var.g = f7;
                y9Var.invalidateSelf();
                break;
            case 5:
                qh0 qh0Var = (qh0) obj;
                qh0Var.H.unlock();
                qh0Var.b = f7;
                if (f7 <= 0.0f) {
                    qh0Var.G = -1;
                }
                qh0Var.c(true);
                qh0Var.f = false;
                if (qh0Var.O != null && Math.abs(f7 - 1.0f) < 0.01f) {
                    qh0Var.O.run();
                    break;
                }
                break;
            case 6:
                org.telegram.ui.Wallet.z2 z2Var = (org.telegram.ui.Wallet.z2) obj;
                org.telegram.ui.Wallet.x5 x5Var = z2Var.r;
                x5Var.getClass();
                x5Var.setLayerType(0, null);
                if (f7 != 0.0f) {
                    if (!z2Var.R) {
                        ValueAnimator valueAnimator = z2Var.P;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(z2Var.Q, 1.0f);
                        z2Var.P = ofFloat;
                        ofFloat.setDuration(320L);
                        z2Var.P.setInterpolator(bs.g);
                        z2Var.P.addUpdateListener(new org.telegram.ui.Wallet.w2(z2Var, i11));
                        z2Var.P.start();
                        break;
                    }
                } else {
                    z2Var.b();
                    break;
                }
                break;
            default:
                org.telegram.ui.Wallet.o5 o5Var = (org.telegram.ui.Wallet.o5) obj;
                if (o5Var.l0 == animator) {
                    o5Var.l0 = null;
                    o5Var.H0(f7);
                    o5Var.o0.o(false);
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 5:
                qh0 qh0Var = (qh0) this.c;
                qh0Var.f = true;
                qh0Var.c = this.b;
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
