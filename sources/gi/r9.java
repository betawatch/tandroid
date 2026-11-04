package gi;

import org.telegram.messenger.bd;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r9 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ s9 b;
    public final /* synthetic */ Runnable c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ r9(s9 s9Var, Runnable runnable, boolean z10) {
        this.b = s9Var;
        this.c = runnable;
        this.d = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3 = this.a;
        boolean z10 = this.d;
        Runnable runnable = this.c;
        s9 s9Var = this.b;
        switch (i3) {
            case 0:
                s9Var.g(runnable, z10);
                break;
            default:
                runnable.run();
                va vaVar = s9Var.a;
                i3 i3Var = vaVar.U0;
                i3Var.a.t(bd.M0(z10 ? 2131744670 : 2131744671, null), false, true);
                i3Var.invalidate();
                vaVar.g(true, true);
                vaVar.c0(true);
                vaVar.J0.a(false, true);
                vaVar.K0.b(true, true);
                vaVar.h0(true, true);
                break;
        }
    }

    public /* synthetic */ r9(s9 s9Var, boolean z10, Runnable runnable) {
        this.b = s9Var;
        this.d = z10;
        this.c = runnable;
    }
}
