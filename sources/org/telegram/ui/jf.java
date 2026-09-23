package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class jf implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ xn b;
    public final /* synthetic */ View c;

    public /* synthetic */ jf(xn xnVar, org.telegram.ui.Cells.w0 w0Var, int i10) {
        this.a = i10;
        this.b = xnVar;
        this.c = w0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                xn xnVar = this.b;
                xnVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xnVar.A9 = AndroidUtilities.dp(30.0f) * floatValue;
                xnVar.o9();
                this.c.setAlpha(floatValue);
                break;
            default:
                xn xnVar2 = this.b;
                xnVar2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xnVar2.A9 = AndroidUtilities.dp(30.0f) * floatValue2;
                xnVar2.o9();
                xnVar2.r9();
                this.c.setAlpha(floatValue2);
                break;
        }
    }
}
