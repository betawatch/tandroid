package org.telegram.ui.Components;

import android.os.SystemClock;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j60 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ o60 b;

    public /* synthetic */ j60(o60 o60Var, int i10) {
        this.a = i10;
        this.b = o60Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        vi.t0 t0Var;
        int i10 = this.a;
        o60 o60Var = this.b;
        switch (i10) {
            case 0:
                vi.t0 t0Var2 = o60Var.Q;
                if (t0Var2 != null && t0Var2.a == 3) {
                    long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                    long j10 = o60Var.F0;
                    if (j10 == 0 || elapsedRealtimeNanos - j10 >= 70000000) {
                        o60Var.D();
                        break;
                    }
                }
                break;
            case 1:
                int i11 = o60.K0;
                o60Var.t();
                break;
            default:
                int i12 = o60.K0;
                vi.u0 u0Var = o60Var.O;
                if (u0Var != null && (t0Var = o60Var.Q) != null) {
                    if (t0Var.a != 3) {
                        if (t0Var.e) {
                            u0Var.p();
                            break;
                        }
                    } else {
                        o60Var.w();
                        break;
                    }
                }
                break;
        }
    }
}
