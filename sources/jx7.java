// default package

import android.animation.ValueAnimator;
import android.graphics.RectF;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class jx7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ nx7 b;
    public final /* synthetic */ uca c;

    public /* synthetic */ jx7(nx7 nx7Var, uca ucaVar, byte b) {
        this.a = b;
        this.b = nx7Var;
        this.c = ucaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        uca ucaVar = this.c;
        nx7 nx7Var = this.b;
        switch (b) {
            case 0:
                nx7Var.c = ucaVar;
                RectF rectF = nx7Var.h;
                if (rectF == null) {
                    rectF = new RectF();
                    nx7Var.h = rectF;
                }
                nx7Var.c.a(rectF);
                xh4 xh4Var = nx7Var.a;
                if (xh4Var != null) {
                    xh4Var.v();
                    break;
                }
                break;
            default:
                if (ucaVar != null && nx7Var.q == 0) {
                    nx7Var.q = ymb.b(nx7Var.g);
                }
                byte b2 = 0;
                if (nx7Var.H == (ucaVar != null)) {
                    if (ucaVar != nx7Var.d) {
                        nx7Var.d = ucaVar;
                        xh4 xh4Var2 = nx7Var.a;
                        if (xh4Var2 != null) {
                            xh4Var2.v();
                            break;
                        }
                    }
                } else {
                    nx7Var.H = ucaVar != null;
                    ValueAnimator valueAnimator = nx7Var.K;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        nx7Var.K = null;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(nx7Var.I, nx7Var.H ? 1.0f : 0.0f);
                    nx7Var.K = ofFloat;
                    ofFloat.addUpdateListener(new ix7(nx7Var, b2));
                    nx7Var.K.addListener(new mx7(nx7Var, b2));
                    nx7Var.K.setInterpolator(k43.h);
                    nx7Var.K.start();
                    nx7Var.d = ucaVar;
                    xh4 xh4Var3 = nx7Var.a;
                    if (xh4Var3 != null) {
                        xh4Var3.v();
                    }
                    if (nx7Var.H) {
                        yw0.y.a();
                        break;
                    }
                }
                break;
        }
    }
}
