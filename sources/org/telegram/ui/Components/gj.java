package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gj implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ float c;
    public final /* synthetic */ FrameLayout d;

    public /* synthetic */ gj(FrameLayout frameLayout, int i7, float f10, int i10) {
        this.a = i10;
        this.d = frameLayout;
        this.b = i7;
        this.c = f10;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                uj ujVar = (uj) this.d;
                jj jjVar = ujVar.r;
                jj jjVar2 = ujVar.s;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i7 = this.b;
                float f10 = this.c;
                if (i7 != 1) {
                    jjVar2.setTranslationX(f10 * floatValue);
                    jjVar2.setAlpha(Math.max(0.0f, 1.0f - floatValue));
                    jjVar2.invalidate();
                    jjVar.setAlpha(floatValue);
                    float f11 = (floatValue * 0.05f) + 0.95f;
                    jjVar.setScaleX(f11);
                    jjVar.setScaleY(f11);
                    jjVar2.invalidate();
                    break;
                } else {
                    jjVar.setTranslationX(f10 * floatValue);
                    jjVar.setAlpha(1.0f - floatValue);
                    jjVar.invalidate();
                    jjVar2.setAlpha(floatValue);
                    float f12 = (floatValue * 0.05f) + 0.95f;
                    jjVar2.setScaleX(f12);
                    jjVar2.setScaleY(f12);
                    break;
                }
            default:
                ca0 ca0Var = (ca0) this.d;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f13 = 1.0f - floatValue2;
                int i10 = (int) ((ca0Var.R * floatValue2) + (this.b * f13));
                ca0Var.T = i10;
                ca0Var.f((ca0Var.S * floatValue2) + (this.c * f13), i10);
                break;
        }
    }
}
