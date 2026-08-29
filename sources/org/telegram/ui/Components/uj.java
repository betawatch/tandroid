package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class uj implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ float c;
    public final /* synthetic */ FrameLayout d;

    public /* synthetic */ uj(FrameLayout frameLayout, int i10, float f9, int i11) {
        this.a = i11;
        this.d = frameLayout;
        this.b = i10;
        this.c = f9;
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
                float f9 = this.c;
                if (i10 != 1) {
                    xjVar2.setTranslationX(f9 * floatValue);
                    xjVar2.setAlpha(Math.max(0.0f, 1.0f - floatValue));
                    xjVar2.invalidate();
                    xjVar.setAlpha(floatValue);
                    float f10 = (floatValue * 0.05f) + 0.95f;
                    xjVar.setScaleX(f10);
                    xjVar.setScaleY(f10);
                    xjVar2.invalidate();
                    break;
                } else {
                    xjVar.setTranslationX(f9 * floatValue);
                    xjVar.setAlpha(1.0f - floatValue);
                    xjVar.invalidate();
                    xjVar2.setAlpha(floatValue);
                    float f11 = (floatValue * 0.05f) + 0.95f;
                    xjVar2.setScaleX(f11);
                    xjVar2.setScaleY(f11);
                    break;
                }
            default:
                lb0 lb0Var = (lb0) this.d;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f12 = 1.0f - floatValue2;
                int i11 = (int) ((lb0Var.N * floatValue2) + (this.b * f12));
                lb0Var.P = i11;
                lb0Var.e((lb0Var.O * floatValue2) + (this.c * f12), i11);
                break;
        }
    }
}
