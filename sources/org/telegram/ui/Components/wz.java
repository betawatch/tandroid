package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wz implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ d00 b;

    public /* synthetic */ wz(d00 d00Var, int i10) {
        this.a = i10;
        this.b = d00Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d00 d00Var = this.b;
                d00Var.x = floatValue;
                d00Var.invalidate();
                break;
            default:
                d00 d00Var2 = this.b;
                d00Var2.getClass();
                d00Var2.y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d00Var2.invalidate();
                break;
        }
    }
}
