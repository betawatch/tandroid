package org.telegram.ui;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class ci implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ di b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ org.telegram.ui.Components.xi0 e;
    public final /* synthetic */ float f;
    public final /* synthetic */ float h;
    public final /* synthetic */ ch.p0 n;

    public /* synthetic */ ci(di diVar, int i7, boolean z10, org.telegram.ui.Components.xi0 xi0Var, float f10, float f11, ch.p0 p0Var, int i10) {
        this.a = i10;
        this.b = diVar;
        this.c = i7;
        this.d = z10;
        this.e = xi0Var;
        this.f = f10;
        this.h = f11;
        this.n = p0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7;
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.h3(new ci(this.b, this.c, this.d, this.e, this.f, this.h, this.n, 1), 50L);
                break;
            default:
                bn bnVar = this.b.s;
                org.telegram.ui.Cells.z J8 = bnVar.J8(this.c, true);
                if (this.d) {
                    i7 = ((org.telegram.ui.ActionBar.g2) bnVar).currentAccount;
                    ch.l0.d(bnVar, this.e, J8, null, this.f, this.h, this.n, i7, 1);
                    ch.l0.f();
                    break;
                }
                break;
        }
    }
}
