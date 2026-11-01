package li;

import org.telegram.ui.Components.mz0;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes4.dex */
public final /* synthetic */ class k0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ x0 b;
    public final /* synthetic */ t0 c;

    public /* synthetic */ k0(x0 x0Var, t0 t0Var, int i10, int i11) {
        this.a = i11;
        this.b = x0Var;
        this.c = t0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                x0 x0Var = this.b;
                t0 t0Var = this.c;
                ((mz0) x0Var.e).c(t0Var.a);
                return;
            case 1:
                x0 x0Var2 = this.b;
                t0 t0Var2 = this.c;
                u0 u0Var = x0Var2.e;
                long j10 = t0Var2.a;
                mz0 mz0Var = (mz0) u0Var;
                synchronized (mz0Var) {
                    mz0Var.c(j10);
                }
                return;
            default:
                x0 x0Var3 = this.b;
                t0 t0Var3 = this.c;
                ((mz0) x0Var3.e).c(t0Var3.a);
                return;
        }
    }

    public /* synthetic */ k0(x0 x0Var, t0 t0Var, Exception exc) {
        this.a = 1;
        this.b = x0Var;
        this.c = t0Var;
    }
}
