package di;

import android.os.SystemClock;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes4.dex */
public final /* synthetic */ class i7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ l7 b;

    public /* synthetic */ i7(l7 l7Var, int i10) {
        this.a = i10;
        this.b = l7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                l7 l7Var = this.b;
                l7Var.r0 = false;
                l7Var.z0 = false;
                l7Var.v0 = SystemClock.elapsedRealtime();
                l7Var.u0 = true;
                l7Var.w0 = false;
                l7Var.J.c(false);
                l7Var.K.c(false);
                l7Var.L.c(false);
                ((jb) l7Var.a).d(true);
                break;
            case 1:
                long currentTimeMillis = System.currentTimeMillis();
                l7 l7Var2 = this.b;
                l7Var2.Q = currentTimeMillis;
                l7Var2.R = 0L;
                l7Var2.r0 = true;
                ((jb) l7Var2.a).a.J0.a(0L, true);
                break;
            case 2:
                l7 l7Var3 = this.b;
                if (!l7Var3.r0 && !l7Var3.b()) {
                    if (!pc.d(((jb) l7Var3.a).a)) {
                        l7Var3.w0 = false;
                        l7Var3.J.c(false);
                        l7Var3.K.c(false);
                        l7Var3.L.c(false);
                        break;
                    } else {
                        l7Var3.z0 = true;
                        l7Var3.A0 = true;
                        ((jb) l7Var3.a).e(new i7(l7Var3, 4), true);
                        break;
                    }
                }
                break;
            case 3:
                l7 l7Var4 = this.b;
                if (!l7Var4.r0 && !l7Var4.b()) {
                    sb sbVar = ((jb) l7Var4.a).a.B0;
                    if (sbVar != null) {
                        sbVar.toggleDual();
                    }
                    l7Var4.d(360.0f);
                    l7Var4.w0 = false;
                    l7Var4.J.c(false);
                    l7Var4.K.c(false);
                    l7Var4.L.c(false);
                    break;
                }
                break;
            default:
                long currentTimeMillis2 = System.currentTimeMillis();
                l7 l7Var5 = this.b;
                l7Var5.Q = currentTimeMillis2;
                l7Var5.r0 = true;
                j7 j7Var = l7Var5.a;
                l7Var5.R = 0L;
                ((jb) j7Var).a.J0.a(0L, true);
                break;
        }
    }
}
