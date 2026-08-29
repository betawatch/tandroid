package nh;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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
                dVar.L = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                dVar.invalidate();
                break;
            case 1:
                d dVar2 = this.b;
                dVar2.getClass();
                dVar2.R = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dVar2.invalidate();
                break;
            case 2:
                d dVar3 = this.b;
                dVar3.getClass();
                dVar3.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dVar3.invalidate();
                break;
            case 3:
                d dVar4 = this.b;
                dVar4.getClass();
                dVar4.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dVar4.invalidate();
                break;
            default:
                d dVar5 = this.b;
                dVar5.getClass();
                dVar5.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dVar5.invalidate();
                break;
        }
    }
}
