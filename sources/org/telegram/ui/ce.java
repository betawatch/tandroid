package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ce implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ cn b;

    public /* synthetic */ ce(cn cnVar, int i7) {
        this.a = i7;
        this.b = cnVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cn cnVar = this.b;
                cnVar.Y8 = floatValue;
                ql qlVar = cnVar.l1;
                if (qlVar != null) {
                    qlVar.invalidate();
                    cnVar.z0.invalidate();
                    break;
                }
                break;
            case 1:
                cn cnVar2 = this.b;
                cnVar2.getClass();
                cnVar2.w3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cnVar2.Sc();
                break;
            case 2:
                cn cnVar3 = this.b;
                cnVar3.getClass();
                cnVar3.w3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cnVar3.Sc();
                break;
            case 3:
                cn cnVar4 = this.b;
                cnVar4.getClass();
                cnVar4.Za = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cnVar4.L9();
                break;
            default:
                cn cnVar5 = this.b;
                cnVar5.getClass();
                cnVar5.Za = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cnVar5.L9();
                break;
        }
    }
}
