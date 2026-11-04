package gi;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ d b;

    public /* synthetic */ b(d dVar, int i3) {
        this.a = i3;
        this.b = dVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                d dVar = this.b;
                dVar.getClass();
                dVar.T = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                dVar.invalidate();
                break;
            case 1:
                d dVar2 = this.b;
                dVar2.getClass();
                dVar2.c0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dVar2.invalidate();
                break;
            case 2:
                d dVar3 = this.b;
                dVar3.getClass();
                dVar3.Q = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dVar3.invalidate();
                break;
            case 3:
                d dVar4 = this.b;
                dVar4.getClass();
                dVar4.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dVar4.invalidate();
                break;
            default:
                d dVar5 = this.b;
                dVar5.getClass();
                dVar5.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dVar5.invalidate();
                break;
        }
    }
}
