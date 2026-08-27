package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Cells.k6;
import org.telegram.ui.Cells.u7;
import org.telegram.ui.Components.hg0;
import org.telegram.ui.Components.p9;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class z0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;

    public /* synthetic */ z0(Object obj, float f10, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = f10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                c1 c1Var = (c1) this.c;
                c1Var.P = null;
                c1Var.a = this.b;
                c1Var.invalidate();
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
                k6 k6Var = (k6) this.c;
                k6Var.A = this.b;
                k6Var.invalidate();
                break;
            case 3:
                ColorMatrix colorMatrix = new ColorMatrix();
                u7 u7Var = (u7) this.c;
                float f10 = this.b;
                u7Var.v = f10;
                colorMatrix.setSaturation(f10);
                if (g6.I.q()) {
                    AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, (1.0f - u7Var.v) * (-0.3f));
                }
                u7Var.d.setEmojiColorFilter(new ColorMatrixColorFilter(colorMatrix));
                break;
            case 4:
                p9 p9Var = (p9) this.c;
                p9Var.g = this.b;
                p9Var.invalidateSelf();
                break;
            default:
                hg0 hg0Var = (hg0) this.c;
                hg0Var.D.unlock();
                float f11 = this.b;
                hg0Var.b = f11;
                if (f11 <= 0.0f) {
                    hg0Var.C = -1;
                }
                hg0Var.c(true);
                hg0Var.f = false;
                if (hg0Var.K != null && Math.abs(f11 - 1.0f) < 0.01f) {
                    hg0Var.K.run();
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 5:
                hg0 hg0Var = (hg0) this.c;
                hg0Var.f = true;
                hg0Var.c = this.b;
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
