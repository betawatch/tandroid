package hi;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class n2 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ m3 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;

    public /* synthetic */ n2(m3 m3Var, int i10, int i11, int i12) {
        this.a = i12;
        this.b = m3Var;
        this.c = i10;
        this.d = i11;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                m3 m3Var = this.b;
                Paint paint = m3Var.Q;
                paint.setColor(i0.a.f(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.c, this.d));
                m3Var.B();
                m3Var.f.invalidate();
                org.telegram.ui.c3 c3Var = m3Var.Y0;
                if (c3Var != null) {
                    c3Var.b(AndroidUtilities.computePerceivedBrightness(paint.getColor()) <= 0.721f, false);
                    m3Var.Y0.setBackgroundColor(paint.getColor());
                }
                m3Var.G();
                break;
            default:
                m3 m3Var2 = this.b;
                m3Var2.getClass();
                m3Var2.S = i0.a.f(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.c, this.d);
                m3Var2.h();
                break;
        }
    }
}
