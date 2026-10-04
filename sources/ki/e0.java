package ki;

import org.telegram.ui.Components.z01;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
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
                ((z01) s0Var.e).c(o0Var.a);
                return;
            case 1:
                s0 s0Var2 = this.b;
                o0 o0Var2 = this.c;
                ((z01) s0Var2.e).c(o0Var2.a);
                return;
            default:
                s0 s0Var3 = this.b;
                o0 o0Var3 = this.c;
                p0 p0Var = s0Var3.e;
                long j3 = o0Var3.a;
                z01 z01Var = (z01) p0Var;
                synchronized (z01Var) {
                    z01Var.c(j3);
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
