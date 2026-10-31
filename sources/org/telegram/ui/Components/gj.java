package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class gj implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ float c;
    public final /* synthetic */ FrameLayout d;

    public /* synthetic */ gj(FrameLayout frameLayout, int i10, float f7, int i11) {
        this.a = i11;
        this.d = frameLayout;
        this.b = i10;
        this.c = f7;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                xj xjVar = (xj) this.d;
                lj ljVar = xjVar.r;
                lj ljVar2 = xjVar.s;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i10 = this.b;
                float f7 = this.c;
                if (i10 != 1) {
                    ljVar2.setTranslationX(f7 * floatValue);
                    ljVar2.setAlpha(Math.max(0.0f, 1.0f - floatValue));
                    ljVar2.invalidate();
                    ljVar.setAlpha(floatValue);
                    float f10 = (floatValue * 0.05f) + 0.95f;
                    ljVar.setScaleX(f10);
                    ljVar.setScaleY(f10);
                    ljVar2.invalidate();
                    break;
                } else {
                    ljVar.setTranslationX(f7 * floatValue);
                    ljVar.setAlpha(1.0f - floatValue);
                    ljVar.invalidate();
                    ljVar2.setAlpha(floatValue);
                    float f11 = (floatValue * 0.05f) + 0.95f;
                    ljVar2.setScaleX(f11);
                    ljVar2.setScaleY(f11);
                    break;
                }
            default:
                ua0 ua0Var = (ua0) this.d;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f12 = 1.0f - floatValue2;
                int i11 = (int) ((ua0Var.R * floatValue2) + (this.b * f12));
                ua0Var.T = i11;
                ua0Var.f((ua0Var.S * floatValue2) + (this.c * f12), i11);
                break;
        }
    }
}
