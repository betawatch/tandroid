package fi;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t2 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ u2 b;

    public /* synthetic */ t2(u2 u2Var, int i7) {
        this.a = i7;
        this.b = u2Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                ((f3) this.b.c).invalidate();
                break;
            default:
                ((f3) this.b.c).invalidate();
                break;
        }
    }
}
