package di;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class o2 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ n3 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;

    public /* synthetic */ o2(n3 n3Var, int i10, int i11, int i12) {
        this.a = i12;
        this.b = n3Var;
        this.c = i10;
        this.d = i11;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                n3 n3Var = this.b;
                Paint paint = n3Var.P;
                paint.setColor(i0.a.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.c, this.d));
                n3Var.A();
                n3Var.e.invalidate();
                org.telegram.ui.e3 e3Var = n3Var.U0;
                if (e3Var != null) {
                    e3Var.b(AndroidUtilities.computePerceivedBrightness(paint.getColor()) <= 0.721f, false);
                    n3Var.U0.setBackgroundColor(paint.getColor());
                }
                n3Var.F();
                break;
            default:
                n3 n3Var2 = this.b;
                n3Var2.getClass();
                n3Var2.R = i0.a.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.c, this.d);
                n3Var2.h();
                break;
        }
    }
}
