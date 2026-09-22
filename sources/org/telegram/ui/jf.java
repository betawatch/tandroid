package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jf implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ bo b;
    public final /* synthetic */ View c;

    public /* synthetic */ jf(bo boVar, org.telegram.ui.Cells.w0 w0Var, int i10) {
        this.a = i10;
        this.b = boVar;
        this.c = w0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                bo boVar = this.b;
                boVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                boVar.A9 = AndroidUtilities.dp(30.0f) * floatValue;
                boVar.o9();
                this.c.setAlpha(floatValue);
                break;
            default:
                bo boVar2 = this.b;
                boVar2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                boVar2.A9 = AndroidUtilities.dp(30.0f) * floatValue2;
                boVar2.o9();
                boVar2.r9();
                this.c.setAlpha(floatValue2);
                break;
        }
    }
}
