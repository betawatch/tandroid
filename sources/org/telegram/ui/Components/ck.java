package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ck implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ float c;
    public final /* synthetic */ FrameLayout d;

    public /* synthetic */ ck(FrameLayout frameLayout, int i10, float f7, int i11) {
        this.a = i11;
        this.d = frameLayout;
        this.b = i10;
        this.c = f7;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                qk qkVar = (qk) this.d;
                fk fkVar = qkVar.r;
                fk fkVar2 = qkVar.s;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i10 = this.b;
                float f7 = this.c;
                if (i10 != 1) {
                    fkVar2.setTranslationX(f7 * floatValue);
                    fkVar2.setAlpha(Math.max(0.0f, 1.0f - floatValue));
                    fkVar2.invalidate();
                    fkVar.setAlpha(floatValue);
                    float f10 = (floatValue * 0.05f) + 0.95f;
                    fkVar.setScaleX(f10);
                    fkVar.setScaleY(f10);
                    fkVar2.invalidate();
                    break;
                } else {
                    fkVar.setTranslationX(f7 * floatValue);
                    fkVar.setAlpha(1.0f - floatValue);
                    fkVar.invalidate();
                    fkVar2.setAlpha(floatValue);
                    float f11 = (floatValue * 0.05f) + 0.95f;
                    fkVar2.setScaleX(f11);
                    fkVar2.setScaleY(f11);
                    break;
                }
            default:
                bc0 bc0Var = (bc0) this.d;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f12 = 1.0f - floatValue2;
                int i11 = (int) ((bc0Var.R * floatValue2) + (this.b * f12));
                bc0Var.T = i11;
                bc0Var.e((bc0Var.S * floatValue2) + (this.c * f12), i11);
                break;
        }
    }
}
