package hi;

import android.os.SystemClock;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class c6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f6 b;

    public /* synthetic */ c6(f6 f6Var, int i7) {
        this.a = i7;
        this.b = f6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                f6 f6Var = this.b;
                f6Var.s0 = false;
                f6Var.A0 = false;
                f6Var.w0 = SystemClock.elapsedRealtime();
                f6Var.v0 = true;
                f6Var.x0 = false;
                f6Var.K.c(false);
                f6Var.L.c(false);
                f6Var.M.c(false);
                ((p9) f6Var.a).e(true);
                break;
            case 1:
                long currentTimeMillis = System.currentTimeMillis();
                f6 f6Var2 = this.b;
                f6Var2.R = currentTimeMillis;
                f6Var2.S = 0L;
                f6Var2.s0 = true;
                ((p9) f6Var2.a).a.K0.a(0L, true);
                break;
            case 2:
                f6 f6Var3 = this.b;
                if (!f6Var3.s0 && !f6Var3.b()) {
                    if (!sa.c(((p9) f6Var3.a).a)) {
                        f6Var3.x0 = false;
                        f6Var3.K.c(false);
                        f6Var3.L.c(false);
                        f6Var3.M.c(false);
                        break;
                    } else {
                        f6Var3.A0 = true;
                        f6Var3.B0 = true;
                        ((p9) f6Var3.a).f(new c6(f6Var3, 4), true);
                        break;
                    }
                }
                break;
            case 3:
                f6 f6Var4 = this.b;
                if (!f6Var4.s0 && !f6Var4.b()) {
                    v9 v9Var = ((p9) f6Var4.a).a.C0;
                    if (v9Var != null) {
                        v9Var.toggleDual();
                    }
                    f6Var4.d(360.0f);
                    f6Var4.x0 = false;
                    f6Var4.K.c(false);
                    f6Var4.L.c(false);
                    f6Var4.M.c(false);
                    break;
                }
                break;
            default:
                long currentTimeMillis2 = System.currentTimeMillis();
                f6 f6Var5 = this.b;
                f6Var5.R = currentTimeMillis2;
                f6Var5.s0 = true;
                d6 d6Var = f6Var5.a;
                f6Var5.S = 0L;
                ((p9) d6Var).a.K0.a(0L, true);
                break;
        }
    }
}
