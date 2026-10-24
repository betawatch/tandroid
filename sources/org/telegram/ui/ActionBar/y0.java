package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Cells.y7;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.th0;
import org.telegram.ui.Components.y9;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
                y3 y3Var = (y3) obj;
                y3Var.i = f7;
                z3 z3Var = y3Var.b;
                if (z3Var != null) {
                    z3Var.invalidate();
                    break;
                }
                break;
            case 2:
                org.telegram.ui.Cells.o6 o6Var = (org.telegram.ui.Cells.o6) obj;
                o6Var.F = f7;
                o6Var.invalidate();
                break;
            case 3:
                ColorMatrix colorMatrix = new ColorMatrix();
                y7 y7Var = (y7) obj;
                y7Var.v = f7;
                colorMatrix.setSaturation(f7);
                if (k6.I.q()) {
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
                th0 th0Var = (th0) obj;
                th0Var.H.unlock();
                th0Var.b = f7;
                if (f7 <= 0.0f) {
                    th0Var.G = -1;
                }
                th0Var.c(true);
                th0Var.f = false;
                if (th0Var.O != null && Math.abs(f7 - 1.0f) < 0.01f) {
                    th0Var.O.run();
                    break;
                }
                break;
            case 6:
                org.telegram.ui.Wallet.y2 y2Var = (org.telegram.ui.Wallet.y2) obj;
                org.telegram.ui.Wallet.x5 x5Var = y2Var.r;
                x5Var.getClass();
                x5Var.setLayerType(0, null);
                if (f7 != 0.0f) {
                    if (!y2Var.R) {
                        ValueAnimator valueAnimator = y2Var.P;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(y2Var.Q, 1.0f);
                        y2Var.P = ofFloat;
                        ofFloat.setDuration(320L);
                        y2Var.P.setInterpolator(bs.g);
                        y2Var.P.addUpdateListener(new org.telegram.ui.Wallet.v2(y2Var, i11));
                        y2Var.P.start();
                        break;
                    }
                } else {
                    y2Var.b();
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
                th0 th0Var = (th0) this.c;
                th0Var.f = true;
                th0Var.c = this.b;
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
