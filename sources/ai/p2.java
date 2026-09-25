package ai;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes4.dex */
public final /* synthetic */ class p2 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ r2 b;

    public /* synthetic */ p2(r2 r2Var, int i10) {
        this.a = i10;
        this.b = r2Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                this.b.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                r2 r2Var = this.b;
                r2Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r2Var.n = floatValue;
                View view = r2Var.b;
                view.setAlpha(1.0f - floatValue);
                view.setScaleX(1.0f - r2Var.n);
                view.setScaleY(1.0f - r2Var.n);
                r2Var.c.setColorFilter(new PorterDuffColorFilter(i0.a.d(r2Var.n, -1, -2960428), PorterDuff.Mode.SRC_IN));
                r2Var.a.invalidate();
                break;
        }
    }
}
