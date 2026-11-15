package hi;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class r2 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ s2 b;

    public /* synthetic */ r2(s2 s2Var, int i7) {
        this.a = i7;
        this.b = s2Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                ((d3) this.b.c).invalidate();
                break;
            default:
                ((d3) this.b.c).invalidate();
                break;
        }
    }
}
