package gi;

import android.os.SystemClock;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h6 b;

    public /* synthetic */ d6(h6 h6Var, int i3) {
        this.a = i3;
        this.b = h6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                h6 h6Var = this.b;
                h6Var.s0 = false;
                h6Var.A0 = false;
                h6Var.w0 = SystemClock.elapsedRealtime();
                h6Var.v0 = true;
                h6Var.x0 = false;
                h6Var.K.c(false);
                h6Var.L.c(false);
                h6Var.M.c(false);
                ((s9) h6Var.a).e(true);
                break;
            case 1:
                long currentTimeMillis = System.currentTimeMillis();
                h6 h6Var2 = this.b;
                h6Var2.R = currentTimeMillis;
                h6Var2.S = 0L;
                h6Var2.s0 = true;
                ((s9) h6Var2.a).a.K0.a(0L, true);
                break;
            case 2:
                h6 h6Var3 = this.b;
                if (!h6Var3.s0 && !h6Var3.b()) {
                    if (!va.c(((s9) h6Var3.a).a)) {
                        h6Var3.x0 = false;
                        h6Var3.K.c(false);
                        h6Var3.L.c(false);
                        h6Var3.M.c(false);
                        break;
                    } else {
                        h6Var3.A0 = true;
                        h6Var3.B0 = true;
                        ((s9) h6Var3.a).f(new d6(h6Var3, 4), true);
                        break;
                    }
                }
                break;
            case 3:
                h6 h6Var4 = this.b;
                if (!h6Var4.s0 && !h6Var4.b()) {
                    y9 y9Var = ((s9) h6Var4.a).a.C0;
                    if (y9Var != null) {
                        y9Var.toggleDual();
                    }
                    h6Var4.d(360.0f);
                    h6Var4.x0 = false;
                    h6Var4.K.c(false);
                    h6Var4.L.c(false);
                    h6Var4.M.c(false);
                    break;
                }
                break;
            default:
                long currentTimeMillis2 = System.currentTimeMillis();
                h6 h6Var5 = this.b;
                h6Var5.R = currentTimeMillis2;
                h6Var5.s0 = true;
                e6 e6Var = h6Var5.a;
                h6Var5.S = 0L;
                ((s9) e6Var).a.K0.a(0L, true);
                break;
        }
    }
}
