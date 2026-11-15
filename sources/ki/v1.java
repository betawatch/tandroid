package ki;

import android.animation.ValueAnimator;
import android.graphics.Paint;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes4.dex */
public final /* synthetic */ class v1 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ x2 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;

    public /* synthetic */ v1(x2 x2Var, int i7, int i10, int i11) {
        this.a = i11;
        this.b = x2Var;
        this.c = i7;
        this.d = i10;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                x2 x2Var = this.b;
                Paint paint = x2Var.R;
                paint.setColor(i0.a.f(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.c, this.d));
                x2Var.F();
                x2Var.f.invalidate();
                org.telegram.ui.b3 b3Var = x2Var.Z0;
                if (b3Var != null) {
                    b3Var.b(org.telegram.messenger.g0.B(paint.getColor()) <= 0.721f, false);
                    x2Var.Z0.setBackgroundColor(paint.getColor());
                }
                x2Var.K();
                break;
            default:
                x2 x2Var2 = this.b;
                x2Var2.getClass();
                x2Var2.T = i0.a.f(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.c, this.d);
                x2Var2.l();
                break;
        }
    }
}
