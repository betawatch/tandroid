package ai;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final /* synthetic */ class ub implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ xb b;

    public /* synthetic */ ub(xb xbVar, int i10) {
        this.a = i10;
        this.b = xbVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                jc jcVar = this.b.I0;
                jcVar.X = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jc.k(jcVar);
                break;
            default:
                jc jcVar2 = this.b.I0;
                jcVar2.W = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jc.k(jcVar2);
                break;
        }
    }
}
