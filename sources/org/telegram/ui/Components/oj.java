package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class oj implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ float c;
    public final /* synthetic */ FrameLayout d;

    public /* synthetic */ oj(FrameLayout frameLayout, int i7, float f10, int i10) {
        this.a = i10;
        this.d = frameLayout;
        this.b = i7;
        this.c = f10;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                dk dkVar = (dk) this.d;
                rj rjVar = dkVar.r;
                rj rjVar2 = dkVar.s;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i7 = this.b;
                float f10 = this.c;
                if (i7 != 1) {
                    rjVar2.setTranslationX(f10 * floatValue);
                    rjVar2.setAlpha(Math.max(0.0f, 1.0f - floatValue));
                    rjVar2.invalidate();
                    rjVar.setAlpha(floatValue);
                    float f11 = (floatValue * 0.05f) + 0.95f;
                    rjVar.setScaleX(f11);
                    rjVar.setScaleY(f11);
                    rjVar2.invalidate();
                    break;
                } else {
                    rjVar.setTranslationX(f10 * floatValue);
                    rjVar.setAlpha(1.0f - floatValue);
                    rjVar.invalidate();
                    rjVar2.setAlpha(floatValue);
                    float f12 = (floatValue * 0.05f) + 0.95f;
                    rjVar2.setScaleX(f12);
                    rjVar2.setScaleY(f12);
                    break;
                }
            default:
                ea0 ea0Var = (ea0) this.d;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f13 = 1.0f - floatValue2;
                int i10 = (int) ((ea0Var.S * floatValue2) + (this.b * f13));
                ea0Var.U = i10;
                ea0Var.f((ea0Var.T * floatValue2) + (this.c * f13), i10);
                break;
        }
    }
}
