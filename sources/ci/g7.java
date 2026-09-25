package ci;

import android.os.SystemClock;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes4.dex */
public final /* synthetic */ class g7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ j7 b;

    public /* synthetic */ g7(j7 j7Var, int i10) {
        this.a = i10;
        this.b = j7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                j7 j7Var = this.b;
                j7Var.r0 = false;
                j7Var.z0 = false;
                j7Var.v0 = SystemClock.elapsedRealtime();
                j7Var.u0 = true;
                j7Var.w0 = false;
                j7Var.J.c(false);
                j7Var.K.c(false);
                j7Var.L.c(false);
                ((gb) j7Var.a).d(true);
                break;
            case 1:
                long currentTimeMillis = System.currentTimeMillis();
                j7 j7Var2 = this.b;
                j7Var2.Q = currentTimeMillis;
                j7Var2.R = 0L;
                j7Var2.r0 = true;
                ((gb) j7Var2.a).a.J0.a(0L, true);
                break;
            case 2:
                j7 j7Var3 = this.b;
                if (!j7Var3.r0 && !j7Var3.b()) {
                    if (!lc.d(((gb) j7Var3.a).a)) {
                        j7Var3.w0 = false;
                        j7Var3.J.c(false);
                        j7Var3.K.c(false);
                        j7Var3.L.c(false);
                        break;
                    } else {
                        j7Var3.z0 = true;
                        j7Var3.A0 = true;
                        ((gb) j7Var3.a).e(new g7(j7Var3, 4), true);
                        break;
                    }
                }
                break;
            case 3:
                j7 j7Var4 = this.b;
                if (!j7Var4.r0 && !j7Var4.b()) {
                    ob obVar = ((gb) j7Var4.a).a.B0;
                    if (obVar != null) {
                        obVar.toggleDual();
                    }
                    j7Var4.d(360.0f);
                    j7Var4.w0 = false;
                    j7Var4.J.c(false);
                    j7Var4.K.c(false);
                    j7Var4.L.c(false);
                    break;
                }
                break;
            default:
                long currentTimeMillis2 = System.currentTimeMillis();
                j7 j7Var5 = this.b;
                j7Var5.Q = currentTimeMillis2;
                j7Var5.r0 = true;
                h7 h7Var = j7Var5.a;
                j7Var5.R = 0L;
                ((gb) h7Var).a.J0.a(0L, true);
                break;
        }
    }
}
