package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ng implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ci b;

    public /* synthetic */ ng(ci ciVar, int i7) {
        this.a = i7;
        this.b = ciVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                this.b.Q1();
                break;
            case 1:
                this.b.A2.invalidate();
                break;
            case 2:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ci ciVar = this.b;
                ciVar.C0 = floatValue;
                org.telegram.ui.ActionBar.m2 m2Var = ciVar.c;
                if (m2Var != null) {
                    m2Var.invalidate();
                    break;
                }
                break;
            case 3:
                ci ciVar2 = this.b;
                ciVar2.getClass();
                ciVar2.z1(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 4:
                ci ciVar3 = this.b;
                uh uhVar = ciVar3.v2;
                hk hkVar = ciVar3.q2;
                if (uhVar == hkVar && hkVar != null) {
                    hkVar.invalidate();
                    break;
                }
                break;
            default:
                this.b.Q1();
                break;
        }
    }
}
