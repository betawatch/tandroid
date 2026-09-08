package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class p51 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ j71 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ p51(j71 j71Var, boolean z10, int i10) {
        this.a = i10;
        this.b = j71Var;
        this.c = z10;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                j71 j71Var = this.b;
                g61 g61Var = j71Var.h0;
                w51 w51Var = j71Var.i0;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.c) {
                    floatValue = 1.0f - floatValue;
                }
                float f7 = 1.0f - floatValue;
                g61Var.setAlpha(f7);
                g61Var.setTranslationY(AndroidUtilities.dp(8.0f) * floatValue);
                w51Var.setAlpha(floatValue);
                w51Var.setTranslationY(AndroidUtilities.dp(8.0f) * f7);
                j71Var.j0.setAlpha(w51Var.getAlpha() * floatValue);
                break;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.c) {
                    floatValue2 = 1.0f - floatValue2;
                }
                j71 j71Var2 = this.b;
                j71Var2.j0.setAlpha(j71Var2.i0.getAlpha() * floatValue2);
                break;
        }
    }
}
