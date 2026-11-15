package org.telegram.ui;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class gh implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ an b;
    public final /* synthetic */ int c;
    public final /* synthetic */ org.telegram.messenger.gj d;

    public /* synthetic */ gh(an anVar, int i7, org.telegram.messenger.gj gjVar) {
        this.b = anVar;
        this.c = i7;
        this.d = gjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        org.telegram.messenger.gj gjVar = this.d;
        int i10 = this.c;
        an anVar = this.b;
        switch (i7) {
            case 0:
                anVar.C4 = null;
                gjVar.k.replies.read_max_id = i10;
                break;
            default:
                org.telegram.ui.Components.cc.a0(anVar).c(org.telegram.messenger.hd.M0(2131754488, null)).j();
                org.telegram.messenger.np.s1(i10).o0(false);
                anVar.ib(gjVar);
                anVar.kb(gjVar);
                break;
        }
    }

    public /* synthetic */ gh(an anVar, org.telegram.messenger.gj gjVar, int i7) {
        this.b = anVar;
        this.d = gjVar;
        this.c = i7;
    }
}
