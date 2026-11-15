package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class ae implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ an b;

    public /* synthetic */ ae(an anVar, int i7) {
        this.a = i7;
        this.b = anVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                an anVar = this.b;
                anVar.Z8 = floatValue;
                ol olVar = anVar.m1;
                if (olVar != null) {
                    olVar.invalidate();
                    anVar.A0.invalidate();
                    break;
                }
                break;
            case 1:
                an anVar2 = this.b;
                anVar2.getClass();
                anVar2.x3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                anVar2.Tc();
                break;
            case 2:
                an anVar3 = this.b;
                anVar3.getClass();
                anVar3.x3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                anVar3.Tc();
                break;
            case 3:
                an anVar4 = this.b;
                anVar4.getClass();
                anVar4.ab = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                anVar4.M9();
                break;
            default:
                an anVar5 = this.b;
                anVar5.getClass();
                anVar5.ab = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                anVar5.M9();
                break;
        }
    }
}
