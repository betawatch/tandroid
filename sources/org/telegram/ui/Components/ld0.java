package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ld0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ xd0 b;

    public /* synthetic */ ld0(xd0 xd0Var, int i10) {
        this.a = i10;
        this.b = xd0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                xd0 xd0Var = this.b;
                xd0Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xd0Var.M = floatValue;
                xd0Var.f(floatValue);
                xd0Var.setAlpha(xd0Var.M);
                break;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xd0 xd0Var2 = this.b;
                eh.d dVar = xd0Var2.e;
                dVar.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, floatValue2));
                dVar.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, floatValue2));
                dVar.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, floatValue2));
                TextView textView = xd0Var2.w;
                textView.setScaleX(AndroidUtilities.lerp(1.0f, 0.9f, floatValue2));
                textView.setScaleY(AndroidUtilities.lerp(1.0f, 0.9f, floatValue2));
                textView.setAlpha(AndroidUtilities.lerp(1.0f, 0.0f, floatValue2));
                xd0Var2.s.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, floatValue2));
                break;
        }
    }
}
