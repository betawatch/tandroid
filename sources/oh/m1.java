package oh;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final /* synthetic */ class m1 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ o1 b;

    public /* synthetic */ m1(o1 o1Var, int i10) {
        this.a = i10;
        this.b = o1Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                this.b.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                o1 o1Var = this.b;
                o1Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o1Var.n = floatValue;
                View view = o1Var.b;
                view.setAlpha(1.0f - floatValue);
                view.setScaleX(1.0f - o1Var.n);
                view.setScaleY(1.0f - o1Var.n);
                o1Var.c.setColorFilter(new PorterDuffColorFilter(i0.a.d(o1Var.n, -1, -2960428), PorterDuff.Mode.SRC_IN));
                o1Var.a.invalidate();
                break;
        }
    }
}
