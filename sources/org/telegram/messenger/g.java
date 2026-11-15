package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
                du duVar = (du) this.b;
                duVar.getClass();
                duVar.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                duVar.t.run();
                break;
            default:
                uu uuVar = (uu) this.b;
                uuVar.getClass();
                uuVar.c0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = uuVar.W;
                if (view != null) {
                    view.invalidate();
                    break;
                }
                break;
        }
    }
}
