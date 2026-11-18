package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
