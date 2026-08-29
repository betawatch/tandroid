package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p2 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ f3 b;

    public /* synthetic */ p2(f3 f3Var, int i10) {
        this.a = i10;
        this.b = f3Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                f3 f3Var = this.b;
                f3Var.getClass();
                f3Var.navigationBarAlpha = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d3 d3Var = f3Var.container;
                if (d3Var != null) {
                    d3Var.invalidate();
                    break;
                }
                break;
            case 1:
                f3 f3Var2 = this.b;
                f3Var2.getClass();
                f3Var2.navigationBarAlpha = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d3 d3Var2 = f3Var2.container;
                if (d3Var2 != null) {
                    d3Var2.invalidate();
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
                f3.j(this.b, valueAnimator);
                break;
            case 6:
                this.b.onContainerViewTranslation();
                break;
            default:
                f3.i(this.b, valueAnimator);
                break;
        }
    }
}
