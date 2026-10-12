package li;

import org.telegram.ui.Components.c11;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final /* synthetic */ class i0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ u0 b;
    public final /* synthetic */ q0 c;

    public /* synthetic */ i0(u0 u0Var, q0 q0Var, int i10, int i11) {
        this.a = i11;
        this.b = u0Var;
        this.c = q0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                u0 u0Var = this.b;
                q0 q0Var = this.c;
                ((c11) u0Var.e).c(q0Var.a);
                return;
            case 1:
                u0 u0Var2 = this.b;
                q0 q0Var2 = this.c;
                ((c11) u0Var2.e).c(q0Var2.a);
                return;
            default:
                u0 u0Var3 = this.b;
                q0 q0Var3 = this.c;
                r0 r0Var = u0Var3.e;
                long j10 = q0Var3.a;
                c11 c11Var = (c11) r0Var;
                synchronized (c11Var) {
                    c11Var.c(j10);
                }
                return;
        }
    }

    public /* synthetic */ i0(u0 u0Var, q0 q0Var, Exception exc) {
        this.a = 2;
        this.b = u0Var;
        this.c = q0Var;
    }
}
