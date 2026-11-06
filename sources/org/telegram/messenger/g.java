package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
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
                gu guVar = (gu) this.b;
                guVar.getClass();
                guVar.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                guVar.t.run();
                break;
            default:
                wu wuVar = (wu) this.b;
                wuVar.getClass();
                wuVar.b0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = wuVar.V;
                if (view != null) {
                    view.invalidate();
                    break;
                }
                break;
        }
    }
}
