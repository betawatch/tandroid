package fi;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class t8 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ w8 b;

    public /* synthetic */ t8(w8 w8Var, int i7) {
        this.a = i7;
        this.b = w8Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                i9 i9Var = this.b.s0;
                i9Var.Y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i9.i(i9Var);
                break;
            default:
                i9 i9Var2 = this.b.s0;
                i9Var2.X = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i9.i(i9Var2);
                break;
        }
    }
}
