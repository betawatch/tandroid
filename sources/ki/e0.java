package ki;

import org.telegram.ui.Components.a11;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
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
                ((a11) s0Var.e).c(o0Var.a);
                return;
            case 1:
                s0 s0Var2 = this.b;
                o0 o0Var2 = this.c;
                ((a11) s0Var2.e).c(o0Var2.a);
                return;
            default:
                s0 s0Var3 = this.b;
                o0 o0Var3 = this.c;
                p0 p0Var = s0Var3.e;
                long j3 = o0Var3.a;
                a11 a11Var = (a11) p0Var;
                synchronized (a11Var) {
                    a11Var.c(j3);
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
