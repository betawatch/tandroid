package hi;

import android.os.SystemClock;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class k6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ n6 b;

    public /* synthetic */ k6(n6 n6Var, int i7) {
        this.a = i7;
        this.b = n6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                n6 n6Var = this.b;
                n6Var.s0 = false;
                n6Var.A0 = false;
                n6Var.w0 = SystemClock.elapsedRealtime();
                n6Var.v0 = true;
                n6Var.x0 = false;
                n6Var.K.c(false);
                n6Var.L.c(false);
                n6Var.M.c(false);
                ((ka) n6Var.a).e(true);
                break;
            case 1:
                long currentTimeMillis = System.currentTimeMillis();
                n6 n6Var2 = this.b;
                n6Var2.R = currentTimeMillis;
                n6Var2.S = 0L;
                n6Var2.s0 = true;
                ((ka) n6Var2.a).a.K0.a(0L, true);
                break;
            case 2:
                n6 n6Var3 = this.b;
                if (!n6Var3.s0 && !n6Var3.b()) {
                    if (!nb.c(((ka) n6Var3.a).a)) {
                        n6Var3.x0 = false;
                        n6Var3.K.c(false);
                        n6Var3.L.c(false);
                        n6Var3.M.c(false);
                        break;
                    } else {
                        n6Var3.A0 = true;
                        n6Var3.B0 = true;
                        ((ka) n6Var3.a).f(new k6(n6Var3, 4), true);
                        break;
                    }
                }
                break;
            case 3:
                n6 n6Var4 = this.b;
                if (!n6Var4.s0 && !n6Var4.b()) {
                    qa qaVar = ((ka) n6Var4.a).a.C0;
                    if (qaVar != null) {
                        qaVar.toggleDual();
                    }
                    n6Var4.d(360.0f);
                    n6Var4.x0 = false;
                    n6Var4.K.c(false);
                    n6Var4.L.c(false);
                    n6Var4.M.c(false);
                    break;
                }
                break;
            default:
                long currentTimeMillis2 = System.currentTimeMillis();
                n6 n6Var5 = this.b;
                n6Var5.R = currentTimeMillis2;
                n6Var5.s0 = true;
                l6 l6Var = n6Var5.a;
                n6Var5.S = 0L;
                ((ka) l6Var).a.K0.a(0L, true);
                break;
        }
    }
}
