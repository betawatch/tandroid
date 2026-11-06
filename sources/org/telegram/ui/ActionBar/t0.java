package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import org.telegram.ui.Cells.t7;
import org.telegram.ui.Components.n9;
import org.telegram.ui.Components.ve0;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
                if (k6.I.q()) {
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
                ve0 ve0Var = (ve0) obj;
                ve0Var.H.e();
                ve0Var.b = f10;
                if (f10 <= 0.0f) {
                    ve0Var.G = -1;
                }
                ve0Var.c(true);
                ve0Var.f = false;
                if (ve0Var.P != null && Math.abs(f10 - 1.0f) < 0.01f) {
                    ve0Var.P.run();
                    break;
                }
                break;
            case 6:
                org.telegram.ui.Wallet.p3 p3Var = (org.telegram.ui.Wallet.p3) obj;
                org.telegram.ui.Wallet.h6 h6Var = p3Var.r;
                h6Var.getClass();
                h6Var.setLayerType(0, null);
                if (f10 != 0.0f) {
                    if (!p3Var.R) {
                        ValueAnimator valueAnimator = p3Var.P;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(p3Var.Q, 1.0f);
                        p3Var.P = ofFloat;
                        ofFloat.setDuration(320L);
                        p3Var.P.setInterpolator(xq.g);
                        p3Var.P.addUpdateListener(new org.telegram.ui.Wallet.m3(p3Var, i10));
                        p3Var.P.start();
                        break;
                    }
                } else {
                    p3Var.b();
                    break;
                }
                break;
            default:
                org.telegram.ui.Wallet.y5 y5Var = (org.telegram.ui.Wallet.y5) obj;
                if (y5Var.m0 == animator) {
                    y5Var.m0 = null;
                    y5Var.M0(f10);
                    y5Var.p0.o(false);
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 5:
                ve0 ve0Var = (ve0) this.c;
                ve0Var.f = true;
                ve0Var.c = this.b;
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
