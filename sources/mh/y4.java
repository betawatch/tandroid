package mh;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final /* synthetic */ class y4 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ c5 b;

    public /* synthetic */ y4(c5 c5Var, int i10) {
        this.a = i10;
        this.b = c5Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                c5 c5Var = this.b;
                c5Var.getClass();
                c5Var.p0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c5Var.d(c5Var.R);
                break;
            case 1:
                c5 c5Var2 = this.b;
                c5Var2.getClass();
                float u10 = e2.c.u((float) Math.pow((r6 * 2.0f) - 2.0f, 2.0d), 0.075f, ((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
                c5Var2.q0 = u10;
                FrameLayout frameLayout = c5Var2.b;
                frameLayout.setScaleX(u10);
                frameLayout.setScaleY(c5Var2.q0);
                c5Var2.invalidate();
                break;
            default:
                c5 c5Var3 = this.b;
                c5Var3.getClass();
                c5Var3.p0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c5Var3.d(c5Var3.R);
                break;
        }
    }
}
