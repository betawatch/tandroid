// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class oa implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pa b;
    public final /* synthetic */ f63 c;

    public /* synthetic */ oa(pa paVar, f63 f63Var, byte b) {
        this.a = b;
        this.b = paVar;
        this.c = f63Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        f63 f63Var = this.c;
        pa paVar = this.b;
        switch (b) {
            case 0:
                paVar.f = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                f63Var.invalidate();
                break;
            default:
                paVar.f = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                f63Var.invalidate();
                break;
        }
    }
}
