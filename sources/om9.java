// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class om9 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ rm9 b;

    public /* synthetic */ om9(rm9 rm9Var, byte b) {
        this.a = b;
        this.b = rm9Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        rm9 rm9Var = this.b;
        switch (b) {
            case 0:
                rm9Var.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rm9Var.g();
                break;
            default:
                rm9Var.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rm9Var.g();
                break;
        }
    }
}
