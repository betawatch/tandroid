package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
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
                h4 h4Var = (h4) this.b;
                org.telegram.ui.Components.v9 v9Var = h4Var.a;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f7 = h4Var.H ? 1.0f - (0.18f * floatValue) : 0.82f + (0.18f * floatValue);
                v9Var.setScaleX(f7);
                v9Var.setScaleY(f7);
                if (!h4Var.H) {
                    floatValue = 1.0f - floatValue;
                }
                h4Var.I = floatValue;
                h4Var.invalidate();
                break;
            case 4:
                p6 p6Var = (p6) this.b;
                p6Var.getClass();
                p6Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p6Var.invalidate();
                break;
            case 5:
                u7 u7Var = (u7) this.b;
                u7Var.getClass();
                u7Var.i0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u7Var.invalidate();
                break;
            case 6:
                a8 a8Var = (a8) this.b;
                a8Var.getClass();
                ColorMatrix colorMatrix = new ColorMatrix();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a8Var.v = floatValue2;
                colorMatrix.setSaturation(floatValue2);
                if (org.telegram.ui.ActionBar.j6.I.q()) {
                    AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, (1.0f - a8Var.v) * (-0.3f));
                }
                a8Var.d.setEmojiColorFilter(new ColorMatrixColorFilter(colorMatrix));
                break;
            case 7:
                ea eaVar = (ea) this.b;
                eaVar.getClass();
                eaVar.V = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                eaVar.C.invalidate();
                break;
            default:
                ha haVar = (ha) ((ga) this.b).b;
                haVar.a.getTransitionParams().K1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                haVar.a.invalidate();
                break;
        }
    }
}
