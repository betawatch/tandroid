package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class tg implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ki b;

    public /* synthetic */ tg(ki kiVar, int i7) {
        this.a = i7;
        this.b = kiVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                this.b.Q1();
                break;
            case 1:
                this.b.B2.invalidate();
                break;
            case 2:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ki kiVar = this.b;
                kiVar.D0 = floatValue;
                org.telegram.ui.ActionBar.k2 k2Var = kiVar.c;
                if (k2Var != null) {
                    k2Var.invalidate();
                    break;
                }
                break;
            case 3:
                ki kiVar2 = this.b;
                kiVar2.getClass();
                kiVar2.z1(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 4:
                ki kiVar3 = this.b;
                ci ciVar = kiVar3.w2;
                qk qkVar = kiVar3.r2;
                if (ciVar == qkVar && qkVar != null) {
                    qkVar.invalidate();
                    break;
                }
                break;
            default:
                this.b.Q1();
                break;
        }
    }
}
