package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final /* synthetic */ class ak implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ float c;
    public final /* synthetic */ FrameLayout d;

    public /* synthetic */ ak(FrameLayout frameLayout, int i10, float f7, int i11) {
        this.a = i11;
        this.d = frameLayout;
        this.b = i10;
        this.c = f7;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                ok okVar = (ok) this.d;
                dk dkVar = okVar.r;
                dk dkVar2 = okVar.s;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i10 = this.b;
                float f7 = this.c;
                if (i10 != 1) {
                    dkVar2.setTranslationX(f7 * floatValue);
                    dkVar2.setAlpha(Math.max(0.0f, 1.0f - floatValue));
                    dkVar2.invalidate();
                    dkVar.setAlpha(floatValue);
                    float f10 = (floatValue * 0.05f) + 0.95f;
                    dkVar.setScaleX(f10);
                    dkVar.setScaleY(f10);
                    dkVar2.invalidate();
                    break;
                } else {
                    dkVar.setTranslationX(f7 * floatValue);
                    dkVar.setAlpha(1.0f - floatValue);
                    dkVar.invalidate();
                    dkVar2.setAlpha(floatValue);
                    float f11 = (floatValue * 0.05f) + 0.95f;
                    dkVar2.setScaleX(f11);
                    dkVar2.setScaleY(f11);
                    break;
                }
            default:
                qb0 qb0Var = (qb0) this.d;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f12 = 1.0f - floatValue2;
                int i11 = (int) ((qb0Var.R * floatValue2) + (this.b * f12));
                qb0Var.T = i11;
                qb0Var.e((qb0Var.S * floatValue2) + (this.c * f12), i11);
                break;
        }
    }
}
