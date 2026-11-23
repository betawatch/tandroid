package hi;

import org.telegram.messenger.gd;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class ja implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ ka b;
    public final /* synthetic */ Runnable c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ ja(ka kaVar, Runnable runnable, boolean z10) {
        this.b = kaVar;
        this.c = runnable;
        this.d = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        boolean z10 = this.d;
        Runnable runnable = this.c;
        ka kaVar = this.b;
        switch (i7) {
            case 0:
                kaVar.g(runnable, z10);
                break;
            default:
                runnable.run();
                nb nbVar = kaVar.a;
                r3 r3Var = nbVar.U0;
                r3Var.a.t(gd.N0(z10 ? 2131744416 : 2131744417, null), false, true);
                r3Var.invalidate();
                nbVar.g(true, true);
                nbVar.c0(true);
                nbVar.J0.a(false, true);
                nbVar.K0.b(true, true);
                nbVar.h0(true, true);
                break;
        }
    }

    public /* synthetic */ ja(ka kaVar, boolean z10, Runnable runnable) {
        this.b = kaVar;
        this.d = z10;
        this.c = runnable;
    }
}
