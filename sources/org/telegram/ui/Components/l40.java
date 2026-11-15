package org.telegram.ui.Components;

import android.os.SystemClock;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class l40 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ q40 b;

    public /* synthetic */ l40(q40 q40Var, int i7) {
        this.a = i7;
        this.b = q40Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zi.u0 u0Var;
        int i7 = this.a;
        q40 q40Var = this.b;
        switch (i7) {
            case 0:
                zi.u0 u0Var2 = q40Var.R;
                if (u0Var2 != null && u0Var2.a == 3) {
                    long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                    long j3 = q40Var.H0;
                    if (j3 == 0 || elapsedRealtimeNanos - j3 >= 70000000) {
                        q40Var.F();
                        break;
                    }
                }
                break;
            case 1:
                int i10 = q40.M0;
                q40Var.u();
                break;
            default:
                int i11 = q40.M0;
                zi.v0 v0Var = q40Var.P;
                if (v0Var != null && (u0Var = q40Var.R) != null) {
                    if (u0Var.a != 3) {
                        if (u0Var.e) {
                            v0Var.p();
                            break;
                        }
                    } else {
                        q40Var.y();
                        break;
                    }
                }
                break;
        }
    }
}
