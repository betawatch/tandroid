package org.telegram.ui;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ig0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ mg0 b;

    public /* synthetic */ ig0(mg0 mg0Var, int i10) {
        this.a = i10;
        this.b = mg0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                mg0 mg0Var = this.b;
                mg0Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mg0Var.d.setAlpha(floatValue);
                mg0Var.e.setAlpha(floatValue);
                mg0Var.f.setProgress(floatValue);
                FrameLayout frameLayout = mg0Var.w;
                frameLayout.setAlpha(floatValue);
                float f7 = (floatValue * 0.5f) + 0.5f;
                frameLayout.setScaleX(f7);
                frameLayout.setScaleY(f7);
                break;
            default:
                mg0 mg0Var2 = this.b;
                mg0Var2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mg0Var2.f.setProgress(floatValue2);
                mg0Var2.d.setAlpha(floatValue2);
                mg0Var2.e.setAlpha(floatValue2);
                FrameLayout frameLayout2 = mg0Var2.w;
                frameLayout2.setAlpha(floatValue2);
                float f10 = (floatValue2 * 0.5f) + 0.5f;
                frameLayout2.setScaleX(f10);
                frameLayout2.setScaleY(f10);
                break;
        }
    }
}
