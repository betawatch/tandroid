package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class f51 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ z61 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ f51(z61 z61Var, boolean z10, int i10) {
        this.a = i10;
        this.b = z61Var;
        this.c = z10;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                z61 z61Var = this.b;
                w51 w51Var = z61Var.h0;
                m51 m51Var = z61Var.i0;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.c) {
                    floatValue = 1.0f - floatValue;
                }
                float f7 = 1.0f - floatValue;
                w51Var.setAlpha(f7);
                w51Var.setTranslationY(AndroidUtilities.dp(8.0f) * floatValue);
                m51Var.setAlpha(floatValue);
                m51Var.setTranslationY(AndroidUtilities.dp(8.0f) * f7);
                z61Var.j0.setAlpha(m51Var.getAlpha() * floatValue);
                break;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.c) {
                    floatValue2 = 1.0f - floatValue2;
                }
                z61 z61Var2 = this.b;
                z61Var2.j0.setAlpha(z61Var2.i0.getAlpha() * floatValue2);
                break;
        }
    }
}
