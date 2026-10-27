package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
                eyVar.H4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                this.b.L4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                ey eyVar2 = this.b;
                eyVar2.getClass();
                eyVar2.N4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
