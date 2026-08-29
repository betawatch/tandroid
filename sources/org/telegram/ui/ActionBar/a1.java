package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Cells.l6;
import org.telegram.ui.Cells.v7;
import org.telegram.ui.Components.qg0;
import org.telegram.ui.Components.v9;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class a1 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a1(Object obj, float f9, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = f9;
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
                l6 l6Var = (l6) this.c;
                l6Var.A = this.b;
                l6Var.invalidate();
                break;
            case 3:
                ColorMatrix colorMatrix = new ColorMatrix();
                v7 v7Var = (v7) this.c;
                float f9 = this.b;
                v7Var.v = f9;
                colorMatrix.setSaturation(f9);
                if (g6.I.q()) {
                    AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, (1.0f - v7Var.v) * (-0.3f));
                }
                v7Var.d.setEmojiColorFilter(new ColorMatrixColorFilter(colorMatrix));
                break;
            case 4:
                v9 v9Var = (v9) this.c;
                v9Var.g = this.b;
                v9Var.invalidateSelf();
                break;
            default:
                qg0 qg0Var = (qg0) this.c;
                qg0Var.D.unlock();
                float f10 = this.b;
                qg0Var.b = f10;
                if (f10 <= 0.0f) {
                    qg0Var.C = -1;
                }
                qg0Var.c(true);
                qg0Var.f = false;
                if (qg0Var.K != null && Math.abs(f10 - 1.0f) < 0.01f) {
                    qg0Var.K.run();
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 5:
                qg0 qg0Var = (qg0) this.c;
                qg0Var.f = true;
                qg0Var.c = this.b;
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
