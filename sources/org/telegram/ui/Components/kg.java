package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class kg implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ bi b;

    public /* synthetic */ kg(bi biVar, int i10) {
        this.a = i10;
        this.b = biVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                this.b.P1();
                break;
            case 1:
                this.b.x2.invalidate();
                break;
            case 2:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bi biVar = this.b;
                biVar.C0 = floatValue;
                org.telegram.ui.ActionBar.p2 p2Var = biVar.c;
                if (p2Var != null) {
                    p2Var.invalidate();
                    break;
                }
                break;
            case 3:
                bi biVar2 = this.b;
                biVar2.getClass();
                biVar2.y1(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 4:
                bi biVar3 = this.b;
                uh uhVar = biVar3.s2;
                kk kkVar = biVar3.n2;
                if (uhVar == kkVar && kkVar != null) {
                    kkVar.invalidate();
                    break;
                }
                break;
            default:
                this.b.P1();
                break;
        }
    }
}
