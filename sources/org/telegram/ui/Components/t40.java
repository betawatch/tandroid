package org.telegram.ui.Components;

import android.os.SystemClock;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class t40 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ y40 b;

    public /* synthetic */ t40(y40 y40Var, int i7) {
        this.a = i7;
        this.b = y40Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zi.t0 t0Var;
        int i7 = this.a;
        y40 y40Var = this.b;
        switch (i7) {
            case 0:
                zi.t0 t0Var2 = y40Var.R;
                if (t0Var2 != null && t0Var2.a == 3) {
                    long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                    long j3 = y40Var.H0;
                    if (j3 == 0 || elapsedRealtimeNanos - j3 >= 70000000) {
                        y40Var.F();
                        break;
                    }
                }
                break;
            case 1:
                int i10 = y40.M0;
                y40Var.u();
                break;
            default:
                int i11 = y40.M0;
                zi.u0 u0Var = y40Var.P;
                if (u0Var != null && (t0Var = y40Var.R) != null) {
                    if (t0Var.a != 3) {
                        if (t0Var.e) {
                            u0Var.p();
                            break;
                        }
                    } else {
                        y40Var.y();
                        break;
                    }
                }
                break;
        }
    }
}
