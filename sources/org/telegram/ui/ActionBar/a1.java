package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Cells.m6;
import org.telegram.ui.Cells.w7;
import org.telegram.ui.Components.bh0;
import org.telegram.ui.Components.r9;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
                v3 v3Var = (v3) this.c;
                v3Var.i = this.b;
                w3 w3Var = v3Var.b;
                if (w3Var != null) {
                    w3Var.invalidate();
                    break;
                }
                break;
            case 2:
                m6 m6Var = (m6) this.c;
                m6Var.B = this.b;
                m6Var.invalidate();
                break;
            case 3:
                ColorMatrix colorMatrix = new ColorMatrix();
                w7 w7Var = (w7) this.c;
                float f10 = this.b;
                w7Var.v = f10;
                colorMatrix.setSaturation(f10);
                if (j6.I.q()) {
                    AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, (1.0f - w7Var.v) * (-0.3f));
                }
                w7Var.d.setEmojiColorFilter(new ColorMatrixColorFilter(colorMatrix));
                break;
            case 4:
                r9 r9Var = (r9) this.c;
                r9Var.g = this.b;
                r9Var.invalidateSelf();
                break;
            default:
                bh0 bh0Var = (bh0) this.c;
                bh0Var.E.unlock();
                float f11 = this.b;
                bh0Var.b = f11;
                if (f11 <= 0.0f) {
                    bh0Var.D = -1;
                }
                bh0Var.c(true);
                bh0Var.f = false;
                if (bh0Var.L != null && Math.abs(f11 - 1.0f) < 0.01f) {
                    bh0Var.L.run();
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 5:
                bh0 bh0Var = (bh0) this.c;
                bh0Var.f = true;
                bh0Var.c = this.b;
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
