// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class jt4 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ cn0 b;

    public /* synthetic */ jt4(cn0 cn0Var, byte b) {
        this.a = b;
        this.b = cn0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        cn0 cn0Var = this.b;
        switch (b) {
            case 0:
                ((tt4) cn0Var.c).invalidate();
                break;
            default:
                ((tt4) cn0Var.c).invalidate();
                break;
        }
    }
}
