package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Cells.n6;
import org.telegram.ui.Cells.x7;
import org.telegram.ui.Components.fg0;
import org.telegram.ui.Components.q9;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class a1 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a1(Object obj, float f10, int i9) {
        this.a = i9;
        this.c = obj;
        this.b = f10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                d1 d1Var = (d1) this.c;
                d1Var.P = null;
                d1Var.a = this.b;
                d1Var.invalidate();
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
                n6 n6Var = (n6) this.c;
                n6Var.A = this.b;
                n6Var.invalidate();
                break;
            case 3:
                ColorMatrix colorMatrix = new ColorMatrix();
                x7 x7Var = (x7) this.c;
                float f10 = this.b;
                x7Var.v = f10;
                colorMatrix.setSaturation(f10);
                if (f6.I.q()) {
                    AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, (1.0f - x7Var.v) * (-0.3f));
                }
                x7Var.d.setEmojiColorFilter(new ColorMatrixColorFilter(colorMatrix));
                break;
            case 4:
                q9 q9Var = (q9) this.c;
                q9Var.g = this.b;
                q9Var.invalidateSelf();
                break;
            default:
                fg0 fg0Var = (fg0) this.c;
                fg0Var.D.unlock();
                float f11 = this.b;
                fg0Var.b = f11;
                if (f11 <= 0.0f) {
                    fg0Var.C = -1;
                }
                fg0Var.c(true);
                fg0Var.f = false;
                if (fg0Var.K != null && Math.abs(f11 - 1.0f) < 0.01f) {
                    fg0Var.K.run();
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 5:
                fg0 fg0Var = (fg0) this.c;
                fg0Var.f = true;
                fg0Var.c = this.b;
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
