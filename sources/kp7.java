// default package

import android.view.ViewConfiguration;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class kp7 implements Runnable {
    public byte a;
    public byte b;
    public final /* synthetic */ lp7 c;

    public kp7(lp7 lp7Var) {
        this.c = lp7Var;
    }

    public final void a() {
        this.b = (byte) 0;
        this.a = (byte) 0;
        lp7 lp7Var = this.c;
        lp7Var.removeCallbacks(this);
        if (lp7Var.p0) {
            lp7Var.p0 = false;
            lp7Var.invalidate(0, lp7Var.o0, lp7Var.getRight(), lp7Var.getBottom());
        }
        lp7Var.q0 = false;
    }

    /* JADX WARN: Type inference failed for: r5v10, types: [boolean, byte] */
    /* JADX WARN: Type inference failed for: r5v6, types: [boolean, byte] */
    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.b;
        lp7 lp7Var = this.c;
        if (b == 1) {
            byte b2 = this.a;
            if (b2 == 1) {
                lp7Var.p0 = true;
                lp7Var.invalidate(0, lp7Var.o0, lp7Var.getRight(), lp7Var.getBottom());
                return;
            } else {
                if (b2 != 2) {
                    return;
                }
                lp7Var.q0 = true;
                lp7Var.invalidate(0, 0, lp7Var.getRight(), lp7Var.n0);
                return;
            }
        }
        if (b == 2) {
            byte b3 = this.a;
            if (b3 == 1) {
                if (!lp7Var.p0) {
                    lp7Var.postDelayed(this, ViewConfiguration.getPressedStateDuration());
                }
                lp7Var.p0 = (byte) (!lp7Var.p0 ? 1 : 0);
                lp7Var.invalidate(0, lp7Var.o0, lp7Var.getRight(), lp7Var.getBottom());
                return;
            }
            if (b3 == 2) {
                if (!lp7Var.q0) {
                    lp7Var.postDelayed(this, ViewConfiguration.getPressedStateDuration());
                }
                lp7Var.q0 = (byte) (!lp7Var.q0 ? 1 : 0);
                lp7Var.invalidate(0, 0, lp7Var.getRight(), lp7Var.n0);
            }
        }
    }
}
