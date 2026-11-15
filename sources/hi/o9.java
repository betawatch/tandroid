package hi;

import org.telegram.messenger.hd;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class o9 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ p9 b;
    public final /* synthetic */ Runnable c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ o9(p9 p9Var, Runnable runnable, boolean z10) {
        this.b = p9Var;
        this.c = runnable;
        this.d = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        boolean z10 = this.d;
        Runnable runnable = this.c;
        p9 p9Var = this.b;
        switch (i7) {
            case 0:
                p9Var.g(runnable, z10);
                break;
            default:
                runnable.run();
                sa saVar = p9Var.a;
                i3 i3Var = saVar.U0;
                i3Var.a.t(hd.M0(z10 ? 2131744660 : 2131744661, null), false, true);
                i3Var.invalidate();
                saVar.g(true, true);
                saVar.c0(true);
                saVar.J0.a(false, true);
                saVar.K0.b(true, true);
                saVar.h0(true, true);
                break;
        }
    }

    public /* synthetic */ o9(p9 p9Var, boolean z10, Runnable runnable) {
        this.b = p9Var;
        this.d = z10;
        this.c = runnable;
    }
}
