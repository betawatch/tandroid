package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
                q1 q1Var = (q1) this.b;
                q1Var.getClass();
                q1Var.M9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q1Var.invalidate();
                break;
            case 3:
                h4 h4Var = (h4) this.b;
                org.telegram.ui.Components.q9 q9Var = h4Var.a;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f10 = h4Var.I ? 1.0f - (0.18f * floatValue) : 0.82f + (0.18f * floatValue);
                q9Var.setScaleX(f10);
                q9Var.setScaleY(f10);
                if (!h4Var.I) {
                    floatValue = 1.0f - floatValue;
                }
                h4Var.J = floatValue;
                h4Var.invalidate();
                break;
            case 4:
                m6 m6Var = (m6) this.b;
                m6Var.getClass();
                m6Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m6Var.invalidate();
                break;
            case 5:
                o7 o7Var = (o7) this.b;
                o7Var.getClass();
                o7Var.j0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o7Var.invalidate();
                break;
            case 6:
                t7 t7Var = (t7) this.b;
                t7Var.getClass();
                ColorMatrix colorMatrix = new ColorMatrix();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t7Var.w = floatValue2;
                colorMatrix.setSaturation(floatValue2);
                if (org.telegram.ui.ActionBar.n6.I.q()) {
                    org.telegram.messenger.g0.h(colorMatrix, (1.0f - t7Var.w) * (-0.3f));
                }
                t7Var.d.setEmojiColorFilter(new ColorMatrixColorFilter(colorMatrix));
                break;
            case 7:
                v9 v9Var = (v9) this.b;
                v9Var.getClass();
                v9Var.V = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v9Var.C.invalidate();
                break;
            default:
                y9 y9Var = (y9) ((org.telegram.ui.ActionBar.i1) this.b).b;
                ((z9) y9Var.b).getTransitionParams().L1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((z9) y9Var.b).invalidate();
                break;
        }
    }
}
