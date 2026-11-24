// default package

import android.view.ViewConfiguration;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class gn7 implements Runnable {
    public byte a;
    public byte b;
    public final /* synthetic */ hn7 c;

    public gn7(hn7 hn7Var) {
        this.c = hn7Var;
    }

    public final void a() {
        this.b = (byte) 0;
        this.a = (byte) 0;
        hn7 hn7Var = this.c;
        hn7Var.removeCallbacks(this);
        if (hn7Var.p0) {
            hn7Var.p0 = false;
            hn7Var.invalidate(0, hn7Var.o0, hn7Var.getRight(), hn7Var.getBottom());
        }
        hn7Var.q0 = false;
    }

    /* JADX WARN: Type inference failed for: r5v10, types: [boolean, byte] */
    /* JADX WARN: Type inference failed for: r5v6, types: [boolean, byte] */
    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.b;
        hn7 hn7Var = this.c;
        if (b == 1) {
            byte b2 = this.a;
            if (b2 == 1) {
                hn7Var.p0 = true;
                hn7Var.invalidate(0, hn7Var.o0, hn7Var.getRight(), hn7Var.getBottom());
                return;
            } else {
                if (b2 != 2) {
                    return;
                }
                hn7Var.q0 = true;
                hn7Var.invalidate(0, 0, hn7Var.getRight(), hn7Var.n0);
                return;
            }
        }
        if (b == 2) {
            byte b3 = this.a;
            if (b3 == 1) {
                if (!hn7Var.p0) {
                    hn7Var.postDelayed(this, ViewConfiguration.getPressedStateDuration());
                }
                hn7Var.p0 = (byte) (!hn7Var.p0 ? 1 : 0);
                hn7Var.invalidate(0, hn7Var.o0, hn7Var.getRight(), hn7Var.getBottom());
                return;
            }
            if (b3 == 2) {
                if (!hn7Var.q0) {
                    hn7Var.postDelayed(this, ViewConfiguration.getPressedStateDuration());
                }
                hn7Var.q0 = (byte) (!hn7Var.q0 ? 1 : 0);
                hn7Var.invalidate(0, 0, hn7Var.getRight(), hn7Var.n0);
            }
        }
    }
}
