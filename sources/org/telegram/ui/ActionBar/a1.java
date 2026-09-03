package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Cells.n6;
import org.telegram.ui.Cells.x7;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.r9;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class a1 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a1(Object obj, float f10, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = f10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                d1 d1Var = (d1) this.c;
                d1Var.Q = null;
                d1Var.a = this.b;
                d1Var.invalidate();
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
                n6 n6Var = (n6) this.c;
                n6Var.B = this.b;
                n6Var.invalidate();
                break;
            case 3:
                ColorMatrix colorMatrix = new ColorMatrix();
                x7 x7Var = (x7) this.c;
                float f10 = this.b;
                x7Var.v = f10;
                colorMatrix.setSaturation(f10);
                if (k6.I.q()) {
                    AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, (1.0f - x7Var.v) * (-0.3f));
                }
                x7Var.d.setEmojiColorFilter(new ColorMatrixColorFilter(colorMatrix));
                break;
            case 4:
                r9 r9Var = (r9) this.c;
                r9Var.g = this.b;
                r9Var.invalidateSelf();
                break;
            default:
                ch0 ch0Var = (ch0) this.c;
                ch0Var.E.unlock();
                float f11 = this.b;
                ch0Var.b = f11;
                if (f11 <= 0.0f) {
                    ch0Var.D = -1;
                }
                ch0Var.c(true);
                ch0Var.f = false;
                if (ch0Var.L != null && Math.abs(f11 - 1.0f) < 0.01f) {
                    ch0Var.L.run();
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 5:
                ch0 ch0Var = (ch0) this.c;
                ch0Var.f = true;
                ch0Var.c = this.b;
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
