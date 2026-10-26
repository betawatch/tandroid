package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wm implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ bn b;

    public /* synthetic */ wm(bn bnVar, int i10) {
        this.a = i10;
        this.b = bnVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                bn bnVar = this.b;
                bnVar.getClass();
                bnVar.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bnVar.invalidate();
                break;
            default:
                bn bnVar2 = this.b;
                bnVar2.getClass();
                bnVar2.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bnVar2.invalidate();
                break;
        }
    }
}
