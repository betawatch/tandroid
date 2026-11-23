package org.telegram.ui;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hh implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ bn b;
    public final /* synthetic */ int c;
    public final /* synthetic */ org.telegram.messenger.gj d;

    public /* synthetic */ hh(bn bnVar, int i7, org.telegram.messenger.gj gjVar) {
        this.b = bnVar;
        this.c = i7;
        this.d = gjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        org.telegram.messenger.gj gjVar = this.d;
        int i10 = this.c;
        bn bnVar = this.b;
        switch (i7) {
            case 0:
                bnVar.D4 = null;
                gjVar.k.replies.read_max_id = i10;
                break;
            default:
                org.telegram.ui.Components.lc.b0(bnVar).c(org.telegram.messenger.hd.N0(2131754485, null)).j();
                org.telegram.messenger.np.u1(i10).p0(false);
                bnVar.ib(gjVar);
                bnVar.kb(gjVar);
                break;
        }
    }

    public /* synthetic */ hh(bn bnVar, org.telegram.messenger.gj gjVar, int i7) {
        this.b = bnVar;
        this.d = gjVar;
        this.c = i7;
    }
}
