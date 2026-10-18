package ai;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
public final /* synthetic */ class a7 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ e7 b;

    public /* synthetic */ a7(e7 e7Var, int i10) {
        this.a = i10;
        this.b = e7Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                e7 e7Var = this.b;
                e7Var.getClass();
                e7Var.t0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e7Var.d(e7Var.V);
                break;
            case 1:
                e7 e7Var2 = this.b;
                e7Var2.getClass();
                float t10 = com.google.android.gms.internal.play_billing.k3.t((float) Math.pow((r6 * 2.0f) - 2.0f, 2.0d), 0.075f, ((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
                e7Var2.u0 = t10;
                FrameLayout frameLayout = e7Var2.b;
                frameLayout.setScaleX(t10);
                frameLayout.setScaleY(e7Var2.u0);
                e7Var2.invalidate();
                break;
            default:
                e7 e7Var3 = this.b;
                e7Var3.getClass();
                e7Var3.t0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e7Var3.d(e7Var3.V);
                break;
        }
    }
}
