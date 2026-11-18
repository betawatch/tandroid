package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
                au auVar = (au) this.b;
                auVar.getClass();
                auVar.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                auVar.t.run();
                break;
            default:
                qu quVar = (qu) this.b;
                quVar.getClass();
                quVar.c0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = quVar.W;
                if (view != null) {
                    view.invalidate();
                    break;
                }
                break;
        }
    }
}
