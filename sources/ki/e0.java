package ki;

import org.telegram.ui.Components.q01;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes4.dex */
public final /* synthetic */ class e0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ s0 b;
    public final /* synthetic */ o0 c;

    public /* synthetic */ e0(s0 s0Var, o0 o0Var, int i10, int i11) {
        this.a = i11;
        this.b = s0Var;
        this.c = o0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                s0 s0Var = this.b;
                o0 o0Var = this.c;
                ((q01) s0Var.e).c(o0Var.a);
                return;
            case 1:
                s0 s0Var2 = this.b;
                o0 o0Var2 = this.c;
                ((q01) s0Var2.e).c(o0Var2.a);
                return;
            default:
                s0 s0Var3 = this.b;
                o0 o0Var3 = this.c;
                p0 p0Var = s0Var3.e;
                long j3 = o0Var3.a;
                q01 q01Var = (q01) p0Var;
                synchronized (q01Var) {
                    q01Var.c(j3);
                }
                return;
        }
    }

    public /* synthetic */ e0(s0 s0Var, o0 o0Var, Exception exc) {
        this.a = 2;
        this.b = s0Var;
        this.c = o0Var;
    }
}
