// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class kc3 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ sc3 b;

    public /* synthetic */ kc3(sc3 sc3Var, u69 u69Var, byte b) {
        this.a = b;
        this.b = sc3Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        sc3 sc3Var = this.b;
        switch (b) {
            case 0:
                sc3Var.Q();
                break;
            default:
                sc3Var.M();
                break;
        }
    }
}
