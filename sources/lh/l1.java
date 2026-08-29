package lh;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class l1 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ n1 b;

    public /* synthetic */ l1(n1 n1Var, int i10) {
        this.a = i10;
        this.b = n1Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                this.b.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                n1 n1Var = this.b;
                n1Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n1Var.n = floatValue;
                View view = n1Var.b;
                view.setAlpha(1.0f - floatValue);
                view.setScaleX(1.0f - n1Var.n);
                view.setScaleY(1.0f - n1Var.n);
                n1Var.c.setColorFilter(new PorterDuffColorFilter(i0.a.d(n1Var.n, -1, -2960428), PorterDuff.Mode.SRC_IN));
                n1Var.a.invalidate();
                break;
        }
    }
}
