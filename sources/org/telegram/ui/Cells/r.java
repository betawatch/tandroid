package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ r(Object obj, int i3) {
        this.a = i3;
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
                q1Var.L9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q1Var.invalidate();
                break;
            case 3:
                h4 h4Var = (h4) this.b;
                org.telegram.ui.Components.k9 k9Var = h4Var.a;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f10 = h4Var.I ? 1.0f - (0.18f * floatValue) : 0.82f + (0.18f * floatValue);
                k9Var.setScaleX(f10);
                k9Var.setScaleY(f10);
                if (!h4Var.I) {
                    floatValue = 1.0f - floatValue;
                }
                h4Var.J = floatValue;
                h4Var.invalidate();
                break;
            case 4:
                l6 l6Var = (l6) this.b;
                l6Var.getClass();
                l6Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l6Var.invalidate();
                break;
            case 5:
                n7 n7Var = (n7) this.b;
                n7Var.getClass();
                n7Var.j0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n7Var.invalidate();
                break;
            case 6:
                s7 s7Var = (s7) this.b;
                s7Var.getClass();
                ColorMatrix colorMatrix = new ColorMatrix();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s7Var.w = floatValue2;
                colorMatrix.setSaturation(floatValue2);
                if (org.telegram.ui.ActionBar.k6.I.q()) {
                    org.telegram.messenger.g0.h(colorMatrix, (1.0f - s7Var.w) * (-0.3f));
                }
                s7Var.d.setEmojiColorFilter(new ColorMatrixColorFilter(colorMatrix));
                break;
            case 7:
                u9 u9Var = (u9) this.b;
                u9Var.getClass();
                u9Var.V = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u9Var.C.invalidate();
                break;
            default:
                x9 x9Var = (x9) ((org.telegram.ui.ActionBar.g1) this.b).b;
                ((y9) x9Var.b).getTransitionParams().L1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((y9) x9Var.b).invalidate();
                break;
        }
    }
}
