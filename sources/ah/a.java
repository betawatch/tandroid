package ah;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ c b;
    public final /* synthetic */ x0 c;

    public /* synthetic */ a(c cVar, x0 x0Var, int i10) {
        this.a = i10;
        this.b = cVar;
        this.c = x0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                this.b.f = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                this.c.invalidate();
                break;
            default:
                this.b.f = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                this.c.invalidate();
                break;
        }
    }
}
