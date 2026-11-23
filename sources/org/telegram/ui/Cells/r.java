package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ r(Object obj, int i7) {
        this.a = i7;
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
                r1 r1Var = (r1) this.b;
                r1Var.getClass();
                r1Var.M9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r1Var.invalidate();
                break;
            case 3:
                i4 i4Var = (i4) this.b;
                org.telegram.ui.Components.q9 q9Var = i4Var.a;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f10 = i4Var.I ? 1.0f - (0.18f * floatValue) : 0.82f + (0.18f * floatValue);
                q9Var.setScaleX(f10);
                q9Var.setScaleY(f10);
                if (!i4Var.I) {
                    floatValue = 1.0f - floatValue;
                }
                i4Var.J = floatValue;
                i4Var.invalidate();
                break;
            case 4:
                n6 n6Var = (n6) this.b;
                n6Var.getClass();
                n6Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n6Var.invalidate();
                break;
            case 5:
                p7 p7Var = (p7) this.b;
                p7Var.getClass();
                p7Var.j0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p7Var.invalidate();
                break;
            case 6:
                u7 u7Var = (u7) this.b;
                u7Var.getClass();
                ColorMatrix colorMatrix = new ColorMatrix();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u7Var.w = floatValue2;
                colorMatrix.setSaturation(floatValue2);
                if (org.telegram.ui.ActionBar.m6.I.q()) {
                    org.telegram.messenger.g0.h(colorMatrix, (1.0f - u7Var.w) * (-0.3f));
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
                z9 z9Var = (z9) ((org.telegram.ui.ActionBar.h1) this.b).b;
                ((aa) z9Var.b).getTransitionParams().L1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((aa) z9Var.b).invalidate();
                break;
        }
    }
}
