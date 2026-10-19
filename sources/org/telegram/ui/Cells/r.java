package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
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
                u1 u1Var = (u1) this.b;
                u1Var.getClass();
                u1Var.Bb = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u1Var.invalidate();
                break;
            case 3:
                f4 f4Var = (f4) this.b;
                org.telegram.ui.Components.w9 w9Var = f4Var.a;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f7 = f4Var.H ? 1.0f - (0.18f * floatValue) : 0.82f + (0.18f * floatValue);
                w9Var.setScaleX(f7);
                w9Var.setScaleY(f7);
                if (!f4Var.H) {
                    floatValue = 1.0f - floatValue;
                }
                f4Var.I = floatValue;
                f4Var.invalidate();
                break;
            case 4:
                n6 n6Var = (n6) this.b;
                n6Var.getClass();
                n6Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n6Var.invalidate();
                break;
            case 5:
                s7 s7Var = (s7) this.b;
                s7Var.getClass();
                s7Var.i0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s7Var.invalidate();
                break;
            case 6:
                y7 y7Var = (y7) this.b;
                y7Var.getClass();
                ColorMatrix colorMatrix = new ColorMatrix();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y7Var.v = floatValue2;
                colorMatrix.setSaturation(floatValue2);
                if (org.telegram.ui.ActionBar.h6.I.q()) {
                    AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, (1.0f - y7Var.v) * (-0.3f));
                }
                y7Var.d.setEmojiColorFilter(new ColorMatrixColorFilter(colorMatrix));
                break;
            case 7:
                aa aaVar = (aa) this.b;
                aaVar.getClass();
                aaVar.V = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                aaVar.C.invalidate();
                break;
            default:
                da daVar = (da) ((ca) this.b).b;
                daVar.a.getTransitionParams().K1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                daVar.a.invalidate();
                break;
        }
    }
}
