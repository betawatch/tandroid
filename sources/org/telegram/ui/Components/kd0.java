package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kd0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ wd0 b;

    public /* synthetic */ kd0(wd0 wd0Var, int i10) {
        this.a = i10;
        this.b = wd0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                wd0 wd0Var = this.b;
                wd0Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wd0Var.M = floatValue;
                wd0Var.f(floatValue);
                wd0Var.setAlpha(wd0Var.M);
                break;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wd0 wd0Var2 = this.b;
                dh.d dVar = wd0Var2.e;
                dVar.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, floatValue2));
                dVar.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, floatValue2));
                dVar.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, floatValue2));
                TextView textView = wd0Var2.w;
                textView.setScaleX(AndroidUtilities.lerp(1.0f, 0.9f, floatValue2));
                textView.setScaleY(AndroidUtilities.lerp(1.0f, 0.9f, floatValue2));
                textView.setAlpha(AndroidUtilities.lerp(1.0f, 0.0f, floatValue2));
                wd0Var2.s.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, floatValue2));
                break;
        }
    }
}
