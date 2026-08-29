package lh;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class t8 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ w8 b;

    public /* synthetic */ t8(w8 w8Var, int i10) {
        this.a = i10;
        this.b = w8Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                i9 i9Var = this.b.E0;
                i9Var.T = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i9.k(i9Var);
                break;
            default:
                i9 i9Var2 = this.b.E0;
                i9Var2.S = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i9.k(i9Var2);
                break;
        }
    }
}
