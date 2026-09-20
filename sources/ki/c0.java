package ki;

import org.telegram.ui.Components.p01;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes4.dex */
public final /* synthetic */ class c0 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ o0 b;
    public final /* synthetic */ k0 c;

    public /* synthetic */ c0(o0 o0Var, k0 k0Var, int i10) {
        this.b = o0Var;
        this.c = k0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                o0 o0Var = this.b;
                k0 k0Var = this.c;
                ((p01) o0Var.d).a(k0Var.a);
                return;
            default:
                o0 o0Var2 = this.b;
                k0 k0Var2 = this.c;
                l0 l0Var = o0Var2.d;
                long j3 = k0Var2.a;
                p01 p01Var = (p01) l0Var;
                synchronized (p01Var) {
                    p01Var.a(j3);
                }
                return;
        }
    }

    public /* synthetic */ c0(o0 o0Var, k0 k0Var, Exception exc) {
        this.b = o0Var;
        this.c = k0Var;
    }
}
