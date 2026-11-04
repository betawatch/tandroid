package ei;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q1 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ s1 b;

    public /* synthetic */ q1(s1 s1Var, int i3) {
        this.a = i3;
        this.b = s1Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                this.b.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                s1 s1Var = this.b;
                s1Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s1Var.n = floatValue;
                View view = s1Var.b;
                view.setAlpha(1.0f - floatValue);
                view.setScaleX(1.0f - s1Var.n);
                view.setScaleY(1.0f - s1Var.n);
                s1Var.c.setColorFilter(new PorterDuffColorFilter(i0.a.f(s1Var.n, -1, -2960428), PorterDuff.Mode.SRC_IN));
                s1Var.a.invalidate();
                break;
        }
    }
}
