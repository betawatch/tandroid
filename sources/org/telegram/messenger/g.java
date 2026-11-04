package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                ((View) this.b).setTranslationX((float) (Math.sin(((Float) valueAnimator.getAnimatedValue()).floatValue() * 3.141592653589793d * 4.0d) * (1.0f - r9) * r9 * 4.0f * g0.L(4.0f)));
                break;
            case 1:
                yt ytVar = (yt) this.b;
                ytVar.getClass();
                ytVar.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ytVar.t.run();
                break;
            default:
                ou ouVar = (ou) this.b;
                ouVar.getClass();
                ouVar.c0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = ouVar.W;
                if (view != null) {
                    view.invalidate();
                    break;
                }
                break;
        }
    }
}
