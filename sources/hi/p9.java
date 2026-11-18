package hi;

import org.telegram.messenger.gd;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final /* synthetic */ class p9 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ q9 b;
    public final /* synthetic */ Runnable c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ p9(q9 q9Var, Runnable runnable, boolean z10) {
        this.b = q9Var;
        this.c = runnable;
        this.d = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        boolean z10 = this.d;
        Runnable runnable = this.c;
        q9 q9Var = this.b;
        switch (i7) {
            case 0:
                q9Var.g(runnable, z10);
                break;
            default:
                runnable.run();
                ta taVar = q9Var.a;
                j3 j3Var = taVar.U0;
                j3Var.a.t(gd.M0(z10 ? 2131744425 : 2131744426, null), false, true);
                j3Var.invalidate();
                taVar.g(true, true);
                taVar.c0(true);
                taVar.J0.a(false, true);
                taVar.K0.b(true, true);
                taVar.h0(true, true);
                break;
        }
    }

    public /* synthetic */ p9(q9 q9Var, boolean z10, Runnable runnable) {
        this.b = q9Var;
        this.d = z10;
        this.c = runnable;
    }
}
