package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fm implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ km b;

    public /* synthetic */ fm(km kmVar, int i10) {
        this.a = i10;
        this.b = kmVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                km kmVar = this.b;
                kmVar.getClass();
                kmVar.C = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kmVar.invalidate();
                break;
            default:
                km kmVar2 = this.b;
                kmVar2.getClass();
                kmVar2.C = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kmVar2.invalidate();
                break;
        }
    }
}
