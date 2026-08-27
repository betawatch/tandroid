package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h41 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ a61 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ h41(a61 a61Var, boolean z10, int i10) {
        this.a = i10;
        this.b = a61Var;
        this.c = z10;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                a61 a61Var = this.b;
                x41 x41Var = a61Var.d0;
                n41 n41Var = a61Var.e0;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.c) {
                    floatValue = 1.0f - floatValue;
                }
                float f10 = 1.0f - floatValue;
                x41Var.setAlpha(f10);
                x41Var.setTranslationY(AndroidUtilities.dp(8.0f) * floatValue);
                n41Var.setAlpha(floatValue);
                n41Var.setTranslationY(AndroidUtilities.dp(8.0f) * f10);
                a61Var.f0.setAlpha(n41Var.getAlpha() * floatValue);
                break;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.c) {
                    floatValue2 = 1.0f - floatValue2;
                }
                a61 a61Var2 = this.b;
                a61Var2.f0.setAlpha(a61Var2.e0.getAlpha() * floatValue2);
                break;
        }
    }
}
