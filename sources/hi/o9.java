package hi;

import org.telegram.messenger.hd;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
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
                i3Var.a.t(hd.N0(z10 ? 2131744417 : 2131744418, null), false, true);
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
