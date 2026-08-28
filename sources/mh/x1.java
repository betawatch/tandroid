package mh;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class x1 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ c3 b;

    public /* synthetic */ x1(c3 c3Var, int i9) {
        this.a = i9;
        this.b = c3Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                c3 c3Var = this.b;
                c3Var.getClass();
                c3Var.J0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c3Var.h();
                break;
            default:
                this.b.y.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
