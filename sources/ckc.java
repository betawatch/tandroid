// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class ckc implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ dkc b;

    public /* synthetic */ ckc(dkc dkcVar, byte b) {
        this.a = b;
        this.b = dkcVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        dkc dkcVar = this.b;
        switch (b) {
            case 0:
                dkcVar.getClass();
                dkcVar.R = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dkcVar.a(dkcVar.S, dkcVar.T);
                break;
            default:
                dkcVar.a0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dkcVar.invalidate();
                break;
        }
    }
}
