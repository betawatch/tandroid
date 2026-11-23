package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class jz implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ pz b;

    public /* synthetic */ jz(pz pzVar, int i7) {
        this.a = i7;
        this.b = pzVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pz pzVar = this.b;
                pzVar.y = floatValue;
                pzVar.invalidate();
                break;
            default:
                pz pzVar2 = this.b;
                pzVar2.getClass();
                pzVar2.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pzVar2.invalidate();
                break;
        }
    }
}
