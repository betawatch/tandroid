package nh;

import android.os.SystemClock;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class k6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ o6 b;

    public /* synthetic */ k6(o6 o6Var, int i10) {
        this.a = i10;
        this.b = o6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                o6 o6Var = this.b;
                o6Var.n0 = false;
                o6Var.v0 = false;
                o6Var.r0 = SystemClock.elapsedRealtime();
                o6Var.q0 = true;
                o6Var.s0 = false;
                o6Var.F.c(false);
                o6Var.G.c(false);
                o6Var.H.c(false);
                ((ca) o6Var.a).d(true);
                break;
            case 1:
                long currentTimeMillis = System.currentTimeMillis();
                o6 o6Var2 = this.b;
                o6Var2.M = currentTimeMillis;
                o6Var2.N = 0L;
                o6Var2.n0 = true;
                ((ca) o6Var2.a).a.F0.a(0L, true);
                break;
            case 2:
                o6 o6Var3 = this.b;
                if (!o6Var3.n0 && !o6Var3.b()) {
                    if (!gb.d(((ca) o6Var3.a).a)) {
                        o6Var3.s0 = false;
                        o6Var3.F.c(false);
                        o6Var3.G.c(false);
                        o6Var3.H.c(false);
                        break;
                    } else {
                        o6Var3.v0 = true;
                        o6Var3.w0 = true;
                        ((ca) o6Var3.a).e(new k6(o6Var3, 4), true);
                        break;
                    }
                }
                break;
            case 3:
                o6 o6Var4 = this.b;
                if (!o6Var4.n0 && !o6Var4.b()) {
                    ka kaVar = ((ca) o6Var4.a).a.x0;
                    if (kaVar != null) {
                        kaVar.toggleDual();
                    }
                    o6Var4.d(360.0f);
                    o6Var4.s0 = false;
                    o6Var4.F.c(false);
                    o6Var4.G.c(false);
                    o6Var4.H.c(false);
                    break;
                }
                break;
            default:
                long currentTimeMillis2 = System.currentTimeMillis();
                o6 o6Var5 = this.b;
                o6Var5.M = currentTimeMillis2;
                o6Var5.n0 = true;
                l6 l6Var = o6Var5.a;
                o6Var5.N = 0L;
                ((ca) l6Var).a.F0.a(0L, true);
                break;
        }
    }
}
