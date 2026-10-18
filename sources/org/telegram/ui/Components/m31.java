package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m31 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ p31 b;

    public /* synthetic */ m31(p31 p31Var, int i10) {
        this.a = i10;
        this.b = p31Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                p31 p31Var = this.b;
                p31Var.getClass();
                p31Var.Q = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p31Var.h();
                p31Var.g();
                break;
            default:
                float max = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                p31 p31Var2 = this.b;
                p31Var2.K = max;
                p31Var2.h.invalidate();
                break;
        }
    }
}
