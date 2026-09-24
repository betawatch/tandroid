package ki;

import org.telegram.ui.Components.o01;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes4.dex */
public final /* synthetic */ class e0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ r0 b;
    public final /* synthetic */ n0 c;

    public /* synthetic */ e0(r0 r0Var, n0 n0Var, int i10, int i11) {
        this.a = i11;
        this.b = r0Var;
        this.c = n0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                r0 r0Var = this.b;
                n0 n0Var = this.c;
                ((o01) r0Var.d).c(n0Var.a);
                return;
            case 1:
                r0 r0Var2 = this.b;
                n0 n0Var2 = this.c;
                ((o01) r0Var2.d).c(n0Var2.a);
                return;
            default:
                r0 r0Var3 = this.b;
                n0 n0Var3 = this.c;
                o0 o0Var = r0Var3.d;
                long j3 = n0Var3.a;
                o01 o01Var = (o01) o0Var;
                synchronized (o01Var) {
                    o01Var.c(j3);
                }
                return;
        }
    }

    public /* synthetic */ e0(r0 r0Var, n0 n0Var, Exception exc) {
        this.a = 2;
        this.b = r0Var;
        this.c = n0Var;
    }
}
