package org.telegram.ui.Components;

import android.os.SystemClock;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class w40 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ b50 b;

    public /* synthetic */ w40(b50 b50Var, int i7) {
        this.a = i7;
        this.b = b50Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zi.t0 t0Var;
        int i7 = this.a;
        b50 b50Var = this.b;
        switch (i7) {
            case 0:
                zi.t0 t0Var2 = b50Var.R;
                if (t0Var2 != null && t0Var2.a == 3) {
                    long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                    long j3 = b50Var.H0;
                    if (j3 == 0 || elapsedRealtimeNanos - j3 >= 70000000) {
                        b50Var.F();
                        break;
                    }
                }
                break;
            case 1:
                int i10 = b50.M0;
                b50Var.u();
                break;
            default:
                int i11 = b50.M0;
                zi.u0 u0Var = b50Var.P;
                if (u0Var != null && (t0Var = b50Var.R) != null) {
                    if (t0Var.a != 3) {
                        if (t0Var.e) {
                            u0Var.p();
                            break;
                        }
                    } else {
                        b50Var.y();
                        break;
                    }
                }
                break;
        }
    }
}
