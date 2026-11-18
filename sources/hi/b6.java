package hi;

import android.os.SystemClock;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final /* synthetic */ class b6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e6 b;

    public /* synthetic */ b6(e6 e6Var, int i7) {
        this.a = i7;
        this.b = e6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                e6 e6Var = this.b;
                e6Var.s0 = false;
                e6Var.A0 = false;
                e6Var.w0 = SystemClock.elapsedRealtime();
                e6Var.v0 = true;
                e6Var.x0 = false;
                e6Var.K.c(false);
                e6Var.L.c(false);
                e6Var.M.c(false);
                ((q9) e6Var.a).e(true);
                break;
            case 1:
                long currentTimeMillis = System.currentTimeMillis();
                e6 e6Var2 = this.b;
                e6Var2.R = currentTimeMillis;
                e6Var2.S = 0L;
                e6Var2.s0 = true;
                ((q9) e6Var2.a).a.K0.a(0L, true);
                break;
            case 2:
                e6 e6Var3 = this.b;
                if (!e6Var3.s0 && !e6Var3.b()) {
                    if (!ta.c(((q9) e6Var3.a).a)) {
                        e6Var3.x0 = false;
                        e6Var3.K.c(false);
                        e6Var3.L.c(false);
                        e6Var3.M.c(false);
                        break;
                    } else {
                        e6Var3.A0 = true;
                        e6Var3.B0 = true;
                        ((q9) e6Var3.a).f(new b6(e6Var3, 4), true);
                        break;
                    }
                }
                break;
            case 3:
                e6 e6Var4 = this.b;
                if (!e6Var4.s0 && !e6Var4.b()) {
                    w9 w9Var = ((q9) e6Var4.a).a.C0;
                    if (w9Var != null) {
                        w9Var.toggleDual();
                    }
                    e6Var4.d(360.0f);
                    e6Var4.x0 = false;
                    e6Var4.K.c(false);
                    e6Var4.L.c(false);
                    e6Var4.M.c(false);
                    break;
                }
                break;
            default:
                long currentTimeMillis2 = System.currentTimeMillis();
                e6 e6Var5 = this.b;
                e6Var5.R = currentTimeMillis2;
                e6Var5.s0 = true;
                c6 c6Var = e6Var5.a;
                e6Var5.S = 0L;
                ((q9) c6Var).a.K0.a(0L, true);
                break;
        }
    }
}
