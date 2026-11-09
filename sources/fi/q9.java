package fi;

import org.telegram.messenger.id;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class q9 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ r9 b;
    public final /* synthetic */ Runnable c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ q9(r9 r9Var, Runnable runnable, boolean z9) {
        this.b = r9Var;
        this.c = runnable;
        this.d = z9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        boolean z9 = this.d;
        Runnable runnable = this.c;
        r9 r9Var = this.b;
        switch (i7) {
            case 0:
                r9Var.g(runnable, z9);
                break;
            default:
                runnable.run();
                va vaVar = r9Var.a;
                k3 k3Var = vaVar.T0;
                k3Var.a.t(id.M0(z9 ? 2131744660 : 2131744661, null), false, true);
                k3Var.invalidate();
                vaVar.g(true, true);
                vaVar.c0(true);
                vaVar.I0.a(false, true);
                vaVar.J0.b(true, true);
                vaVar.h0(true, true);
                break;
        }
    }

    public /* synthetic */ q9(r9 r9Var, boolean z9, Runnable runnable) {
        this.b = r9Var;
        this.d = z9;
        this.c = runnable;
    }
}
