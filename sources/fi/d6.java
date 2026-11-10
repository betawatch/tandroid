package fi;

import android.os.SystemClock;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ g6 b;

    public /* synthetic */ d6(g6 g6Var, int i7) {
        this.a = i7;
        this.b = g6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                g6 g6Var = this.b;
                g6Var.r0 = false;
                g6Var.z0 = false;
                g6Var.v0 = SystemClock.elapsedRealtime();
                g6Var.u0 = true;
                g6Var.w0 = false;
                g6Var.J.c(false);
                g6Var.K.c(false);
                g6Var.L.c(false);
                ((r9) g6Var.a).e(true);
                break;
            case 1:
                long currentTimeMillis = System.currentTimeMillis();
                g6 g6Var2 = this.b;
                g6Var2.Q = currentTimeMillis;
                g6Var2.R = 0L;
                g6Var2.r0 = true;
                ((r9) g6Var2.a).a.J0.a(0L, true);
                break;
            case 2:
                g6 g6Var3 = this.b;
                if (!g6Var3.r0 && !g6Var3.b()) {
                    if (!va.c(((r9) g6Var3.a).a)) {
                        g6Var3.w0 = false;
                        g6Var3.J.c(false);
                        g6Var3.K.c(false);
                        g6Var3.L.c(false);
                        break;
                    } else {
                        g6Var3.z0 = true;
                        g6Var3.A0 = true;
                        ((r9) g6Var3.a).f(new d6(g6Var3, 4), true);
                        break;
                    }
                }
                break;
            case 3:
                g6 g6Var4 = this.b;
                if (!g6Var4.r0 && !g6Var4.b()) {
                    y9 y9Var = ((r9) g6Var4.a).a.B0;
                    if (y9Var != null) {
                        y9Var.toggleDual();
                    }
                    g6Var4.d(360.0f);
                    g6Var4.w0 = false;
                    g6Var4.J.c(false);
                    g6Var4.K.c(false);
                    g6Var4.L.c(false);
                    break;
                }
                break;
            default:
                long currentTimeMillis2 = System.currentTimeMillis();
                g6 g6Var5 = this.b;
                g6Var5.Q = currentTimeMillis2;
                g6Var5.r0 = true;
                e6 e6Var = g6Var5.a;
                g6Var5.R = 0L;
                ((r9) e6Var).a.J0.a(0L, true);
                break;
        }
    }
}
