package org.telegram.ui;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class az implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bz b;

    public /* synthetic */ az(bz bzVar, int i7) {
        this.a = i7;
        this.b = bzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.d();
                break;
            case 1:
                this.b.a();
                break;
            default:
                bz bzVar = this.b;
                bzVar.b(bzVar.E);
                break;
        }
    }
}
