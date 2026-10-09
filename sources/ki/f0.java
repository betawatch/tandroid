package ki;

import org.telegram.ui.Components.g11;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final /* synthetic */ class f0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ t0 b;
    public final /* synthetic */ p0 c;

    public /* synthetic */ f0(t0 t0Var, p0 p0Var, int i10, int i11) {
        this.a = i11;
        this.b = t0Var;
        this.c = p0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                t0 t0Var = this.b;
                p0 p0Var = this.c;
                ((g11) t0Var.e).c(p0Var.a);
                return;
            case 1:
                t0 t0Var2 = this.b;
                p0 p0Var2 = this.c;
                ((g11) t0Var2.e).c(p0Var2.a);
                return;
            default:
                t0 t0Var3 = this.b;
                p0 p0Var3 = this.c;
                q0 q0Var = t0Var3.e;
                long j3 = p0Var3.a;
                g11 g11Var = (g11) q0Var;
                synchronized (g11Var) {
                    g11Var.c(j3);
                }
                return;
        }
    }

    public /* synthetic */ f0(t0 t0Var, p0 p0Var, Exception exc) {
        this.a = 2;
        this.b = t0Var;
        this.c = p0Var;
    }
}
