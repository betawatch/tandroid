package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final /* synthetic */ class nm implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ sm b;

    public /* synthetic */ nm(sm smVar, int i10) {
        this.a = i10;
        this.b = smVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                sm smVar = this.b;
                smVar.getClass();
                smVar.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                smVar.invalidate();
                break;
            default:
                sm smVar2 = this.b;
                smVar2.getClass();
                smVar2.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                smVar2.invalidate();
                break;
        }
    }
}
