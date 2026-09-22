package ei;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes4.dex */
public final /* synthetic */ class l2 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ k3 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;

    public /* synthetic */ l2(k3 k3Var, int i10, int i11, int i12) {
        this.a = i12;
        this.b = k3Var;
        this.c = i10;
        this.d = i11;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                k3 k3Var = this.b;
                Paint paint = k3Var.P;
                paint.setColor(i0.a.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.c, this.d));
                k3Var.A();
                k3Var.e.invalidate();
                org.telegram.ui.c3 c3Var = k3Var.U0;
                if (c3Var != null) {
                    c3Var.b(AndroidUtilities.computePerceivedBrightness(paint.getColor()) <= 0.721f, false);
                    k3Var.U0.setBackgroundColor(paint.getColor());
                }
                k3Var.F();
                break;
            default:
                k3 k3Var2 = this.b;
                k3Var2.getClass();
                k3Var2.R = i0.a.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.c, this.d);
                k3Var2.h();
                break;
        }
    }
}
