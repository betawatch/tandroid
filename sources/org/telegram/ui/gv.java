package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gv implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ey b;

    public /* synthetic */ gv(ey eyVar, int i10) {
        this.a = i10;
        this.b = eyVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                ey eyVar = this.b;
                eyVar.getClass();
                eyVar.x4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                this.b.B4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                ey eyVar2 = this.b;
                eyVar2.getClass();
                eyVar2.D4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
