package hi;

import android.animation.ValueAnimator;
import android.graphics.Paint;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes4.dex */
public final /* synthetic */ class v1 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ a3 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;

    public /* synthetic */ v1(a3 a3Var, int i7, int i10, int i11) {
        this.a = i11;
        this.b = a3Var;
        this.c = i7;
        this.d = i10;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                a3 a3Var = this.b;
                Paint paint = a3Var.Q;
                paint.setColor(i0.a.f(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.c, this.d));
                a3Var.F();
                a3Var.f.invalidate();
                org.telegram.ui.b3 b3Var = a3Var.Y0;
                if (b3Var != null) {
                    b3Var.b(org.telegram.messenger.g0.B(paint.getColor()) <= 0.721f, false);
                    a3Var.Y0.setBackgroundColor(paint.getColor());
                }
                a3Var.K();
                break;
            default:
                a3 a3Var2 = this.b;
                a3Var2.getClass();
                a3Var2.S = i0.a.f(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.c, this.d);
                a3Var2.l();
                break;
        }
    }
}
