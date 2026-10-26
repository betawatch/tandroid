package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ph0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ sh0 b;

    public /* synthetic */ ph0(sh0 sh0Var, int i10) {
        this.a = i10;
        this.b = sh0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                sh0 sh0Var = this.b;
                sh0Var.getClass();
                sh0Var.b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sh0Var.c(true);
                break;
            default:
                sh0 sh0Var2 = this.b;
                sh0Var2.getClass();
                sh0Var2.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sh0Var2.c(true);
                break;
        }
    }
}
