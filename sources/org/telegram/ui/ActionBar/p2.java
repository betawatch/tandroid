package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p2 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ f3 b;

    public /* synthetic */ p2(f3 f3Var, int i9) {
        this.a = i9;
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
