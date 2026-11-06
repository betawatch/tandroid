package org.telegram.ui.Components;

import android.os.SystemClock;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
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
                    long j3 = n40Var.F0;
                    if (j3 == 0 || elapsedRealtimeNanos - j3 >= 70000000) {
                        n40Var.D();
                        break;
                    }
                }
                break;
            case 1:
                int i10 = n40.K0;
                n40Var.t();
                break;
            default:
                int i11 = n40.K0;
                wi.t0 t0Var = n40Var.O;
                if (t0Var != null && (s0Var = n40Var.Q) != null) {
                    if (s0Var.a != 3) {
                        if (s0Var.e) {
                            t0Var.p();
                            break;
                        }
                    } else {
                        n40Var.w();
                        break;
                    }
                }
                break;
        }
    }
}
