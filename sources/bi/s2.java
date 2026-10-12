package bi;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final /* synthetic */ class s2 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ q5 b;

    public /* synthetic */ s2(q5 q5Var, int i10) {
        this.a = i10;
        this.b = q5Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                q5 q5Var = this.b;
                q5Var.getClass();
                q5Var.H2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q5Var.invalidate();
                break;
            case 1:
                q5 q5Var2 = this.b;
                q5Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q5Var2.t3 = floatValue;
                q5Var2.r3.setTransitionProgress(floatValue);
                break;
            default:
                q5.Z(this.b, valueAnimator);
                break;
        }
    }
}
