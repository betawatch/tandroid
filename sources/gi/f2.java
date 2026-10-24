package gi;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final /* synthetic */ class f2 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ d3 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;

    public /* synthetic */ f2(d3 d3Var, int i10, int i11, int i12) {
        this.a = i12;
        this.b = d3Var;
        this.c = i10;
        this.d = i11;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                d3 d3Var = this.b;
                Paint paint = d3Var.Q;
                paint.setColor(i0.a.f(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.c, this.d));
                d3Var.B();
                d3Var.f.invalidate();
                org.telegram.ui.e3 e3Var = d3Var.Y0;
                if (e3Var != null) {
                    e3Var.b(AndroidUtilities.computePerceivedBrightness(paint.getColor()) <= 0.721f, false);
                    d3Var.Y0.setBackgroundColor(paint.getColor());
                }
                d3Var.G();
                break;
            default:
                d3 d3Var2 = this.b;
                d3Var2.getClass();
                d3Var2.S = i0.a.f(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.c, this.d);
                d3Var2.h();
                break;
        }
    }
}
