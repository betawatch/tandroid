package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g41 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ b61 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ g41(b61 b61Var, boolean z10, int i10) {
        this.a = i10;
        this.b = b61Var;
        this.c = z10;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                b61 b61Var = this.b;
                y41 y41Var = b61Var.h0;
                o41 o41Var = b61Var.i0;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.c) {
                    floatValue = 1.0f - floatValue;
                }
                float f7 = 1.0f - floatValue;
                y41Var.setAlpha(f7);
                y41Var.setTranslationY(AndroidUtilities.dp(8.0f) * floatValue);
                o41Var.setAlpha(floatValue);
                o41Var.setTranslationY(AndroidUtilities.dp(8.0f) * f7);
                b61Var.j0.setAlpha(o41Var.getAlpha() * floatValue);
                break;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.c) {
                    floatValue2 = 1.0f - floatValue2;
                }
                b61 b61Var2 = this.b;
                b61Var2.j0.setAlpha(b61Var2.i0.getAlpha() * floatValue2);
                break;
        }
    }
}
