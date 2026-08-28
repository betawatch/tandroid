package mh;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class f2 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ c3 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;

    public /* synthetic */ f2(c3 c3Var, int i9, int i10, int i11) {
        this.a = i11;
        this.b = c3Var;
        this.c = i9;
        this.d = i10;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                c3 c3Var = this.b;
                Paint paint = c3Var.L;
                paint.setColor(i0.a.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.c, this.d));
                c3Var.A();
                c3Var.e.invalidate();
                org.telegram.ui.g3 g3Var = c3Var.Q0;
                if (g3Var != null) {
                    g3Var.b(AndroidUtilities.computePerceivedBrightness(paint.getColor()) <= 0.721f, false);
                    c3Var.Q0.setBackgroundColor(paint.getColor());
                }
                c3Var.F();
                break;
            default:
                c3 c3Var2 = this.b;
                c3Var2.getClass();
                c3Var2.N = i0.a.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.c, this.d);
                c3Var2.h();
                break;
        }
    }
}
