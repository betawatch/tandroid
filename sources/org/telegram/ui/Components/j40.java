package org.telegram.ui.Components;

import android.os.SystemClock;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class j40 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ o40 b;

    public /* synthetic */ j40(o40 o40Var, int i7) {
        this.a = i7;
        this.b = o40Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        wi.s0 s0Var;
        int i7 = this.a;
        o40 o40Var = this.b;
        switch (i7) {
            case 0:
                wi.s0 s0Var2 = o40Var.Q;
                if (s0Var2 != null && s0Var2.a == 3) {
                    long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                    long j3 = o40Var.G0;
                    if (j3 == 0 || elapsedRealtimeNanos - j3 >= 70000000) {
                        o40Var.F();
                        break;
                    }
                }
                break;
            case 1:
                int i10 = o40.L0;
                o40Var.u();
                break;
            default:
                int i11 = o40.L0;
                wi.t0 t0Var = o40Var.O;
                if (t0Var != null && (s0Var = o40Var.Q) != null) {
                    if (s0Var.a != 3) {
                        if (s0Var.e) {
                            t0Var.p();
                            break;
                        }
                    } else {
                        o40Var.y();
                        break;
                    }
                }
                break;
        }
    }
}
