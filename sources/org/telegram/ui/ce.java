package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ce implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ an b;

    public /* synthetic */ ce(an anVar, int i7) {
        this.a = i7;
        this.b = anVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                an anVar = this.b;
                anVar.Y8 = floatValue;
                ol olVar = anVar.l1;
                if (olVar != null) {
                    olVar.invalidate();
                    anVar.z0.invalidate();
                    break;
                }
                break;
            case 1:
                an anVar2 = this.b;
                anVar2.getClass();
                anVar2.w3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                anVar2.Pc();
                break;
            case 2:
                an anVar3 = this.b;
                anVar3.getClass();
                anVar3.w3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                anVar3.Pc();
                break;
            case 3:
                an anVar4 = this.b;
                anVar4.getClass();
                anVar4.Xa = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                anVar4.K9();
                break;
            default:
                an anVar5 = this.b;
                anVar5.getClass();
                anVar5.Xa = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                anVar5.K9();
                break;
        }
    }
}
