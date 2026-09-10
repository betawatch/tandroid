package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Cells.a8;
import org.telegram.ui.Cells.p6;
import org.telegram.ui.Components.eh0;
import org.telegram.ui.Components.y9;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
                y3 y3Var = (y3) this.c;
                y3Var.i = this.b;
                z3 z3Var = y3Var.b;
                if (z3Var != null) {
                    z3Var.invalidate();
                    break;
                }
                break;
            case 2:
                p6 p6Var = (p6) this.c;
                p6Var.E = this.b;
                p6Var.invalidate();
                break;
            case 3:
                ColorMatrix colorMatrix = new ColorMatrix();
                a8 a8Var = (a8) this.c;
                float f7 = this.b;
                a8Var.v = f7;
                colorMatrix.setSaturation(f7);
                if (j6.I.q()) {
                    AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, (1.0f - a8Var.v) * (-0.3f));
                }
                a8Var.d.setEmojiColorFilter(new ColorMatrixColorFilter(colorMatrix));
                break;
            case 4:
                y9 y9Var = (y9) this.c;
                y9Var.g = this.b;
                y9Var.invalidateSelf();
                break;
            default:
                eh0 eh0Var = (eh0) this.c;
                eh0Var.H.unlock();
                float f10 = this.b;
                eh0Var.b = f10;
                if (f10 <= 0.0f) {
                    eh0Var.G = -1;
                }
                eh0Var.c(true);
                eh0Var.f = false;
                if (eh0Var.O != null && Math.abs(f10 - 1.0f) < 0.01f) {
                    eh0Var.O.run();
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 5:
                eh0 eh0Var = (eh0) this.c;
                eh0Var.f = true;
                eh0Var.c = this.b;
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
