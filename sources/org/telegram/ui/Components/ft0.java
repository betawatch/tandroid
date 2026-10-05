package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class ft0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ju0 b;
    public final /* synthetic */ qv0 c;

    public /* synthetic */ ft0(qv0 qv0Var, ju0 ju0Var, int i10) {
        this.a = i10;
        this.c = qv0Var;
        this.b = ju0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                this.c.n1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                this.b.h.invalidate();
                break;
            default:
                this.c.n1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                this.b.h.invalidate();
                break;
        }
    }
}
