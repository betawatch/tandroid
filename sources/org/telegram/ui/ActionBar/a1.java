package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Cells.n6;
import org.telegram.ui.Cells.z7;
import org.telegram.ui.Components.vg0;
import org.telegram.ui.Components.w9;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class a1 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a1(Object obj, float f7, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = f7;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                d1 d1Var = (d1) this.c;
                d1Var.T = null;
                d1Var.a = this.b;
                d1Var.invalidate();
                break;
            case 1:
                x3 x3Var = (x3) this.c;
                x3Var.i = this.b;
                y3 y3Var = x3Var.b;
                if (y3Var != null) {
                    y3Var.invalidate();
                    break;
                }
                break;
            case 2:
                n6 n6Var = (n6) this.c;
                n6Var.E = this.b;
                n6Var.invalidate();
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
                w9 w9Var = (w9) this.c;
                w9Var.g = this.b;
                w9Var.invalidateSelf();
                break;
            default:
                vg0 vg0Var = (vg0) this.c;
                vg0Var.H.unlock();
                float f10 = this.b;
                vg0Var.b = f10;
                if (f10 <= 0.0f) {
                    vg0Var.G = -1;
                }
                vg0Var.c(true);
                vg0Var.f = false;
                if (vg0Var.O != null && Math.abs(f10 - 1.0f) < 0.01f) {
                    vg0Var.O.run();
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 5:
                vg0 vg0Var = (vg0) this.c;
                vg0Var.f = true;
                vg0Var.c = this.b;
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
