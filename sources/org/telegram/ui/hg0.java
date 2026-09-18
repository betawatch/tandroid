package org.telegram.ui;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final /* synthetic */ class hg0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ lg0 b;

    public /* synthetic */ hg0(lg0 lg0Var, int i10) {
        this.a = i10;
        this.b = lg0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                lg0 lg0Var = this.b;
                lg0Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lg0Var.d.setAlpha(floatValue);
                lg0Var.e.setAlpha(floatValue);
                lg0Var.f.setProgress(floatValue);
                FrameLayout frameLayout = lg0Var.w;
                frameLayout.setAlpha(floatValue);
                float f7 = (floatValue * 0.5f) + 0.5f;
                frameLayout.setScaleX(f7);
                frameLayout.setScaleY(f7);
                break;
            default:
                lg0 lg0Var2 = this.b;
                lg0Var2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lg0Var2.f.setProgress(floatValue2);
                lg0Var2.d.setAlpha(floatValue2);
                lg0Var2.e.setAlpha(floatValue2);
                FrameLayout frameLayout2 = lg0Var2.w;
                frameLayout2.setAlpha(floatValue2);
                float f10 = (floatValue2 * 0.5f) + 0.5f;
                frameLayout2.setScaleX(f10);
                frameLayout2.setScaleY(f10);
                break;
        }
    }
}
