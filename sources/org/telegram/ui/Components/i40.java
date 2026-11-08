package org.telegram.ui.Components;

import android.os.SystemClock;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i40 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ n40 b;

    public /* synthetic */ i40(n40 n40Var, int i7) {
        this.a = i7;
        this.b = n40Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        wi.s0 s0Var;
        int i7 = this.a;
        n40 n40Var = this.b;
        switch (i7) {
            case 0:
                wi.s0 s0Var2 = n40Var.Q;
                if (s0Var2 != null && s0Var2.a == 3) {
                    long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                    long j3 = n40Var.G0;
                    if (j3 == 0 || elapsedRealtimeNanos - j3 >= 70000000) {
                        n40Var.F();
                        break;
                    }
                }
                break;
            case 1:
                int i10 = n40.L0;
                n40Var.u();
                break;
            default:
                int i11 = n40.L0;
                wi.t0 t0Var = n40Var.O;
                if (t0Var != null && (s0Var = n40Var.Q) != null) {
                    if (s0Var.a != 3) {
                        if (s0Var.e) {
                            t0Var.p();
                            break;
                        }
                    } else {
                        n40Var.y();
                        break;
                    }
                }
                break;
        }
    }
}
