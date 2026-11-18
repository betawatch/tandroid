package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class km implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ om b;

    public /* synthetic */ km(om omVar, int i7) {
        this.a = i7;
        this.b = omVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                om omVar = this.b;
                omVar.getClass();
                omVar.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                omVar.invalidate();
                break;
            default:
                om omVar2 = this.b;
                omVar2.getClass();
                omVar2.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                omVar2.invalidate();
                break;
        }
    }
}
