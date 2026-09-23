package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Cells.a8;
import org.telegram.ui.Cells.o6;
import org.telegram.ui.Components.vg0;
import org.telegram.ui.Components.y9;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
                v3 v3Var = (v3) this.c;
                v3Var.i = this.b;
                w3 w3Var = v3Var.b;
                if (w3Var != null) {
                    w3Var.invalidate();
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
                a8 a8Var = (a8) this.c;
                float f7 = this.b;
                a8Var.v = f7;
                colorMatrix.setSaturation(f7);
                if (h6.I.q()) {
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
