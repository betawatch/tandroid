package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
                s1Var.yb = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s1Var.invalidate();
                break;
            case 3:
                f4 f4Var = (f4) this.b;
                org.telegram.ui.Components.p9 p9Var = f4Var.a;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f10 = f4Var.E ? 1.0f - (0.18f * floatValue) : 0.82f + (0.18f * floatValue);
                p9Var.setScaleX(f10);
                p9Var.setScaleY(f10);
                if (!f4Var.E) {
                    floatValue = 1.0f - floatValue;
                }
                f4Var.F = floatValue;
                f4Var.invalidate();
                break;
            case 4:
                m6 m6Var = (m6) this.b;
                m6Var.getClass();
                m6Var.B = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m6Var.invalidate();
                break;
            case 5:
                q7 q7Var = (q7) this.b;
                q7Var.getClass();
                q7Var.f0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q7Var.invalidate();
                break;
            case 6:
                w7 w7Var = (w7) this.b;
                w7Var.getClass();
                ColorMatrix colorMatrix = new ColorMatrix();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w7Var.v = floatValue2;
                colorMatrix.setSaturation(floatValue2);
                if (org.telegram.ui.ActionBar.j6.I.q()) {
                    AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, (1.0f - w7Var.v) * (-0.3f));
                }
                w7Var.d.setEmojiColorFilter(new ColorMatrixColorFilter(colorMatrix));
                break;
            case 7:
                y9 y9Var = (y9) this.b;
                y9Var.getClass();
                y9Var.V = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y9Var.C.invalidate();
                break;
            default:
                ba baVar = (ba) ((aa) this.b).b;
                baVar.a.getTransitionParams().K1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                baVar.a.invalidate();
                break;
        }
    }
}
