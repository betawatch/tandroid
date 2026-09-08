package di;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final /* synthetic */ class b implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ d b;

    public /* synthetic */ b(d dVar, int i10) {
        this.a = i10;
        this.b = dVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                d dVar = this.b;
                dVar.getClass();
                dVar.P = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                dVar.invalidate();
                break;
            case 1:
                d dVar2 = this.b;
                dVar2.getClass();
                dVar2.V = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dVar2.invalidate();
                break;
            case 2:
                d dVar3 = this.b;
                dVar3.getClass();
                dVar3.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dVar3.invalidate();
                break;
            case 3:
                d dVar4 = this.b;
                dVar4.getClass();
                dVar4.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dVar4.invalidate();
                break;
            default:
                d dVar5 = this.b;
                dVar5.getClass();
                dVar5.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dVar5.invalidate();
                break;
        }
    }
}
