package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Cells.n6;
import org.telegram.ui.Cells.y7;
import org.telegram.ui.Components.ph0;
import org.telegram.ui.Components.y9;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
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
        switch (this.a) {
            case 0:
                b1 b1Var = (b1) this.c;
                b1Var.T = null;
                b1Var.a = this.b;
                b1Var.invalidate();
                break;
            case 1:
                v3 v3Var = (v3) this.c;
                v3Var.i = this.b;
                w3 w3Var = v3Var.b;
                if (w3Var != null) {
                    w3Var.invalidate();
                    break;
                }
                break;
            case 2:
                n6 n6Var = (n6) this.c;
                n6Var.F = this.b;
                n6Var.invalidate();
                break;
            case 3:
                ColorMatrix colorMatrix = new ColorMatrix();
                y7 y7Var = (y7) this.c;
                float f7 = this.b;
                y7Var.v = f7;
                colorMatrix.setSaturation(f7);
                if (h6.I.q()) {
                    AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, (1.0f - y7Var.v) * (-0.3f));
                }
                y7Var.d.setEmojiColorFilter(new ColorMatrixColorFilter(colorMatrix));
                break;
            case 4:
                y9 y9Var = (y9) this.c;
                y9Var.g = this.b;
                y9Var.invalidateSelf();
                break;
            case 5:
                ph0 ph0Var = (ph0) this.c;
                ph0Var.H.unlock();
                float f10 = this.b;
                ph0Var.b = f10;
                if (f10 <= 0.0f) {
                    ph0Var.G = -1;
                }
                ph0Var.c(true);
                ph0Var.f = false;
                if (ph0Var.O != null && Math.abs(f10 - 1.0f) < 0.01f) {
                    ph0Var.O.run();
                    break;
                }
                break;
            case 6:
                org.telegram.ui.Wallet.z2 z2Var = (org.telegram.ui.Wallet.z2) this.c;
                z2Var.r.getClass();
                z2Var.r.setLayerType(0, null);
                if (this.b == 0.0f) {
                    z2Var.b();
                    break;
                }
                break;
            default:
                org.telegram.ui.Wallet.n5 n5Var = (org.telegram.ui.Wallet.n5) this.c;
                if (n5Var.l0 == animator) {
                    n5Var.l0 = null;
                    n5Var.G0(this.b);
                    n5Var.o0.o(false);
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 5:
                ph0 ph0Var = (ph0) this.c;
                ph0Var.f = true;
                ph0Var.c = this.b;
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
