package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final /* synthetic */ class q2 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ h3 b;

    public /* synthetic */ q2(h3 h3Var, int i10) {
        this.a = i10;
        this.b = h3Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                h3 h3Var = this.b;
                h3Var.getClass();
                h3Var.navigationBarAlpha = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e3 e3Var = h3Var.container;
                if (e3Var != null) {
                    e3Var.invalidate();
                    break;
                }
                break;
            case 1:
                h3 h3Var2 = this.b;
                h3Var2.getClass();
                h3Var2.navigationBarAlpha = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e3 e3Var2 = h3Var2.container;
                if (e3Var2 != null) {
                    e3Var2.invalidate();
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
                h3.j(this.b, valueAnimator);
                break;
            case 6:
                this.b.onContainerViewTranslation();
                break;
            default:
                h3.i(this.b, valueAnimator);
                break;
        }
    }
}
