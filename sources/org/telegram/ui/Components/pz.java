package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pz implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ rz b;

    public /* synthetic */ pz(rz rzVar, int i7) {
        this.a = i7;
        this.b = rzVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                rz rzVar = this.b;
                rzVar.getClass();
                rzVar.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rzVar.invalidate();
                break;
            case 1:
                rz rzVar2 = this.b;
                rzVar2.getClass();
                rzVar2.w = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                rzVar2.invalidate();
                break;
            default:
                rz rzVar3 = this.b;
                rzVar3.getClass();
                rzVar3.n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rzVar3.invalidate();
                break;
        }
    }
}
