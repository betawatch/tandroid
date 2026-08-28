package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ r(Object obj, int i9) {
        this.a = i9;
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
                t1Var.xb = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t1Var.invalidate();
                break;
            case 3:
                g4 g4Var = (g4) this.b;
                org.telegram.ui.Components.o9 o9Var = g4Var.a;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f10 = g4Var.D ? 1.0f - (0.18f * floatValue) : 0.82f + (0.18f * floatValue);
                o9Var.setScaleX(f10);
                o9Var.setScaleY(f10);
                if (!g4Var.D) {
                    floatValue = 1.0f - floatValue;
                }
                g4Var.E = floatValue;
                g4Var.invalidate();
                break;
            case 4:
                n6 n6Var = (n6) this.b;
                n6Var.getClass();
                n6Var.A = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n6Var.invalidate();
                break;
            case 5:
                r7 r7Var = (r7) this.b;
                r7Var.getClass();
                r7Var.e0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r7Var.invalidate();
                break;
            case 6:
                x7 x7Var = (x7) this.b;
                x7Var.getClass();
                ColorMatrix colorMatrix = new ColorMatrix();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x7Var.v = floatValue2;
                colorMatrix.setSaturation(floatValue2);
                if (org.telegram.ui.ActionBar.f6.I.q()) {
                    AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, (1.0f - x7Var.v) * (-0.3f));
                }
                x7Var.d.setEmojiColorFilter(new ColorMatrixColorFilter(colorMatrix));
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
