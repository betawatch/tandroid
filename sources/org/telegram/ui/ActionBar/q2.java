package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q2 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ g3 b;

    public /* synthetic */ q2(g3 g3Var, int i10) {
        this.a = i10;
        this.b = g3Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                g3 g3Var = this.b;
                g3Var.getClass();
                g3Var.navigationBarAlpha = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e3 e3Var = g3Var.container;
                if (e3Var != null) {
                    e3Var.invalidate();
                    break;
                }
                break;
            case 1:
                g3 g3Var2 = this.b;
                g3Var2.getClass();
                g3Var2.navigationBarAlpha = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e3 e3Var2 = g3Var2.container;
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
                g3.j(this.b, valueAnimator);
                break;
            case 6:
                this.b.onContainerViewTranslation();
                break;
            default:
                g3.i(this.b, valueAnimator);
                break;
        }
    }
}
