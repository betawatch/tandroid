package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final /* synthetic */ class ef implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ sn b;
    public final /* synthetic */ View c;

    public /* synthetic */ ef(sn snVar, org.telegram.ui.Cells.v0 v0Var, int i10) {
        this.a = i10;
        this.b = snVar;
        this.c = v0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                sn snVar = this.b;
                snVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                snVar.M9 = AndroidUtilities.dp(30.0f) * floatValue;
                snVar.t9();
                this.c.setAlpha(floatValue);
                break;
            default:
                sn snVar2 = this.b;
                snVar2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                snVar2.M9 = AndroidUtilities.dp(30.0f) * floatValue2;
                snVar2.t9();
                snVar2.w9();
                this.c.setAlpha(floatValue2);
                break;
        }
    }
}
