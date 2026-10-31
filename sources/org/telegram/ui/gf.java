package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class gf implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ un b;
    public final /* synthetic */ View c;

    public /* synthetic */ gf(un unVar, org.telegram.ui.Cells.s0 s0Var, int i10) {
        this.a = i10;
        this.b = unVar;
        this.c = s0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                un unVar = this.b;
                unVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                unVar.T9 = org.telegram.messenger.i0.L(30.0f) * floatValue;
                unVar.A9();
                this.c.setAlpha(floatValue);
                break;
            default:
                un unVar2 = this.b;
                unVar2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                unVar2.T9 = org.telegram.messenger.i0.L(30.0f) * floatValue2;
                unVar2.A9();
                unVar2.C9();
                this.c.setAlpha(floatValue2);
                break;
        }
    }
}
