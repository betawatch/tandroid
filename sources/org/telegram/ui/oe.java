package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class oe implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ zn b;

    public /* synthetic */ oe(zn znVar, int i10) {
        this.a = i10;
        this.b = znVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zn znVar = this.b;
                znVar.K8 = floatValue;
                sm smVar = znVar.X0;
                if (smVar != null) {
                    smVar.invalidate();
                    znVar.x0.invalidate();
                    break;
                }
                break;
            case 1:
                zn znVar2 = this.b;
                znVar2.getClass();
                znVar2.i3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                znVar2.pc();
                break;
            case 2:
                zn znVar3 = this.b;
                znVar3.getClass();
                znVar3.i3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                znVar3.pc();
                break;
            case 3:
                zn znVar4 = this.b;
                znVar4.getClass();
                znVar4.Ea = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                znVar4.t9();
                break;
            default:
                zn znVar5 = this.b;
                znVar5.getClass();
                znVar5.Ea = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                znVar5.t9();
                break;
        }
    }
}
