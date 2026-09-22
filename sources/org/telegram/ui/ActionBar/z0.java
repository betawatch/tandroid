package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Cells.o6;
import org.telegram.ui.Cells.z7;
import org.telegram.ui.Components.ug0;
import org.telegram.ui.Components.w9;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
                if (i6.I.q()) {
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
                ug0 ug0Var = (ug0) this.c;
                ug0Var.H.unlock();
                float f10 = this.b;
                ug0Var.b = f10;
                if (f10 <= 0.0f) {
                    ug0Var.G = -1;
                }
                ug0Var.c(true);
                ug0Var.f = false;
                if (ug0Var.O != null && Math.abs(f10 - 1.0f) < 0.01f) {
                    ug0Var.O.run();
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 5:
                ug0 ug0Var = (ug0) this.c;
                ug0Var.f = true;
                ug0Var.c = this.b;
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
