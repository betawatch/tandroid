// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class fzb implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hzb b;

    public /* synthetic */ fzb(hzb hzbVar, byte b) {
        this.a = b;
        this.b = hzbVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        hzb hzbVar = this.b;
        switch (b) {
            case 0:
                yc ycVar = hzbVar.f;
                ycVar.setScaleX(Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                ycVar.setScaleY(Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                ycVar.invalidate();
                break;
            default:
                hzbVar.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hzbVar.h();
                break;
        }
    }
}
