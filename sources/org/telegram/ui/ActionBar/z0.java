package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Cells.a8;
import org.telegram.ui.Cells.p6;
import org.telegram.ui.Components.hh0;
import org.telegram.ui.Components.x9;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
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
                x9 x9Var = (x9) this.c;
                x9Var.g = this.b;
                x9Var.invalidateSelf();
                break;
            default:
                hh0 hh0Var = (hh0) this.c;
                hh0Var.H.unlock();
                float f10 = this.b;
                hh0Var.b = f10;
                if (f10 <= 0.0f) {
                    hh0Var.G = -1;
                }
                hh0Var.c(true);
                hh0Var.f = false;
                if (hh0Var.O != null && Math.abs(f10 - 1.0f) < 0.01f) {
                    hh0Var.O.run();
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 5:
                hh0 hh0Var = (hh0) this.c;
                hh0Var.f = true;
                hh0Var.c = this.b;
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
