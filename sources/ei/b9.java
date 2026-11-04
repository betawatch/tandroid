package ei;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b9 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ e9 b;

    public /* synthetic */ b9(e9 e9Var, int i3) {
        this.a = i3;
        this.b = e9Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                r9 r9Var = this.b.s0;
                r9Var.Y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r9.w(r9Var);
                break;
            default:
                r9 r9Var2 = this.b.s0;
                r9Var2.X = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r9.w(r9Var2);
                break;
        }
    }
}
