// default package

import android.os.SystemClock;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class h49 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ j49 b;

    public /* synthetic */ h49(j49 j49Var, byte b) {
        this.a = b;
        this.b = j49Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        j49 j49Var = this.b;
        switch (b) {
            case 0:
                j49Var.s0 = false;
                j49Var.A0 = false;
                j49Var.w0 = SystemClock.elapsedRealtime();
                j49Var.v0 = true;
                j49Var.x0 = false;
                j49Var.K.c(false);
                j49Var.L.c(false);
                j49Var.M.c(false);
                ((v8b) j49Var.a).e(true);
                break;
            case 1:
                j49Var.R = System.currentTimeMillis();
                j49Var.S = 0L;
                j49Var.s0 = true;
                ((v8b) j49Var.a).a.K0.a(0L, true);
                break;
            case 2:
                if (!j49Var.s0 && !j49Var.b()) {
                    if (!((v8b) j49Var.a).a.Y()) {
                        j49Var.x0 = false;
                        j49Var.K.c(false);
                        j49Var.L.c(false);
                        j49Var.M.c(false);
                        break;
                    } else {
                        j49Var.A0 = true;
                        j49Var.B0 = true;
                        ((v8b) j49Var.a).f(new h49(j49Var, (byte) 4), true);
                        break;
                    }
                }
                break;
            case 3:
                if (!j49Var.s0 && !j49Var.b()) {
                    a9b a9bVar = ((v8b) j49Var.a).a.C0;
                    if (a9bVar != null) {
                        a9bVar.toggleDual();
                    }
                    j49Var.d(360.0f);
                    j49Var.x0 = false;
                    j49Var.K.c(false);
                    j49Var.L.c(false);
                    j49Var.M.c(false);
                    break;
                }
                break;
            default:
                j49Var.R = System.currentTimeMillis();
                j49Var.s0 = true;
                i49 i49Var = j49Var.a;
                j49Var.S = 0L;
                ((v8b) i49Var).a.K0.a(0L, true);
                break;
        }
    }
}
