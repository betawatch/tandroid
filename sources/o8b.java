// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class o8b implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ v9b b;

    public /* synthetic */ o8b(v9b v9bVar, byte b) {
        this.a = b;
        this.b = v9bVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        v9b v9bVar = this.b;
        switch (b) {
            case 0:
                v9bVar.N0.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                v9bVar.s1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 2:
                v9bVar.s1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 3:
                v9bVar.t1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 4:
                v9bVar.t1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                v9bVar.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v9bVar.l();
                v9bVar.r.invalidate();
                v9bVar.n.invalidate();
                break;
        }
    }
}
