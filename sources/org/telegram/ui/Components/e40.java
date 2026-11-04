package org.telegram.ui.Components;

import android.os.SystemClock;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e40 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ j40 b;

    public /* synthetic */ e40(j40 j40Var, int i3) {
        this.a = i3;
        this.b = j40Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        wi.s0 s0Var;
        int i3 = this.a;
        j40 j40Var = this.b;
        switch (i3) {
            case 0:
                wi.s0 s0Var2 = j40Var.R;
                if (s0Var2 != null && s0Var2.a == 3) {
                    long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                    long j10 = j40Var.G0;
                    if (j10 == 0 || elapsedRealtimeNanos - j10 >= 70000000) {
                        j40Var.D();
                        break;
                    }
                }
                break;
            case 1:
                int i10 = j40.L0;
                j40Var.t();
                break;
            default:
                int i11 = j40.L0;
                wi.t0 t0Var = j40Var.P;
                if (t0Var != null && (s0Var = j40Var.R) != null) {
                    if (s0Var.a != 3) {
                        if (s0Var.e) {
                            t0Var.p();
                            break;
                        }
                    } else {
                        j40Var.w();
                        break;
                    }
                }
                break;
        }
    }
}
