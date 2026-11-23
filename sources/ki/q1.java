package ki;

import android.animation.ValueAnimator;
import android.graphics.Paint;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final /* synthetic */ class q1 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ s2 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;

    public /* synthetic */ q1(s2 s2Var, int i7, int i10, int i11) {
        this.a = i11;
        this.b = s2Var;
        this.c = i7;
        this.d = i10;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                s2 s2Var = this.b;
                Paint paint = s2Var.R;
                paint.setColor(i0.a.f(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.c, this.d));
                s2Var.F();
                s2Var.f.invalidate();
                org.telegram.ui.b3 b3Var = s2Var.Z0;
                if (b3Var != null) {
                    b3Var.b(org.telegram.messenger.g0.B(paint.getColor()) <= 0.721f, false);
                    s2Var.Z0.setBackgroundColor(paint.getColor());
                }
                s2Var.K();
                break;
            default:
                s2 s2Var2 = this.b;
                s2Var2.getClass();
                s2Var2.T = i0.a.f(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.c, this.d);
                s2Var2.l();
                break;
        }
    }
}
