// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class e5b implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ l5b b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;

    public /* synthetic */ e5b(l5b l5bVar, float f, float f2, byte b) {
        this.a = b;
        this.b = l5bVar;
        this.c = f;
        this.d = f2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        float f = this.d;
        float f2 = this.c;
        l5b l5bVar = this.b;
        switch (b) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l5bVar.setScrollY((int) gm.R1(f2, 0.0f, floatValue));
                k5b k5bVar = l5bVar.b0;
                k5bVar.x = gm.R1(f, 0.0f, floatValue);
                k5bVar.invalidate();
                break;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l5bVar.setScrollY((int) gm.R1(f2, Math.min((l5bVar.getMeasuredHeight() - l5bVar.u0) - gm.L(64.0f), l5bVar.r0.getBottom() - l5bVar.getMeasuredHeight()), floatValue2));
                k5b k5bVar2 = l5bVar.b0;
                k5bVar2.x = gm.R1(f, 1.0f, floatValue2);
                k5bVar2.invalidate();
                break;
        }
    }
}
