package org.telegram.ui;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class hh implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ bn b;
    public final /* synthetic */ int c;
    public final /* synthetic */ org.telegram.messenger.fj d;

    public /* synthetic */ hh(bn bnVar, int i7, org.telegram.messenger.fj fjVar) {
        this.b = bnVar;
        this.c = i7;
        this.d = fjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        org.telegram.messenger.fj fjVar = this.d;
        int i10 = this.c;
        bn bnVar = this.b;
        switch (i7) {
            case 0:
                bnVar.D4 = null;
                fjVar.k.replies.read_max_id = i10;
                break;
            default:
                org.telegram.ui.Components.kc.b0(bnVar).c(org.telegram.messenger.gd.N0(2131754485, null)).j();
                org.telegram.messenger.mp.u1(i10).p0(false);
                bnVar.ib(fjVar);
                bnVar.kb(fjVar);
                break;
        }
    }

    public /* synthetic */ hh(bn bnVar, org.telegram.messenger.fj fjVar, int i7) {
        this.b = bnVar;
        this.d = fjVar;
        this.c = i7;
    }
}
