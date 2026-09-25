package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
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
                g4 g4Var = (g4) this.b;
                org.telegram.ui.Components.w9 w9Var = g4Var.a;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f7 = g4Var.H ? 1.0f - (0.18f * floatValue) : 0.82f + (0.18f * floatValue);
                w9Var.setScaleX(f7);
                w9Var.setScaleY(f7);
                if (!g4Var.H) {
                    floatValue = 1.0f - floatValue;
                }
                g4Var.I = floatValue;
                g4Var.invalidate();
                break;
            case 4:
                o6 o6Var = (o6) this.b;
                o6Var.getClass();
                o6Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o6Var.invalidate();
                break;
            case 5:
                t7 t7Var = (t7) this.b;
                t7Var.getClass();
                t7Var.i0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t7Var.invalidate();
                break;
            case 6:
                z7 z7Var = (z7) this.b;
                z7Var.getClass();
                ColorMatrix colorMatrix = new ColorMatrix();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z7Var.v = floatValue2;
                colorMatrix.setSaturation(floatValue2);
                if (org.telegram.ui.ActionBar.h6.I.q()) {
                    AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, (1.0f - z7Var.v) * (-0.3f));
                }
                z7Var.d.setEmojiColorFilter(new ColorMatrixColorFilter(colorMatrix));
                break;
            case 7:
                da daVar = (da) this.b;
                daVar.getClass();
                daVar.V = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                daVar.C.invalidate();
                break;
            default:
                ga gaVar = (ga) ((fa) this.b).b;
                gaVar.a.getTransitionParams().K1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gaVar.a.invalidate();
                break;
        }
    }
}
