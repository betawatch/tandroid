package ki;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public final /* synthetic */ class w1 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ x2 b;

    public /* synthetic */ w1(x2 x2Var, int i7) {
        this.a = i7;
        this.b = x2Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                x2 x2Var = this.b;
                x2Var.getClass();
                x2Var.S0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x2Var.l();
                break;
            default:
                this.b.F.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
