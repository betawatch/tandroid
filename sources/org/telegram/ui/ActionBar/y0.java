package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Cells.o6;
import org.telegram.ui.Cells.z7;
import org.telegram.ui.Components.ba;
import org.telegram.ui.Components.vh0;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
                u3 u3Var = (u3) this.c;
                u3Var.i = this.b;
                v3 v3Var = u3Var.b;
                if (v3Var != null) {
                    v3Var.invalidate();
                    break;
                }
                break;
            case 2:
                o6 o6Var = (o6) this.c;
                o6Var.F = this.b;
                o6Var.invalidate();
                break;
            case 3:
                ColorMatrix colorMatrix = new ColorMatrix();
                z7 z7Var = (z7) this.c;
                float f7 = this.b;
                z7Var.v = f7;
                colorMatrix.setSaturation(f7);
                if (g6.I.q()) {
                    AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, (1.0f - z7Var.v) * (-0.3f));
                }
                z7Var.d.setEmojiColorFilter(new ColorMatrixColorFilter(colorMatrix));
                break;
            case 4:
                ba baVar = (ba) this.c;
                baVar.g = this.b;
                baVar.invalidateSelf();
                break;
            case 5:
                vh0 vh0Var = (vh0) this.c;
                vh0Var.H.unlock();
                float f10 = this.b;
                vh0Var.b = f10;
                if (f10 <= 0.0f) {
                    vh0Var.G = -1;
                }
                vh0Var.c(true);
                vh0Var.f = false;
                if (vh0Var.O != null && Math.abs(f10 - 1.0f) < 0.01f) {
                    vh0Var.O.run();
                    break;
                }
                break;
            default:
                org.telegram.ui.Wallet.a5 a5Var = (org.telegram.ui.Wallet.a5) this.c;
                if (a5Var.k0 == animator) {
                    a5Var.k0 = null;
                    a5Var.x0(this.b);
                    a5Var.n0.o(false);
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 5:
                vh0 vh0Var = (vh0) this.c;
                vh0Var.f = true;
                vh0Var.c = this.b;
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
