package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ j4 b;

    public /* synthetic */ p(j4 j4Var, int i10) {
        this.a = i10;
        this.b = j4Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                j4 j4Var = this.b;
                j4Var.getClass();
                j4Var.X(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            default:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j4 j4Var2 = this.b;
                j4Var2.Z0 = floatValue;
                j4Var2.q0.setTranslationY(((1.0f - floatValue) * AndroidUtilities.dp(51.0f)) + j4Var2.p0);
                break;
        }
    }
}
