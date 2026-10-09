package ai;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final /* synthetic */ class vb implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ yb b;

    public /* synthetic */ vb(yb ybVar, int i10) {
        this.a = i10;
        this.b = ybVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                kc kcVar = this.b.I0;
                kcVar.X = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kc.k(kcVar);
                break;
            default:
                kc kcVar2 = this.b.I0;
                kcVar2.W = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kc.k(kcVar2);
                break;
        }
    }
}
