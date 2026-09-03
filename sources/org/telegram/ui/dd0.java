package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class dd0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ pg0 b;

    public /* synthetic */ dd0(pg0 pg0Var, int i10) {
        this.a = i10;
        this.b = pg0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                pg0 pg0Var = this.b;
                pg0Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pg0Var.c.setAlpha(floatValue);
                pg0Var.c.setTranslationY((1.0f - floatValue) * AndroidUtilities.dp(230.0f));
                break;
            case 1:
                pg0 pg0Var2 = this.b;
                pg0Var2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pg0Var2.c.setAlpha(floatValue2);
                pg0Var2.c.setTranslationY((1.0f - floatValue2) * AndroidUtilities.dp(230.0f));
                break;
            default:
                pg0 pg0Var3 = this.b;
                pg0Var3.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f10 = (0.9f * floatValue3) + 0.1f;
                pg0Var3.S.setScaleX(f10);
                pg0Var3.S.setScaleY(f10);
                pg0Var3.S.setAlpha(floatValue3);
                break;
        }
    }
}
