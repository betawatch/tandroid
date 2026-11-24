// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class n0b implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ q0b b;

    public /* synthetic */ n0b(q0b q0bVar, byte b) {
        this.a = b;
        this.b = q0bVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        q0b q0bVar = this.b;
        switch (b) {
            case 0:
                q0bVar.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q0bVar.invalidate();
                break;
            case 1:
                q0bVar.m(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                q0bVar.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q0bVar.invalidate();
                break;
        }
    }
}
