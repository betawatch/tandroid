package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
                cyVar.H4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                this.b.L4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                cy cyVar2 = this.b;
                cyVar2.getClass();
                cyVar2.N4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
