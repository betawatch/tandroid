package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Cells.o6;
import org.telegram.ui.Cells.z7;
import org.telegram.ui.Components.fh0;
import org.telegram.ui.Components.y9;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class z0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;

    public /* synthetic */ z0(Object obj, float f7, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = f7;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                c1 c1Var = (c1) this.c;
                c1Var.T = null;
                c1Var.a = this.b;
                c1Var.invalidate();
                break;
            case 1:
                w3 w3Var = (w3) this.c;
                w3Var.i = this.b;
                x3 x3Var = w3Var.b;
                if (x3Var != null) {
                    x3Var.invalidate();
                    break;
                }
                break;
            case 2:
                o6 o6Var = (o6) this.c;
                o6Var.E = this.b;
                o6Var.invalidate();
                break;
            case 3:
                ColorMatrix colorMatrix = new ColorMatrix();
                z7 z7Var = (z7) this.c;
                float f7 = this.b;
                z7Var.v = f7;
                colorMatrix.setSaturation(f7);
                if (j6.I.q()) {
                    AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, (1.0f - z7Var.v) * (-0.3f));
                }
                z7Var.d.setEmojiColorFilter(new ColorMatrixColorFilter(colorMatrix));
                break;
            case 4:
                y9 y9Var = (y9) this.c;
                y9Var.g = this.b;
                y9Var.invalidateSelf();
                break;
            default:
                fh0 fh0Var = (fh0) this.c;
                fh0Var.H.unlock();
                float f10 = this.b;
                fh0Var.b = f10;
                if (f10 <= 0.0f) {
                    fh0Var.G = -1;
                }
                fh0Var.c(true);
                fh0Var.f = false;
                if (fh0Var.O != null && Math.abs(f10 - 1.0f) < 0.01f) {
                    fh0Var.O.run();
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 5:
                fh0 fh0Var = (fh0) this.c;
                fh0Var.f = true;
                fh0Var.c = this.b;
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
