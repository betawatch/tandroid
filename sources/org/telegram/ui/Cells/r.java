package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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
                c0 c0Var = (c0) this.b;
                c0Var.getClass();
                c0Var.w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c0Var.a.run();
                break;
            case 2:
                q1 q1Var = (q1) this.b;
                q1Var.getClass();
                q1Var.K9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q1Var.invalidate();
                break;
            case 3:
                j4 j4Var = (j4) this.b;
                org.telegram.ui.Components.g9 g9Var = j4Var.a;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f7 = j4Var.H ? 1.0f - (0.18f * floatValue) : 0.82f + (0.18f * floatValue);
                g9Var.setScaleX(f7);
                g9Var.setScaleY(f7);
                if (!j4Var.H) {
                    floatValue = 1.0f - floatValue;
                }
                j4Var.I = floatValue;
                j4Var.invalidate();
                break;
            case 4:
                q6 q6Var = (q6) this.b;
                q6Var.getClass();
                q6Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q6Var.invalidate();
                break;
            case 5:
                s7 s7Var = (s7) this.b;
                s7Var.getClass();
                s7Var.i0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s7Var.invalidate();
                break;
            case 6:
                x7 x7Var = (x7) this.b;
                x7Var.getClass();
                ColorMatrix colorMatrix = new ColorMatrix();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x7Var.w = floatValue2;
                colorMatrix.setSaturation(floatValue2);
                if (org.telegram.ui.ActionBar.t6.I.q()) {
                    org.telegram.messenger.i0.h(colorMatrix, (1.0f - x7Var.w) * (-0.3f));
                }
                x7Var.d.setEmojiColorFilter(new ColorMatrixColorFilter(colorMatrix));
                break;
            case 7:
                w9 w9Var = (w9) this.b;
                w9Var.getClass();
                w9Var.V = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w9Var.C.invalidate();
                break;
            default:
                lg.f fVar = (lg.f) ((org.telegram.ui.ActionBar.l1) this.b).b;
                ((y9) fVar.b).getTransitionParams().L1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((y9) fVar.b).invalidate();
                break;
        }
    }
}
