package fi;

import org.telegram.messenger.hd;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
                k3Var.a.t(hd.M0(z9 ? 2131744661 : 2131744662, null), false, true);
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
