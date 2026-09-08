package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class jf implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ co b;
    public final /* synthetic */ View c;

    public /* synthetic */ jf(co coVar, org.telegram.ui.Cells.w0 w0Var, int i10) {
        this.a = i10;
        this.b = coVar;
        this.c = w0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                co coVar = this.b;
                coVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                coVar.A9 = AndroidUtilities.dp(30.0f) * floatValue;
                coVar.o9();
                this.c.setAlpha(floatValue);
                break;
            default:
                co coVar2 = this.b;
                coVar2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                coVar2.A9 = AndroidUtilities.dp(30.0f) * floatValue2;
                coVar2.o9();
                coVar2.r9();
                this.c.setAlpha(floatValue2);
                break;
        }
    }
}
