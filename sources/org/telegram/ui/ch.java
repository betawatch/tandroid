package org.telegram.ui;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ch implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ wm b;
    public final /* synthetic */ int c;
    public final /* synthetic */ org.telegram.messenger.zi d;

    public /* synthetic */ ch(wm wmVar, int i3, org.telegram.messenger.zi ziVar) {
        this.b = wmVar;
        this.c = i3;
        this.d = ziVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3 = this.a;
        org.telegram.messenger.zi ziVar = this.d;
        int i10 = this.c;
        wm wmVar = this.b;
        switch (i3) {
            case 0:
                wmVar.C4 = null;
                ziVar.k.replies.read_max_id = i10;
                break;
            default:
                org.telegram.ui.Components.fc.a0(wmVar).c(org.telegram.messenger.bd.M0(2131754488, null)).j();
                org.telegram.messenger.hp.s1(i10).o0(false);
                wmVar.eb(ziVar);
                wmVar.gb(ziVar);
                break;
        }
    }

    public /* synthetic */ ch(wm wmVar, org.telegram.messenger.zi ziVar, int i3) {
        this.b = wmVar;
        this.d = ziVar;
        this.c = i3;
    }
}
