package org.telegram.ui.Cells;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g2 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ r2 b;

    public /* synthetic */ g2(r2 r2Var, int i9) {
        this.a = i9;
        this.b = r2Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                r2 r2Var = this.b;
                r2Var.getClass();
                r2Var.N3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r2Var.invalidate();
                break;
            case 1:
                r2 r2Var2 = this.b;
                r2Var2.getClass();
                r2Var2.O3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r2Var2.invalidate();
                break;
            default:
                r2 r2Var3 = this.b;
                r2Var3.getClass();
                r2Var3.q4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r2Var3.invalidate();
                break;
        }
    }
}
