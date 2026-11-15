package fi;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class u1 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ b4 b;

    public /* synthetic */ u1(b4 b4Var, int i7) {
        this.a = i7;
        this.b = b4Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                b4 b4Var = this.b;
                b4Var.getClass();
                b4Var.r2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b4Var.invalidate();
                break;
            case 1:
                b4 b4Var2 = this.b;
                b4Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b4Var2.d3 = floatValue;
                b4Var2.b3.setTransitionProgress(floatValue);
                break;
            default:
                b4.X(this.b, valueAnimator);
                break;
        }
    }
}
