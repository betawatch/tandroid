// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class nmb implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pmb b;

    public /* synthetic */ nmb(pmb pmbVar, byte b) {
        this.a = b;
        this.b = pmbVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        pmb pmbVar = this.b;
        switch (b) {
            case 0:
                pmbVar.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pmbVar.invalidate();
                break;
            case 1:
                pmbVar.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pmbVar.invalidate();
                break;
            case 2:
                pmbVar.f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pmbVar.invalidate();
                break;
            case 3:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pmbVar.s = floatValue;
                pmbVar.x = (int) ((pmbVar.h * floatValue) + 0.0f);
                pmbVar.invalidate();
                break;
            default:
                pmbVar.w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pmbVar.y = pmbVar.r + ((int) Math.ceil((pmbVar.n - r0) * r4));
                pmbVar.invalidate();
                break;
        }
    }
}
