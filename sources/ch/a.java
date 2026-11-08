package ch;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ b b;
    public final /* synthetic */ d0 c;

    public /* synthetic */ a(b bVar, d0 d0Var, int i7) {
        this.a = i7;
        this.b = bVar;
        this.c = d0Var;
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
