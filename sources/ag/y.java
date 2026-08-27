package ag;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ b0 b;
    public final /* synthetic */ a0 c;

    public /* synthetic */ y(b0 b0Var, a0 a0Var, int i10) {
        this.a = i10;
        this.b = b0Var;
        this.c = a0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                b0 b0Var = this.b;
                b0Var.getClass();
                this.c.c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b0Var.invalidate();
                break;
            default:
                b0 b0Var2 = this.b;
                b0Var2.getClass();
                this.c.c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b0Var2.invalidate();
                break;
        }
    }
}
