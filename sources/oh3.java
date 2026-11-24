// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class oh3 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ nk3 b;
    public final /* synthetic */ float c;

    public /* synthetic */ oh3(nk3 nk3Var, float f, byte b) {
        this.a = b;
        this.b = nk3Var;
        this.c = f;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        float f = this.c;
        nk3 nk3Var = this.b;
        switch (b) {
            case 0:
                nk3Var.f4(f, valueAnimator);
                break;
            default:
                nk3Var.T3(f, valueAnimator);
                break;
        }
    }
}
