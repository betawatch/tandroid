package fi;

import org.telegram.messenger.id;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r9 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ s9 b;
    public final /* synthetic */ Runnable c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ r9(s9 s9Var, Runnable runnable, boolean z9) {
        this.b = s9Var;
        this.c = runnable;
        this.d = z9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        boolean z9 = this.d;
        Runnable runnable = this.c;
        s9 s9Var = this.b;
        switch (i7) {
            case 0:
                s9Var.g(runnable, z9);
                break;
            default:
                runnable.run();
                va vaVar = s9Var.a;
                k3 k3Var = vaVar.T0;
                k3Var.a.t(id.M0(z9 ? 2131744663 : 2131744664, null), false, true);
                k3Var.invalidate();
                vaVar.g(true, true);
                vaVar.c0(true);
                vaVar.I0.a(false, true);
                vaVar.J0.b(true, true);
                vaVar.h0(true, true);
                break;
        }
    }

    public /* synthetic */ r9(s9 s9Var, boolean z9, Runnable runnable) {
        this.b = s9Var;
        this.d = z9;
        this.c = runnable;
    }
}
