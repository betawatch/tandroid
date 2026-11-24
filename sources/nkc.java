// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class nkc implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qkc b;

    public /* synthetic */ nkc(qkc qkcVar, byte b) {
        this.a = b;
        this.b = qkcVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        qkc qkcVar = this.b;
        switch (b) {
            case 0:
                qkcVar.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qkcVar.invalidate();
                break;
            case 1:
                qkcVar.x = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                qkcVar.invalidate();
                break;
            case 2:
                qkcVar.s = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                qkcVar.invalidate();
                break;
            default:
                qkcVar.r = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                qkcVar.invalidate();
                break;
        }
    }
}
