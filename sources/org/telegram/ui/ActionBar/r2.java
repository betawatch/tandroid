package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class r2 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ h3 b;

    public /* synthetic */ r2(h3 h3Var, int i10) {
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
                f3 f3Var = h3Var.container;
                if (f3Var != null) {
                    f3Var.invalidate();
                    break;
                }
                break;
            case 1:
                h3 h3Var2 = this.b;
                h3Var2.getClass();
                h3Var2.navigationBarAlpha = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f3 f3Var2 = h3Var2.container;
                if (f3Var2 != null) {
                    f3Var2.invalidate();
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
