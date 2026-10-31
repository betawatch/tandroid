package org.telegram.ui.Components;

import android.os.SystemClock;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class z40 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ d50 b;

    public /* synthetic */ z40(d50 d50Var, int i10) {
        this.a = i10;
        this.b = d50Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        li.w0 w0Var;
        int i10 = this.a;
        d50 d50Var = this.b;
        switch (i10) {
            case 0:
                li.w0 w0Var2 = d50Var.Q;
                if (w0Var2 != null && w0Var2.a == 3) {
                    long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                    long j10 = d50Var.F0;
                    if (j10 == 0 || elapsedRealtimeNanos - j10 >= 70000000) {
                        d50Var.D();
                        break;
                    }
                }
                break;
            case 1:
                int i11 = d50.K0;
                d50Var.t();
                break;
            default:
                int i12 = d50.K0;
                li.x0 x0Var = d50Var.O;
                if (x0Var != null && (w0Var = d50Var.Q) != null) {
                    if (w0Var.a != 3) {
                        if (w0Var.e) {
                            x0Var.p();
                            break;
                        }
                    } else {
                        d50Var.w();
                        break;
                    }
                }
                break;
        }
    }
}
