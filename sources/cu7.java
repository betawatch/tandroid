// default package

import android.animation.ValueAnimator;
import android.graphics.RectF;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class cu7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ gu7 b;
    public final /* synthetic */ d9a c;

    public /* synthetic */ cu7(gu7 gu7Var, d9a d9aVar, byte b) {
        this.a = b;
        this.b = gu7Var;
        this.c = d9aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        d9a d9aVar = this.c;
        gu7 gu7Var = this.b;
        switch (b) {
            case 0:
                gu7Var.c = d9aVar;
                RectF rectF = gu7Var.h;
                if (rectF == null) {
                    rectF = new RectF();
                    gu7Var.h = rectF;
                }
                gu7Var.c.a(rectF);
                u39 u39Var = gu7Var.a;
                if (u39Var != null) {
                    u39Var.i0();
                    break;
                }
                break;
            default:
                if (d9aVar != null && gu7Var.q == 0) {
                    gu7Var.q = cjb.b(gu7Var.g);
                }
                byte b2 = 0;
                if (gu7Var.H == (d9aVar != null)) {
                    if (d9aVar != gu7Var.d) {
                        gu7Var.d = d9aVar;
                        u39 u39Var2 = gu7Var.a;
                        if (u39Var2 != null) {
                            u39Var2.i0();
                            break;
                        }
                    }
                } else {
                    gu7Var.H = d9aVar != null;
                    ValueAnimator valueAnimator = gu7Var.K;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        gu7Var.K = null;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(gu7Var.I, gu7Var.H ? 1.0f : 0.0f);
                    gu7Var.K = ofFloat;
                    ofFloat.addUpdateListener(new bu7(gu7Var, b2));
                    gu7Var.K.addListener(new fu7(gu7Var, b2));
                    gu7Var.K.setInterpolator(s33.h);
                    gu7Var.K.start();
                    gu7Var.d = d9aVar;
                    u39 u39Var3 = gu7Var.a;
                    if (u39Var3 != null) {
                        u39Var3.i0();
                    }
                    if (gu7Var.H) {
                        pw0.y.a();
                        break;
                    }
                }
                break;
        }
    }
}
