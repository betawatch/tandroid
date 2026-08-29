package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ r(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                s sVar = (s) this.b;
                sVar.getClass();
                sVar.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                e0 e0Var = (e0) this.b;
                e0Var.getClass();
                e0Var.w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e0Var.a.run();
                break;
            case 2:
                s1 s1Var = (s1) this.b;
                s1Var.getClass();
                s1Var.xb = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s1Var.invalidate();
                break;
            case 3:
                e4 e4Var = (e4) this.b;
                org.telegram.ui.Components.t9 t9Var = e4Var.a;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f9 = e4Var.D ? 1.0f - (0.18f * floatValue) : 0.82f + (0.18f * floatValue);
                t9Var.setScaleX(f9);
                t9Var.setScaleY(f9);
                if (!e4Var.D) {
                    floatValue = 1.0f - floatValue;
                }
                e4Var.E = floatValue;
                e4Var.invalidate();
                break;
            case 4:
                l6 l6Var = (l6) this.b;
                l6Var.getClass();
                l6Var.A = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l6Var.invalidate();
                break;
            case 5:
                p7 p7Var = (p7) this.b;
                p7Var.getClass();
                p7Var.e0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p7Var.invalidate();
                break;
            case 6:
                v7 v7Var = (v7) this.b;
                v7Var.getClass();
                ColorMatrix colorMatrix = new ColorMatrix();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v7Var.v = floatValue2;
                colorMatrix.setSaturation(floatValue2);
                if (org.telegram.ui.ActionBar.g6.I.q()) {
                    AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, (1.0f - v7Var.v) * (-0.3f));
                }
                v7Var.d.setEmojiColorFilter(new ColorMatrixColorFilter(colorMatrix));
                break;
            case 7:
                x9 x9Var = (x9) this.b;
                x9Var.getClass();
                x9Var.V = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x9Var.C.invalidate();
                break;
            default:
                aa aaVar = (aa) ((z9) this.b).b;
                aaVar.a.getTransitionParams().K1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                aaVar.a.invalidate();
                break;
        }
    }
}
