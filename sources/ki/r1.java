package ki;

import android.animation.ValueAnimator;
import android.graphics.Paint;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final /* synthetic */ class r1 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ t2 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;

    public /* synthetic */ r1(t2 t2Var, int i7, int i10, int i11) {
        this.a = i11;
        this.b = t2Var;
        this.c = i7;
        this.d = i10;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                t2 t2Var = this.b;
                Paint paint = t2Var.R;
                paint.setColor(i0.a.f(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.c, this.d));
                t2Var.F();
                t2Var.f.invalidate();
                org.telegram.ui.b3 b3Var = t2Var.Z0;
                if (b3Var != null) {
                    b3Var.b(org.telegram.messenger.g0.B(paint.getColor()) <= 0.721f, false);
                    t2Var.Z0.setBackgroundColor(paint.getColor());
                }
                t2Var.K();
                break;
            default:
                t2 t2Var2 = this.b;
                t2Var2.getClass();
                t2Var2.T = i0.a.f(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.c, this.d);
                t2Var2.l();
                break;
        }
    }
}
