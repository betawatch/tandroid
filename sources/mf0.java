// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class mf0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pf0 b;

    public /* synthetic */ mf0(pf0 pf0Var, byte b) {
        this.a = b;
        this.b = pf0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        pf0 pf0Var = this.b;
        switch (b) {
            case 0:
                pf0Var.k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pf0Var.I = true;
                pf0Var.invalidate();
                break;
            case 1:
                pf0Var.l0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pf0Var.I = true;
                pf0Var.invalidate();
                break;
            default:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pf0Var.w0 = floatValue;
                pf0Var.u0.setAlpha(floatValue);
                pf0Var.invalidate();
                break;
        }
    }
}
