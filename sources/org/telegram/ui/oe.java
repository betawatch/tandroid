package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final /* synthetic */ class oe implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ sn b;

    public /* synthetic */ oe(sn snVar, int i10) {
        this.a = i10;
        this.b = snVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sn snVar = this.b;
                snVar.K8 = floatValue;
                lm lmVar = snVar.X0;
                if (lmVar != null) {
                    lmVar.invalidate();
                    snVar.x0.invalidate();
                    break;
                }
                break;
            case 1:
                sn snVar2 = this.b;
                snVar2.getClass();
                snVar2.i3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                snVar2.pc();
                break;
            case 2:
                sn snVar3 = this.b;
                snVar3.getClass();
                snVar3.i3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                snVar3.pc();
                break;
            case 3:
                sn snVar4 = this.b;
                snVar4.getClass();
                snVar4.Ea = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                snVar4.t9();
                break;
            default:
                sn snVar5 = this.b;
                snVar5.getClass();
                snVar5.Ea = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                snVar5.t9();
                break;
        }
    }
}
