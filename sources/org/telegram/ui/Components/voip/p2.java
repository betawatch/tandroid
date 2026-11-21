package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p2 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ q2 b;

    public /* synthetic */ p2(q2 q2Var, int i7) {
        this.a = i7;
        this.b = q2Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                q2 q2Var = this.b;
                q2Var.getClass();
                q2Var.R = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q2Var.a(q2Var.S, q2Var.T);
                break;
            default:
                q2 q2Var2 = this.b;
                q2Var2.getClass();
                q2Var2.a0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q2Var2.invalidate();
                break;
        }
    }
}
