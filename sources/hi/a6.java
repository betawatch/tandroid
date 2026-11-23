package hi;

import android.os.SystemClock;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final /* synthetic */ class a6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ d6 b;

    public /* synthetic */ a6(d6 d6Var, int i7) {
        this.a = i7;
        this.b = d6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                d6 d6Var = this.b;
                d6Var.s0 = false;
                d6Var.A0 = false;
                d6Var.w0 = SystemClock.elapsedRealtime();
                d6Var.v0 = true;
                d6Var.x0 = false;
                d6Var.K.c(false);
                d6Var.L.c(false);
                d6Var.M.c(false);
                ((p9) d6Var.a).e(true);
                break;
            case 1:
                long currentTimeMillis = System.currentTimeMillis();
                d6 d6Var2 = this.b;
                d6Var2.R = currentTimeMillis;
                d6Var2.S = 0L;
                d6Var2.s0 = true;
                ((p9) d6Var2.a).a.K0.a(0L, true);
                break;
            case 2:
                d6 d6Var3 = this.b;
                if (!d6Var3.s0 && !d6Var3.b()) {
                    if (!sa.c(((p9) d6Var3.a).a)) {
                        d6Var3.x0 = false;
                        d6Var3.K.c(false);
                        d6Var3.L.c(false);
                        d6Var3.M.c(false);
                        break;
                    } else {
                        d6Var3.A0 = true;
                        d6Var3.B0 = true;
                        ((p9) d6Var3.a).f(new a6(d6Var3, 4), true);
                        break;
                    }
                }
                break;
            case 3:
                d6 d6Var4 = this.b;
                if (!d6Var4.s0 && !d6Var4.b()) {
                    v9 v9Var = ((p9) d6Var4.a).a.C0;
                    if (v9Var != null) {
                        v9Var.toggleDual();
                    }
                    d6Var4.d(360.0f);
                    d6Var4.x0 = false;
                    d6Var4.K.c(false);
                    d6Var4.L.c(false);
                    d6Var4.M.c(false);
                    break;
                }
                break;
            default:
                long currentTimeMillis2 = System.currentTimeMillis();
                d6 d6Var5 = this.b;
                d6Var5.R = currentTimeMillis2;
                d6Var5.s0 = true;
                b6 b6Var = d6Var5.a;
                d6Var5.S = 0L;
                ((p9) b6Var).a.K0.a(0L, true);
                break;
        }
    }
}
