package ki;

import org.telegram.ui.Components.r01;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes4.dex */
public final /* synthetic */ class c0 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ q0 b;
    public final /* synthetic */ m0 c;

    public /* synthetic */ c0(q0 q0Var, m0 m0Var, int i10) {
        this.b = q0Var;
        this.c = m0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                q0 q0Var = this.b;
                m0 m0Var = this.c;
                ((r01) q0Var.d).a(m0Var.a);
                return;
            default:
                q0 q0Var2 = this.b;
                m0 m0Var2 = this.c;
                n0 n0Var = q0Var2.d;
                long j3 = m0Var2.a;
                r01 r01Var = (r01) n0Var;
                synchronized (r01Var) {
                    r01Var.a(j3);
                }
                return;
        }
    }

    public /* synthetic */ c0(q0 q0Var, m0 m0Var, Exception exc) {
        this.b = q0Var;
        this.c = m0Var;
    }
}
