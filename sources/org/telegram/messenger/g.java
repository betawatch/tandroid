package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                ((View) this.b).setTranslationX((float) (Math.sin(((Float) valueAnimator.getAnimatedValue()).floatValue() * 3.141592653589793d * 4.0d) * (1.0f - r9) * r9 * 4.0f * i0.L(4.0f)));
                break;
            case 1:
                ru ruVar = (ru) this.b;
                ruVar.getClass();
                ruVar.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ruVar.t.run();
                break;
            default:
                hv hvVar = (hv) this.b;
                hvVar.getClass();
                hvVar.b0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = hvVar.V;
                if (view != null) {
                    view.invalidate();
                    break;
                }
                break;
        }
    }
}
