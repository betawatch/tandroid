package ai;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final /* synthetic */ class q2 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ s2 b;

    public /* synthetic */ q2(s2 s2Var, int i10) {
        this.a = i10;
        this.b = s2Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                this.b.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                s2 s2Var = this.b;
                s2Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s2Var.n = floatValue;
                View view = s2Var.b;
                view.setAlpha(1.0f - floatValue);
                view.setScaleX(1.0f - s2Var.n);
                view.setScaleY(1.0f - s2Var.n);
                s2Var.c.setColorFilter(new PorterDuffColorFilter(i0.a.d(s2Var.n, -1, -2960428), PorterDuff.Mode.SRC_IN));
                s2Var.a.invalidate();
                break;
        }
    }
}
