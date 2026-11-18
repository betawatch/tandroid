package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class ch implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ si b;

    public /* synthetic */ ch(si siVar, int i7) {
        this.a = i7;
        this.b = siVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                this.b.R1();
                break;
            case 1:
                this.b.B2.invalidate();
                break;
            case 2:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                si siVar = this.b;
                siVar.D0 = floatValue;
                org.telegram.ui.ActionBar.n2 n2Var = siVar.c;
                if (n2Var != null) {
                    n2Var.invalidate();
                    break;
                }
                break;
            case 3:
                si siVar2 = this.b;
                siVar2.getClass();
                siVar2.A1(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 4:
                si siVar3 = this.b;
                ki kiVar = siVar3.w2;
                xk xkVar = siVar3.r2;
                if (kiVar == xkVar && xkVar != null) {
                    xkVar.invalidate();
                    break;
                }
                break;
            default:
                this.b.R1();
                break;
        }
    }
}
