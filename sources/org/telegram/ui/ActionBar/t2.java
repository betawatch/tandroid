package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t2 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ k3 b;

    public /* synthetic */ t2(k3 k3Var, int i10) {
        this.a = i10;
        this.b = k3Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                k3 k3Var = this.b;
                k3Var.getClass();
                k3Var.navigationBarAlpha = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h3 h3Var = k3Var.container;
                if (h3Var != null) {
                    h3Var.invalidate();
                    break;
                }
                break;
            case 1:
                k3 k3Var2 = this.b;
                k3Var2.getClass();
                k3Var2.navigationBarAlpha = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h3 h3Var2 = k3Var2.container;
                if (h3Var2 != null) {
                    h3Var2.invalidate();
                    break;
                }
                break;
            case 2:
                this.b.onContainerViewTranslation();
                break;
            case 3:
                this.b.onContainerViewTranslation();
                break;
            case 4:
                this.b.onContainerViewTranslation();
                break;
            case 5:
                k3.j(this.b, valueAnimator);
                break;
            case 6:
                this.b.onContainerViewTranslation();
                break;
            default:
                k3.i(this.b, valueAnimator);
                break;
        }
    }
}
