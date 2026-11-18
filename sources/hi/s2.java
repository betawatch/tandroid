package hi;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final /* synthetic */ class s2 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ t2 b;

    public /* synthetic */ s2(t2 t2Var, int i7) {
        this.a = i7;
        this.b = t2Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                ((e3) this.b.c).invalidate();
                break;
            default:
                ((e3) this.b.c).invalidate();
                break;
        }
    }
}
