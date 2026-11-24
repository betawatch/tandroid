// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class l36 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ o36 b;
    public final /* synthetic */ n36 c;

    public /* synthetic */ l36(o36 o36Var, n36 n36Var, byte b) {
        this.a = b;
        this.b = o36Var;
        this.c = n36Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        n36 n36Var = this.c;
        o36 o36Var = this.b;
        switch (b) {
            case 0:
                n36Var.c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o36Var.invalidate();
                break;
            default:
                o36Var.getClass();
                n36Var.c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o36Var.invalidate();
                break;
        }
    }
}
