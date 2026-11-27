// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class na5 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ra5 b;

    public /* synthetic */ na5(ra5 ra5Var, byte b) {
        this.a = b;
        this.b = ra5Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        ra5 ra5Var = this.b;
        switch (b) {
            case 0:
                ra5Var.s.x = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ra5Var.i();
                pa5 pa5Var = ra5Var.a;
                if (pa5Var.getParent() != null) {
                    ra5Var.n.updateViewLayout(pa5Var, ra5Var.s);
                    break;
                }
                break;
            default:
                ra5Var.s.y = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pa5 pa5Var2 = ra5Var.a;
                if (pa5Var2.getParent() != null) {
                    ra5Var.n.updateViewLayout(pa5Var2, ra5Var.s);
                    break;
                }
                break;
        }
    }
}
