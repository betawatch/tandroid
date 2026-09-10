package bi;

import android.os.SystemClock;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class j8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ m8 b;

    public /* synthetic */ j8(m8 m8Var, int i10) {
        this.a = i10;
        this.b = m8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                m8 m8Var = this.b;
                m8Var.r0 = false;
                m8Var.z0 = false;
                m8Var.v0 = SystemClock.elapsedRealtime();
                m8Var.u0 = true;
                m8Var.w0 = false;
                m8Var.J.c(false);
                m8Var.K.c(false);
                m8Var.L.c(false);
                ((sc) m8Var.a).d(true);
                break;
            case 1:
                long currentTimeMillis = System.currentTimeMillis();
                m8 m8Var2 = this.b;
                m8Var2.Q = currentTimeMillis;
                m8Var2.R = 0L;
                m8Var2.r0 = true;
                ((sc) m8Var2.a).a.J0.a(0L, true);
                break;
            case 2:
                m8 m8Var3 = this.b;
                if (!m8Var3.r0 && !m8Var3.b()) {
                    if (!ce.d(((sc) m8Var3.a).a)) {
                        m8Var3.w0 = false;
                        m8Var3.J.c(false);
                        m8Var3.K.c(false);
                        m8Var3.L.c(false);
                        break;
                    } else {
                        m8Var3.z0 = true;
                        m8Var3.A0 = true;
                        ((sc) m8Var3.a).e(new j8(m8Var3, 4), true);
                        break;
                    }
                }
                break;
            case 3:
                m8 m8Var4 = this.b;
                if (!m8Var4.r0 && !m8Var4.b()) {
                    bd bdVar = ((sc) m8Var4.a).a.B0;
                    if (bdVar != null) {
                        bdVar.toggleDual();
                    }
                    m8Var4.d(360.0f);
                    m8Var4.w0 = false;
                    m8Var4.J.c(false);
                    m8Var4.K.c(false);
                    m8Var4.L.c(false);
                    break;
                }
                break;
            default:
                long currentTimeMillis2 = System.currentTimeMillis();
                m8 m8Var5 = this.b;
                m8Var5.Q = currentTimeMillis2;
                m8Var5.r0 = true;
                k8 k8Var = m8Var5.a;
                m8Var5.R = 0L;
                ((sc) k8Var).a.J0.a(0L, true);
                break;
        }
    }
}
