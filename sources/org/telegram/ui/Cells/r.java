package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
                t1 t1Var = (t1) this.b;
                t1Var.getClass();
                t1Var.yb = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t1Var.invalidate();
                break;
            case 3:
                g4 g4Var = (g4) this.b;
                org.telegram.ui.Components.p9 p9Var = g4Var.a;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f10 = g4Var.E ? 1.0f - (0.18f * floatValue) : 0.82f + (0.18f * floatValue);
                p9Var.setScaleX(f10);
                p9Var.setScaleY(f10);
                if (!g4Var.E) {
                    floatValue = 1.0f - floatValue;
                }
                g4Var.F = floatValue;
                g4Var.invalidate();
                break;
            case 4:
                n6 n6Var = (n6) this.b;
                n6Var.getClass();
                n6Var.B = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n6Var.invalidate();
                break;
            case 5:
                r7 r7Var = (r7) this.b;
                r7Var.getClass();
                r7Var.f0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r7Var.invalidate();
                break;
            case 6:
                x7 x7Var = (x7) this.b;
                x7Var.getClass();
                ColorMatrix colorMatrix = new ColorMatrix();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x7Var.v = floatValue2;
                colorMatrix.setSaturation(floatValue2);
                if (org.telegram.ui.ActionBar.k6.I.q()) {
                    AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, (1.0f - x7Var.v) * (-0.3f));
                }
                x7Var.d.setEmojiColorFilter(new ColorMatrixColorFilter(colorMatrix));
                break;
            case 7:
                z9 z9Var = (z9) this.b;
                z9Var.getClass();
                z9Var.V = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z9Var.C.invalidate();
                break;
            default:
                ca caVar = (ca) ((ba) this.b).b;
                caVar.a.getTransitionParams().K1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                caVar.a.invalidate();
                break;
        }
    }
}
