package kh;

import android.os.SystemClock;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class w6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ z6 b;

    public /* synthetic */ w6(z6 z6Var, int i9) {
        this.a = i9;
        this.b = z6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                z6 z6Var = this.b;
                z6Var.n0 = false;
                z6Var.v0 = false;
                z6Var.r0 = SystemClock.elapsedRealtime();
                z6Var.q0 = true;
                z6Var.s0 = false;
                z6Var.F.c(false);
                z6Var.G.c(false);
                z6Var.H.c(false);
                ((ra) z6Var.a).d(true);
                break;
            case 1:
                long currentTimeMillis = System.currentTimeMillis();
                z6 z6Var2 = this.b;
                z6Var2.M = currentTimeMillis;
                z6Var2.N = 0L;
                z6Var2.n0 = true;
                ((ra) z6Var2.a).a.F0.a(0L, true);
                break;
            case 2:
                z6 z6Var3 = this.b;
                if (!z6Var3.n0 && !z6Var3.b()) {
                    if (!wb.d(((ra) z6Var3.a).a)) {
                        z6Var3.s0 = false;
                        z6Var3.F.c(false);
                        z6Var3.G.c(false);
                        z6Var3.H.c(false);
                        break;
                    } else {
                        z6Var3.v0 = true;
                        z6Var3.w0 = true;
                        ((ra) z6Var3.a).e(new w6(z6Var3, 4), true);
                        break;
                    }
                }
                break;
            case 3:
                z6 z6Var4 = this.b;
                if (!z6Var4.n0 && !z6Var4.b()) {
                    za zaVar = ((ra) z6Var4.a).a.x0;
                    if (zaVar != null) {
                        zaVar.toggleDual();
                    }
                    z6Var4.d(360.0f);
                    z6Var4.s0 = false;
                    z6Var4.F.c(false);
                    z6Var4.G.c(false);
                    z6Var4.H.c(false);
                    break;
                }
                break;
            default:
                long currentTimeMillis2 = System.currentTimeMillis();
                z6 z6Var5 = this.b;
                z6Var5.M = currentTimeMillis2;
                z6Var5.n0 = true;
                x6 x6Var = z6Var5.a;
                z6Var5.N = 0L;
                ((ra) x6Var).a.F0.a(0L, true);
                break;
        }
    }
}
