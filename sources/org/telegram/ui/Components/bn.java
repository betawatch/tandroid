package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bn implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ gn b;

    public /* synthetic */ bn(gn gnVar, int i10) {
        this.a = i10;
        this.b = gnVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                gn gnVar = this.b;
                gnVar.getClass();
                gnVar.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gnVar.invalidate();
                break;
            default:
                gn gnVar2 = this.b;
                gnVar2.getClass();
                gnVar2.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gnVar2.invalidate();
                break;
        }
    }
}
