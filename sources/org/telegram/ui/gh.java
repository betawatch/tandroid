package org.telegram.ui;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class gh implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ bn b;
    public final /* synthetic */ int c;
    public final /* synthetic */ org.telegram.messenger.fj d;

    public /* synthetic */ gh(bn bnVar, int i7, org.telegram.messenger.fj fjVar) {
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
                org.telegram.ui.Components.lc.b0(bnVar).c(org.telegram.messenger.gd.M0(2131754486, null)).j();
                org.telegram.messenger.mp.u1(i10).p0(false);
                bnVar.ib(fjVar);
                bnVar.kb(fjVar);
                break;
        }
    }

    public /* synthetic */ gh(bn bnVar, org.telegram.messenger.fj fjVar, int i7) {
        this.b = bnVar;
        this.d = fjVar;
        this.c = i7;
    }
}
