package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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
                d4 d4Var = (d4) this.b;
                org.telegram.ui.Components.n9 n9Var = d4Var.a;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f10 = d4Var.D ? 1.0f - (0.18f * floatValue) : 0.82f + (0.18f * floatValue);
                n9Var.setScaleX(f10);
                n9Var.setScaleY(f10);
                if (!d4Var.D) {
                    floatValue = 1.0f - floatValue;
                }
                d4Var.E = floatValue;
                d4Var.invalidate();
                break;
            case 4:
                k6 k6Var = (k6) this.b;
                k6Var.getClass();
                k6Var.A = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k6Var.invalidate();
                break;
            case 5:
                o7 o7Var = (o7) this.b;
                o7Var.getClass();
                o7Var.e0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o7Var.invalidate();
                break;
            case 6:
                u7 u7Var = (u7) this.b;
                u7Var.getClass();
                ColorMatrix colorMatrix = new ColorMatrix();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u7Var.v = floatValue2;
                colorMatrix.setSaturation(floatValue2);
                if (org.telegram.ui.ActionBar.g6.I.q()) {
                    AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, (1.0f - u7Var.v) * (-0.3f));
                }
                u7Var.d.setEmojiColorFilter(new ColorMatrixColorFilter(colorMatrix));
                break;
            case 7:
                w9 w9Var = (w9) this.b;
                w9Var.getClass();
                w9Var.V = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w9Var.C.invalidate();
                break;
            default:
                z9 z9Var = (z9) ((y9) this.b).b;
                z9Var.a.getTransitionParams().K1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z9Var.a.invalidate();
                break;
        }
    }
}
