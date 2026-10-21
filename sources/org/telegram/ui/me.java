package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final /* synthetic */ class me implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ qn b;

    public /* synthetic */ me(qn qnVar, int i10) {
        this.a = i10;
        this.b = qnVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qn qnVar = this.b;
                qnVar.K8 = floatValue;
                jm jmVar = qnVar.X0;
                if (jmVar != null) {
                    jmVar.invalidate();
                    qnVar.x0.invalidate();
                    break;
                }
                break;
            case 1:
                qn qnVar2 = this.b;
                qnVar2.getClass();
                qnVar2.i3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qnVar2.qc();
                break;
            case 2:
                qn qnVar3 = this.b;
                qnVar3.getClass();
                qnVar3.i3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qnVar3.qc();
                break;
            case 3:
                qn qnVar4 = this.b;
                qnVar4.getClass();
                qnVar4.Ea = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qnVar4.t9();
                break;
            default:
                qn qnVar5 = this.b;
                qnVar5.getClass();
                qnVar5.Ea = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qnVar5.t9();
                break;
        }
    }
}
