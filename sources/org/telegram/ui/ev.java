package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final /* synthetic */ class ev implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ cy b;

    public /* synthetic */ ev(cy cyVar, int i10) {
        this.a = i10;
        this.b = cyVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                cy cyVar = this.b;
                cyVar.getClass();
                cyVar.x4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                this.b.B4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                cy cyVar2 = this.b;
                cyVar2.getClass();
                cyVar2.D4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
