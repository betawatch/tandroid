// default package

import android.animation.ValueAnimator;
import android.graphics.RectF;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class jx7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ nx7 b;
    public final /* synthetic */ tca c;

    public /* synthetic */ jx7(nx7 nx7Var, tca tcaVar, byte b) {
        this.a = b;
        this.b = nx7Var;
        this.c = tcaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        tca tcaVar = this.c;
        nx7 nx7Var = this.b;
        switch (b) {
            case 0:
                nx7Var.c = tcaVar;
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
                if (tcaVar != null && nx7Var.q == 0) {
                    nx7Var.q = ymb.b(nx7Var.g);
                }
                byte b2 = 0;
                if (nx7Var.H == (tcaVar != null)) {
                    if (tcaVar != nx7Var.d) {
                        nx7Var.d = tcaVar;
                        xh4 xh4Var2 = nx7Var.a;
                        if (xh4Var2 != null) {
                            xh4Var2.v();
                            break;
                        }
                    }
                } else {
                    nx7Var.H = tcaVar != null;
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
                    nx7Var.d = tcaVar;
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
