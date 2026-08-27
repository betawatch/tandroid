package lh;

import android.os.SystemClock;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final /* synthetic */ class v6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ y6 b;

    public /* synthetic */ v6(y6 y6Var, int i10) {
        this.a = i10;
        this.b = y6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                y6 y6Var = this.b;
                y6Var.n0 = false;
                y6Var.v0 = false;
                y6Var.r0 = SystemClock.elapsedRealtime();
                y6Var.q0 = true;
                y6Var.s0 = false;
                y6Var.F.c(false);
                y6Var.G.c(false);
                y6Var.H.c(false);
                ((oa) y6Var.a).d(true);
                break;
            case 1:
                long currentTimeMillis = System.currentTimeMillis();
                y6 y6Var2 = this.b;
                y6Var2.M = currentTimeMillis;
                y6Var2.N = 0L;
                y6Var2.n0 = true;
                ((oa) y6Var2.a).a.F0.a(0L, true);
                break;
            case 2:
                y6 y6Var3 = this.b;
                if (!y6Var3.n0 && !y6Var3.b()) {
                    if (!sb.d(((oa) y6Var3.a).a)) {
                        y6Var3.s0 = false;
                        y6Var3.F.c(false);
                        y6Var3.G.c(false);
                        y6Var3.H.c(false);
                        break;
                    } else {
                        y6Var3.v0 = true;
                        y6Var3.w0 = true;
                        ((oa) y6Var3.a).e(new v6(y6Var3, 4), true);
                        break;
                    }
                }
                break;
            case 3:
                y6 y6Var4 = this.b;
                if (!y6Var4.n0 && !y6Var4.b()) {
                    wa waVar = ((oa) y6Var4.a).a.x0;
                    if (waVar != null) {
                        waVar.toggleDual();
                    }
                    y6Var4.d(360.0f);
                    y6Var4.s0 = false;
                    y6Var4.F.c(false);
                    y6Var4.G.c(false);
                    y6Var4.H.c(false);
                    break;
                }
                break;
            default:
                long currentTimeMillis2 = System.currentTimeMillis();
                y6 y6Var5 = this.b;
                y6Var5.M = currentTimeMillis2;
                y6Var5.n0 = true;
                w6 w6Var = y6Var5.a;
                y6Var5.N = 0L;
                ((oa) w6Var).a.F0.a(0L, true);
                break;
        }
    }
}
