package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class lf implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ yn b;
    public final /* synthetic */ View c;

    public /* synthetic */ lf(yn ynVar, org.telegram.ui.Cells.w0 w0Var, int i10) {
        this.a = i10;
        this.b = ynVar;
        this.c = w0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                yn ynVar = this.b;
                ynVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ynVar.y9 = AndroidUtilities.dp(30.0f) * floatValue;
                ynVar.o9();
                this.c.setAlpha(floatValue);
                break;
            default:
                yn ynVar2 = this.b;
                ynVar2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ynVar2.y9 = AndroidUtilities.dp(30.0f) * floatValue2;
                ynVar2.o9();
                ynVar2.q9();
                this.c.setAlpha(floatValue2);
                break;
        }
    }
}
