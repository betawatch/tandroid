package mh;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class x3 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ g4 b;

    public /* synthetic */ x3(g4 g4Var, int i9) {
        this.a = i9;
        this.b = g4Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                this.b.E.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                z3 z3Var = this.b.n;
                if (z3Var.getWebView() != null) {
                    z3Var.getWebView().setScrollY(intValue);
                    break;
                }
                break;
        }
    }
}
