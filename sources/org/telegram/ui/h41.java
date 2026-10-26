package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h41 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ c61 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ h41(c61 c61Var, boolean z10, int i10) {
        this.a = i10;
        this.b = c61Var;
        this.c = z10;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                c61 c61Var = this.b;
                z41 z41Var = c61Var.h0;
                p41 p41Var = c61Var.i0;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.c) {
                    floatValue = 1.0f - floatValue;
                }
                float f7 = 1.0f - floatValue;
                z41Var.setAlpha(f7);
                z41Var.setTranslationY(AndroidUtilities.dp(8.0f) * floatValue);
                p41Var.setAlpha(floatValue);
                p41Var.setTranslationY(AndroidUtilities.dp(8.0f) * f7);
                c61Var.j0.setAlpha(p41Var.getAlpha() * floatValue);
                break;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.c) {
                    floatValue2 = 1.0f - floatValue2;
                }
                c61 c61Var2 = this.b;
                c61Var2.j0.setAlpha(c61Var2.i0.getAlpha() * floatValue2);
                break;
        }
    }
}
