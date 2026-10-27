package fi;

import android.os.SystemClock;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class t6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ w6 b;

    public /* synthetic */ t6(w6 w6Var, int i10) {
        this.a = i10;
        this.b = w6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                w6 w6Var = this.b;
                w6Var.r0 = false;
                w6Var.z0 = false;
                w6Var.v0 = SystemClock.elapsedRealtime();
                w6Var.u0 = true;
                w6Var.w0 = false;
                w6Var.J.c(false);
                w6Var.K.c(false);
                w6Var.L.c(false);
                ((ma) w6Var.a).e(true);
                break;
            case 1:
                long currentTimeMillis = System.currentTimeMillis();
                w6 w6Var2 = this.b;
                w6Var2.Q = currentTimeMillis;
                w6Var2.R = 0L;
                w6Var2.r0 = true;
                ((ma) w6Var2.a).a.J0.a(0L, true);
                break;
            case 2:
                w6 w6Var3 = this.b;
                if (!w6Var3.r0 && !w6Var3.b()) {
                    if (!sb.c(((ma) w6Var3.a).a)) {
                        w6Var3.w0 = false;
                        w6Var3.J.c(false);
                        w6Var3.K.c(false);
                        w6Var3.L.c(false);
                        break;
                    } else {
                        w6Var3.z0 = true;
                        w6Var3.A0 = true;
                        ((ma) w6Var3.a).f(new t6(w6Var3, 4), true);
                        break;
                    }
                }
                break;
            case 3:
                w6 w6Var4 = this.b;
                if (!w6Var4.r0 && !w6Var4.b()) {
                    va vaVar = ((ma) w6Var4.a).a.B0;
                    if (vaVar != null) {
                        vaVar.toggleDual();
                    }
                    w6Var4.d(360.0f);
                    w6Var4.w0 = false;
                    w6Var4.J.c(false);
                    w6Var4.K.c(false);
                    w6Var4.L.c(false);
                    break;
                }
                break;
            default:
                long currentTimeMillis2 = System.currentTimeMillis();
                w6 w6Var5 = this.b;
                w6Var5.Q = currentTimeMillis2;
                w6Var5.r0 = true;
                u6 u6Var = w6Var5.a;
                w6Var5.R = 0L;
                ((ma) u6Var).a.J0.a(0L, true);
                break;
        }
    }
}
