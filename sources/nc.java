// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class nc implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ rc b;

    public /* synthetic */ nc(rc rcVar, byte b) {
        this.a = b;
        this.b = rcVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        rc rcVar = this.b;
        switch (b) {
            case 0:
                rcVar.f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rcVar.invalidate();
                break;
            case 1:
                rcVar.f(valueAnimator);
                break;
            case 2:
                rcVar.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            default:
                rcVar.n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
        }
    }
}
