package di;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a9 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ d9 b;

    public /* synthetic */ a9(d9 d9Var, int i7) {
        this.a = i7;
        this.b = d9Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                p9 p9Var = this.b.r0;
                p9Var.X = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p9.i(p9Var);
                break;
            default:
                p9 p9Var2 = this.b.r0;
                p9Var2.W = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p9.i(p9Var2);
                break;
        }
    }
}
