package di;

import android.os.SystemClock;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final /* synthetic */ class f7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ i7 b;

    public /* synthetic */ f7(i7 i7Var, int i10) {
        this.a = i10;
        this.b = i7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                i7 i7Var = this.b;
                i7Var.r0 = false;
                i7Var.z0 = false;
                i7Var.v0 = SystemClock.elapsedRealtime();
                i7Var.u0 = true;
                i7Var.w0 = false;
                i7Var.J.c(false);
                i7Var.K.c(false);
                i7Var.L.c(false);
                ((fb) i7Var.a).e(true);
                break;
            case 1:
                long currentTimeMillis = System.currentTimeMillis();
                i7 i7Var2 = this.b;
                i7Var2.Q = currentTimeMillis;
                i7Var2.R = 0L;
                i7Var2.r0 = true;
                ((fb) i7Var2.a).a.J0.a(0L, true);
                break;
            case 2:
                i7 i7Var3 = this.b;
                if (!i7Var3.r0 && !i7Var3.b()) {
                    if (!kc.c(((fb) i7Var3.a).a)) {
                        i7Var3.w0 = false;
                        i7Var3.J.c(false);
                        i7Var3.K.c(false);
                        i7Var3.L.c(false);
                        break;
                    } else {
                        i7Var3.z0 = true;
                        i7Var3.A0 = true;
                        ((fb) i7Var3.a).f(new f7(i7Var3, 4), true);
                        break;
                    }
                }
                break;
            case 3:
                i7 i7Var4 = this.b;
                if (!i7Var4.r0 && !i7Var4.b()) {
                    nb nbVar = ((fb) i7Var4.a).a.B0;
                    if (nbVar != null) {
                        nbVar.toggleDual();
                    }
                    i7Var4.d(360.0f);
                    i7Var4.w0 = false;
                    i7Var4.J.c(false);
                    i7Var4.K.c(false);
                    i7Var4.L.c(false);
                    break;
                }
                break;
            default:
                long currentTimeMillis2 = System.currentTimeMillis();
                i7 i7Var5 = this.b;
                i7Var5.Q = currentTimeMillis2;
                i7Var5.r0 = true;
                g7 g7Var = i7Var5.a;
                i7Var5.R = 0L;
                ((fb) g7Var).a.J0.a(0L, true);
                break;
        }
    }
}
