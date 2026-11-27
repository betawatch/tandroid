// default package

import android.view.ViewConfiguration;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class gq7 implements Runnable {
    public byte a;
    public byte b;
    public final /* synthetic */ hq7 c;

    public gq7(hq7 hq7Var) {
        this.c = hq7Var;
    }

    public final void a() {
        this.b = (byte) 0;
        this.a = (byte) 0;
        hq7 hq7Var = this.c;
        hq7Var.removeCallbacks(this);
        if (hq7Var.p0) {
            hq7Var.p0 = false;
            hq7Var.invalidate(0, hq7Var.o0, hq7Var.getRight(), hq7Var.getBottom());
        }
        hq7Var.q0 = false;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.b;
        hq7 hq7Var = this.c;
        if (b == 1) {
            byte b2 = this.a;
            if (b2 == 1) {
                hq7Var.p0 = true;
                hq7Var.invalidate(0, hq7Var.o0, hq7Var.getRight(), hq7Var.getBottom());
                return;
            } else {
                if (b2 != 2) {
                    return;
                }
                hq7Var.q0 = true;
                hq7Var.invalidate(0, 0, hq7Var.getRight(), hq7Var.n0);
                return;
            }
        }
        if (b == 2) {
            byte b3 = this.a;
            if (b3 == 1) {
                if (!hq7Var.p0) {
                    hq7Var.postDelayed(this, ViewConfiguration.getPressedStateDuration());
                }
                hq7Var.p0 = !hq7Var.p0;
                hq7Var.invalidate(0, hq7Var.o0, hq7Var.getRight(), hq7Var.getBottom());
                return;
            }
            if (b3 == 2) {
                if (!hq7Var.q0) {
                    hq7Var.postDelayed(this, ViewConfiguration.getPressedStateDuration());
                }
                hq7Var.q0 = !hq7Var.q0;
                hq7Var.invalidate(0, 0, hq7Var.getRight(), hq7Var.n0);
            }
        }
    }
}
