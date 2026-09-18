package ki;

import org.telegram.ui.Components.q01;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes4.dex */
public final /* synthetic */ class a0 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ h0 b;
    public final /* synthetic */ e0 c;

    public /* synthetic */ a0(h0 h0Var, e0 e0Var, int i10) {
        this.b = h0Var;
        this.c = e0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                h0 h0Var = this.b;
                e0 e0Var = this.c;
                ((q01) h0Var.d).a(e0Var.a);
                return;
            default:
                h0 h0Var2 = this.b;
                e0 e0Var2 = this.c;
                f0 f0Var = h0Var2.d;
                long j3 = e0Var2.a;
                q01 q01Var = (q01) f0Var;
                synchronized (q01Var) {
                    q01Var.a(j3);
                }
                return;
        }
    }

    public /* synthetic */ a0(h0 h0Var, e0 e0Var, Exception exc) {
        this.b = h0Var;
        this.c = e0Var;
    }
}
