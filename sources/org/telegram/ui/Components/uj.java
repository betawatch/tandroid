package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class uj implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ float c;
    public final /* synthetic */ FrameLayout d;

    public /* synthetic */ uj(FrameLayout frameLayout, int i10, float f10, int i11) {
        this.a = i11;
        this.d = frameLayout;
        this.b = i10;
        this.c = f10;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                jk jkVar = (jk) this.d;
                xj xjVar = jkVar.r;
                xj xjVar2 = jkVar.s;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i10 = this.b;
                float f10 = this.c;
                if (i10 != 1) {
                    xjVar2.setTranslationX(f10 * floatValue);
                    xjVar2.setAlpha(Math.max(0.0f, 1.0f - floatValue));
                    xjVar2.invalidate();
                    xjVar.setAlpha(floatValue);
                    float f11 = (floatValue * 0.05f) + 0.95f;
                    xjVar.setScaleX(f11);
                    xjVar.setScaleY(f11);
                    xjVar2.invalidate();
                    break;
                } else {
                    xjVar.setTranslationX(f10 * floatValue);
                    xjVar.setAlpha(1.0f - floatValue);
                    xjVar.invalidate();
                    xjVar2.setAlpha(floatValue);
                    float f12 = (floatValue * 0.05f) + 0.95f;
                    xjVar2.setScaleX(f12);
                    xjVar2.setScaleY(f12);
                    break;
                }
            default:
                sb0 sb0Var = (sb0) this.d;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f13 = 1.0f - floatValue2;
                int i11 = (int) ((sb0Var.O * floatValue2) + (this.b * f13));
                sb0Var.Q = i11;
                sb0Var.e((sb0Var.P * floatValue2) + (this.c * f13), i11);
                break;
        }
    }
}
