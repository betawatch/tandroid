package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class dk implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ float c;
    public final /* synthetic */ FrameLayout d;

    public /* synthetic */ dk(FrameLayout frameLayout, int i10, float f7, int i11) {
        this.a = i11;
        this.d = frameLayout;
        this.b = i10;
        this.c = f7;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                rk rkVar = (rk) this.d;
                gk gkVar = rkVar.r;
                gk gkVar2 = rkVar.s;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i10 = this.b;
                float f7 = this.c;
                if (i10 != 1) {
                    gkVar2.setTranslationX(f7 * floatValue);
                    gkVar2.setAlpha(Math.max(0.0f, 1.0f - floatValue));
                    gkVar2.invalidate();
                    gkVar.setAlpha(floatValue);
                    float f10 = (floatValue * 0.05f) + 0.95f;
                    gkVar.setScaleX(f10);
                    gkVar.setScaleY(f10);
                    gkVar2.invalidate();
                    break;
                } else {
                    gkVar.setTranslationX(f7 * floatValue);
                    gkVar.setAlpha(1.0f - floatValue);
                    gkVar.invalidate();
                    gkVar2.setAlpha(floatValue);
                    float f11 = (floatValue * 0.05f) + 0.95f;
                    gkVar2.setScaleX(f11);
                    gkVar2.setScaleY(f11);
                    break;
                }
            default:
                cc0 cc0Var = (cc0) this.d;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f12 = 1.0f - floatValue2;
                int i11 = (int) ((cc0Var.R * floatValue2) + (this.b * f12));
                cc0Var.T = i11;
                cc0Var.e((cc0Var.S * floatValue2) + (this.c * f12), i11);
                break;
        }
    }
}
