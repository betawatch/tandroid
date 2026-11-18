package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class be implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ bn b;

    public /* synthetic */ be(bn bnVar, int i7) {
        this.a = i7;
        this.b = bnVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bn bnVar = this.b;
                bnVar.a9 = floatValue;
                pl plVar = bnVar.m1;
                if (plVar != null) {
                    plVar.invalidate();
                    bnVar.A0.invalidate();
                    break;
                }
                break;
            case 1:
                bn bnVar2 = this.b;
                bnVar2.getClass();
                bnVar2.x3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bnVar2.Tc();
                break;
            case 2:
                bn bnVar3 = this.b;
                bnVar3.getClass();
                bnVar3.x3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bnVar3.Tc();
                break;
            case 3:
                bn bnVar4 = this.b;
                bnVar4.getClass();
                bnVar4.bb = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bnVar4.M9();
                break;
            default:
                bn bnVar5 = this.b;
                bnVar5.getClass();
                bnVar5.bb = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bnVar5.M9();
                break;
        }
    }
}
