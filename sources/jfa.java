// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class jfa implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iga b;
    public final /* synthetic */ nha c;

    public /* synthetic */ jfa(nha nhaVar, iga igaVar, byte b) {
        this.a = b;
        this.c = nhaVar;
        this.b = igaVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        iga igaVar = this.b;
        nha nhaVar = this.c;
        switch (b) {
            case 0:
                nhaVar.q1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                igaVar.h.invalidate();
                break;
            default:
                nhaVar.q1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                igaVar.h.invalidate();
                break;
        }
    }
}
