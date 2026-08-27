package nh;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final /* synthetic */ class f2 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ b3 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;

    public /* synthetic */ f2(b3 b3Var, int i10, int i11, int i12) {
        this.a = i12;
        this.b = b3Var;
        this.c = i10;
        this.d = i11;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                b3 b3Var = this.b;
                Paint paint = b3Var.L;
                paint.setColor(i0.b.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.c, this.d));
                b3Var.A();
                b3Var.e.invalidate();
                org.telegram.ui.h3 h3Var = b3Var.Q0;
                if (h3Var != null) {
                    h3Var.b(AndroidUtilities.computePerceivedBrightness(paint.getColor()) <= 0.721f, false);
                    b3Var.Q0.setBackgroundColor(paint.getColor());
                }
                b3Var.F();
                break;
            default:
                b3 b3Var2 = this.b;
                b3Var2.getClass();
                b3Var2.N = i0.b.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.c, this.d);
                b3Var2.h();
                break;
        }
    }
}
