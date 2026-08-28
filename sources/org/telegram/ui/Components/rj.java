package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rj implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ float c;
    public final /* synthetic */ FrameLayout d;

    public /* synthetic */ rj(FrameLayout frameLayout, int i9, float f10, int i10) {
        this.a = i10;
        this.d = frameLayout;
        this.b = i9;
        this.c = f10;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                fk fkVar = (fk) this.d;
                uj ujVar = fkVar.r;
                uj ujVar2 = fkVar.s;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i9 = this.b;
                float f10 = this.c;
                if (i9 != 1) {
                    ujVar2.setTranslationX(f10 * floatValue);
                    ujVar2.setAlpha(Math.max(0.0f, 1.0f - floatValue));
                    ujVar2.invalidate();
                    ujVar.setAlpha(floatValue);
                    float f11 = (floatValue * 0.05f) + 0.95f;
                    ujVar.setScaleX(f11);
                    ujVar.setScaleY(f11);
                    ujVar2.invalidate();
                    break;
                } else {
                    ujVar.setTranslationX(f10 * floatValue);
                    ujVar.setAlpha(1.0f - floatValue);
                    ujVar.invalidate();
                    ujVar2.setAlpha(floatValue);
                    float f12 = (floatValue * 0.05f) + 0.95f;
                    ujVar2.setScaleX(f12);
                    ujVar2.setScaleY(f12);
                    break;
                }
            default:
                wa0 wa0Var = (wa0) this.d;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f13 = 1.0f - floatValue2;
                int i10 = (int) ((wa0Var.N * floatValue2) + (this.b * f13));
                wa0Var.P = i10;
                wa0Var.e((wa0Var.O * floatValue2) + (this.c * f13), i10);
                break;
        }
    }
}
