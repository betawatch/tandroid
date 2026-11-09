package org.telegram.ui;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class ih implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ cn b;
    public final /* synthetic */ int c;
    public final /* synthetic */ org.telegram.messenger.ij d;

    public /* synthetic */ ih(cn cnVar, int i7, org.telegram.messenger.ij ijVar) {
        this.b = cnVar;
        this.c = i7;
        this.d = ijVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        org.telegram.messenger.ij ijVar = this.d;
        int i10 = this.c;
        cn cnVar = this.b;
        switch (i7) {
            case 0:
                cnVar.B4 = null;
                ijVar.k.replies.read_max_id = i10;
                break;
            default:
                org.telegram.ui.Components.hc.a0(cnVar).c(org.telegram.messenger.id.M0(2131754488, null)).j();
                org.telegram.messenger.qp.s1(i10).o0(false);
                cnVar.hb(ijVar);
                cnVar.jb(ijVar);
                break;
        }
    }

    public /* synthetic */ ih(cn cnVar, org.telegram.messenger.ij ijVar, int i7) {
        this.b = cnVar;
        this.d = ijVar;
        this.c = i7;
    }
}
