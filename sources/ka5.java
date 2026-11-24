// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ka5 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ oa5 b;

    public /* synthetic */ ka5(oa5 oa5Var, byte b) {
        this.a = b;
        this.b = oa5Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        oa5 oa5Var = this.b;
        switch (b) {
            case 0:
                oa5Var.s.x = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
                oa5Var.i();
                ma5 ma5Var = oa5Var.a;
                if (ma5Var.getParent() != null) {
                    oa5Var.n.updateViewLayout(ma5Var, oa5Var.s);
                    break;
                }
                break;
            default:
                oa5Var.s.y = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ma5 ma5Var2 = oa5Var.a;
                if (ma5Var2.getParent() != null) {
                    oa5Var.n.updateViewLayout(ma5Var2, oa5Var.s);
                    break;
                }
                break;
        }
    }
}
