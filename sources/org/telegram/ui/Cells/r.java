package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
                d0 d0Var = (d0) this.b;
                d0Var.getClass();
                d0Var.w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d0Var.a.run();
                break;
            case 2:
                s1 s1Var = (s1) this.b;
                s1Var.getClass();
                s1Var.Bb = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s1Var.invalidate();
                break;
            case 3:
                t3 t3Var = (t3) this.b;
                t3Var.getClass();
                t3Var.f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t3Var.b();
                t3Var.invalidate();
                break;
            case 4:
                k4 k4Var = (k4) this.b;
                org.telegram.ui.Components.y9 y9Var = k4Var.a;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f7 = k4Var.H ? 1.0f - (0.18f * floatValue) : 0.82f + (0.18f * floatValue);
                y9Var.setScaleX(f7);
                y9Var.setScaleY(f7);
                if (!k4Var.H) {
                    floatValue = 1.0f - floatValue;
                }
                k4Var.I = floatValue;
                k4Var.invalidate();
                break;
            case 5:
                s6 s6Var = (s6) this.b;
                s6Var.getClass();
                s6Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s6Var.invalidate();
                break;
            case 6:
                w7 w7Var = (w7) this.b;
                w7Var.getClass();
                w7Var.i0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w7Var.invalidate();
                break;
            case 7:
                c8 c8Var = (c8) this.b;
                c8Var.getClass();
                ColorMatrix colorMatrix = new ColorMatrix();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c8Var.v = floatValue2;
                colorMatrix.setSaturation(floatValue2);
                if (org.telegram.ui.ActionBar.y6.I.q()) {
                    AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, (1.0f - c8Var.v) * (-0.3f));
                }
                c8Var.d.setEmojiColorFilter(new ColorMatrixColorFilter(colorMatrix));
                break;
            case 8:
                fa faVar = (fa) this.b;
                faVar.getClass();
                faVar.V = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                faVar.C.invalidate();
                break;
            default:
                ia iaVar = (ia) ((ha) this.b).b;
                iaVar.a.getTransitionParams().K1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                iaVar.a.invalidate();
                break;
        }
    }
}
