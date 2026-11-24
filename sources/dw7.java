// default package

import android.animation.ValueAnimator;
import android.graphics.RectF;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class dw7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hw7 b;
    public final /* synthetic */ dba c;

    public /* synthetic */ dw7(hw7 hw7Var, dba dbaVar, byte b) {
        this.a = b;
        this.b = hw7Var;
        this.c = dbaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        dba dbaVar = this.c;
        hw7 hw7Var = this.b;
        switch (b) {
            case 0:
                hw7Var.c = dbaVar;
                RectF rectF = hw7Var.h;
                if (rectF == null) {
                    rectF = new RectF();
                    hw7Var.h = rectF;
                }
                hw7Var.c.a(rectF);
                x59 x59Var = hw7Var.a;
                if (x59Var != null) {
                    x59Var.f0();
                    break;
                }
                break;
            default:
                if (dbaVar != null && hw7Var.q == 0) {
                    hw7Var.q = dlb.b(hw7Var.g);
                }
                byte b2 = 0;
                if (hw7Var.H == (dbaVar != null)) {
                    if (dbaVar != hw7Var.d) {
                        hw7Var.d = dbaVar;
                        x59 x59Var2 = hw7Var.a;
                        if (x59Var2 != null) {
                            x59Var2.f0();
                            break;
                        }
                    }
                } else {
                    hw7Var.H = dbaVar != null;
                    ValueAnimator valueAnimator = hw7Var.K;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        hw7Var.K = null;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(hw7Var.I, hw7Var.H ? 1.0f : 0.0f);
                    hw7Var.K = ofFloat;
                    ofFloat.addUpdateListener(new cw7(hw7Var, b2));
                    hw7Var.K.addListener(new gw7(hw7Var, b2));
                    hw7Var.K.setInterpolator(d53.h);
                    hw7Var.K.start();
                    hw7Var.d = dbaVar;
                    x59 x59Var3 = hw7Var.a;
                    if (x59Var3 != null) {
                        x59Var3.f0();
                    }
                    if (hw7Var.H) {
                        xx0.y.a();
                        break;
                    }
                }
                break;
        }
    }
}
