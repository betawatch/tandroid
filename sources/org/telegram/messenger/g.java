package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                ((View) this.b).setTranslationX((float) (Math.sin(((Float) valueAnimator.getAnimatedValue()).floatValue() * 3.141592653589793d * 4.0d) * (1.0f - r9) * r9 * 4.0f * g0.L(4.0f)));
                break;
            case 1:
                bu buVar = (bu) this.b;
                buVar.getClass();
                buVar.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                buVar.t.run();
                break;
            default:
                ru ruVar = (ru) this.b;
                ruVar.getClass();
                ruVar.c0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = ruVar.W;
                if (view != null) {
                    view.invalidate();
                    break;
                }
                break;
        }
    }
}
