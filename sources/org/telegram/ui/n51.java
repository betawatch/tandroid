package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final /* synthetic */ class n51 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ g71 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ n51(g71 g71Var, boolean z10, int i10) {
        this.a = i10;
        this.b = g71Var;
        this.c = z10;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                g71 g71Var = this.b;
                d61 d61Var = g71Var.h0;
                t51 t51Var = g71Var.i0;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.c) {
                    floatValue = 1.0f - floatValue;
                }
                float f7 = 1.0f - floatValue;
                d61Var.setAlpha(f7);
                d61Var.setTranslationY(AndroidUtilities.dp(8.0f) * floatValue);
                t51Var.setAlpha(floatValue);
                t51Var.setTranslationY(AndroidUtilities.dp(8.0f) * f7);
                g71Var.j0.setAlpha(t51Var.getAlpha() * floatValue);
                break;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.c) {
                    floatValue2 = 1.0f - floatValue2;
                }
                g71 g71Var2 = this.b;
                g71Var2.j0.setAlpha(g71Var2.i0.getAlpha() * floatValue2);
                break;
        }
    }
}
