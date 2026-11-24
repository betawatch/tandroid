// default package

import android.animation.ValueAnimator;
import android.graphics.Paint;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final /* synthetic */ class jv0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ow0 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;

    public /* synthetic */ jv0(ow0 ow0Var, int i, int i2, byte b) {
        this.a = b;
        this.b = ow0Var;
        this.c = i;
        this.d = i2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        int i = this.d;
        int i2 = this.c;
        ow0 ow0Var = this.b;
        switch (b) {
            case 0:
                Paint paint = ow0Var.R;
                paint.setColor(bm2.f(((Float) valueAnimator.getAnimatedValue()).floatValue(), i2, i));
                ow0Var.F();
                ow0Var.f.invalidate();
                cw cwVar = ow0Var.Z0;
                if (cwVar != null) {
                    cwVar.b(gl.B(paint.getColor()) <= 0.721f, false);
                    ow0Var.Z0.setBackgroundColor(paint.getColor());
                }
                ow0Var.K();
                break;
            default:
                ow0Var.T = bm2.f(((Float) valueAnimator.getAnimatedValue()).floatValue(), i2, i);
                ow0Var.h();
                break;
        }
    }
}
