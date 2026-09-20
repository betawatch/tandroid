package ai;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
