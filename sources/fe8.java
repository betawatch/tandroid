// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class fe8 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ he8 b;

    public /* synthetic */ fe8(he8 he8Var, byte b) {
        this.a = b;
        this.b = he8Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        he8 he8Var = this.b;
        switch (b) {
            case 0:
                he8Var.getClass();
                he8Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                he8Var.invalidate();
                break;
            default:
                he8Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                he8Var.invalidate();
                break;
        }
    }
}
