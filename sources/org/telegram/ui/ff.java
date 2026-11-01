package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ff implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ un b;
    public final /* synthetic */ View c;

    public /* synthetic */ ff(un unVar, org.telegram.ui.Cells.s0 s0Var, int i10) {
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
                unVar.F9();
                this.c.setAlpha(floatValue);
                break;
            default:
                un unVar2 = this.b;
                unVar2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                unVar2.T9 = org.telegram.messenger.i0.L(30.0f) * floatValue2;
                unVar2.F9();
                unVar2.H9();
                this.c.setAlpha(floatValue2);
                break;
        }
    }
}
