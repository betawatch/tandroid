package org.telegram.ui;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gh implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ an b;
    public final /* synthetic */ int c;
    public final /* synthetic */ org.telegram.messenger.ij d;

    public /* synthetic */ gh(an anVar, int i7, org.telegram.messenger.ij ijVar) {
        this.b = anVar;
        this.c = i7;
        this.d = ijVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        org.telegram.messenger.ij ijVar = this.d;
        int i10 = this.c;
        an anVar = this.b;
        switch (i7) {
            case 0:
                anVar.B4 = null;
                ijVar.k.replies.read_max_id = i10;
                break;
            default:
                org.telegram.ui.Components.hc.a0(anVar).c(org.telegram.messenger.id.M0(2131754488, null)).j();
                org.telegram.messenger.qp.s1(i10).o0(false);
                anVar.eb(ijVar);
                anVar.gb(ijVar);
                break;
        }
    }

    public /* synthetic */ gh(an anVar, org.telegram.messenger.ij ijVar, int i7) {
        this.b = anVar;
        this.d = ijVar;
        this.c = i7;
    }
}
