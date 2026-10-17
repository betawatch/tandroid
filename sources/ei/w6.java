package ei;

import android.os.SystemClock;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final /* synthetic */ class w6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ z6 b;

    public /* synthetic */ w6(z6 z6Var, int i10) {
        this.a = i10;
        this.b = z6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                z6 z6Var = this.b;
                z6Var.r0 = false;
                z6Var.z0 = false;
                z6Var.v0 = SystemClock.elapsedRealtime();
                z6Var.u0 = true;
                z6Var.w0 = false;
                z6Var.J.c(false);
                z6Var.K.c(false);
                z6Var.L.c(false);
                ((qa) z6Var.a).e(true);
                break;
            case 1:
                long currentTimeMillis = System.currentTimeMillis();
                z6 z6Var2 = this.b;
                z6Var2.Q = currentTimeMillis;
                z6Var2.R = 0L;
                z6Var2.r0 = true;
                ((qa) z6Var2.a).a.J0.a(0L, true);
                break;
            case 2:
                z6 z6Var3 = this.b;
                if (!z6Var3.r0 && !z6Var3.b()) {
                    if (!vb.c(((qa) z6Var3.a).a)) {
                        z6Var3.w0 = false;
                        z6Var3.J.c(false);
                        z6Var3.K.c(false);
                        z6Var3.L.c(false);
                        break;
                    } else {
                        z6Var3.z0 = true;
                        z6Var3.A0 = true;
                        ((qa) z6Var3.a).f(new w6(z6Var3, 4), true);
                        break;
                    }
                }
                break;
            case 3:
                z6 z6Var4 = this.b;
                if (!z6Var4.r0 && !z6Var4.b()) {
                    ya yaVar = ((qa) z6Var4.a).a.B0;
                    if (yaVar != null) {
                        yaVar.toggleDual();
                    }
                    z6Var4.d(360.0f);
                    z6Var4.w0 = false;
                    z6Var4.J.c(false);
                    z6Var4.K.c(false);
                    z6Var4.L.c(false);
                    break;
                }
                break;
            default:
                long currentTimeMillis2 = System.currentTimeMillis();
                z6 z6Var5 = this.b;
                z6Var5.Q = currentTimeMillis2;
                z6Var5.r0 = true;
                x6 x6Var = z6Var5.a;
                z6Var5.R = 0L;
                ((qa) x6Var).a.J0.a(0L, true);
                break;
        }
    }
}
