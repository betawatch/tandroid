package di;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final /* synthetic */ class wa implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ pc b;

    public /* synthetic */ wa(pc pcVar, int i10) {
        this.a = i10;
        this.b = pcVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                this.b.M0.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                this.b.r1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 2:
                this.b.r1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 3:
                this.b.s1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 4:
                this.b.s1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                pc pcVar = this.b;
                pcVar.getClass();
                pcVar.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pcVar.o();
                pcVar.r.invalidate();
                pcVar.n.invalidate();
                break;
        }
    }
}
